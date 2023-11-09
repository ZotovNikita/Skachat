package com.example.dota2.components

import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.R
import com.example.dota2.ui.theme.AppTheme


@Composable
fun PrimaryOvalButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 0.dp, hoveredElevation = 20.dp
        ),
        colors = ButtonDefaults.textButtonColors(containerColor = AppTheme.ButtonColors.button),
        modifier = modifier
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            color = AppTheme.ButtonColors.text,
            style = AppTheme.TextStyle.Bold_20,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
        )
    }
}


@Preview
@Composable
fun DotaInstallButtonPreview() {
    val context = LocalContext.current
    Surface(
        color = AppTheme.BgColors.primary
    ) {
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
                    top = 20.dp,
                    bottom = 40.dp
            )
        )
    }
}
