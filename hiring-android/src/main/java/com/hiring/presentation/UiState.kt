package com.hiring.presentation

import com.hiring.domain.data.model.Item

/*
* refactor this to make sealed class that has Loading, Error and Success
*
* */
data class UiState(
    val itemsMap: Map<Int, List<Item>> = emptyMap(),
    val errorMessage: String? = null,
    val isLoading: Boolean = true
)
