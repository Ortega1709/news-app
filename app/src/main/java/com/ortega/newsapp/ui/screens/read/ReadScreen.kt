package com.ortega.newsapp.ui.screens.read

import android.annotation.SuppressLint
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun ReadScreen() {

    val context = LocalContext.current

    AndroidView(
        factory = {
        WebView(context)
            .apply {
                webViewClient = WebViewClient()
                settings.javaScriptEnabled = true
                loadUrl("https://github.com/Ortega1709")
        }
    })

}