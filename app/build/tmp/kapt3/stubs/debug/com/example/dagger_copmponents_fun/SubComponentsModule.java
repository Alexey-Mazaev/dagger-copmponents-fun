package com.example.dagger_copmponents_fun;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/dagger_copmponents_fun/SubComponentsModule;", "", "()V", "app_debug"})
@dagger.Module(subcomponents = {com.example.first.FirstComponent.class, com.example.second.SecondComponent.class, com.example.core.ThirdComponent.class})
public final class SubComponentsModule {
    
    public SubComponentsModule() {
        super();
    }
}