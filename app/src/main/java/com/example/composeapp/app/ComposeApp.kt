package com.example.composeapp.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.composeapp.navigation.AppRouter
import com.example.composeapp.navigation.Screen
import com.example.composeapp.screens.LoginScreen
import com.example.composeapp.screens.SignUpScreen
import com.example.composeapp.screens.TermsAndConditionsScreen

@Composable
fun ComposeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = AppRouter.currentScreen, label = "") { currentState ->
            when(currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }

                is Screen.LoginScreen -> {
                    LoginScreen()
                }

                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }
            }
        }
    }
}