package com.huseyinkiran.movieappca.domain.use_case.get_movies

import com.huseyinkiran.movieappca.data.remote.dto.toMovieList
import com.huseyinkiran.movieappca.domain.model.Movie
import com.huseyinkiran.movieappca.domain.repository.MovieRepository
import com.huseyinkiran.movieappca.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOError
import javax.inject.Inject

class GetMovieUseCase @Inject constructor(private val repository: MovieRepository) {

    fun executeGetMovies(search: String) : Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movieList = repository.getMovies(search)
            if (movieList.response.equals("True")) {
                emit(Resource.Success(movieList.toMovieList()))
            }else{
                emit(Resource.Error(message = "No movie found!"))
            }
        }catch (e: IOError) {
            emit(Resource.Error(message = "No internet connection"))
        }catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Error"))
        }
    }
}