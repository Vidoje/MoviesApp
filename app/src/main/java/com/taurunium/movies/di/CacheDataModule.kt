package com.taurunium.movies.di

import com.taurunium.movies.data.datasource.MovieCacheDataSource
import com.taurunium.movies.data.datasourceimpl.MovieCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }
}