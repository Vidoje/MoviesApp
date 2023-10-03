package com.taurunium.movies.data.datasource

import com.taurunium.movies.data.model.Movie

interface MovieLocalDataSource {
    suspend fun getMoviesFromDB(): List<Movie>

    suspend fun saveMoviesToDB(movies:List<Movie>)

    suspend fun clearAll()
}