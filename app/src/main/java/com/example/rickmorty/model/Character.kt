package com.example.rickmorty.model

data class Character(
    val gender: String,
    val id: Int,
    val image: String,
    val name: String,
    val species: String,
    val status: String
)

fun CharacterResponse.toCharacter() = Character(
    gender = gender,
    id = id,
    image = image,
    name = name,
    species = species,
    status = status
)
