package one.volod.femandroidrecipepage.model

import androidx.annotation.DrawableRes

data class RecipeItem(
    @DrawableRes val image: Int,
    val title: String,
    val description: String,
    val preparationTime: PreparationTime,
    val ingredients: Ingredients,
    val instructions: Instructions,
    val nutrition: Nutrition,
) {

    data class PreparationTime(
        val total: String,
        val preparation: String,
        val cooking: String,
    )

    data class Ingredients(
        val ingredientList: List<String>,
    )

    data class Instructions(
        val instructionList: List<Instruction>,
    ) {

        data class Instruction(
            val title: String,
            val body: String,
        )
    }

    data class Nutrition(
        val description: String,
        val nutritionItems: NutritionItems,
    ) {

        data class NutritionItems(
            val nutritionList: List<NutritionItem>,
        ) {

            data class NutritionItem(
                val title: String,
                val value: String,
            )
        }
    }
}
