package com.huseyinkiran.movieappca.domain.repository

import com.huseyinkiran.movieappca.data.remote.dto.MovieDetailDto
import com.huseyinkiran.movieappca.data.remote.dto.MoviesDto

interface MovieRepository {
    suspend fun getMovies(search: String) : MoviesDto
    suspend fun getMovieDetail(imdbId: String) : MovieDetailDto
}