package com.taurunium.movies.data.datasourceimpl

import com.taurunium.movies.data.datasource.MovieCacheDataSource
import com.taurunium.movies.data.model.Movie

class MovieCacheDataSourceImpl: MovieCacheDataSource {
    override suspend fun getMoviesFromCache(): List<Movie> {

    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {

    }
}