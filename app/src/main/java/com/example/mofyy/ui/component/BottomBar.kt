package com.example.mofyy.ui.component

import NavigationItem
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.mofyy.R
import com.example.mofyy.ui.theme.Background
import com.example.mofyy.ui.theme.Primary

@Composable
fun BottomBar(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    NavigationBar(
        modifier = modifier,
        containerColor = Background,
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(R.string.home),
                icon = R.drawable.home,
                selectedIcon = R.drawable.home_click,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(R.string.favorite),
                icon = R.drawable.bookmark,
                selectedIcon = R.drawable.bookmark_click,
                screen = Screen.Favorite
            ),
            NavigationItem(
                title = stringResource(R.string.profile),
                icon = R.drawable.profile,
                selectedIcon = R.drawable.profile_click,
                screen = Screen.Profile,
            ),
        )
        navigationItems.map { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = if (currentRoute == item.screen.route)
                            item.selectedIcon else item.icon),
                        contentDescription = "Item Menu",
                        modifier = Modifier.size(20.dp),
                        tint = Primary
                    )
                },
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                }
            )
        }
    }
}