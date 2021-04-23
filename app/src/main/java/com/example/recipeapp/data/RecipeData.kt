package com.example.recipeapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "recipe")
data class RecipeData(
    @PrimaryKey(autoGenerate = true) var recipeid: Long?,
    @ColumnInfo(name = "recipename") var recipename: String,
    @ColumnInfo(name = "ingredients") var ingredients: List<String>,
    @ColumnInfo(name = "imageurl") var imageUrl: String
)