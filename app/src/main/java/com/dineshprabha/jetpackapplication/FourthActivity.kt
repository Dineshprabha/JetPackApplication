package com.dineshprabha.jetpackapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.dineshprabha.jetpackapplication.ui.theme.JetPackApplicationTheme

class FourthActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackApplicationTheme {

                Column(
                    modifier =  Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    var text by remember {
                        mutableStateOf("")
                    }

                    TextField(
                        value = text,
                        onValueChange = { text = it },
                        leadingIcon = {
                            Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
                        },
                        trailingIcon = {
                            TextButton(onClick = { /*TODO*/ }) {
                                Text(text = "Show")
                            }
                        }
                    )

                }
            }
        }
    }
}