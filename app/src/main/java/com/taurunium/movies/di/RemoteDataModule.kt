package com.taurunium.movies.di

import com.taurunium.movies.data.api.TMDBService
import com.taurunium.movies.data.datasource.MovieRemoteDataSource
import com.taurunium.movies.data.datasourceimpl.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(
        tmdbService: TMDBService
    ): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(tmdbService, apiKey)
    }
}