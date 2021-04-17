package com.example.recipeapp.ui

import android.content.Context
import com.example.recipeapp.ui.addRecipe.AddRecipePresenter
import com.example.recipeapp.ui.details.DetailsPresenter
import com.example.recipeapp.ui.main.MainPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UIModule(private val context: Context) {

    @Provides
    fun context() = context

    @Provides
    @Singleton
    fun mainPresenter() = MainPresenter()

    @Provides
    @Singleton
    fun addRecipePresenter() = AddRecipePresenter()

    @Provides
    @Singleton
    fun detailsPresenter() = DetailsPresenter()
}