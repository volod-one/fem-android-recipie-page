package one.volod.femandroidrecipepage.ui.compose.ingredients

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import one.volod.femandroidrecipepage.data.DummyRecipeItems
import one.volod.femandroidrecipepage.model.RecipeItem
import one.volod.femandroidrecipepage.ui.compose.SectionTitle
import one.volod.femandroidrecipepage.ui.theme.OutfitFontFamily
import one.volod.femandroidrecipepage.ui.theme.Rose800
import one.volod.femandroidrecipepage.ui.theme.Stone900

@Composable
internal fun IngredientsSection(
    modifier: Modifier = Modifier,
    recipeItem: RecipeItem,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SectionTitle(text = "Ingredients")

        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            recipeItem.ingredients.ingredientList.forEach { item ->
                IngredientsItem(
                    modifier = Modifier,
                    item = item,
                )
            }
        }
    }
}

@Composable
private fun IngredientsItem(
    modifier: Modifier = Modifier,
    item: String,
) {
    Row(
        modifier = modifier.padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "・",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Black,
                color = Rose800,
            ),
        )
        Text(
            text = item,
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = OutfitFontFamily,
                fontWeight = FontWeight.Normal,
                color = Stone900,
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun IngredientsSection_Preview() {
    MaterialTheme {
        IngredientsSection(
            recipeItem = DummyRecipeItems.items.first(),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun IngredientsItem_Preview() {
    MaterialTheme {
        IngredientsItem(
            item = DummyRecipeItems.items.first().ingredients.ingredientList.first(),
        )
    }
}
