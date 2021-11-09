package com.example.rickmorty.di

import com.example.rickmorty.ui.characters.CharactersFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun inject(charactersFragment: CharactersFragment)

}