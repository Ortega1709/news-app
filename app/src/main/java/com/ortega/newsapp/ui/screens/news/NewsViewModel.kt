package com.ortega.newsapp.ui.screens.news

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ortega.newsapp.data.repository.NewsRepository
import com.ortega.newsapp.util.Result
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository
): ViewModel() {

    var state by mutableStateOf(NewsState())

    init {
        getTopHeadlinesByCountry("fr")
    }

    fun getEverything(q: String) {

        viewModelScope.launch {
            newsRepository.getEverything(q).collect {
                state = when (it) {
                    is Result.Loading -> {
                        state.copy(isLoading = true)
                    }

                    is Result.Success -> {
                        state.copy(news = it.data, isLoading = false)
                    }

                    is Result.Error -> {
                        state.copy(error = it.message, isLoading = false)
                    }
                }
            }
        }
    }

    fun getTopHeadlinesByCountry(country: String) {

        viewModelScope.launch {
            newsRepository.getTopHeadlinesByCountry(country).collect {
                state = when (it) {
                    is Result.Loading -> {
                        state.copy(isLoading = true)
                    }

                    is Result.Success -> {
                        state.copy(news = it.data, isLoading = false)
                    }

                    is Result.Error -> {
                        state.copy(error = it.message, isLoading = false)
                    }
                }
            }
        }

    }

    fun getTopHeadlinesByCategory(category: String) {

        viewModelScope.launch {
            newsRepository.getTopHeadlinesByCategory(category).collect {
                state = when (it) {
                    is Result.Loading -> {
                        state.copy(isLoading = true)
                    }

                    is Result.Success -> {
                        state.copy(news = it.data, isLoading = false)
                    }

                    is Result.Error -> {
                        state.copy(error = it.message, isLoading = false)
                    }
                }
            }
        }

    }

}