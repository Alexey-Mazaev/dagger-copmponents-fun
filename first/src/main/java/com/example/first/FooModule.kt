package com.example.first

import dagger.Module
import dagger.Provides

@Module
class FooModule {
    @Provides
    fun provideFoo(): Foo = Foo(title = "Foo")
}