package com.taurunium.movies.di

import com.taurunium.movies.presentation.MainActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {
    fun inject(movieActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create():MovieSubComponent
    }
}