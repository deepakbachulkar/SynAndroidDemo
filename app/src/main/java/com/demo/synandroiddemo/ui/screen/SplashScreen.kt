package com.demo.synandroiddemo.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.demo.synandroiddemo.R
import com.demo.synandroiddemo.ui.screen.Routes.SPLASH_SCREEN
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {
    LaunchedEffect(Unit) {
        delay(3000) // 3 seconds delay
        navController.navigate(Routes.LOGIN_SCREEN) {
            popUpTo(SPLASH_SCREEN) { inclusive = true }
        }
    }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.primary
    ) {
        Box(contentAlignment = Alignment.Center) {
            // Replace with your logo/image
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Logo",
                modifier = Modifier.size(200.dp)
            )
        }
    }
}