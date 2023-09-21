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
                price = "Rp. 40.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_taichan.jpg",
                name = "Taichan",
                price = "Rp. 20.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1

            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_spaghetti.jpg",
                name = "Spaghetti",
                price = "Rp. 38.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_ayampanggang.jpg",
                name = "Ayam Panggang",
                price = "Rp. 18.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_dimsum.jpg",
                name = "Dim Sum",
                price = "Rp. 25.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_kentang.jpg",
                name = "Kentang Goreng",
                price = "Rp. 10.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_burger.jpg",
                name = "Burger",
                price = "Rp. 30.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            )
        )
    }
}