package com.example.dota2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.dota2.ui.theme.AppTheme


@Composable
fun RatingReview(
    rating: Float,
    downloads: String,
    modifier: Modifier
) {
    Row(modifier = modifier) {
        Text(
            text = rating.toString(),
            style = AppTheme.TextStyle.Bold_48,
            color = AppTheme.TextColors.primary,
        )
        Column(
            modifier = Modifier.padding(
                start = 16.dp,
                top = 16.dp,
                bottom = 8.dp
            )
        ) {
            Rating(
                modifier = Modifier
                    .size(90.dp, 12.dp),
                rating = rating
            )
            Text(
                text = "$downloads Reviews",
                style = AppTheme.TextStyle.Normal_12,
                color = AppTheme.TextColors.message,
            )
        }
    }
}
