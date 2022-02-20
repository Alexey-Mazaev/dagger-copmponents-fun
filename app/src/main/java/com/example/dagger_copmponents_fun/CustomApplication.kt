package com.example.dagger_copmponents_fun

import android.app.Application

class CustomApplication: Application() {
    val appComponent: AppComponent = DaggerAppComponent.create()
}