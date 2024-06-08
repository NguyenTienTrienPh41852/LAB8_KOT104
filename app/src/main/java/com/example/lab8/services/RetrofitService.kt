package com.example.lab8.services

import com.example.lab8.MovieService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class RetrofitService() {
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://65bb36ad52189914b5bb7105.mockapi.io")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val movieService: MovieService by lazy {
        retrofit.create(MovieService::class.java)
    }
}