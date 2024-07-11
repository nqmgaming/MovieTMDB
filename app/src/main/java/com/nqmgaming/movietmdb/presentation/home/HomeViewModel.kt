package com.nqmgaming.movietmdb.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.nqmgaming.movietmdb.domain.repository.MovieTmdbRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val movieTmdbRepository: MovieTmdbRepository
) : ViewModel() {
    private val _homeUiState = MutableStateFlow(HomeUiState())
    val homeUiState = _homeUiState.asStateFlow()


    suspend fun getTrendingMovies (){
        _homeUiState.update {  it ->
            it.copy(
                trendingMovies = movieTmdbRepository.getPopularMovies().cachedIn(viewModelScope)
            )
        }
    }
}