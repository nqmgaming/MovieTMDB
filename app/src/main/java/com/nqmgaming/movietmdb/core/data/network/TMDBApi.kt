package com.nqmgaming.movietmdb.core.data.network

import com.nqmgaming.movietmdb.BuildConfig.API_KEY
import com.nqmgaming.movietmdb.core.data.dto.ListMovieDto
import com.nqmgaming.movietmdb.core.data.dto.MovieDto
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBApi {

    @GET("trending/movie/day")
    suspend fun getTrendingTodayMovies(
        @Query("page") page: Int,
        @Query("language") language: String = "en",
        @Query("api_key") apiKey: String = API_KEY
    ): ListMovieDto

    @GET("movie/{movie_id}")
    suspend fun getMovieDetail(
        @Query("movie_id") movieId: Int,
        @Query("language") language: String = "en",
        @Query("api_key") apiKey: String = API_KEY
    ): MovieDto
}