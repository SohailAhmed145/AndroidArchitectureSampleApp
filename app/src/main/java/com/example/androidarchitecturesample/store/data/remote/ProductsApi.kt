package com.example.androidarchitecturesample.store.data.remote

import com.example.androidarchitecturesample.store.domain.model.Product
import retrofit2.http.GET

interface ProductsApi {

    @GET("products")
    suspend fun getProducts(): List<Product>

}