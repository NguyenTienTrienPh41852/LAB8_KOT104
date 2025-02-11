package com.example.lab8.response

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("filmId") val filmId: String,
    @SerializedName("filmName") val filmName: String,
    @SerializedName("year") val year: String,
    @SerializedName("image") val image: String,
    @SerializedName("duration") val duration: String,
    @SerializedName("releaseDate") val releaseDate: String,
    @SerializedName("genre") val genre: String,
    @SerializedName("description") val description: String,

)

