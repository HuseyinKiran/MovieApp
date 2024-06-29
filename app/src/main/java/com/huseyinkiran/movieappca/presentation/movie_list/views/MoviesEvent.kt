package com.huseyinkiran.movieappca.presentation.movie_list.views

sealed class MoviesEvent {
    data class Search(val searchString: String): MoviesEvent()
}