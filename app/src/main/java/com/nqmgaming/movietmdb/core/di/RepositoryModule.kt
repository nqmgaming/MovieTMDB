package com.nqmgaming.movietmdb.core.di

import com.nqmgaming.movietmdb.core.data.network.TMDBApi
import com.nqmgaming.movietmdb.core.repository.MovieTmdbRepositoryImpl
import com.nqmgaming.movietmdb.domain.repository.MovieTmdbRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideMovieRepository(api: TMDBApi): MovieTmdbRepository = MovieTmdbRepositoryImpl(api)
}