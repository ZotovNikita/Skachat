import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dota2.R
import com.example.dota2.components.Rating
import com.example.dota2.ui.theme.AppTheme


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
                .padding(start = 24.dp, top = 304.dp)
        ) {
            Row(verticalAlignment = Alignment.Bottom) {
                DotaLogo(modifier = Modifier)
                Column(modifier = Modifier.padding(bottom = 8.dp)){
                    Text(
                        text = stringResource(id = R.string.dota2),
                        style = AppTheme.TextStyle.Bold_20,
                        color = AppTheme.TextColors.secondary,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                    Row (modifier = Modifier.padding(top = 7.dp)){
                        Rating(
                            modifier = Modifier
                                .padding(start = 12.dp)
                                .height(14.dp)
                                .width(90.dp),
                            rating = 5.0f
                        )
                        Text(
                            text = stringResource(id = R.string.downloads),
                            style = AppTheme.TextStyle.Normal_12,
                            color = AppTheme.TextColors.downloads,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                }
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
                .height(324.dp),
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter
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
