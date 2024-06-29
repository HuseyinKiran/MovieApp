package com.huseyinkiran.movieappca.domain.use_case.get_movie_detail

import com.huseyinkiran.movieappca.domain.model.MovieDetail
import com.huseyinkiran.movieappca.domain.model.toMovieDetail
import com.huseyinkiran.movieappca.domain.repository.MovieRepository
import com.huseyinkiran.movieappca.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject

class GetMoviesDetailUseCase @Inject constructor(private val repository: MovieRepository) {

    fun executeGetMovieDetails(imdbId: String) : Flow<Resource<MovieDetail>> = flow {
        try {
            emit(Resource.Loading())
            val movieDetail = repository.getMovieDetail(imdbId = imdbId)
            emit(Resource.Success(movieDetail.toMovieDetail()))
        }catch (e: IOError) {
            emit(Resource.Error(message = "No internet connection"))
        }catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Error"))
        }
    }
}