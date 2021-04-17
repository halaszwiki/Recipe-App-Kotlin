package com.example.recipeapp

import android.app.Application

class RecipeAppApplication : Application() {
    lateinit var injector: RecipeAppApplicationComponent

    override fun onCreate() {
        super.onCreate()
    }
}