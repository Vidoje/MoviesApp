package com.taurunium.movies.data.datasource

import com.taurunium.movies.data.model.Movie

interface MovieCacheDataSource {
    suspend fun getMoviesFromCache(): List<Movie>

    suspend fun saveMoviesToCache(movies:List<Movie>)
}