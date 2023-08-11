package com.ortega.newsapp.ui.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ortega.newsapp.domain.model.Article

@RequiresApi(Build.VERSION_CODES.S)
@Composable
fun NewsItemComponent(article: Article, onClick: () -> Unit) {

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }

    ) {
        
        NewsHeaderComponent(article = article)

        ListItem(
            leadingContent = {
                Text(
                    fontSize = 12.sp,
                    text = article.publishedAt.toString()
                )
            },
            headlineContent = { /*TODO*/ },
            trailingContent = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Rounded.MoreVert,
                        contentDescription = null
                    )
                }
            }
        )

    }

    Divider(
        thickness = .5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    )

}



