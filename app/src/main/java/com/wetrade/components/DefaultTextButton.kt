package com.wetrade.components

import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DefaultTextButton(onClick: () -> Unit, text: String) {
    TextButton(
        modifier = Modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(Color.Transparent),
    ) {
        Text(
            text = text,
            color = MaterialTheme.colors.onBackground,
            style = MaterialTheme.typography.button
        )
    }
}
