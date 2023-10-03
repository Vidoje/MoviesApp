package com.taurunium.movies.data.datasourceimpl

import com.taurunium.movies.data.datasource.MovieLocalDataSource
import com.taurunium.movies.data.db.MovieDao
import com.taurunium.movies.data.model.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDataSourceImpl(
    val movieDao: MovieDao
): MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> = movieDao.getMovies()

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteAllMovies()
        }
    }
}