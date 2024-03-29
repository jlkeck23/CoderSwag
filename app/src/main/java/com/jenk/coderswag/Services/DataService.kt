package com.jenk.coderswag.Services

import com.jenk.coderswag.Model.Category
import com.jenk.coderswag.Model.Product

object DataService {

    val categories = listOf(
            Category("Shirts", "shirtimage"),
            Category("Hoodies", "hoodieimage"),
            Category("Hats", "hatimage"),
            Category("Digital","digitalgoodsimage")
            )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","$18","hat01"),
            Product("Devslopes Hat Black","$20","hat02"),
            Product("Devslopes Hat White","$18","hat03"),
            Product("Devslopes Hat Snapback","$22","hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Grey", "$28","hoodie01"),
            Product("Devslopes Hoodie Red", "$32","hoodie02"),
            Product("Devslopes Grey Hoodie", "$28","hoodie03"),
            Product("Devslopes Black Hoodie", "$32","hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18","shirt01"),
            Product("Devslopes Badge Light Grey", "$20","shirt02"),
            Product("Devslopes Logo Shirt Red", "$22","shirt03"),
            Product("Devslopes Hustle", "$22","shirt04"),
            Product("Kickflip Studio","18","shirt05")
    )

}