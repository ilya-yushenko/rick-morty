package com.example.rickmorty.api

import com.example.rickmorty.model.CharacterResponse
import com.example.rickmorty.model.DataResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface DataRetrofitService {

    @GET("character/")
    suspend fun getCharacters(@QueryMap sort: Map<String, String>): DataResponse

    @GET("character/{id}")
    suspend fun getDetails(@Path("id") id: Int): CharacterResponse
}