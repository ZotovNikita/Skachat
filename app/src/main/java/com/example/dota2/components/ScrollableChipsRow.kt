package com.example.dota2.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.ui.theme.AppTheme

@Composable
fun ScrollableChipsRow(
    items: List<String>,
    chipContent: (String) -> String,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues,
    chipsPaddindgValues: PaddingValues
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = contentPadding,
        modifier = modifier
    ) {
        items(items) { item ->
            Chip(
                content = chipContent(item),
                paddingValues = chipsPaddindgValues,
                backgroundColor = AppTheme.BgColors.secondary,
            )
        }
    }
}


@Composable
fun Chip(content: String, paddingValues: PaddingValues, backgroundColor: Color) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(color = backgroundColor)
            .padding(paddingValues)
    ) {
        Text(
            text = content,
            color = AppTheme.TextColors.chip,
            style = AppTheme.TextStyle.Medium_10_12,
        )
    }
}


@Preview
@Composable
fun DotaScrollableChipsRowPreview() {
    Surface(
        color = AppTheme.BgColors.primary
    ) {
        ScrollableChipsRow(
            items = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
            chipContent = { item -> item },
            modifier = Modifier.padding(top = 16.dp, bottom = 30.dp),
            contentPadding = PaddingValues(start = 24.dp),
            chipsPaddindgValues = PaddingValues(horizontal = 10.dp, vertical = 5.dp)
        )
    }
}
