package com.example.core

import dagger.Binds
import dagger.Module

@Module
abstract class MessageComponent {
    @Binds
    abstract fun provideMessageInteractor(interactor: MessageInteractor): MessageInteractor
}