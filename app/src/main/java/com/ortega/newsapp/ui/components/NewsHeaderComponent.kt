package com.ortega.newsapp.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ortega.newsapp.domain.model.Article


@Composable
fun NewsHeaderComponent(article: Article) {

    if (article.urlToImage == null) {
        ListItem(
            leadingContent = {
                ImageNewsComponent(url = "https://imageresizer.static9.net.au/GqP2_ZNyzogaKofOT6D29bG1_W4=/1920x0/filters:format(webp)/vms-tv-images-prod.s3-ap-southeast-2.amazonaws.com%2F2023%2F06%2F512511%2Fmel23_6pm_nextgen_hitch_clean_standardcard.png")
            },
            overlineContent = {
                Text(
                    text = article.author.toString()
                )
            },
            headlineContent = {
                Text(
                    text = article.title.toString()
                )
            }
        )
    } else {
        ListItem(
            overlineContent = {
                Text(
                    text = article.author.toString()
                )
            },
            headlineContent = {
                Text(
                    text = article.title.toString()
                )
            }
        )
    }
}
