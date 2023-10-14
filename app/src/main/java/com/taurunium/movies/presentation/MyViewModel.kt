package com.taurunium.movies.presentation

import androidx.lifecycle.liveData
import com.taurunium.movies.domain.usecases.GetMoviesUseCase
import com.taurunium.movies.domain.usecases.UpdateMoviesUseCase

class MyViewModel(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : androidx.lifecycle.ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMoviesUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMoviesUseCase.execute()
        emit(movieList)
    }


}