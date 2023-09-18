package com.wizdom.jetpackcomposestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wizdom.jetpackcomposestudy.ui.theme.JetpackComposeStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeStudyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HelpImage(
                        title = stringResource(id = R.string.title),
                        firstString = stringResource(id = R.string.main_1),
                        secondString = stringResource(id = R.string.main_2)
                    )
                }
            }
        }
    }
}

@Composable
fun MainText(title: String, firstString: String, secondString: String, modifier: Modifier) {
    Column(modifier) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = firstString,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = secondString,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Composable
fun HelpImage(title: String, firstString: String, secondString: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Image(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        MainText(
            title = title,
            firstString = firstString,
            secondString = secondString,
            modifier = Modifier.fillMaxSize())
    }
}



@Preview(showBackground = true)
@Composable
private fun HelpViewPreview() {
    JetpackComposeStudyTheme {
        HelpImage(
            title = stringResource(id = R.string.title),
            firstString = stringResource(id = R.string.main_1),
            secondString = stringResource(id = R.string.main_2)
        )
    }
}