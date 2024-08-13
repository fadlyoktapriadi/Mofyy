package com.example.mofyy.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mofyy.R

val evolveSansFamily = FontFamily(
    Font(R.font.evolve_sans_light, FontWeight.Light),
    Font(R.font.evolve_sans_bold, FontWeight.Bold),
    Font(R.font.evolve_sans_reguler, FontWeight.Normal),
    Font(R.font.evolve_sans_medium, FontWeight.Medium),
    Font(R.font.evolve_sans_thin, FontWeight.Thin)
)


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = evolveSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    titleLarge = TextStyle(
        fontFamily = evolveSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = evolveSansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)

