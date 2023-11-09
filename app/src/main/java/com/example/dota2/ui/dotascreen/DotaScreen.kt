package com.example.dota2.ui.dotascreen

import DotaScreenHeader
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.ui.res.stringResource
import com.example.dota2.components.CommentBlock
import com.example.dota2.components.PrimaryOvalButton
import com.example.dota2.R
import com.example.dota2.components.RatingReview
import com.example.dota2.components.ScrollableChipsRow
import com.example.dota2.components.VideoPreviewRow
import com.example.dota2.ui.theme.AppTheme
import com.example.dota2.ui.comments


@Composable
fun DotaScreen() {

    val context = LocalContext.current
    val lazyListState = rememberLazyListState()

    LazyColumn(
        state = lazyListState,
        modifier = Modifier
            .fillMaxSize()
    ) {
        item {
            DotaScreenHeader()
        }

        item {
            ScrollableChipsRow(
                items = listOf("MOBA", "MULTIPLAYER", "STRATEGY"),
                chipContent = { item -> item },
                modifier = Modifier.padding(top = 16.dp, bottom = 30.dp),
                contentPadding = PaddingValues(start = 24.dp),
                chipsPaddindgValues = PaddingValues(horizontal = 10.dp, vertical = 5.dp)
            )
            Text(
                text = stringResource(id = R.string.description),
                style = AppTheme.TextStyle.Normal_12_19,
                color = AppTheme.TextColors.primary,
                modifier = Modifier.padding(
                    start = 21.dp,
                    end = 27.dp,
                    bottom = 15.dp
                )
            )

        }
        item {
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
        item {
            Text(
                text = stringResource(R.string.rating),
                style = AppTheme.TextStyle.Bold_16,
                color = AppTheme.TextColors.secondary,
                modifier = Modifier.padding(
                    start = 24.dp,
                    top = 20.dp
                )
            )
        }
        item{
            RatingReview(
                rating = 4.9f,
                downloads = stringResource(id = R.string.downloads),
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        top = 12.dp,
                        bottom = 32.dp
                    )
            )
        }
        itemsIndexed(comments) { index, item ->
            CommentBlock(
                commentUi = item,
                modifier = Modifier
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        bottom = 24.dp
                    )
            )
            if (index < comments.lastIndex) {
                Divider(
                    color = AppTheme.BgColors.divider,
                    thickness = 1.dp,
                    modifier = Modifier.padding(top = 12.dp, bottom = 18.dp)
                )
            }
        }
        item {
            PrimaryOvalButton(
                text = stringResource(id = R.string.button),
                onClick = {
                    Toast.makeText(context, "CLICKED", Toast.LENGTH_LONG).show()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 24.dp,
                        end = 24.dp,
                        top = 16.dp,
                        bottom = 38.dp
                    )
            )
        }

    }
}
