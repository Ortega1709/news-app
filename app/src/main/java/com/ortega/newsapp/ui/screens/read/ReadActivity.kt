package com.ortega.newsapp.ui.screens.read

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ortega.newsapp.ui.theme.NewsAppTheme

class ReadActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val url = intent.getStringExtra("url")

        setContent {



            NewsAppTheme {
                ReadScreen(url!!)
            }
        }
    }
}
