package com.ortega.newsapp.ui.screens.news

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ListItem
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.ortega.newsapp.R
import com.ortega.newsapp.ui.components.CircularProgressComponent
import com.ortega.newsapp.ui.components.ListOptionsComponent
import com.ortega.newsapp.util.Options
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsScreen(viewModel: NewsViewModel = hiltViewModel()) {

    var options by rememberSaveable { mutableStateOf(Options.COUNTRY) }
    val state = viewModel.state

    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name)) },
                actions = {  }
            )
        },
        bottomBar = {

        }
    ) { paddingValues ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            ListOptionsComponent(
                onClickCountry = {
                    options = Options.COUNTRY
                },
                onClickBusiness = {
                    options = Options.BUSINESS
                },
                onClickHealth = {
                    options = Options.HEALTH
                },
                onClickScience = {
                    options = Options.SCIENCES
                },
                onClickInternational = {
                    options = Options.INTERNATIONAL
                },
                onClickSport = {
                    options = Options.SPORTS
                },
                onClickTechnology = {
                    options = Options.TECHNOLOGY
                },
                options = options
            )

            LazyColumn {
                item {
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                    ListItem(headlineContent = { Text(text = "Info") })
                }
            }

        }
    }

}

@Composable
fun NewsScreenCompact() {

}


//            if (state.isLoading) {
//                LoadingComponent()
//            } else {
//                if (state.news != null) {
//                    Text(text = state.news!!.articles.size.toString())
//
//                } else {
//                    Text(text = state.error!!)
//                }
//            }
