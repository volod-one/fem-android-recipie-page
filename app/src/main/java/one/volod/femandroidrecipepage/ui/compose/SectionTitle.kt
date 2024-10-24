package one.volod.femandroidrecipepage.ui.compose

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import one.volod.femandroidrecipepage.ui.theme.Rose800
import one.volod.femandroidrecipepage.ui.theme.YoungSerifFontFamily

@Composable
fun SectionTitle(
    modifier: Modifier = Modifier,
    text: String,
) {
    Text(
        modifier = modifier,
        text = text,
        style = TextStyle(
            fontSize = 30.sp,
            fontFamily = YoungSerifFontFamily,
            letterSpacing = 1.sp,
            fontWeight = FontWeight.SemiBold,
            color = Rose800,
        ),
    )
}

@Preview(showBackground = true)
@Composable
private fun SectionTitle_Preview() {
    MaterialTheme {
        SectionTitle(
            text = "Instructions",
        )
    }
}
