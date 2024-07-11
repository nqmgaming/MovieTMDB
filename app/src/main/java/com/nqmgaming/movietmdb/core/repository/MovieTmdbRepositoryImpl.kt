package com.nqmgaming.movietmdb.core.repository

import android.nfc.tech.MifareUltralight.PAGE_SIZE
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.nqmgaming.movietmdb.core.data.mapper.toDomain
import com.nqmgaming.movietmdb.core.data.network.TMDBApi
import com.nqmgaming.movietmdb.core.data.paging.TrendingMoviesSource
import com.nqmgaming.movietmdb.domain.model.Movie
import com.nqmgaming.movietmdb.domain.repository.MovieTmdbRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieTmdbRepositoryImpl @Inject constructor(
    private val tmdbApi: TMDBApi
) : MovieTmdbRepository {
    override suspend fun getPopularMovies(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(
                pageSize = PAGE_SIZE,
                prefetchDistance = 5,
            ),
            pagingSourceFactory = { TrendingMoviesSource(tmdbApi)
            }
        ).flow
    }

    override suspend fun getMovieDetail(movieId: Int): Movie {
        return tmdbApi.getMovieDetail(movieId).toDomain()
    }
}