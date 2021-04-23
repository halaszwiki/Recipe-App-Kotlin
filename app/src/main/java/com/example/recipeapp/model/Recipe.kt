package com.example.recipeapp.model

import com.google.gson.annotations.SerializedName

data class Recipe(
        @SerializedName("imageUrl")
        var imageUrl: String? = null,
        @SerializedName("ingredients")
        var ingredients: List<String>? = null,
        @SerializedName("id")
        var id: Double? = null
        )

