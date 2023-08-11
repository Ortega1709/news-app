package com.ortega.newsapp.ui.components

import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.ortega.newsapp.domain.model.News
import com.ortega.newsapp.ui.screens.read.ReadActivity

@RequiresApi(Build.VERSION_CODES.S)
@Composable
fun ListNewsComponent(
    news: News,
) {

    val context = LocalContext.current

    LazyColumn {
        items(news.articles) {
            NewsItemComponent(
                article = it,
                onClick = {
                    val intent = Intent(context, ReadActivity::class.java)
                    intent.putExtra("url", it.url)
                    context.startActivity(intent)
                }
            )
        }
    }

}