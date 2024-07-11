package com.nqmgaming.movietmdb.domain.repository

import androidx.paging.PagingData
import com.nqmgaming.movietmdb.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieTmdbRepository {
    suspend fun getPopularMovies(): Flow<PagingData<Movie>>
    suspend fun getMovieDetail(movieId: Int): Movie
}