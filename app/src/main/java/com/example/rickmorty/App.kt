package com.example.rickmorty

import android.app.Application
import com.example.rickmorty.di.AppComponent
import com.example.rickmorty.di.DaggerAppComponent

class App : Application() {

        val appComponent: AppComponent = DaggerAppComponent.create()
}