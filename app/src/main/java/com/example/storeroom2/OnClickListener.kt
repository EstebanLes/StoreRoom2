package com.example.storeroom2

interface OnClickListener {
    fun onClick (storeEntity: StoreEntity)
    fun onFavoriteStore(storeEntity: StoreEntity)
    fun onDeleteStore(storeEntity: StoreEntity)
}