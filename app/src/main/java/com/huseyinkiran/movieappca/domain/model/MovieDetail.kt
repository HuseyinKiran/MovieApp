package com.huseyinkiran.movieappca.domain.model

import com.google.gson.annotations.SerializedName
import com.huseyinkiran.movieappca.data.remote.dto.MovieDetailDto

data class MovieDetail(
    @SerializedName("Actors")
    val actors: String,
    @SerializedName("Awards")
    val awards: String,
    @SerializedName("Country")
    val country: String,
    @SerializedName("Director")
    val director: String,
    @SerializedName("Genre")
    val genre: String,
    @SerializedName("Language")
    val language: String,
    @SerializedName("Poster")
    val poster: String,
    @SerializedName("Rated")
    val rated: String,
    @SerializedName("Released")
    val released: String,
    @SerializedName("Title")
    val title: String,
    @SerializedName("Type")
    val type: String,
    @SerializedName("Year")
    val year: String,
    val imdbRating: String,
)

fun MovieDetailDto.toMovieDetail(): MovieDetail {
    return MovieDetail(actors, awards, country, director, genre, language,
        poster, rated, released, title, type, year, imdbRating)
}
