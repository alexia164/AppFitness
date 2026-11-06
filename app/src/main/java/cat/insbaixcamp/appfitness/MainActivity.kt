package cat.insbaixcamp.appfitness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cat.insbaixcamp.appfitness.ui.screen.EditProfileScreen
import cat.insbaixcamp.appfitness.ui.screen.ProfileScreen
import cat.insbaixcamp.appfitness.ui.theme.AppFitnessTheme
import java.util.Date

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppFitnessTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FitnessApp()

                }
            }
        }
    }
}

@Composable
fun FitnessApp() {
    var nom: String by remember { mutableStateOf("Laia Soler") }
    var email: String by remember { mutableStateOf("laia.soler@example.com") }
    var dataNaixement: String by remember { mutableStateOf("16/09/1999") }
    var genere: String by remember { mutableStateOf("Dona") }
    var alsada: Int by remember { mutableStateOf(170) }
    var pes: Double by remember { mutableStateOf(60.0) }
    var objectiu: String by remember { mutableStateOf("Guanyar Massa") }
    var nivellActivitat: String by remember { mutableStateOf("Mitjà") }
    var editant: Boolean by remember { mutableStateOf(false) }


    if (editant) {
        EditProfileScreen(nom, email, dataNaixement, genere, alsada, pes, objectiu, nivellActivitat,editant)
    } else {
        ProfileScreen(nom, email, dataNaixement, genere, alsada, pes, objectiu, nivellActivitat, editant)
    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppFitnessTheme {
        FitnessApp()
    }

    }
