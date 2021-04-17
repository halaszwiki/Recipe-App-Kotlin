package com.example.recipeapp.ui.main

import com.example.recipeapp.ui.Presenter

class MainPresenter : Presenter<MainScreen>() {
    fun showRecipeList(){
        screen?.showRecipes()
    }
}