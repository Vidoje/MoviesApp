package com.taurunium.movies.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.taurunium.movies.domain.usecases.GetMoviesUseCase
import com.taurunium.movies.domain.usecases.UpdateMoviesUseCase

class ViewModelFactory(
    private val getMoviesUseCase: GetMoviesUseCase,
    private val updateMoviesUseCase: UpdateMoviesUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return com.taurunium.movies.presentation.MyViewModel(
            getMoviesUseCase,
            updateMoviesUseCase
        ) as T
    }
}