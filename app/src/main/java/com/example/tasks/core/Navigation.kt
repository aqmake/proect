package com.example.tasks.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.tasks.ui.Screen.ForgotPass
import com.example.tasks.ui.Screen.LogIn
import com.example.tasks.ui.Screen.NewPass
import com.example.tasks.ui.Screen.OTPVerifi
import com.example.tasks.ui.Screen.Onboarding1
import com.example.tasks.ui.Screen.Onboarding3
import com.example.tasks.ui.Screen.Onboarding4
import com.example.tasks.ui.Screen.SingUp

@Composable
fun Navigation() {

    var currentScreen by remember {
        mutableStateOf(Screen.Start)
    }

    when (currentScreen) {
        Screen.Start -> {
            Onboarding1(
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
            Onboarding3(
                onClick = {
                    currentScreen = Screen.SingUp
                },
                onClick1 = {
                    currentScreen = Screen.LogIn
                }
            )
        }

        Screen.SingUp -> {
            SingUp (
                onClick = {

                },
                onClick1 = {

                }
            )
        }

        Screen.LogIn -> {
            LogIn (
                onClick = {

                },
                onClick1 = {

                },
                onClick2 = {

                }
            )
        }

        Screen.ForgotPass -> {
            ForgotPass(
                onClick = {

                },
                onClick1 = {

                }
            )

        }

        Screen.OTPVerifi -> {
            OTPVerifi (
                onClick = {

                }
            )
        }

        Screen.NewPass -> {
            NewPass (
                onClick = {

                }
            )
        }
    }
}

enum class Screen {
    Start, Second, Home, SingUp, LogIn, ForgotPass, OTPVerifi, NewPass
}