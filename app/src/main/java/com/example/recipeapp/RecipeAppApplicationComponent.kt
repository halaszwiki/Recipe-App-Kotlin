package com.example.recipeapp

import com.example.recipeapp.ui.addRecipe.AddRecipeActivity
import com.example.recipeapp.ui.details.DetailsActivity
import com.example.recipeapp.ui.main.MainActivity
import dagger.Component

@Component
interface RecipeAppApplicationComponent{
    fun inject(mainActivity: MainActivity)
    fun inject(detailsActivity: DetailsActivity)
    fun inject(addRecipeActivity: AddRecipeActivity)
}