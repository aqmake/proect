package com.example.tasks.ui.Screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable

fun SingUp(
    onClick: () -> Unit,
    onClick1: () -> Unit
) {
    Column(modifier = Modifier
        .padding(start = 24.dp, end = 24.dp, top = 78.dp)
        .verticalScroll(rememberScrollState())) {
        Text(
            text = "Create an account"

        )
    }
}

