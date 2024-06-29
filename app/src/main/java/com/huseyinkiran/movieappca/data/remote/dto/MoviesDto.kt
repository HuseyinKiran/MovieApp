package com.huseyinkiran.movieappca.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.huseyinkiran.movieappca.domain.model.Movie

data class MoviesDto(
    @SerializedName("Response")
    val response: String,
    @SerializedName("Search")
    val search: List<Search>,
    val totalResults: String
)

fun MoviesDto.toMovieList(): List<Movie> {
    return search.map { search -> Movie(search.poster, search.title, search.year, search.imdbID) }
}