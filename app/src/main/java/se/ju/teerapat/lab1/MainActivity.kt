package se.ju.teerapat.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import se.ju.teerapat.lab1.ui.theme.Lab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1Theme {
                MyApp(
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }
    }
}

@Composable
fun MyApp(
    modifier: Modifier = Modifier,
    menus: List<Pair<String, String>> = listOf(
        Pair("Water", "Still water, 50cl"),
        Pair("Coca Cola", "33cl"),
        Pair("Pepsi", "33cl"),
        Pair("Fanta", "Exotic, 33cl")
    )
) {
    Column(modifier = modifier.padding(vertical = 4.dp, horizontal = 4.dp)) {
        Text("Menu")
        for ((name, description) in menus) {
            DisplayMenu(name = name, description = description)
        }
    }
}

@Composable
fun DisplayMenu(name: String, description: String, modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                Text(text = description)
            }
            ElevatedButton(
                onClick = {  }
            ) {
                Text("Add")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Hello ")
                Text(text = name)
            }
            ElevatedButton(
                onClick = { /* TODO */ }
            ) {
                Text("Show more")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    Lab1Theme {
        MyApp()
    }
}
