package com.example.recipeapp.ui

import com.example.recipeapp.ui.main.MainActivity

abstract class Presenter<S> {
    protected var screen: S? = null

    open fun attachScreen(screen: MainActivity) {
        this.screen = screen
    }

    open fun detachScreen() {
        this.screen = null
    }
}