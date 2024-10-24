package one.volod.femandroidrecipepage.ui.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import one.volod.femandroidrecipepage.data.DummyRecipeItems
import one.volod.femandroidrecipepage.model.RecipeItem
import one.volod.femandroidrecipepage.ui.theme.OutfitFontFamily
import one.volod.femandroidrecipepage.ui.theme.Pink40
import one.volod.femandroidrecipepage.ui.theme.Rose50
import one.volod.femandroidrecipepage.ui.theme.Rose800
import one.volod.femandroidrecipepage.ui.theme.Stone900

@Composable
internal fun PreparationTimeCard(
    modifier: Modifier = Modifier,
    recipeItem: RecipeItem,
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = Rose50,
        )
    ) {
        Column(
            modifier = Modifier.padding(24.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(
                text = "Preparation time",
                style = TextStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Pink40,
                )
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                PreparationItem(
                    recipeItem.preparationTime.total,
                )

                PreparationItem(
                    recipeItem.preparationTime.preparation,
                )

                PreparationItem(
                    recipeItem.preparationTime.cooking,
                )
            }
        }
    }
}

@Composable
private fun PreparationItem(
    item: String,
) {
    val heading = remember { item.substringBefore(":") }
    val body = remember { item.substringAfter(":") }
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "・",
            style = TextStyle(
                fontSize = 20.sp,
                lineHeight = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Rose800,
            ),
        )
        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                    append("${heading}:")
                }
                append(body)
            },
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = OutfitFontFamily,
                color = Stone900,
            ),
        )
    }
}

@Preview
@Composable
private fun PreparationTimeCard_Preview() {
    MaterialTheme {
        PreparationTimeCard(recipeItem = DummyRecipeItems.items.first())
    }
}