package com.example.tasks.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasks.R

@Composable

fun Onboarding3(
    onClick: () -> Unit,
    onClick1: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(start = 23.dp, end = 23.dp, top = 150.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.a3),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp, 298.dp)
        )
        Spacer(modifier = Modifier.size(63.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Real-time Tracking",
                color = Color(0xff0560FA),
                fontSize = 24.sp,
                lineHeight = 24.sp,
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.size(12.dp))
            Text(
                text = "Track your packages/items from the \n comfort of your home till final destination",
                color = Color(0xff3A3A3A),
                fontSize = 16.sp,
                lineHeight = 20.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.size(91.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(342.dp, 46.dp)
                    .background(Color(0xff0560FA), shape = RoundedCornerShape(5.dp))
                    .clip(shape = RoundedCornerShape(5.dp))
                    .clickable {
                        onClick()
                    }
            ) {
                Text(
                    text = "Sign Up",
                    color = Color(0xffFFFFFF)
                )
            }
            Spacer(modifier = Modifier.size(20.dp))
            Row {
                Text(
                    text = "Already have an account?",
                    color = Color(0xffA7A7A7),
                    fontSize = 14.sp,
                    lineHeight = 16.sp
                )
                Text(
                    text = "Sign in",
                    color = Color(0xff0560FA),
                    fontSize = 14.sp,
                    lineHeight = 16.sp,
                    modifier = Modifier.clickable {
                        onClick1()
                    }
                )
            }
        }
    }
}