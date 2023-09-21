package com.ch.foodapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.util.UUID

@Parcelize
data class Food(
    val id: String = UUID.randomUUID().toString(),
    val imgUrl: String,
    val name: String,
    val price: String,
    val desc: String,
    val quantity: Int,
): Parcelable
