package com.ortega.newsapp.ui.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortega.newsapp.R
import com.ortega.newsapp.domain.model.Article
import com.ortega.newsapp.domain.model.News
import com.ortega.newsapp.domain.model.Source
import com.ortega.newsapp.ui.theme.NewsAppTheme
import com.ortega.newsapp.util.TimeBetween

@RequiresApi(Build.VERSION_CODES.S)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsItemComponent(article: Article) {

    Column (
        modifier = Modifier.fillMaxWidth()
    ) {

        ListItem(
            leadingContent = {
                if (article.urlToImage != null) {
                    Card(
                        modifier = Modifier.size(100.dp)
                    ) {

                    }
                }
            },
            overlineContent = {
                Text(
                    text = article.author.toString(),
                    overflow = TextOverflow.Ellipsis,
                )
            },
            headlineContent = { Text(
                text = article.title.toString(),
                overflow = TextOverflow.Ellipsis,
            ) },
            supportingContent = {
                Text(
                    text = article.content.toString(),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 3
                )
            }
        )

        ListItem(
            leadingContent = {
                Text(
                    modifier = Modifier.padding(horizontal = 12.dp),
                    text = TimeBetween()
                        .getTimeBetween(article.publishedAt.toString()),
                    fontSize = 12.sp
                )
            },
            headlineContent = { },
            trailingContent = {
                Icon(
                    imageVector = Icons.Rounded.MoreVert,
                    contentDescription = null,
                )
            },
        )

    }

    Divider(
        thickness = .5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    )

}



