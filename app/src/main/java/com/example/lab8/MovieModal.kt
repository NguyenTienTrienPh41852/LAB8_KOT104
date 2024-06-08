package com.example.lab8


import java.sql.Date
import kotlin.time.Duration

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val posterURL: String,
    val duration: String,
    val releaseDate: String,
    val genre: String,
    val shotDescription: String
) {

}
