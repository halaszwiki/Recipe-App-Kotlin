package com.example.recipeapp.network

import com.example.recipeapp.model.Recipe
import retrofit2.Call
import retrofit2.http.*

interface RecipeApi {
    @GET("Recipe")
    fun recipeList(): Call<Recipe>

    @POST("Recipe")
    fun recipeCreate(@Body data: Recipe)

    @GET("Recipe/{id}")
    fun recipeFindById(@Path("id") id: Double): Call<Recipe>

    @PUT("Recipe/{id}")
    fun recipeUpdate(@Path("id") id: Double, @Body data: Recipe)

    @DELETE("Recipe/{id}")
    fun recipeDeleteById(@Path("id") id: Double)
}