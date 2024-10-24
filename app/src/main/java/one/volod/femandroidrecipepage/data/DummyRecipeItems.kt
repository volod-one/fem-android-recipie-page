package one.volod.femandroidrecipepage.data

import one.volod.femandroidrecipepage.R
import one.volod.femandroidrecipepage.model.RecipeItem

object DummyRecipeItems {

    val items = listOf(
        RecipeItem(
            image = R.drawable.image_omelette,
            title = "Simple Omelette Recipe",
            description = "An easy and quick dish, perfect for any meal. This classic omelette combines beaten eggs cooked to perfection, optionally filled with your choice of cheese, vegetables, or meats.",
            preparationTime = RecipeItem.PreparationTime(
                total = "Total: Approximately 10 minutes",
                preparation = "Preparation: 5 minutes",
                cooking = "Cooking: 5 minutes",
            ),
            ingredients = RecipeItem.Ingredients(
                listOf(
                    "2-3 large eggs",
                    "Salt, to taste",
                    "Pepper, to taste",
                    "1 tablespoon of butter or oil",
                    "Optional fillings: cheese, diced vegetables, cooked meats, herbs"
                )
            ),
            instructions = RecipeItem.Instructions(
                instructionList = listOf(
                    RecipeItem.Instructions.Instruction(
                        title = "Beat the eggs:",
                        body = "In a bowl, beat the eggs with a pinch of salt and pepper until they are well mixed. You can add a tablespoon of water or milk for a fluffier texture.",
                    ),
                    RecipeItem.Instructions.Instruction(
                        title = "Heat the pan:",
                        body = "Place a non-stick frying pan over medium heat and add butter or oil.",
                    ),
                    RecipeItem.Instructions.Instruction(
                        title = "Cook the omelette:",
                        body = "Once the butter is melted and bubbling, pour in the eggs. Tilt the pan to ensure the eggs evenly coat the surface.",
                    ),
                    RecipeItem.Instructions.Instruction(
                        title = "Add fillings (optional):",
                        body = "When the eggs begin to set at the edges but are still slightly runny in the middle, sprinkle your chosen fillings over one half of the omelette.",
                    ),
                    RecipeItem.Instructions.Instruction(
                        title = "Fold and serve:",
                        body = "As the omelette continues to cook, carefully lift one edge and fold it over the fillings. Let it cook for another minute, then slide it onto a plate.",
                    ),
                    RecipeItem.Instructions.Instruction(
                        title = "Enjoy:",
                        body = "Serve hot, with additional salt and pepper if needed.",
                    ),
                )
            ),
            nutrition = RecipeItem.Nutrition(
                description = "The table below shows nutritional values per serving without the additional fillings.",
                nutritionItems = RecipeItem.Nutrition.NutritionItems(
                    nutritionList = listOf(
                        RecipeItem.Nutrition.NutritionItems.NutritionItem(
                            title = "Calories",
                            value = "277kcal",
                        ),
                        RecipeItem.Nutrition.NutritionItems.NutritionItem(
                            title = "Carbs",
                            value = "0g",
                        ),
                        RecipeItem.Nutrition.NutritionItems.NutritionItem(
                            title = "Protein",
                            value = "20g",
                        ),
                        RecipeItem.Nutrition.NutritionItems.NutritionItem(
                            title = "Fat",
                            value = "22g",
                        ),
                    )
                )
            ),
        )
    )
}