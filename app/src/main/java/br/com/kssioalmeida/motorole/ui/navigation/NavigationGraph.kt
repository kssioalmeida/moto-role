package br.com.kssioalmeida.motorole.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import br.com.kssioalmeida.motorole.ui.screens.HomeScreen
import br.com.kssioalmeida.motorole.ui.screens.LoginScreen

@Composable
internal fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.Login.route
    ) {
        composable(NavigationRoute.Login.route) {
            LoginScreen(navController)
        }

        composable(NavigationRoute.Home.route) {
            HomeScreen(navController)
        }
    }
}

internal sealed class NavigationRoute(val route: String) {
    data object Login : NavigationRoute("login")
    data object Home : NavigationRoute("home")
}