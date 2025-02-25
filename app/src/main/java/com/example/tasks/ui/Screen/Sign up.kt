package com.example.tasks.ui.Screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasks.R
import com.example.tasks.ui.theme.Blue80


fun Color.Companion.gold() = Color(0xFFFFFFFF)

@Composable
fun SingUp(
    onClick: () -> Unit,
    onClick1: () -> Unit
) {
    var text by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("") }
    var text4 by remember { mutableStateOf("") }
    var text5 by remember { mutableStateOf("") }
    var check by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 24.dp, end = 24.dp, top = 78.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Text(
            text = "Create an account"

        )
        Text(
            text = "Complete the sign up process to get started"
        )

        Spacer(modifier = Modifier.size(33.dp))

        Text(
            text = "Full name",
            color = Color(0xffA7A7A7),
            fontSize = 14.sp,
            lineHeight = 16.sp,
            textAlign = TextAlign.Center
        )

        OutlinedTextField(
            value = text,
            colors = OutlinedTextFieldDefaults.colors(focusedBorderColor = Color(0xffA7A7A7)),
            maxLines = 1,
            onValueChange = { newText ->
                text = newText.trimStart { it == ' ' }
            },
            placeholder = {
                Text(
                    text = "Ivanov Ivan ",
                    color = Color(0xffA7A7A7)
                )
            },
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)

        )

        Spacer(modifier = Modifier.size(24.dp))

        Text(
            text = "Phone Number",
            color = Color(0xffA7A7A7),
            fontSize = 14.sp,
            lineHeight = 16.sp,
            textAlign = TextAlign.Center
        )
        OutlinedTextField(
            value = text2,
            maxLines = 1,
            onValueChange = { newText ->
                text2 = newText.trimStart { it == ' ' }
            },
            placeholder = {
                Text(
                    text = "+7(999)999-99-99"
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.size(24.dp))

        Text(
            text = "Email Address",
            color = Color(0xffA7A7A7),
            fontSize = 14.sp,
            lineHeight = 16.sp,
            textAlign = TextAlign.Center
        )
        OutlinedTextField(
            value = text3,
            maxLines = 1,
            onValueChange = { newText ->
                text3 = newText.trimStart { it == ' ' }
            },
            placeholder = {
                Text(
                    text = "***********@mail.com",
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        )

        Spacer(modifier = Modifier.size(24.dp))

        Text(
            text = "Password",
            color = Color(0xffA7A7A7),
            fontSize = 14.sp,
            lineHeight = 16.sp,
            textAlign = TextAlign.Center
        )
        OutlinedTextField(
            value = text4,
            visualTransformation = PasswordVisualTransformation(),
            maxLines = 1,
            onValueChange = { newText ->
                text4 = newText.trim { it == ' ' }
            },
            placeholder = {
                Text(
                    text = "**********"
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.eye_slash),
                    contentDescription = "",
                    modifier = Modifier.clickable {

                    }
                )
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp)
        )

        Spacer(modifier = Modifier.size(24.dp))

        Text(
            text = "Confirm Password",
            color = Color(0xffA7A7A7),
            fontSize = 14.sp,
            lineHeight = 16.sp,
            textAlign = TextAlign.Center
        )
        OutlinedTextField(
            value = text5,
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            maxLines = 1,
            onValueChange = { newText ->
                text5 = newText.trim { it == ' ' }
            },
            placeholder = {
                Text(
                    text = "**********"
                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(R.drawable.eye_slash),
                    contentDescription = "",
                    modifier = Modifier.clickable {

                    }
                )
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(4.dp),
        )
        Row() {
            Checkbox(checked = check,
                onCheckedChange = {
                    check = it
                })
            Spacer(modifier = Modifier.size(11.dp))
            val annotatedText = buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        fontWeight = FontWeight.W400,
                        fontSize = 12.sp,
                        color = Color(0xffa6a6a6)
                    )
                ) {
                    append("By ticking this box, you agree to our")
                }
                pushStringAnnotation(
                    tag = "SignUp",// provide tag which will then be provided when you click the text
                    annotation = "SignUp45"
                )
                withStyle(
                    SpanStyle(
                        fontWeight = FontWeight.W400,
                        fontSize = 12.sp,
                        color = Color(0xffeabc2e)
                    )
                ) {
                    append("Terms and conditions and private policy")
                }

            }
            ClickableText(
                text = annotatedText,
                onClick = { offset ->

                    annotatedText.getStringAnnotations(
                        tag = "SignUp",
                        start = offset,
                        end = offset
                    )[0].let { annotation ->


                        Log.w("Clicked", annotation.item)


                    }

                }
            )

        }
        Spacer(modifier = Modifier.size(64.dp))
        Box(modifier = Modifier
            .size(342.dp, 46.dp)
            .background(color = Blue80, shape = RoundedCornerShape(5.dp))
            .clip(shape = RoundedCornerShape(4.dp))
            .clickable {
                onClick()
            })
    }
}

@Composable
@Preview(showBackground = true)
fun ScreenPreview() {
    SingUp(
        onClick = {

        },
        onClick1 = {

        }
    )
}
