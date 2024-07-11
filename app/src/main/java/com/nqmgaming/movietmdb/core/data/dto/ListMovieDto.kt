package com.nqmgaming.movietmdb.core.data.dto

import com.google.gson.annotations.SerializedName

data class ListMovieDto(
    val page: Int,
    val movieDto: List<MovieDto>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)