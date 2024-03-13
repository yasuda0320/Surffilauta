package si.f5.slapstop.surffilauta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import si.f5.slapstop.surffilauta.ui.screen.*
import si.f5.slapstop.surffilauta.ui.theme.SurffilautaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SurffilautaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "top") {
                        composable("top") { TopScreen(navController) }
                        composable("category") { CategoryScreen(navController) }
                        composable("board") { BoardScreen(navController) }
                        composable("thread") { ThreadScreen(navController) }
                        composable("response") { ResponseScreen(navController) }
                    }
                }
            }
        }
    }
}