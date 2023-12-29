package com.dineshprabha.jetpackapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.dineshprabha.jetpackapplication.ui.theme.JetPackApplicationTheme

class SecondActivity : ComponentActivity() {
    @OptIn(ExperimentalTextApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackApplicationTheme {
                Box(modifier = Modifier.fillMaxSize().background(Color.Black),
                    contentAlignment = Alignment.Center){
                    val annotatedString = buildAnnotatedString {

                        blueGradientText("Dinesh")
                        append("\n\n")
                        pinkBlueGradientText("Gradient")
                    }
                    Text(text = annotatedString)
                }
            }
        }
    }

    @OptIn(ExperimentalTextApi::class)
    private fun AnnotatedString.Builder.blueGradientText(text: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF2788C7),
                        Color(0xFF00BBD4)
                    )
                ),
                fontSize = 42.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append("Welcome \n\n $text")
        }
    }

    @OptIn(ExperimentalTextApi::class)
    private fun AnnotatedString.Builder.pinkBlueGradientText(text: String) {
        withStyle(
            style = SpanStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFFF3885),
                        Color(0xFF00BBD4)
                    )
                ),
                fontSize = 48.sp,
                fontWeight = FontWeight.Medium
            )
        ) {
            append(text)
        }
    }
}

