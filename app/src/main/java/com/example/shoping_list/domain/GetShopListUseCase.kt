package com.example.shoping_list.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository){
    fun getShopList():List<ShopItem>{
        return shopListRepository.getShopList()
    }
}