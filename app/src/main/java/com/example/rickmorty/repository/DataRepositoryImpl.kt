package com.example.rickmorty.repository

import com.example.rickmorty.api.DataRetrofitService
import com.example.rickmorty.model.CharacterResponse

class DataRepositoryImpl(
    private val dataRetrofitService: DataRetrofitService
) : DataRepository {

    override suspend fun getCharacters(name: String): List<CharacterResponse> =
        dataRetrofitService.getCharacters(mapOf("name" to name)).characters

    override suspend fun getDetails(id: Int): CharacterResponse =
        dataRetrofitService.getDetails(id)
}