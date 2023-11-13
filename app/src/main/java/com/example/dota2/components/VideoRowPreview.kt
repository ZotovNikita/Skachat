package com.example.dota2.components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.Alignment
import com.example.dota2.R

import com.example.dota2.ui.theme.AppTheme


@Composable
fun VideoPreviewRow(
    previewResList: List<Int>,
    contentPadding: PaddingValues,
    onClick: () -> Unit) {

    LazyRow(
        contentPadding = contentPadding,
        horizontalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        items(previewResList) { previewRes ->
            Box {
                Image(
                    painter = painterResource(previewRes),
                    contentDescription = "Scenes",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(240.dp, height = 135.dp)
                        .clip(RoundedCornerShape(12.dp))
                )
                IconButton(
                    onClick = onClick,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                        .background(
                            color = AppTheme.ButtonColors.play_button.copy(alpha = 0.4f)
                        )
                        .align(Alignment.Center)
                ) {
                    Image(
                        painter = painterResource(R.drawable.play),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.Center)
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun VideoRowPreviewPreview() {
    val context = LocalContext.current
    VideoPreviewRow(
        previewResList = listOf(
            R.drawable.scene1,
            R.drawable.scene2,
        ),
        contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
        onClick = {
            Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show()
        }
    )
}
