package com.example.androidarchitecturesample.store.domain.repository

import arrow.core.Either
import com.example.androidarchitecturesample.store.domain.model.NetworkError
import com.example.androidarchitecturesample.store.domain.model.Product

interface ProductRespository {
    suspend fun getProducts(): Either<NetworkError, List<Product>>
}