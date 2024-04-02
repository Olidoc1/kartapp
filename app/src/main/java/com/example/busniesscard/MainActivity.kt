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
                    color = Color(255,216,236)
                ) {
                    RowDown()
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
            // .background(color = Color.Magenta)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )

    {
        Image(
            painter = imagemain,
            contentDescription = null,
            modifier
                .size(90.dp)
            //  .background(color = Color.Cyan)

        )

        Text(
            text = name,
            fontSize = 50.sp,
            color = Color(120,66,131),
            fontWeight = FontWeight.ExtraBold
            //   .background(color = Color.Gray)

        )

        Text(
            text = position,
            fontSize = 20.sp,
            color = Color(255,168,203),
            fontWeight = FontWeight.Bold
            //  .background(color = Color.Green)

        )
    }

}
@Composable
private fun TextDef (basic:String, modifier: Modifier = Modifier) {

    val imagetel = painterResource(R.drawable.telephone_call)
    
    //TODO IMPLEMENT THIS IMAGES FOR GITHUB, EMIAL AND PHONE
    //val imageem = painterResource(R.drawable.email)
   // val imagegit = painterResource(R.drawable.github)


    Column (
        modifier = modifier
            //.background(color = Color.Yellow)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Row(
            modifier = modifier
        ) {

            Image(
                painter = imagetel,
                contentDescription = null,
                Modifier
                    .size(20.dp)
            )

            Text(
                text = basic,
                textAlign = TextAlign.Center,
                color = Color(120,66,131),
                modifier = Modifier
                    .padding(bottom = 15.dp, start = 8.dp)

            )
        }
    }
}

@Composable
fun RowDown(modifier: Modifier = Modifier) {
    Column {

        Column(
            modifier = modifier
                .fillMaxHeight()
                .weight(6f),
            verticalArrangement = Arrangement.Center
        )

        {
            MainText(
                name = stringResource(R.string.name), position = stringResource(R.string.position)
            )
        }


        Column(modifier = modifier
                    .weight(1f))
                {
            TextDef(
                basic = stringResource(R.string.tel_number),
            )
            TextDef(
                basic = stringResource(R.string.username_text),
            )
            TextDef(
                basic = stringResource(R.string.email_text),

                )
        }
    }
    }



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    RowDown()
    }