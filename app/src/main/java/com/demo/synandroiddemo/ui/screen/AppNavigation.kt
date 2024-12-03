package com.demo.synandroiddemo.ui.screen


import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigationGraph(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.SPLASH_SCREEN){
        composable(Routes.SPLASH_SCREEN){
           SplashScreen(navController)
        }
        composable(Routes.LOGIN_SCREEN){
            LoginScreen()
        }
    }


}