package com.example.dota2

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.ui.theme.AppTheme

@Preview
@Composable
fun InstallButton() {
    Button(
        onClick = {},
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.textButtonColors(containerColor = AppTheme.ButtonColors.button),
        modifier = Modifier.fillMaxWidth()
    )
    {
        Text(
            "Install",
            style = AppTheme.TextStyle.Bold_20,
            color = AppTheme.ButtonColors.text,
            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
        )
    }
}


@Preview
@Composable
fun DotaInstallButtonPreview() {
    Surface(
        color = AppTheme.BgColors.primary
    ) {
        InstallButton()
    }
}