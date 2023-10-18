package com.taurunium.movies.di

import com.taurunium.movies.data.MovieRepositoryImpl
import com.taurunium.movies.data.datasource.MovieCacheDataSource
import com.taurunium.movies.data.datasource.MovieLocalDataSource
import com.taurunium.movies.data.datasource.MovieRemoteDataSource
import com.taurunium.movies.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MovieRepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {
        return MovieRepositoryImpl(
            movieRemoteDataSource,
            movieLocalDataSource,
            movieCacheDataSource
        )
    }
}