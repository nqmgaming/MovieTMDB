package com.nqmgaming.movietmdb.domain.model


data class ListMovie(
    val page: Int,
    val movie: List<Movie>,
    val totalPages: Int,
    val totalResults: Int
)
