package com.example.mofyy.ui.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.mofyy.ui.theme.evolveSansFamily

@Composable
fun HomeScreen(){
    HeaderHome()
}

@Composable
fun HeaderHome(){
    Column {
        Text(text = "Mofyy",
            style = MaterialTheme.typography.bodyLarge, fontFamily = evolveSansFamily,
            fontWeight = FontWeight.Medium)
        Text(text = "Trending Now", style = MaterialTheme.typography.headlineMedium,
            fontFamily = evolveSansFamily, fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}