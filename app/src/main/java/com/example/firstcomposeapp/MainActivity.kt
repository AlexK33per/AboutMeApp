package com.example.firstcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstcomposeapp.ui.theme.FirstComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageText(Message("Alejandro Alonso", "Me muero"))
        }
    }
}

data class Message(val author: String, val msg: String)

@Composable
fun MessageText(msg: Message) {
    Image(
        painter = painterResource(id = R.drawable._634601274304),
        contentDescription = "My photo"
    )
    Column {
        Text(text = msg.author)
        Text(text = msg.msg)
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageText(Message("Hey VSauce", "Michael Here"))
}