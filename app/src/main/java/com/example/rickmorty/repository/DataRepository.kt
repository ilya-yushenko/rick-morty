package com.example.rickmorty.repository

import com.example.rickmorty.model.CharacterResponse

interface DataRepository {

    suspend fun getCharacters(): List<CharacterResponse>
}