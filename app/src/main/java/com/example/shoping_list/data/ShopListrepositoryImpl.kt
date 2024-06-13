package com.example.shoping_list.data

import com.example.shoping_list.domain.ShopItem
import com.example.shoping_list.domain.ShopListRepository

object ShopListrepositoryImpl: ShopListRepository{

    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementID = 0

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEDINED_ID){
            shopItem.id = autoIncrementID++
        }
        shopList.add(shopItem)
    }

    override fun deleteItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getShopItem(shopItem.id)
        shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        return shopList.find { it.id == shopItemId } ?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }

}