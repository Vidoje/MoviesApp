package com.taurunium.movies.data.datasourceimpl

import com.taurunium.movies.data.datasource.MovieCacheDataSource
import com.taurunium.movies.data.model.Movie

class MovieCacheDataSourceImpl: MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}