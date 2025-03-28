package com.hiring.domain.service

import com.hiring.domain.data.model.Item
import retrofit2.Response
import retrofit2.http.GET

interface ItemsService {

    @GET("") // TODO
    suspend fun getItems(): Response<List<Item>>
}