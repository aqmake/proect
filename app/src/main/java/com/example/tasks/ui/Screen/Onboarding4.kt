package com.example.tasks.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import com.example.tasks.R

@Composable
fun Onboarding4(
    onClick: () -> Unit,
    onClick1: () -> Unit

) {
    Column(
        modifier = Modifier
            .padding(start = 23.dp, end = 23.dp, top = 133.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.a2),
            contentDescription = "",
            modifier = Modifier
                .size(424.dp, 315.dp)

        )
        Spacer(modifier = Modifier.size(59.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Flexible Payment",
                color = Color(0xff0560FA),
                lineHeight = 24.sp,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )

            Text(
                text = "Different modes of payment either \n before and after delivery without stress",
                color = Color(0xff3A3A3A),
                lineHeight = 20.sp,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.size(82.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(100.dp, 50.dp)
                        .background(Color(0xffFFFFFF), shape = RoundedCornerShape(5.dp))
                        .border(width = 1.dp, color = Color.Blue, shape = RoundedCornerShape(5.dp))
                        .clip(shape = RoundedCornerShape(5.dp))
                        .clickable {
                            onClick1()
                        }
                ) {
                    Text(
                        text = "Skip",
                        color = Color(0xff0560FA)
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(100.dp, 50.dp)
                        .background(Color(0xff0560FA), shape = RoundedCornerShape(5.dp))
                        .clip(shape = RoundedCornerShape(5.dp))
                        .clickable {
                            onClick()
                        }
                ) {
                    Text(
                        text = "Next",
                        color = Color(0xffFFFFFF)
                    )
                }
            }

        }

    }
}
