package com.wetrade.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.wetrade.R
import com.wetrade.components.DefaultTextButton
import com.wetrade.components.RoundedButton
import com.wetrade.components.RoundedClickableBox
import com.wetrade.components.StockItem
import com.wetrade.data.WeTradeData
import com.wetrade.ui.theme.Green

@Composable
fun HomeScreen() {
    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(
        color = MaterialTheme.colors.background,
        darkIcons = false
    )

    Column(
        modifier = Modifier
            .systemBarsPadding()
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        MainSection()
        ValueItemList()
    }
}

@Composable
private fun ButtonSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .paddingFromBaseline(top = 64.dp, bottom = 8.dp),
        Arrangement.SpaceAround
    ) {
        DefaultTextButton(onClick = {}, "ACCOUNT")
        DefaultTextButton(onClick = {}, "WATCHLIST")
        DefaultTextButton(onClick = {}, "PROFILE")
    }
}

@Composable
private fun BalanceSection() {
    Text(
        modifier = Modifier.paddingFromBaseline(top = 32.dp, bottom = 8.dp),
        text = "Balance",
        color = MaterialTheme.colors.onBackground,
        style = MaterialTheme.typography.subtitle1
    )
    Text(
        modifier = Modifier.paddingFromBaseline(top = 48.dp, bottom = 24.dp),
        text = "$73,589.01",
        color = MaterialTheme.colors.onBackground,
        style = MaterialTheme.typography.h1
    )
    Text(
        modifier = Modifier.paddingFromBaseline(top = 16.dp, bottom = 32.dp),
        text = "+412.35 today",
        color = Green,
        style = MaterialTheme.typography.subtitle1
    )
}

@Composable
private fun TransactButton() {
    RoundedButton(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
            .height(48.dp),
        text = "TRANSACT",
        onClick = { },
        textColor = MaterialTheme.colors.onPrimary,
        backgroundColor = MaterialTheme.colors.primary
    )
}

@Composable
private fun CategorySection() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(WeTradeData.categoryData) {
            if (it == "Week") {
                RoundedClickableBox(
                    text = it,
                    boxOnClick = { },
                    isIconAvailable = true,
                    iconButtonOnClick = { }
                )
            } else {
                RoundedClickableBox(text = it, boxOnClick = { })
            }
        }
    }
}

@Composable
private fun Graph() {
    Image(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 112.dp),
        painter = painterResource(id = R.drawable.ic_home_illos),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun MainSection() {
    Column(
        modifier = Modifier.background(color = MaterialTheme.colors.background),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ButtonSection()
        BalanceSection()
        TransactButton()
        CategorySection()
        Graph()
    }
}

@Composable
private fun ValueItemList() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.surface),
        verticalArrangement = Arrangement.Bottom
    ) {
        PositionsSection()
        WeTradeData.StockData.forEach { stock ->
            StockItem(
                valuePrice = stock.valuePrice,
                valueStatus = stock.valueStatus,
                valueName = stock.valueName,
                valueCompany = stock.valueCompany,
                valueGraphId = stock.valueGraphId
            )
        }
    }
}

@Composable
private fun PositionsSection() {
    Box(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .fillMaxWidth(),
        contentAlignment = Alignment.TopCenter
    ) {
        Text(
            modifier = Modifier.paddingFromBaseline(top = 40.dp, bottom = 40.dp),
            text = "Positions",
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.subtitle1
        )
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.BottomCenter) {
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                color = MaterialTheme.colors.surface,
                thickness = 10.dp
            )
        }
    }
}