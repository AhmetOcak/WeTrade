package com.wetrade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.wetrade.screens.WelcomeScreen
import com.wetrade.ui.theme.WeTradeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeTradeTheme {
                val systemUiController = rememberSystemUiController()
                systemUiController.setStatusBarColor(color = Color.Transparent)
                WindowCompat.setDecorFitsSystemWindows(window, false)
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    WelcomeScreen()
                }
            }
        }
    }
}