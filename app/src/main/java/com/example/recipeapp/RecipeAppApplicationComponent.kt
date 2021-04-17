package com.example.recipeapp

import com.example.recipeapp.ui.main.MainActivity
import dagger.Component

@Component
interface RecipeAppApplicationComponent{
    fun inject(mainActivity: MainActivity)
}