package com.ortega.newsapp.data.repository

import android.util.Log
import com.ortega.newsapp.data.datasource.remote.NewsAPI
import com.ortega.newsapp.util.Result
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import okhttp3.internal.wait
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsAPI: NewsAPI
) {

    fun getEverything(q: String) = flow {

        emit(Result.Loading())
        val response = newsAPI.getEverything(q).body()

        emit(Result.Success(data = response))
    }.catch {
        emit(Result.Error(data = null, message = it.message!!))
    }

    fun getTopHeadlinesByCountry(country: String) = flow {

        emit(Result.Loading())
        val response = newsAPI.getTopHeadlinesByCountry(country).body()

        emit(Result.Success(data = response))
    }.catch {
        emit(Result.Error(data = null, message = it.message!!))
    }

    fun getTopHeadlinesByCategory(category: String)  = flow {

        emit(Result.Loading())
        val response = newsAPI.getTopHeadlinesByCategory(category).body()

        emit(Result.Success(data = response))
    }.catch {
        emit(Result.Error(data = null, message = it.message!!))
    }

}