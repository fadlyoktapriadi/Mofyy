package com.example.mofyy.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mofyy.R
import com.example.mofyy.ui.theme.evolveSansFamily

@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        HeaderHome()
        BannerTrending()
    }
}

@Composable
fun HeaderHome(){
    Column {
        Text(text = "Mofyy",
            style = MaterialTheme.typography.bodyLarge, fontFamily = evolveSansFamily,
            fontWeight = FontWeight.Medium)
        Text(text = "Trending Now", style = MaterialTheme.typography.headlineMedium,
            fontFamily = evolveSansFamily, fontWeight = FontWeight.SemiBold)
    }
}

@Composable
fun BannerTrending(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 20.dp)) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(
                    RoundedCornerShape(size = 40.dp)
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.up),
                contentDescription = "Banner",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize()
            )
        }
        Column(
            Modifier
                .align(Alignment.BottomStart)
                .padding(14.dp)
                .clip(RoundedCornerShape(size = 20.dp))
                .padding(8.dp)
        ) {
            Row {
                Text(text = "UP", style = MaterialTheme.typography.headlineMedium,
                    fontFamily = evolveSansFamily, fontWeight = FontWeight.SemiBold, fontSize = 40.sp,
                    color = Color.White, modifier = Modifier.padding(end = 4.dp))
                Text(text = "Disney | Pixar", style = MaterialTheme.typography.headlineMedium,
                    fontFamily = evolveSansFamily, fontWeight = FontWeight.SemiBold, fontSize = 20.sp,
                    color = Color.White, modifier = Modifier.align(Alignment.Bottom))
            }
            Text(text = "Action, Adventure, Comedy", style = MaterialTheme.typography.bodyMedium,
                fontFamily = evolveSansFamily, fontWeight = FontWeight.Medium, color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}