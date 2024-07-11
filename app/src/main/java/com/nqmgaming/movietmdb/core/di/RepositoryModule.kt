package com.nqmgaming.movietmdb.core.di

import com.nqmgaming.movietmdb.domain.repository.MovieTmdbRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
internal abstract class RepositoryModule {
    @Binds
    abstract fun bindMovieRepository(
        movieTmdbRepository: MovieTmdbRepository
    ): MovieTmdbRepository
}