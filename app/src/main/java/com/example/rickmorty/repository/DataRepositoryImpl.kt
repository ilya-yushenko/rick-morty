package com.example.rickmorty.repository

import com.example.rickmorty.api.DataRetrofitService
import com.example.rickmorty.model.CharacterResponse

class DataRepositoryImpl(
    private val dataRetrofitService: DataRetrofitService
) : DataRepository {

    override suspend fun getCharacters(): List<CharacterResponse> =
        dataRetrofitService.getCharacters().characters

}