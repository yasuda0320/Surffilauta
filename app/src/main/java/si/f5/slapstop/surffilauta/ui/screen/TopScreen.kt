package si.f5.slapstop.surffilauta.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun TopScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Surffilauta") }
            )
        }
    ) { paddingValues ->
        LazyColumn(contentPadding = paddingValues) {
            val boards = listOf("Board 1", "Board 2", "Board 3") // 仮のデータ
            items(boards) { board ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { navController.navigate("category") }
                        .padding(16.dp)
                ) {
                    Text(board)
                }
            }
        }
    }
}