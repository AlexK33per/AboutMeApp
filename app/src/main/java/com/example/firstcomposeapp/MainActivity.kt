package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageText(Message("Alejandro Alonso López", "Subdelegado de Comunicación"))
        }
    }
}

data class Message(val author: String, val msg: String)

@Composable
fun MessageText(msg: Message) {
    Column(
        modifier = Modifier
            .padding(all = 4.dp)
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable._634601274304),
            contentDescription = "My photo",
            modifier = Modifier
                .clip(CircleShape)
                .size(260.dp)
        )
        Spacer(modifier = Modifier
            .height(8.dp)
        )
        Text(
            text = msg.author,
            style = MaterialTheme.typography.h4,
            color = com.example.firstcomposeapp.ui.theme.Orange
        )
        Text(
            text = msg.msg,
            style = MaterialTheme.typography.h5,
            color = com.example.firstcomposeapp.ui.theme.DelegaBlue
        )
        Spacer(modifier = Modifier
            .height(20.dp)
        )

        Column(
            modifier = Modifier.align(Alignment.Start).background(Color.Red)
        ) {
            Row {
                Image(
                    modifier = Modifier
                        .size(40.dp),
                    painter = painterResource(id = R.drawable._80b57fcd9996e24bc43c53e),
                    contentDescription = "Twitter logo"
                )
                Text(text = "@alexxistyping", modifier = Modifier
                    .align(Alignment.CenterVertically)
                )
            }
            Row {
                Image(
                    modifier = Modifier
                        .size(40.dp),
                    painter = painterResource(id = R.drawable.github),
                    contentDescription = "GitHub logo"
                )
                Text(text = "@AlexK33per", modifier = Modifier
                    .align(Alignment.CenterVertically)
                )
            }
            Row {
                Image(
                    modifier = Modifier
                        .size(40.dp),
                    painter = painterResource(id = R.drawable.instagram_png_instagram_png_logo_1455),
                    contentDescription = "Instagram logo"
                )
                Text(text = "@alexxisininsta", modifier = Modifier
                    .align(Alignment.CenterVertically)
                )
            }
        }
    }


}

@Preview(showSystemUi = true)
@Composable
fun PreviewMessageCard() {
    MessageText(Message("Alejandro Alonso López", "Subdelegado de Comunicación"))
}