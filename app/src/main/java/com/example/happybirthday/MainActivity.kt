package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayGreetingWithImage("Fauzaan","Everyone")
                }
            }
        }
    }
}


@Composable
fun BirthdayGreetingWithImage(name: String, from: String){
    val image = painterResource(id = R.drawable.androidparty)

    Image(painter = image, contentDescription = null, modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(),
    contentScale = ContentScale.Crop

    )
    BirthdayGreetingText(name=name, from = from)
}



@Composable
fun BirthdayGreetingText(name: String, from: String) {
    Column {
        Text(
            text = stringResource(R.string.happy_birthday_text) + "$name!",
            fontSize = 36.sp,
            modifier = Modifier.fillMaxWidth()
                .wrapContentWidth(align = Alignment.Start)
                .padding(start = 16.dp, top = 16.dp)
        )

        Text(
            text = stringResource(R.string.from_text) + "$from!",
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(align = Alignment.End)
                .padding(start = 16.dp, end = 16.dp)
        )
    }

}

@Composable
fun BackButtonHandler(name: String) {

}


@Composable
fun DrawTextField(name: String) {

}

@Composable
fun RoundIcon(name: String) {

}




@Preview(showBackground = true)
@Composable
fun BirthdayGreetingWithImagePreview() {
    HappyBirthdayTheme {
        BirthdayGreetingWithImage(stringResource(R.string.name), stringResource(R.string.from))
    }
}