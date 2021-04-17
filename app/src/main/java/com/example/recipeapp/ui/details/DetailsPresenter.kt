package com.example.recipeapp.ui.details

import com.example.recipeapp.model.Recipe
import com.example.recipeapp.ui.Presenter

class DetailsPresenter  : Presenter<DetailsScreen>() {
    fun showRecipeDetails(recipe: Recipe){
        screen?.showDetails(recipe)
    }
}