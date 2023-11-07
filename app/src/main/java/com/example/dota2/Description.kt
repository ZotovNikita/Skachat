package com.example.dota2

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dota2.ui.theme.AppTheme


@Composable
fun Description(description: String) {
    Text(
        text = description,
        modifier = Modifier.padding(top = 18.dp, start = 18.dp, end = 18.dp),
        style = AppTheme.TextStyle.Bold_12,
        color = AppTheme.TextColors.description
    )
}