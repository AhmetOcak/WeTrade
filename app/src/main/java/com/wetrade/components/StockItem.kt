package com.wetrade.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.wetrade.ui.theme.Red

@Composable
fun StockItem(
    valuePrice: String,
    valueStatus: String,
    valueName: String,
    valueCompany: String,
    valueGraphId: Int
) {
    Divider(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        color = MaterialTheme.colors.onSurface,
        thickness = 1.dp
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(56.dp),
    ) {
        Column(
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 16.dp).padding(end = 16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "$${valuePrice}",
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "${valueStatus}%",
                color = Red,
                style = MaterialTheme.typography.body1
            )
        }
        Column(
            modifier = Modifier.paddingFromBaseline(top = 24.dp, bottom = 16.dp),
        ) {
            Text(
                text = valueName,
                color = MaterialTheme.colors.onSurface,
                style = MaterialTheme.typography.h3
            )
            Text(
                text = valueCompany,
                color = Red,
                style = MaterialTheme.typography.body1
            )
        }
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
            Image(
                modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 16.dp),
                painter = painterResource(id = valueGraphId),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
    }
}