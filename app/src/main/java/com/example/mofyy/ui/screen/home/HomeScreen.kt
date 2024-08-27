package com.example.mofyy.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mofyy.R
import com.example.mofyy.ui.component.home.BannerTrending
import com.example.mofyy.ui.component.MovieItem
import com.example.mofyy.ui.component.home.HeaderHome
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



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}