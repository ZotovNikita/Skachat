package com.example.dota2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import com.example.dota2.ui.theme.AppTheme


@Composable
fun DotaScreen() {
    LazyColumn(modifier = Modifier.
        fillMaxSize()
    ) {
        item{
            DotaScreenHeader()
        }
    }
}


@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier
    ) {
    HeaderBackground(
        painter = painterResource(R.drawable.main_header), modifier = modifier
    ) {
        Box(
            modifier = Modifier.padding(start = 24.dp, top = 294.dp)
        ) {
            Row {
                DotaLogo(modifier = Modifier)
            }
        }
    }
}


@Composable
private fun HeaderBackground(
    painter: Painter,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Box(modifier = modifier) {
        Image(
            painter = painter,
            contentDescription = "Header background",
            modifier = Modifier
                .fillMaxWidth()
                .height(354.dp),
            contentScale = ContentScale.Crop,
        )
        content()
    }
}


@Composable
private fun DotaLogo(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .size(88.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color = AppTheme.BgColors.logo_frame)
    ) {
        Box(
            modifier = modifier
                .size(84.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(color = AppTheme.BgColors.logo_box)
                .align(Alignment.Center)
        ) {
            Box(modifier = modifier.align(Alignment.Center)) {
                Image(
                    painter = painterResource(R.drawable.dota_logo),
                    contentDescription = "Dota logo",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.size(54.dp)
                )
            }
        }
    }
}


@Preview
@Composable
fun DotaScreenHeaderPreview() {
    Surface(
        color = AppTheme.BgColors.primary
    ) {
        DotaScreenHeader()
    }
}
