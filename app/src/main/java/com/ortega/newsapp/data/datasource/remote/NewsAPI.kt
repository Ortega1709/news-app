package com.ortega.newsapp.data.datasource.remote

import com.ortega.newsapp.domain.model.Article
import com.ortega.newsapp.domain.model.News
import com.ortega.newsapp.util.Constants.EVERYTHING_ENDPOINT
import com.ortega.newsapp.util.Constants.TOP_HEADLINES_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsAPI {

    @GET(EVERYTHING_ENDPOINT)
    suspend fun getEverything(@Query("q") q: String): Response<News>

    @GET(TOP_HEADLINES_ENDPOINT)
    suspend fun getTopHeadlinesByCountry(@Query("country") country: String): Response<News>

    @GET(TOP_HEADLINES_ENDPOINT)
    suspend fun getTopHeadlinesByCategory(@Query("category") category: String): Response<News>


}