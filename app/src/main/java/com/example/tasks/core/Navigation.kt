package com.example.tasks.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.tasks.ui.Screen.Screen1
import com.example.tasks.ui.Screen.Screen2

@Composable
fun Navigation(){

    var currentScreen by remember {
        mutableStateOf(Screen.Start)
    }

    when(currentScreen){
        Screen.Start -> {
            Screen1(
                onClick = {
                    currentScreen = Screen.Second
                }
            )
        }
        Screen.Second -> {
            Screen2()
        }
        Screen.Home -> {

        }
    }
}
enum class Screen {
    Start, Second, Home
}