package com.ch.foodapp.data

import com.ch.foodapp.model.Food

interface FoodDataSource {
    fun getFoodData(): List<Food>
}

class FoodDataSourceImpl() : FoodDataSource {
    override fun getFoodData(): List<Food> {
        return mutableListOf(
            Food(
                imgUrl = "https://lh3.googleusercontent.com/u/0/drive-viewer/AITFw-weCt-VPnfhvbGA81kYCVYPbxb1tSAT7FrnU-U0NGWIEGtDE00igz04FrgYgn_dPRBlqDEcePE4L-03awyvoc0DX0Dymw=w1910-h842",
                name = "Sushi",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://lh3.googleusercontent.com/u/0/drive-viewer/AITFw-xmA2qL_45VfsCdqwDkI3HMmbFlhq4IZC9uTbEHGTjDDU0qTbLHTXL63crRU61uAqggCoX_AtKTY-umn4sBQojHla4C=w1910-h842",
                name = "Taichan",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://lh3.googleusercontent.com/u/0/drive-viewer/AITFw-xb2dax6LwObhNgKnB-iJhbZ2DvPQT0hRzzgCc3KmloIdgcaIH7YyILmyP8GYT-jBe2fB_utYioTkaV5Fwo0apTyaAn3g=w1910-h842",
                name = "Spaghetti",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://lh3.googleusercontent.com/u/0/drive-viewer/AITFw-yik0xK-0dzjNV0UASpNDgCqF0baJOpD6GcJnQJAIjufFZZvIonaf0CFJlSWZl1-KtMOdr7yTRye5HLIotMDQoPP9iCow=w1910-h842",
                name = "Ayam Panggang",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://lh3.googleusercontent.com/u/0/drive-viewer/AITFw-zXlAlZQH_6CFkJZjF58mHEXV2KjrYpjqwpq_eHn9SfPmfTa0oQYz9ucedkwZzHuWjOvbpGDPuu3p5wrpEY9hvsHvVl=w1910-h842",
                name = "Dim Sum",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://lh3.googleusercontent.com/u/0/drive-viewer/AITFw-w6LHfxiChWGo9SbUst70WPJyRZbm2W8mK4GUx6EvcYyLJ-VG8wASb4wryWpgf_DOF3opC9gspOyVVzBjEx0W-AF3R5=w1910-h842",
                name = "Kentang Goreng",
                price = "Rp. 28.000"
            ),
            Food(
                imgUrl="https://lh3.googleusercontent.com/u/0/drive-viewer/AITFw-z_XhlTDw4jwvenMC1ZScCdylqre_T4VLIufHKi7nYqtyGGsgoCZfgfGgyDwCOc9kpfs5kRkvcTHHm-_Iak8llWqzbY=w1910-h842",
                name = "Burger",
                price = "Rp. 28.000"
            )
        )
    }
}