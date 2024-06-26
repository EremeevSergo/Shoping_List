package com.example.shoping_list.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList():List<ShopItem>


}