package com.nqmgaming.movietmdb.presentation.home

sealed interface HomeUiEvents {
    data object LoadTrendingMovies : HomeUiEvents
    data class SelectMovie(val movieId: Int) : HomeUiEvents
}