package com.example.lab8

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lab8.LoginScreen
import com.example.lab8.MovieScreen
import com.example.lab8.MovieViewModel

enum class Screen(val route: String) {
    SCREEN1("Screen1"),
    SCREEN2("Screen2"),
    SCREEN3("Screen3"),
    LOGIN("Login"),
    MOVIE_SCREEN("MovieScreen"),

}
@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    val mainViewModel: MovieViewModel = viewModel()
    val moviesState = mainViewModel.movies.observeAsState(initial = emptyList())
    NavHost(
        navController = navController,
        startDestination = Screen.SCREEN1.route,
    ) {
        composable(Screen.SCREEN1.route) { Screen1(navController) }
        composable(Screen.SCREEN2.route) { Screen2(navController) }
        composable(Screen.SCREEN3.route) { Screen3(navController) }
        composable(Screen.LOGIN.route) { LoginScreen(navController) }
        composable(Screen.MOVIE_SCREEN.route) { MovieScreen() }
    }
}
@Composable
fun Screen1(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Red)
            .clickable { navController.navigate(Screen.SCREEN2.route){

            } },
        contentAlignment = Alignment.Center
    ) {
        Text("Screen 1", color = Color.White, fontSize = 20.sp)
    }
}
@Composable
fun Screen2(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
            .clickable { navController.navigate(Screen.SCREEN3.route) },
        contentAlignment = Alignment.Center
    ) {
        Text("Screen 2", color = Color.White, fontSize = 20.sp)
    }
}
@Composable
fun Screen3(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
            .clickable { navController.navigate(Screen.LOGIN.route) },
        contentAlignment = Alignment.Center
    ) {
        Text("Screen 3", color = Color.White, fontSize = 20.sp)
    }
}
