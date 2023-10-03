package com.taurunium.movies.data.datasource

import com.taurunium.movies.data.model.MovieList
import retrofit2.Response

interface MovieRemoteDataSource {
    suspend fun getMovies(): Response<MovieList>
}