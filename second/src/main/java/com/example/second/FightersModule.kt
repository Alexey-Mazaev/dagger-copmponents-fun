package com.example.second

import dagger.Module
import dagger.Provides

@Module
class FightersModule {
    @Provides
    fun provideFighters(): Fighters = Fighters(title = "fighters")
}