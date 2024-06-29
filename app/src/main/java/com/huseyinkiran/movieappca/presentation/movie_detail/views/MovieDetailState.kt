package com.huseyinkiran.movieappca.presentation.movie_detail.views

import com.huseyinkiran.movieappca.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading: Boolean = false,
    val movie: MovieDetail? = null,
    val error: String = ""
)
