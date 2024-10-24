package one.volod.femandroidrecipepage.ui.compose.nutrition

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.HorizontalDivider
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
import one.volod.femandroidrecipepage.ui.compose.SectionTitle
import one.volod.femandroidrecipepage.ui.theme.Stone900

@Composable
fun NutritionSection(
    modifier: Modifier = Modifier,
    nutrition: RecipeItem.Nutrition,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        SectionTitle(text = "Nutrition")

        Text(
            text = nutrition.description,
            style = TextStyle(
                fontSize = 18.sp,
                lineHeight = 24.sp,
                color = Stone900,
                fontWeight = FontWeight.Normal,
            )
        )

        Column {
            val list = nutrition.nutritionItems.nutritionList
            list.forEachIndexed { index, item ->
                NutritionItem(nutritionItem = item)

                if (list.lastIndex > index) {
                    HorizontalDivider()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun NutritionSection_Preview() {
    MaterialTheme {
        NutritionSection(
            nutrition = DummyRecipeItems.items.first().nutrition,
        )
    }
}
