package com.nqmgaming.movietmdb.core.data.mapper

import com.nqmgaming.movietmdb.core.data.dto.ListMovieDto
import com.nqmgaming.movietmdb.domain.model.ListMovie

fun ListMovieDto.toDomain() = ListMovie(
    page = page,
    movie = movieDto.map { it.toDomain() },
    totalPages = totalPages,
    totalResults = totalResults
)

fun ListMovie.toDto() = ListMovieDto(
    page = page,
    movieDto = movie.map { it.toDto() },
    totalPages = totalPages,
    totalResults = totalResults
)