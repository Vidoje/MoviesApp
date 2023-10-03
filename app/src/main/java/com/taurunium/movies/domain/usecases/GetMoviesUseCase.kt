package com.taurunium.movies.domain.usecases

import com.taurunium.movies.data.model.Movie
import com.taurunium.movies.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute() : List<Movie>? = movieRepository.getMovies()
}