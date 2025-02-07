package com.example.tasks.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.tasks.ui.Screen.Onboarding1
import com.example.tasks.ui.Screen.Onboarding4

@Composable
fun Navigation(){

    var currentScreen by remember {
        mutableStateOf(Screen.Start)
    }

    when(currentScreen){
        Screen.Start -> {
            Onboarding1 (
                onClick = {
                    currentScreen = Screen.Second
                },
                onClick1 = {
                    currentScreen = Screen.Home
                }
            )
        }
        Screen.Second -> {
            Onboarding4(
                onClick = {
                    currentScreen = Screen.Home
                },
                onClick1 = {
                    currentScreen = Screen.Home
                }
            )
        }
        Screen.Home -> {

        }
    }
}
enum class Screen {
    Start, Second, Home
}