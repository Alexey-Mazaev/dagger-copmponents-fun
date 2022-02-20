package com.example.core

import dagger.Subcomponent

@Subcomponent(
    modules = [SubComponentsModule::class]
)
interface ThirdComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): ThirdComponent
    }
}