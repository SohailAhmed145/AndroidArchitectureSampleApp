package com.example.androidarchitecturesample.store.presentation.products_screen

import com.example.androidarchitecturesample.store.domain.model.Product

data class ProductsViewState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null

)