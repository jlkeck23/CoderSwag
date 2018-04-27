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

}