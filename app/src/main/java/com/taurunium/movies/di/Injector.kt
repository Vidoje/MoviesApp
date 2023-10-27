package com.taurunium.movies.di

interface Injector {
    fun createMovieSubComponent():MovieSubComponent
}