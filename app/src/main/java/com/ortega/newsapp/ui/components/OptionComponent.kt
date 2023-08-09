package com.ortega.newsapp.ui.components

import androidx.compose.material3.AssistChip
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ElevatedSuggestionChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OptionComponent(
    onClick: () -> Unit,
    label: String,
    isSelected: Boolean = false
) {

    ElevatedFilterChip(
        selected = isSelected,
        onClick = onClick,
        label = { Text(text = label) },
    )

}