package com.wetrade.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.wetrade.R
import com.wetrade.components.OutTextField
import com.wetrade.components.RoundedButton
import com.wetrade.ui.theme.Gray900
import com.wetrade.ui.theme.White

@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = if (isSystemInDarkTheme()) Gray900 else White
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            WelcomeBackSection()
            LoginSection()
        }
    }
}

@Composable
private fun WelcomeBackSection() {
    Box(modifier = Modifier, Alignment.TopCenter) {
        Image(
            modifier = Modifier
                .fillMaxWidth(),
            painter = painterResource(id = R.drawable.ic_login_bg),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .paddingFromBaseline(top = 152.dp),
                text = "Welcome",
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center,
            )
            Text(
                modifier = Modifier.fillMaxWidth(),
                text = "back",
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Composable
private fun LoginFields() {
    OutTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp, start = 16.dp, end = 16.dp)
            .height(56.dp),
        value = "",
        onValueChanged = {},
        placeHolderText = "Email address",
        iconId = R.drawable.ic_baseline_mail_outline,
        shape = MaterialTheme.shapes.small
    )
    OutTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, start = 16.dp, end = 16.dp)
            .height(56.dp),
        value = "",
        onValueChanged = {},
        placeHolderText = "Password",
        iconId = R.drawable.ic_baseline_password,
        shape = MaterialTheme.shapes.small
    )
}

@Composable
private fun LoginButton() {
    RoundedButton(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
            .height(48.dp),
        text = "LOG IN",
        onClick = { },
        textColor = Gray900,
        backgroundColor = MaterialTheme.colors.primary
    )
}

@Composable
private fun LoginSection() {
    Column(modifier = Modifier, Arrangement.Top) {
        LoginFields()
        LoginButton()
    }
}