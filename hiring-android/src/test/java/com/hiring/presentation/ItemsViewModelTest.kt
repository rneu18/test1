package com.hiring.presentation

import com.hiring.domain.data.repository.ItemRepository
import io.mockk.mockk
import kotlinx.coroutines.test.StandardTestDispatcher

class ItemsViewModelTest {
    private val testDispatcher = StandardTestDispatcher()
    private val repository: ItemRepository = mockk<ItemRepository>()

}