package com.example.composable_modifier

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composable_modifier.ui.theme.Composable_ModifierTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Composable_ModifierTheme {
                    MainScreen()
            }
        }
    }
}
@Composable
fun MainScreen() {
    Column() {
        Text(modifier = Modifier.background(color = Color.Cyan)
            .padding(top = 10.dp,start= 1.dp,end=1.dp,bottom = 30.dp)
            .clickable {
                       println("Hello Android Clicked")
            }
            ,text = "Hello Android!",color = Color.Unspecified
            ,fontStyle = FontStyle.Italic
            ,fontWeight = FontWeight.Bold
            ,fontSize = 22.sp
            ,overflow = TextOverflow.Visible)
        Text(text = "Hello World!",color = Color.Magenta
            ,fontStyle = FontStyle.Normal
            ,fontWeight = FontWeight.Black
            ,fontSize = 20.sp
            ,overflow = TextOverflow.Visible)
    }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
       MainScreen()
}