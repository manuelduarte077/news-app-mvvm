package com.thecodemonters.newapp.provider

import com.thecodemonters.newapp.model.NewsApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "11c9aec0bb8e4e45bffffa391ecf22c2"

interface NewsProvider {

    @GET("top-headlines?apiKey=$API_KEY")
    suspend fun topHeadLines(@Query("country") country: String): Response<NewsApiResponse>
}