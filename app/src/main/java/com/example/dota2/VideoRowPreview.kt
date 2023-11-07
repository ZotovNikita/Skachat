package com.example.dota2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun VideoPreviewRow(previewResList: List<Int>, contentPadding: PaddingValues) {
    LazyRow(
        contentPadding = contentPadding,
        horizontalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        items(previewResList) { previewRes ->
            Box(modifier = Modifier
                .width(240.dp)
                .height(135.dp)) {
                Image(
                    painter = painterResource(previewRes),
                    contentDescription = "Scenes",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(12.dp))
                )
            }
        }
    }
}


@Preview
@Composable
fun VideoRowPreviewPreview() {
    VideoPreviewRow(
        previewResList = listOf(
            R.drawable.scene1,
            R.drawable.scene2,
        ), contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
    )
}