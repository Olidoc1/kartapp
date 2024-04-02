package com.example.busniesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.busniesscard.ui.theme.BusniessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusniessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(57, 115, 103)
                ) {
                    RowDonw()
                }
            }
        }
    }
}

@Composable
private fun TextDef (basic:String) {

    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)

    ) {
        Text(
            text = basic,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(bottom = 8.dp)
        )
    }
}

@Composable
private fun MainText(modifier: Modifier = Modifier,name: String, position: String ){

    Column {
        Text(
            text = name
        )

        Text(
            text = position,
            fontSize = 15.sp
        )
    }

}

@Composable
fun RowDonw(modifier: Modifier = Modifier) {
        Column(
        )
        {
            MainText(name = "Ted Doe", position = "Android Developer" )

            TextDef(basic = stringResource(R.string.tel_number))
            TextDef(basic = stringResource(R.string.username_text))
            TextDef(basic = stringResource(R.string.email_text))


        }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    RowDonw()
    }