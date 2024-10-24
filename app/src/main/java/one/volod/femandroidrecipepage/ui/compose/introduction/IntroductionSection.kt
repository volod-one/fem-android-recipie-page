package one.volod.femandroidrecipepage.ui.compose.introduction

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
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
import one.volod.femandroidrecipepage.ui.compose.PreparationTimeCard
import one.volod.femandroidrecipepage.ui.theme.OutfitFontFamily
import one.volod.femandroidrecipepage.ui.theme.Stone900
import one.volod.femandroidrecipepage.ui.theme.YoungSerifFontFamily

@Composable
internal fun IntroductionSection(
    modifier: Modifier = Modifier,
    recipeItem: RecipeItem,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        // Title
        Text(
            modifier = Modifier,
            text = recipeItem.title,
            style = TextStyle(
                fontSize = 40.sp,
                fontFamily = YoungSerifFontFamily,
                lineHeight = 40.sp,
            ),
        )

        // Description
        Text(
            modifier = Modifier,
            text = recipeItem.description,
            style = TextStyle(
                fontSize = 18.sp,
                fontFamily = OutfitFontFamily,
                fontWeight = FontWeight.Normal,
                color = Stone900,
            )
        )

        // Details - Preparation time
        PreparationTimeCard(
            modifier = Modifier
                .fillMaxWidth(),
            recipeItem = recipeItem,
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun IntroductionSection_Preview() {
    MaterialTheme {
        IntroductionSection(recipeItem = DummyRecipeItems.items.first())
    }
}
