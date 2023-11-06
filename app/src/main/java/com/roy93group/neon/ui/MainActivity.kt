package com.roy93group.neon.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.roy93group.neon.common.NeonTheme
import com.roy93group.neon.ui.dlg.gamepause.DialogGamePause
import com.roy93group.neon.navigation.Game
import com.roy93group.neon.navigation.GamePause
import com.roy93group.neon.navigation.Splash
import com.roy93group.neon.ui.game.GameScreen
import com.roy93group.neon.ui.splash.SplashScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setup()
    }

    private fun setup() {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            NeonTheme {
                val navController = rememberNavController()
                val systemUiController = rememberSystemUiController()
                systemUiController.setSystemBarsColor(color = Color.Transparent)

                NavHost(
                    navController = navController,
                    startDestination = Splash.route
                ) {
                    composable(route = Splash.route) {
                        SplashScreen {
                            with(navController) {
                                popBackStack()
                                navigate(Game.route)
                            }
                        }
                    }
                    composable(route = Game.route) {
                        GameScreen(onGamePause = { navController.navigate(GamePause.route) })
                    }
                    dialog(route = GamePause.route) {
                        DialogGamePause(onRestartGame = {
                            navController.navigate(Game.route) { popUpTo(navController.graph.id) }
                        })
                    }
                }
            }
        }
    }

}
