package com.example.lab8

import com.example.lab8.response.MovieResponse

fun MovieResponse.toMovie(): Movie {
    return Movie(
        id = this.filmId,
        title = this.filmName,
        posterURL = this.image,
        year = this.year,
        duration = this.duration,
        releaseDate = this.releaseDate,
        genre = this.genre,
        shotDescription = this.description,
    )
}