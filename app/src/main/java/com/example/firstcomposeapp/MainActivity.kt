package com.example.firstcomposeapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
class RRSS(val icon: Image, val at: String)


@Composable
fun MessageText(msg: Message) {
    Column(
        modifier = Modifier.padding(all = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable._634601274304),
            contentDescription = "My photo",
            modifier = Modifier
                .clip(CircleShape)
                .size(200.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = msg.author, style = MaterialTheme.typography.h5, color = com.example.firstcomposeapp.ui.theme.Orange)
        Text(text = msg.msg, color = com.example.firstcomposeapp.ui.theme.DelegaBlue)
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn {

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewMessageCard() {
    MessageText(Message("Alejandro Alonso López", "Subdelegado de Comunicación"))
}