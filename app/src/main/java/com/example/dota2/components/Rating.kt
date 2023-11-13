package com.example.dota2.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.R
import com.example.dota2.ui.theme.AppTheme


@Composable
fun Rating(
    modifier: Modifier = Modifier,
    rating: Float
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        val integerStars = rating.toInt()
        for (i in 1..integerStars) {
            Image(
                painter = painterResource(R.drawable.star),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 4.dp)
                    .width(12.dp)
                    .height(12.dp)
            )
        }
        if (rating > integerStars.toFloat()){
            Image(
                painter = painterResource(R.drawable.half_of_star),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 4.dp)
                    .width(12.dp)
                    .height(12.dp)
            )
        }
    }
}


@Preview
@Composable
fun DotaRatingPreview() {
    Surface(
        color = AppTheme.BgColors.primary
    ) {
        Rating(
            modifier = Modifier
                .padding(start = 12.dp)
                .height(14.dp)
                .width(90.dp),
            rating = 3.1f
        )
    }
}
