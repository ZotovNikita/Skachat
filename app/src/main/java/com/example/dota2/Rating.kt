package com.example.dota2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


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
