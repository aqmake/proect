package com.example.tasks.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tasks.R

@Composable
fun Screen2(

) {
    Column(
        modifier = Modifier.padding(start = 23.dp, end = 21.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.a2),
            contentDescription = "",
            modifier = Modifier
                .size(346.dp)

        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(text = "Flexible Payment")
            Text(text = "Different modes of payment either before and after delivery without stress")
        }
    }

}