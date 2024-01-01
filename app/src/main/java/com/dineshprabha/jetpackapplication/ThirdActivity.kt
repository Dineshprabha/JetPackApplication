package com.dineshprabha.jetpackapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dineshprabha.jetpackapplication.ui.theme.JetPackApplicationTheme

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackApplicationTheme {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.8f)),
                    contentAlignment = Alignment.Center
                ){
                    MyCustomCard(
                        modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                        image = R.drawable.photo,
                        title = "Shadows & Lightnings",
                        text ="Create modern UI design with Jetpack compose Create modern UI design with Jetpack compose Create modern UI design with Jetpack compose",
                        publisher = Publisher(
                            name = "Dinesh N",
                            job = "Android Developer",
                            image = R.drawable.photo
                        )
                    )

                    Button(modifier = Modifier
                        .height(50.dp)
                        .width(140.dp),
                        shape = RoundedCornerShape(topStart = 10.dp, bottomEnd = 10.dp),
                        enabled = true,
                        elevation = ButtonDefaults.buttonElevation(
                            defaultElevation = 20.dp
                        ),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF2D4356),
                            contentColor = Color.Green
                        ),
                        onClick = { }
                    ) {
                        Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
                        Text(text = "Click")

                    }

                    TextButton(onClick = { /*TODO*/ }) {

                    }
                }
            }
        }
    }
}
