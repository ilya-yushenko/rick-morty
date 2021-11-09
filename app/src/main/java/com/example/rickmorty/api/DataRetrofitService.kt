package com.example.rickmorty.api

import com.example.rickmorty.model.DataResponse
import retrofit2.http.GET

interface DataRetrofitService {

    @GET("character")
    suspend fun getCharacters(): DataResponse
}