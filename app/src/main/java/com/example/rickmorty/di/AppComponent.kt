package com.example.rickmorty.di

import com.example.rickmorty.ui.characters.CharactersFragment
import com.example.rickmorty.ui.details.CharacterDetailsFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun inject(charactersFragment: CharactersFragment)
    fun inject(characterDetailsFragment: CharacterDetailsFragment)

}