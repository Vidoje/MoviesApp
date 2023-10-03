package com.taurunium.movies.data.datasourceimpl

import com.taurunium.movies.data.api.TMDBService
import com.taurunium.movies.data.datasource.MovieRemoteDataSource
import com.taurunium.movies.data.model.MovieList
import retrofit2.Response

class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey: String
) : MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)
}