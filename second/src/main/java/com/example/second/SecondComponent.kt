package com.example.second

import dagger.Subcomponent

@Subcomponent(
    modules = [FightersModule::class]
)
interface SecondComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(fightersModule: FightersModule): SecondComponent
    }
}