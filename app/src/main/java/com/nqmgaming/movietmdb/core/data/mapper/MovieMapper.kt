package com.nqmgaming.movietmdb.core.data.mapper

import com.nqmgaming.movietmdb.core.data.dto.MovieDto
import com.nqmgaming.movietmdb.domain.model.Movie

fun MovieDto.toDomain() = Movie(
    id = id,
    title = title,
    overview = overview,
    posterPath = posterPath,
    backdropPath = backdropPath,
    releaseDate = releaseDate,
    voteAverage = voteAverage,
    voteCount = voteCount,
    adult = adult,
    genreIds = genreIds,
    originalLanguage = originalLanguage,
    originalTitle = originalTitle,
    popularity = popularity,
    video = video
)

fun Movie.toDto() = MovieDto(
    id = id,
    title = title,
    overview = overview,
    posterPath = posterPath,
    backdropPath = backdropPath,
    releaseDate = releaseDate,
    voteAverage = voteAverage,
    voteCount = voteCount,
    adult = adult,
    genreIds = genreIds,
    originalLanguage = originalLanguage,
    originalTitle = originalTitle,
    popularity = popularity,
    video = video
)