package com.taurunium.movies.domain.repository

import com.taurunium.movies.data.model.Movie

interface MovieRepository {
    suspend fun getMovies(): List<Movie>?
    suspend fun updateMovies(): List<Movie>?
}