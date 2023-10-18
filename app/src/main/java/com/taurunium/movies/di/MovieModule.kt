package com.taurunium.movies.di

import com.taurunium.movies.domain.usecases.GetMoviesUseCase
import com.taurunium.movies.domain.usecases.UpdateMoviesUseCase
import com.taurunium.movies.presentation.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): ViewModelFactory {

        return ViewModelFactory(getMoviesUseCase, updateMoviesUseCase)
    }
}