package com.wetrade.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RoundedButton(
    modifier: Modifier,
    text: String,
    onClick: () -> Unit,
    textColor: Color,
    backgroundColor: Color
) {
    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor),
        border = BorderStroke(1.dp, MaterialTheme.colors.primary),
        elevation = ButtonDefaults.elevation(0.dp),
        shape = MaterialTheme.shapes.large
    ) {
        Text(text = text, style = MaterialTheme.typography.button, color = textColor)
    }
}