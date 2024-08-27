package com.example.mofyy.ui.component.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mofyy.R
import com.example.mofyy.ui.theme.evolveSansFamily

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