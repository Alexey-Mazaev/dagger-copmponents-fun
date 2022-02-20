package com.example.dagger_copmponents_fun

import dagger.Component

@Component
interface AppComponent {

    fun inject(activity: MainActivity)
}