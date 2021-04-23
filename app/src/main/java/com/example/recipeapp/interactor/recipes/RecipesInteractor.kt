package com.example.recipeapp.interactor.recipes

import com.example.recipeapp.network.RecipeApi
import javax.inject.Inject

class RecipesInteractor @Inject constructor(private var recipeApi: RecipeApi) {

    fun getRecipes(){}
}