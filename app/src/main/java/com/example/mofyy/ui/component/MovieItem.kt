package com.example.mofyy.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun MovieItem() {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF6F5F5)
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
                    color = Color(0xFF787A91),
                    fontFamily = evolveSansFamily,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "Action, Adventure, Comedy",
                    style = MaterialTheme.typography.bodySmall,
                    color = Color(0xFF787A91),
                    fontFamily = evolveSansFamily,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun MovieItemPreview() {
    MovieItem()
}