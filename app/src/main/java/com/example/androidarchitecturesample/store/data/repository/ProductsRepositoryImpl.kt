package com.example.androidarchitecturesample.store.data.repository

import arrow.core.Either
import com.example.androidarchitecturesample.store.data.mapper.toNetworkError
import com.example.androidarchitecturesample.store.data.remote.ProductsApi
import com.example.androidarchitecturesample.store.domain.model.NetworkError
import com.example.androidarchitecturesample.store.domain.model.Product
import com.example.androidarchitecturesample.store.domain.repository.ProductRespository
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val productApi: ProductsApi
): ProductRespository{
    override suspend fun getProducts(): Either<NetworkError, List<Product>> {
        return Either.catch {
         productApi.getProducts()
       }.mapLeft { it.toNetworkError() }
    }

}