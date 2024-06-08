package com.example.lab8

import com.example.lab8.response.MovieResponse
import retrofit2.Response
import retrofit2.http.GET

interface MovieService {
    @GET("/lab8_kot104")
    suspend fun getListFilms(): Response<List<MovieResponse>>
}