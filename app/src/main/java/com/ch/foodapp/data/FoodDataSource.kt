package com.ch.foodapp.data

import com.ch.foodapp.model.Food

interface FoodDataSource {
    fun getFoodData(): List<Food>
}

class FoodDataSourceImpl() : FoodDataSource {
    override fun getFoodData(): List<Food> {
        return mutableListOf(
            Food(
                imgUrl = "https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_sushi.webp",
                name = "Sushi",
                price = "Rp. 50.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 2
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_taichan.webp",
                name = "Taichan",
                price = "Rp. 30.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1

            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_spaghetti.webp",
                name = "Spaghetti",
                price = "Rp. 48.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_ayamgpanggang.webp",
                name = "Ayam Panggang",
                price = "Rp. 12.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_kopi.webp",
                name = "Kopi",
                price = "Rp. 5.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_kentang.webp",
                name = "Kentang Goreng",
                price = "Rp. 10.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            ),
            Food(
                imgUrl="https://raw.githubusercontent.com/ryhanhxx/Challenge-BinarAndroid/feature_navigation_component/app/src/main/res/drawable/img_burger.webp",
                name = "Burger",
                price = "Rp. 30.000",
                desc = "A variant of traditional Chinese dumplings served steamed and fried.",
                quantity = 1
            )
        )
    }
}