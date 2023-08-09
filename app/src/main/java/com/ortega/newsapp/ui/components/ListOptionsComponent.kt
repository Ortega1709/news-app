package com.ortega.newsapp.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.ortega.newsapp.R
import com.ortega.newsapp.util.Options
import com.ortega.newsapp.util.Paddings

@Composable
fun ListOptionsComponent(
    onClickCountry: () -> Unit,
    onClickInternational: () -> Unit,
    onClickBusiness: () -> Unit,
    onClickHealth: () -> Unit,
    onClickScience: () -> Unit,
    onClickSport: () -> Unit,
    onClickTechnology: () -> Unit,
    options: Options
) {

    LazyRow (
        contentPadding = PaddingValues(horizontal = Paddings.p16)
    ) {
        item {

            OptionComponent(
                onClick = onClickCountry,
                label = stringResource(R.string.france),
                isSelected = options == Options.COUNTRY
            )
            Spacer(modifier = Modifier.width(Paddings.p8))
            OptionComponent(
                onClick = onClickInternational,
                label = stringResource(R.string.internationel),
                isSelected = options == Options.INTERNATIONAL
            )
            Spacer(modifier = Modifier.width(Paddings.p8))
            OptionComponent(
                onClick = onClickBusiness,
                label = stringResource(R.string.business),
                isSelected = options == Options.BUSINESS
            )
            Spacer(modifier = Modifier.width(Paddings.p8))
            OptionComponent(
                onClick = onClickHealth,
                label = stringResource(R.string.health),
                isSelected = options == Options.HEALTH
            )
            Spacer(modifier = Modifier.width(Paddings.p8))
            OptionComponent(
                onClick = onClickScience,
                label = stringResource(R.string.sciences),
                isSelected = options == Options.SCIENCES
            )
            Spacer(modifier = Modifier.width(Paddings.p8))
            OptionComponent(
                onClick = onClickSport,
                label = stringResource(R.string.sports),
                isSelected = options == Options.SPORTS
            )
            Spacer(modifier = Modifier.width(Paddings.p8))
            OptionComponent(
                onClick = onClickTechnology,
                label = stringResource(R.string.technologies),
                isSelected = options == Options.TECHNOLOGY
            )

        }
    }
}