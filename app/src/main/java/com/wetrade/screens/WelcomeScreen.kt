package com.wetrade.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.wetrade.R
import com.wetrade.components.RoundedButton

@Composable
fun WelcomeScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        BackgroundImage()
        Logo()
        Buttons()
    }
}

@Composable
private fun BackgroundImage() {
    Image(
        modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.ic_welcome_bg),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun Logo() {
    Box(modifier = Modifier, Alignment.Center) {
        Image(painter = painterResource(id = R.drawable.ic_logo), contentDescription = null)
    }
}

@Composable
private fun Buttons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .systemBarsPadding()
            .navigationBarsPadding()
            .padding(bottom = 32.dp)
            .height(48.dp),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceAround,
    ) {
        GetStartedButton()
        LoginButton()
    }
}

@Composable
private fun GetStartedButton() {
    RoundedButton(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .size(height = 48.dp, width = 160.dp),
        text = "GET STARTED",
        onClick = { },
        textColor = MaterialTheme.colors.onPrimary,
        backgroundColor = MaterialTheme.colors.primary
    )
}

@Composable
private fun LoginButton() {
    RoundedButton(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .size(height = 48.dp, width = 160.dp),
        text = "LOG IN",
        onClick = { },
        textColor = MaterialTheme.colors.primary,
        backgroundColor = Color.Transparent
    )
}