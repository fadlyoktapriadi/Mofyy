package com.example.mofyy

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mofyy.ui.component.BottomBar
import com.example.mofyy.ui.screen.favorite.FavoriteScreen
import com.example.mofyy.ui.screen.home.HomeScreen
import com.example.mofyy.ui.screen.profile.ProfileScreen
import com.example.mofyy.ui.theme.Background
import com.example.mofyy.ui.theme.MofyyTheme

@Composable
fun MovieApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        modifier = modifier,
        bottomBar = {
            BottomBar(
                navController,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(55.dp)
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
                .background(Background)
        ) {
            composable(Screen.Home.route) {
                HomeScreen()
            }
            composable(Screen.Favorite.route) {
                FavoriteScreen()
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MovieAppPreview() {
    MofyyTheme {
        MovieApp(modifier = Modifier)
    }
}