package com.ch.foodapp.data

import com.ch.foodapp.model.Food

interface FoodDataSource {
    fun getFoodData(): List<Food>
}

class FoodDataSourceImpl() : FoodDataSource {
    override fun getFoodData(): List<Food> {
        return mutableListOf(
            Food(
                imgUrl = "https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_sushi.jpg",
                name = "Sushi",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/blob/feature_navigation_component/app/src/main/res/drawable/img_taichan.jpg",
                name = "Taichan",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_spaghetti.jpg",
                name = "Spaghetti",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_ayampanggang.jpg",
                name = "Ayam Panggang",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_dimsum.jpg",
                name = "Dim Sum",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_kentang.jpg",
                name = "Kentang Goreng",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_burger.jpg",
                name = "Burger",
                price = "Rp. 28.000"
            )
        )
    }
}