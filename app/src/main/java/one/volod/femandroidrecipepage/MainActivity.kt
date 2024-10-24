package one.volod.femandroidrecipepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import one.volod.femandroidrecipepage.data.DummyRecipeItems
import one.volod.femandroidrecipepage.ui.screen.RecipeScreen
import one.volod.femandroidrecipepage.ui.theme.FemAndroidRecipePageTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FemAndroidRecipePageTheme {
                RecipeScreen(
                    modifier = Modifier.fillMaxSize(),
                    recipeItem = DummyRecipeItems.items.first(),
                )
            }
        }
    }
}
