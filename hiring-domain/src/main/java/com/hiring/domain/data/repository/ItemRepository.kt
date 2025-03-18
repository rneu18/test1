package com.hiring.domain.data.repository

import com.hiring.domain.data.model.Item
import com.hiring.domain.service.ItemsService
import com.hiring.domain.service.RetrofitInstance
import com.hiring.domain.util.Result

interface ItemRepository {
    suspend fun getItems(): Result<List<Item>>
}

class ItemRepositoryImpl(
    private val api: ItemsService = RetrofitInstance.api
): ItemRepository {
    override suspend fun getItems(): Result<List<Item>> {
        // Update this to return actual value (result or error)
        return Result.Error(message = "error message", throwable = Throwable())
    }
}