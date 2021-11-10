package com.example.rickmorty.repository

import com.example.rickmorty.model.CharacterResponse

interface DataRepository {

    suspend fun getCharacters(name: String): List<CharacterResponse>
    suspend fun getDetails(id: Int): CharacterResponse
}