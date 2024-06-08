package com.example.shoping_list.domain

class DeleteItemUseCase(private val shopListRepository: ShopListRepository){
    fun deleteItem(shopItem: ShopItem){
        shopListRepository.deleteItem(shopItem)
    }
}