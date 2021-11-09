package com.example.rickmorty.factory

import com.example.rickmorty.repository.DataRepository

interface ApiServiceFactory {

    fun dataService(): DataRepository
}