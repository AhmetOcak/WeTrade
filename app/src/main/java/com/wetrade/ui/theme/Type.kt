package com.wetrade.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.wetrade.R


val fonts = FontFamily(
    Font(R.font.montserrat_extra_bold, FontWeight.ExtraBold),
    Font(R.font.montserrat_semi_bold, FontWeight.SemiBold),
    Font(R.font.montserrat_medium, FontWeight.Medium),
    Font(R.font.montserrat_light, FontWeight.Light),
    Font(R.font.montserrat_bold, FontWeight.Bold)
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = fonts,
        fontSize = 40.sp,
        fontWeight = FontWeight.ExtraBold,
        letterSpacing = 1.25.sp
    ),
    h2 = TextStyle(
        fontFamily = fonts,
        fontSize = 36.sp,
        fontWeight = FontWeight.ExtraBold,
        letterSpacing = 0.sp
    ),
    h3 = TextStyle(
        fontFamily = fonts,
        fontSize = 13.sp,
        fontWeight = FontWeight.SemiBold,
        letterSpacing = 0.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = fonts,
        fontSize = 15.sp,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.sp
    ),
    body1 = TextStyle(
        fontFamily = fonts,
        fontSize = 13.sp,
        fontWeight = FontWeight.Light,
        letterSpacing = 0.sp
    ),
    button = TextStyle(
        fontFamily = fonts,
        fontSize = 13.sp,
        fontWeight = FontWeight.Bold,
        letterSpacing = 1.25.sp
    )
)