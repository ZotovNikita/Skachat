package com.example.dota2.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.ui.theme.AppTheme
import com.example.dota2.ui.CommentUi
import com.example.dota2.ui.comments


@Composable
fun CommentBlock(
    commentUi: CommentUi,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Row {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .size(36.dp)
            ) {
                Image(
                    painter = painterResource(commentUi.user.avatar),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Column(
                modifier = Modifier.padding(start = 16.dp)
            ) {
                Text(
                    text = commentUi.user.name,
                    style = AppTheme.TextStyle.Normal_16,
                    color = AppTheme.TextColors.secondary,
                )
                Text(
                    text = commentUi.date,
                    style = AppTheme.TextStyle.Normal_12_19,
                    color = AppTheme.TextColors.date,
                )
            }
        }
        Text(
            text = "\"${commentUi.message}\"",
            style = AppTheme.TextStyle.Normal_12_20,
            color = AppTheme.TextColors.message,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}


@Preview
@Composable
fun CommentBlockPreview(
) {
    Surface(
        color = AppTheme.BgColors.primary,
    ) {
        CommentBlock(
            commentUi = comments[1],
            modifier = Modifier
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 16.dp
                )
        )
    }
}
