package com.example.rickmorty.factory

import com.example.rickmorty.api.DataRetrofitService
import com.example.rickmorty.repository.DataRepository
import com.example.rickmorty.repository.DataRepositoryImpl

class ApiServiceFactoryImpl : ApiServiceFactory {

    override fun dataService(): DataRepository = DataRepositoryImpl(
        Retrofit().create(DataRetrofitService::class.java)
    )
}