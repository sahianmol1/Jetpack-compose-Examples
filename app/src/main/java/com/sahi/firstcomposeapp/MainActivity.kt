package com.sahi.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.kermit)
            val description = "Kermit in the snow"
            val title = "Kermit is playing in the snow"

            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {

                ImageCard(
                    painter = painter,
                    contentDescription = description,
                    title = title,
                    title2 = "Shinchan with Shero",
                    contentDescription2 = "This is shinchan",
                    painter2 =
                    painterResource(id = R.drawable.shinchan)
                )
            }

        }
    }
}

@Composable
fun ImageCard(
    painter: Painter,
    painter2: Painter,
    contentDescription: String,
    contentDescription2: String,
    title: String,
    title2: String,
    modifier: Modifier = Modifier
) {
    Row {
        Card(
            modifier = modifier.fillMaxWidth(0.5f)
                .padding(end = 8.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 8.dp
        ) {
            Box(modifier = Modifier.height(200.dp)) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    modifier = modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black
                                ),
                                startY = 300f
                            )
                        )
                ) {
                }
                Text(
                    text = title,
                    style = TextStyle(color = Color.White, fontSize = 16.sp),
                    modifier = Modifier
                        .align(
                            Alignment.BottomStart,
                        )
                        .padding(16.dp)
                )
            }
        }

        Card(
            modifier = modifier.fillMaxWidth()
                .padding(start = 8.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 8.dp
        ) {
            Box(modifier = Modifier.height(200.dp)) {
                Image(
                    painter = painter2,
                    contentDescription = contentDescription2,
                    modifier = modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black
                                ),
                                startY = 300f
                            )
                        )
                ) {
                }
                Text(
                    text = title2,
                    style = TextStyle(color = Color.White, fontSize = 16.sp),
                    modifier = Modifier
                        .align(
                            Alignment.BottomStart,
                        )
                        .padding(16.dp)
                )
            }
        }
    }

}