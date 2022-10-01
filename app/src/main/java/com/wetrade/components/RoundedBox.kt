package com.wetrade.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.wetrade.R
import com.wetrade.ui.theme.White

@Composable
fun RoundedClickableBox(
    text: String,
    boxOnClick: () -> Unit,
    iconButtonOnClick: () -> Unit = {},
    isIconAvailable: Boolean = false
) {
    Box(
        modifier = Modifier
            .height(40.dp)
            .clip(MaterialTheme.shapes.large)
            .border(
                color = MaterialTheme.colors.onBackground,
                shape = MaterialTheme.shapes.large,
                width = 1.dp
            )
            .clickable(onClick = boxOnClick)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .height(40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = text,
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.body1
            )
            if (isIconAvailable) {
                IconButton(modifier = Modifier.size(16.dp), onClick = iconButtonOnClick, content = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_expand_more),
                        contentDescription = null,
                        tint = White
                    )
                })
            }
        }
    }
}