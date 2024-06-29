package com.huseyinkiran.movieappca.presentation.movie_list.views

import com.huseyinkiran.movieappca.domain.model.Movie

data class MoviesState(
    val isLoading: Boolean = false,
    val movies: List<Movie> = emptyList(),
    val error: String = "",
    val search: String = ""
)
