package com.nqmgaming.movietmdb.core.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingSource.LoadResult.Page
import androidx.paging.PagingState
import com.nqmgaming.movietmdb.core.data.mapper.toDomain
import com.nqmgaming.movietmdb.core.data.network.TMDBApi
import com.nqmgaming.movietmdb.domain.model.Movie
import retrofit2.HttpException
import timber.log.Timber

class TrendingMoviesSource(private val api: TMDBApi): PagingSource<Int, Movie>() {
    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {
        return state.anchorPosition
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        return try {
            val nextPage: Int = params.key ?: 1
            val trendingMoviesList = api.getTrendingTodayMovies(nextPage)
            Timber.d("trending movies list : ${trendingMoviesList.movieDto}")
            Page(
                data = trendingMoviesList.movieDto.map { it.toDomain() },
                prevKey = if (nextPage == 1) null else nextPage - 1,
                nextKey = if (trendingMoviesList.movieDto.isEmpty()) null else trendingMoviesList.page + 1
            )
        } catch (exception: Exception){
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }
}