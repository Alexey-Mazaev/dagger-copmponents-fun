package com.example.dagger_copmponents_fun;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/dagger_copmponents_fun/AppComponent;", "", "inject", "", "activity", "Lcom/example/dagger_copmponents_fun/MainActivity;", "app_debug"})
@dagger.Component(modules = {com.example.dagger_copmponents_fun.SubComponentsModule.class, com.example.first.FooModule.class, com.example.second.FightersModule.class})
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.dagger_copmponents_fun.MainActivity activity);
}