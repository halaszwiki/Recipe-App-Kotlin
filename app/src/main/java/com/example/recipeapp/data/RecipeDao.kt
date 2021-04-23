package com.example.recipeapp.data

import androidx.room.*

@Dao
interface RecipeDao {

    @Query("SELECT * FROM recipe WHERE recipeId = :id")
    fun getRecipeById(id: Long): RecipeData

    @Query("SELECT * FROM recipe")
    fun getAllRecipes(): List<RecipeData>

    @Insert
    fun insertRecipe(vararg recipe: RecipeData)

    @Update
    fun updateRecipe(vararg recipe: RecipeData)

    @Delete
    fun deleteRecipe(grade: RecipeData)
}