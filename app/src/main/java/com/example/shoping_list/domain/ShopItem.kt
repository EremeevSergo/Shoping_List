package com.example.shoping_list.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val enabled: Boolean,
    var id: Int = -1
)
{
    companion object{
        const val UNDEDINED_ID = -1
    }
}
