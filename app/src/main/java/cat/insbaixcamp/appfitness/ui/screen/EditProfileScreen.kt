package cat.insbaixcamp.appfitness.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cat.insbaixcamp.appfitness.R

@Composable
fun EditProfileScreen(
    nom: String,
    email: String,
    dataNaixement: String,
    genere: String,
    alsada: Int,
    pes: Double,
    objectiu: String,
    nivellActivitat: String,
    editant: Boolean
) {
    Column(){
        Row(){
            Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .background(Color.Black),)
            Column(){
                Button(onClick = {}){Text(text = "Canviar foto") }
                Button(onClick = {}) {Text(text = "Eliminar foto") }
            }
        }
    }
}