package com.example.mofyy.ui.component.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.mofyy.ui.theme.evolveSansFamily

@Composable
fun HeaderHome() {
    Column {
        Text(
            text = "Mofyy",
            style = MaterialTheme.typography.bodyLarge,
            color = Color(0xFF5FBDFF),
            fontFamily = evolveSansFamily,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = "Trending Now",
            style = MaterialTheme.typography.headlineMedium,
            fontFamily = evolveSansFamily,
            fontWeight = FontWeight.SemiBold
        )
    }
}