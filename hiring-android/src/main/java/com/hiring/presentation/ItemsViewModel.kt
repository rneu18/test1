package com.hiring.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hiring.domain.data.model.Item
import com.hiring.domain.data.repository.ItemRepository
import com.hiring.domain.data.repository.ItemRepositoryImpl
import com.hiring.domain.util.Result
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ItemsViewModel(
    private val repository: ItemRepository = ItemRepositoryImpl()
): ViewModel() {

    private val _uiState = MutableStateFlow(UiState())
    val uiState = _uiState.asStateFlow()

    /**
     * A function that fetches data from api calling a function from repository.
     * Once the response is received, it will update the uiState
     * with the appropriate state variable.
     * */
    private fun fetchItems() {
       // call data
    }

    /**
     * A function to filter and sort the list of items.
     * This will not include the item having the name null or empty.
     * This will sort the list by listId and then name of a item.
     * This will return a map of Int (listId) to List<Item>
     * */
    private fun List<Item>.filteredData(): Map<Int, List<Item>> = emptyMap()
}