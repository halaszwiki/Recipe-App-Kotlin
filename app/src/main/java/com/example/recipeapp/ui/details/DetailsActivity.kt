package com.example.recipeapp.ui.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.R
import com.example.recipeapp.injector
import javax.inject.Inject

class DetailsActivity : AppCompatActivity() {

    @Inject
    lateinit var detailsPresenter: DetailsPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injector.inject(this)

      //  detailsPresenter.showRecipeDetails()
    }
   /* override fun showRecipeDetails(recipe) {
        TODO("Not yet implemented")
    }*/
}