package com.example.first

import dagger.Subcomponent

@Subcomponent(
    modules = [FooModule::class]
)
interface FirstComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(fooModule: FooModule): FirstComponent
    }
}