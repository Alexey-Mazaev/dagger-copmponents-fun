package com.example.core

import com.example.first.FirstComponent
import com.example.second.SecondComponent
import dagger.Module

@Module(
    subcomponents = [FirstComponent::class, SecondComponent::class]
)
class SubComponentsModule