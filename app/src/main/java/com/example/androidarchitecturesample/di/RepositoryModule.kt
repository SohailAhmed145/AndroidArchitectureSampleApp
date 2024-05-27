package com.example.androidarchitecturesample.di

import com.example.androidarchitecturesample.store.data.repository.ProductsRepositoryImpl
import com.example.androidarchitecturesample.store.domain.repository.ProductRespository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRepository(impl: ProductsRepositoryImpl): ProductRespository
}