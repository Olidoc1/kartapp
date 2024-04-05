package com.example.busniesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
                    color = Color(255,216,236)
                ) {
                    Done()
                }
            }
        }
    }
}
@Composable
private fun MainText(modifier: Modifier = Modifier,name: String, position: String ){

    val imagemain = painterResource(R.drawable.daco_1075870)

    Column (
        modifier = modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )

    {
        Image(
            painter = imagemain,
            contentDescription = null,
            modifier
                .size(90.dp)

        )

        Text(
            text = name,
            fontSize = 50.sp,
            color = Color(120,66,131),
            fontWeight = FontWeight.ExtraBold

        )

        Text(
            text = position,
            fontSize = 20.sp,
            color = Color(255,168,203),
            fontWeight = FontWeight.Bold

        )
    }

}
@Composable
private fun TextDef (modifier: Modifier = Modifier) {

    val imagetel = painterResource(R.drawable.telephone_call)
    val imageem = painterResource(R.drawable.email)
    val imagegit = painterResource(R.drawable.github)

    Column (
        modifier
            .fillMaxWidth()
            .padding(
                start = 100.dp,
                end = 40.dp),
        horizontalAlignment = Alignment.Start) {

        Row (modifier.padding(bottom = 6.dp)) {
            Image(
                painter = imagetel,
                contentDescription = null,
                Modifier
                    .size(20.dp))

            Text(
                text = stringResource(R.string.tel_number),
                modifier
                    .padding(start = 20.dp))
        }

        Row (modifier.padding(bottom = 6.dp)) {
            Image(
                painter = imagegit,
                contentDescription = null,
                Modifier
                    .size(20.dp))
            Text(
                text = stringResource(R.string.username_text),
                modifier
                    .padding(start = 20.dp))
        }

        Row (modifier.padding(bottom = 6.dp)) {
            Image(
                painter = imageem,
                contentDescription = null,
                Modifier
                    .size(20.dp))
            Text(
                text = stringResource(R.string.email_text),
                modifier
                    .padding(start = 20.dp, bottom = 30.dp))
        }

    }
}


    @Composable
    fun Done (modifier: Modifier = Modifier) {
        Column {
            Column(
                modifier = modifier
                    .fillMaxHeight()
                    .weight(6f),
                verticalArrangement = Arrangement.Center
            )

            {
                MainText(
                    name = stringResource(R.string.name),
                    position = stringResource(R.string.position)
                )


            }

                TextDef()
        }
    }



    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun GreetingPreview() {
            Done()
    }
