package com.example.recipeapp.interactor

import com.example.recipeapp.interactor.recipes.RecipesInteractor
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun provideRecipesInteractor() = RecipesInteractor()
}