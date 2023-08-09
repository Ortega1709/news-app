package com.ortega.newsapp.ui.screens.news

import com.ortega.newsapp.domain.model.News

data class NewsState(
    val isLoading: Boolean = false,
    var news: News? = null,
    val error: String? = null
)
