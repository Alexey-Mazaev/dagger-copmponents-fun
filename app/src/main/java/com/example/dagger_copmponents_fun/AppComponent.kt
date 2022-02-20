package com.example.dagger_copmponents_fun

import com.example.first.FooModule
import com.example.second.FightersModule
import dagger.Component

@Component(modules = [SubComponentsModule::class, FooModule::class, FightersModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)
}