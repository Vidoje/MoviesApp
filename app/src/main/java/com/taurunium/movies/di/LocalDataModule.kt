package com.taurunium.movies.di

import com.taurunium.movies.data.datasource.MovieLocalDataSource
import com.taurunium.movies.data.datasourceimpl.MovieLocalDataSourceImpl
import com.taurunium.movies.data.db.MovieDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {
    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }
}