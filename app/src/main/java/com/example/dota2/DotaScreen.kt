package com.example.dota2

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import com.example.dota2.ui.theme.AppTheme


@Composable
fun DotaScreen() {
    LazyColumn(modifier = Modifier.
        fillMaxSize()
    ) {
        item{
            DotaScreenHeader()
        }



        item {
            ScrollableChipsRow(
                items = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
                chipContent = {item -> item},
                modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
                contentPadding = PaddingValues(start = 24.dp, end = 24.dp),
                chipsPaddindgValues = PaddingValues(horizontal = 10.dp, vertical = 5.dp)
            )
            Text(
                text = stringResource(id = R.string.description),
                style = AppTheme.TextStyle.Normal_12_19,
                color = AppTheme.TextColors.description,
                modifier = Modifier.padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 14.dp,
                    bottom = 14.dp
                )
            )

        }
        item{
            VideoPreviewRow(
                previewResList = listOf(
                    R.drawable.scene1,
                    R.drawable.scene2,
                ), contentPadding = PaddingValues(start = 24.dp, end = 24.dp)
            )
        }
        item {
            InstallButton()
        }

    }
}


@Composable
fun DotaScreenHeader(
    modifier: Modifier = Modifier
    ) {
    HeaderBackground(
        painter = painterResource(R.drawable.main_header),
        modifier = modifier
    ) {
        Box(
            modifier = Modifier
                .padding(start = 24.dp, top = 294.dp)
                .width(170.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                DotaLogo(modifier = Modifier)
                Text(
                    text = stringResource(id = R.string.dota2),
                    style = AppTheme.TextStyle.Bold_20,
                    color = AppTheme.TextColors.dota_name,
                    modifier = Modifier.
                    padding(start = 12.dp)
                )
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
            .background(color = AppTheme.LogoColors.logo_frame)
    ) {
        Box(
            modifier = modifier
                .size(84.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(color = AppTheme.LogoColors.logo_box)
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
