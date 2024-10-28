package one.volod.femandroidrecipepage.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import one.volod.femandroidrecipepage.data.DummyRecipeItems
import one.volod.femandroidrecipepage.model.RecipeItem
import one.volod.femandroidrecipepage.ui.compose.ingredients.IngredientsSection
import one.volod.femandroidrecipepage.ui.compose.instructions.InstructionsSection
import one.volod.femandroidrecipepage.ui.compose.introduction.IntroductionSection
import one.volod.femandroidrecipepage.ui.compose.nutrition.NutritionSection

@Composable
internal fun RecipeScreen(
    modifier: Modifier = Modifier,
    recipeItem: RecipeItem,
) {
    Scaffold(
        modifier = modifier.statusBarsPadding(),
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(bottom = 32.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp),
            contentPadding = innerPadding,
        ) {
            // Image
            item {
                Image(
                    modifier = Modifier.fillMaxWidth(),
                    painter = painterResource(recipeItem.image),
                    contentDescription = null,
                )
            }

            item {
                Column(
                    modifier = Modifier.padding(
                        horizontal = 32.dp,
                    ),
                    verticalArrangement = Arrangement.spacedBy(32.dp),
                ) {
                    // Section - Introduction
                    IntroductionSection(
                        modifier = Modifier
                            .fillMaxWidth(),
                        recipeItem = recipeItem,
                    )

                    // Section - Ingredients
                    IngredientsSection(
                        modifier = Modifier
                            .fillMaxWidth(),
                        recipeItem = recipeItem,
                    )

                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth()
                    )

                    // Section - Instructions
                    InstructionsSection(
                        modifier = Modifier
                            .fillMaxWidth(),
                        recipeItem = recipeItem,
                    )

                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth(),
                    )

                    // Section - Nutrition
                    NutritionSection(
                        modifier = Modifier
                            .fillMaxWidth(),
                        nutrition = recipeItem.nutrition,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RecipeScreen_Preview() {
    MaterialTheme {
        RecipeScreen(
            recipeItem = DummyRecipeItems.items.first()
        )
    }
}
