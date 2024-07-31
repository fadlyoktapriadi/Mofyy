package com.example.mofyy.ui.component

import NavigationItem
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mofyy.R
import com.example.mofyy.ui.theme.BackgroundPrimary
import com.example.mofyy.ui.theme.Primary

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
) {
    NavigationBar(
        modifier = modifier.clip(RoundedCornerShape(30.dp)),
        containerColor = BackgroundPrimary,
    ) {
        val navigationItems = listOf(
            NavigationItem(
                icon = R.drawable.home,
                screen = Screen.Home
            ),
            NavigationItem(
                icon = R.drawable.bookmark,
                screen = Screen.Home
            ),
            NavigationItem(
                icon = R.drawable.profile,
                screen = Screen.Home,
            ),

            )
        navigationItems.map { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = "Item",
                        modifier = Modifier.size(30.dp),
                        tint = Primary
                    )
                },
                selected = false,
                onClick = {
                }
            )
        }
    }
}