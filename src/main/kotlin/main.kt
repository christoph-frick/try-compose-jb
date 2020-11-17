import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp

fun main() = Window(title = "Compose for Desktop,", size = IntSize(300, 300)) {
    val count = remember { mutableStateOf(0) }
    DesktopMaterialTheme {
        Column(Modifier.fillMaxSize(), Arrangement.spacedBy(5.dp)) {
            Text(
                "Hello, Desktop Compose",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                style = MaterialTheme.typography.h3
            )
            Button(modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    count.value++
                }) {
                Text(if (count.value == 0) "Click to count up" else "Clicked ${count.value}!")
            }
            Button(modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    count.value = 0
                }) {
                Text("Reset")
            }
        }
    }
}