package com.example.dagger_copmponents_fun

import com.example.core.ThirdComponent
import com.example.first.FirstComponent
import com.example.second.SecondComponent
import dagger.Module

@Module(subcomponents = [FirstComponent::class, SecondComponent::class, ThirdComponent::class])
class SubComponentsModule