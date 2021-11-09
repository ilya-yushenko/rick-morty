package com.example.rickmorty.di

import com.example.rickmorty.factory.ApiServiceFactory
import com.example.rickmorty.factory.ApiServiceFactoryImpl
import com.example.rickmorty.repository.DataRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun apiServicesFactory(): ApiServiceFactory = ApiServiceFactoryImpl()

    @Singleton
    @Provides
    fun provideDataRepository(factory: ApiServiceFactory): DataRepository =
        factory.dataService()
}