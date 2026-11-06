package cat.insbaixcamp.appfitness.ui.screen
import android.icu.util.Calendar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cat.insbaixcamp.appfitness.R

@Composable
fun ProfileScreen(
    nom: String,
    email: String,
    dataNaixement: String,
    genere: String,
    alsada: Int,
    pes: Double,
    objectiu: String,
    nivellActivitat: String,
    editant: Boolean
){
    Column() {
        Column(Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                Modifier.size(120.dp).clip(CircleShape)
            )

            Text(text = nom,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
            Text(text = email,
                fontSize = 15.sp,
                color = Color.Gray
            )
        }
        Card(Modifier.fillMaxWidth().padding(16.dp),
            shape = RoundedCornerShape(16.dp)) {
            Row(Modifier.fillMaxWidth().padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {
                Column() {
                    Text("Edat",
                        color = Color.Gray)
                    val parts = dataNaixement.split("/")
                    val any = parts.getOrNull(2)?.toIntOrNull() ?: 0
                    val edat = if (any > 0) Calendar.getInstance().get(Calendar.YEAR) - any else 0
                    Text(edat.toString(),
                        fontWeight = FontWeight.Bold)
                }
                Column() {
                    Text("Genere",
                        color = Color.Gray)
                    Text(genere,
                        fontWeight = FontWeight.Bold)
                }
                Column() {
                    Text("Alçada",
                        color = Color.Gray)
                    Text(alsada.toString(),
                        fontWeight = FontWeight.Bold)
                }
                Column() {
                    Text("Pes",
                        color = Color.Gray)
                    Text(pes.toString(),
                        fontWeight = FontWeight.Bold)
            }
            }
        }
    }
}
