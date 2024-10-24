package one.volod.femandroidrecipepage.ui.compose.nutrition

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import one.volod.femandroidrecipepage.data.DummyRecipeItems
import one.volod.femandroidrecipepage.model.RecipeItem
import one.volod.femandroidrecipepage.ui.theme.OutfitFontFamily
import one.volod.femandroidrecipepage.ui.theme.Rose800
import one.volod.femandroidrecipepage.ui.theme.Stone900

@Composable
internal fun NutritionItem(
    modifier: Modifier = Modifier,
    nutritionItem: RecipeItem.Nutrition.NutritionItems.NutritionItem,
) {
    Row(
        modifier = modifier.padding(
            vertical = 12.dp,
            horizontal = 32.dp,
        ),
    ) {
        Text(
            text = nutritionItem.title,
            modifier = Modifier.weight(1f),
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = OutfitFontFamily,
                fontWeight = FontWeight.Normal,
                color = Stone900,
            )
        )

        Text(
            text = nutritionItem.value,
            modifier = Modifier.weight(1f),
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Black,
                color = Rose800,
            ),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NutritionItem_Preview() {
    MaterialTheme {
        NutritionItem(
            nutritionItem = DummyRecipeItems.items.first().nutrition.nutritionItems.nutritionList.first(),
        )
    }
}