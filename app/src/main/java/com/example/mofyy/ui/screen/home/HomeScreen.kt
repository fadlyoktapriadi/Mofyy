package com.example.mofyy.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mofyy.R
import com.example.mofyy.ui.theme.evolveSansFamily

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
    ) {
        HeaderHome()
        BannerTrending()
        TitleListMovie()
        ListMovieHome()
    }
}

@Composable
fun HeaderHome() {
    Column {
        Text(
            text = "Mofyy",
            style = MaterialTheme.typography.bodyLarge,
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

@Composable
fun BannerTrending() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
    ) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(
                defaultElevation = 12.dp
            ),
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

            ElevatedCard(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFF4C4C),
                ),
                modifier = Modifier
                    .size(width = 60.dp, height = 25.dp)
            ) {
                Row(
                    modifier = Modifier
                        .padding(4.dp)
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 1.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.live),
                        contentDescription = "Live",
                        Modifier
                            .size(15.dp)
                            .padding(end = 2.dp)
                    )
                    Text(
                        text = "Live",
                        style = MaterialTheme.typography.bodySmall,
                        fontSize = 12.sp,
                        fontFamily = evolveSansFamily,
                        fontWeight = FontWeight.Normal,
                        color = Color.White
                    )
                }
            }

            Row {
                Text(
                    text = "UP",
                    style = MaterialTheme.typography.headlineMedium,
                    fontFamily = evolveSansFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 40.sp,
                    color = Color.White,
                    modifier = Modifier.padding(end = 4.dp, top = 4.dp)
                )
                Text(
                    text = "Disney | Pixar",
                    style = MaterialTheme.typography.headlineMedium,
                    fontFamily = evolveSansFamily,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.Bottom)
                )
            }
            Text(
                text = "Action, Adventure, Comedy",
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = evolveSansFamily,
                fontWeight =
                FontWeight.Medium,
                color = Color.White
            )
        }
    }
}

@Composable
fun TitleListMovie() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Popular Movies",
            style = MaterialTheme.typography.bodyLarge,
            fontFamily = evolveSansFamily,
            fontWeight = FontWeight.Medium,
        )
        Row {
            Text(
                text = "View More",
                style = MaterialTheme.typography.bodyLarge,
                color = Color(0xFF5FBDFF),
                fontFamily = evolveSansFamily,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(end = 4.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.arrow_right),
                contentDescription = "Arrow",
                colorFilter = ColorFilter.tint(color = Color(0xFF5FBDFF)),
                modifier = Modifier
                    .size(25.dp)
            )
        }
    }
}

@Composable
fun ListMovieHome() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize().padding(),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item { MovieItem() }
        item { MovieItem() }
        item { MovieItem() }
        item { MovieItem() }
    }
}

@Composable
fun MovieItem() {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF5F7F8)
        ),
        onClick = { }
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.up),
                contentDescription = "Movie",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .clip(
                        RoundedCornerShape(size = 25.dp)
                    )
                    .padding(4.dp)
            )
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = "UP",
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 18.sp,
                    fontFamily = evolveSansFamily,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(bottom = 4.dp, top = 2.dp)
                )
                Text(
                    text = "Rating: 9.4/10",
                    style = MaterialTheme.typography.bodySmall,
                    fontFamily = evolveSansFamily,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "Action, Adventure, Comedy",
                    style = MaterialTheme.typography.bodySmall,
                    fontFamily = evolveSansFamily,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}