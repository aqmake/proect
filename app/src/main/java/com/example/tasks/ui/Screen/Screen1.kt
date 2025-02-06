package com.example.tasks.ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasks.R

@Composable

fun Screen1(
    onClick : () -> Unit
) {
    Column(
        modifier = Modifier.padding(start = 23.dp, end = 21.dp)
    ) {

        Image(
            painter = painterResource(R.drawable.a1),
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
            Text(
                text = "Quick Delivery At Your Doorstep",
                color = Color(0xff0560FA),
                fontSize = 24.sp,
                lineHeight = 24.sp
            )
            Text(
                text = "Enjoy quick pick-up and delivery to your destination",
                color = Color(0xff3A3A3A),
                fontSize = 16.sp,
                lineHeight = 20.sp
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                .fillMaxWidth()
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(100.dp, 50.dp)
                        .background(Color.White)
                        .border(width = 1.dp, color = Color.Blue, shape = RoundedCornerShape(5.dp))
                        .clip(shape = RoundedCornerShape(5.dp))
                        .clickable {

                        }
                ){
                    Text(text = "Skip")
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(100.dp, 50.dp)
                        .background(Color.White)
                        .border(width = 1.dp, color = Color.Blue, shape = RoundedCornerShape(5.dp))
                        .clip(shape = RoundedCornerShape(5.dp))
                        .clickable {
                            onClick()
                        }
                ){
                    Text(text = "Next")
                }
            }
        }
    }
}
fun Screen2(){}
fun Screen3(){}
fun Screen4(){}