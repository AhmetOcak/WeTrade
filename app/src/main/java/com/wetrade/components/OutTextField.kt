package com.wetrade.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun OutTextField(
    modifier: Modifier,
    value: String,
    onValueChanged: (String) -> Unit,
    placeHolderText: String,
    iconId: Int,
    shape: Shape
) {
    OutlinedTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChanged,
        leadingIcon = {
            Icon(
                modifier = Modifier.size(24.dp),
                painter = painterResource(id = iconId),
                contentDescription = null
            )
        },
        placeholder = {
            Row(modifier = Modifier.height(56.dp), verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = placeHolderText,
                    color = MaterialTheme.colors.onSurface,
                    style = MaterialTheme.typography.body1
                )
            }
        },
        shape = shape
    )
}