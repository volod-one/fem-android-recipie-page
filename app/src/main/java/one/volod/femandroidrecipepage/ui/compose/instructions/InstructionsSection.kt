package one.volod.femandroidrecipepage.ui.compose.instructions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import one.volod.femandroidrecipepage.ui.compose.SectionTitle
import one.volod.femandroidrecipepage.ui.theme.OutfitFontFamily
import one.volod.femandroidrecipepage.ui.theme.Rose800
import one.volod.femandroidrecipepage.ui.theme.Stone900

@Composable
internal fun InstructionsSection(
    modifier: Modifier = Modifier,
    recipeItem: RecipeItem,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(
            20.dp,
        )
    ) {

        SectionTitle(
            text = "Instructions",
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Section - Instructions
            recipeItem.instructions.instructionList.forEachIndexed { index, item ->
                Row(
                    modifier = Modifier.padding(horizontal = 8.dp)
                ) {
                    Text(
                        text = "${index + 1}.",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = OutfitFontFamily,
                            color = Rose800,
                        )
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = buildAnnotatedString {
                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                append(item.title)
                            }
                            append(" ")
                            withStyle(
                                style = SpanStyle(
                                    fontWeight = FontWeight.Normal,
                                )
                            ) {
                                append(item.body)
                            }
                        },
                        style = TextStyle(
                            fontSize = 18.sp,
                            lineHeight = 28.sp,
                            fontFamily = OutfitFontFamily,
                            color = Stone900,
                        )
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun InstructionsSection_Preview() {
    MaterialTheme {
        InstructionsSection(
            recipeItem = DummyRecipeItems.items.first(),
        )
    }
}