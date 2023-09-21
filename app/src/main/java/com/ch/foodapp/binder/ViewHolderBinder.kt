package com.ch.foodapp.binder

import com.ch.foodapp.model.Food

interface ViewHolderBinder<T> {
    fun bind(item: Food)
}