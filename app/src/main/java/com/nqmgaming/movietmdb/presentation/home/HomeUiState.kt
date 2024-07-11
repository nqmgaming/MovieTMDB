package com.nqmgaming.movietmdb.presentation.home

import androidx.paging.PagingData
import com.nqmgaming.movietmdb.domain.model.Movie
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class HomeUiState (
    val trendingMovies: Flow<PagingData<Movie>> = emptyFlow(),
    val selectedFilmOption: String = "Movies",
)