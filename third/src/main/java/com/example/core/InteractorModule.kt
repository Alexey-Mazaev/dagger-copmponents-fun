package com.example.core

import com.example.first.Foo
import com.example.second.Fighters
import dagger.Module
import dagger.Provides

@Module
class InteractorModule {
    @Provides
    fun provideMessageInteractor(foo: Foo, fighters: Fighters): MessageInteractor =
        MessageInteractor(foo, fighters)
}