package com.example.rickmorty.model


import com.google.gson.annotations.SerializedName

data class DataResponse(
    @SerializedName("results")
    val characters: List<CharacterResponse>
)