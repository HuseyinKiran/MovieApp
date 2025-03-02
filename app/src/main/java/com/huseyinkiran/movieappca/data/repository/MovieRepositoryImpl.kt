package com.huseyinkiran.movieappca.data.repository

import com.huseyinkiran.movieappca.data.remote.MovieAPI
import com.huseyinkiran.movieappca.data.remote.dto.MovieDetailDto
import com.huseyinkiran.movieappca.data.remote.dto.MoviesDto
import com.huseyinkiran.movieappca.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api: MovieAPI) : MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovies(searchString = search)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }
}