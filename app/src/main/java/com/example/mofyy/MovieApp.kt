@file:Suppress("UNUSED_EXPRESSION")

package com.example.mofyy

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mofyy.ui.component.BottomBar
import com.example.mofyy.ui.component.TopBar
import com.example.mofyy.ui.theme.MofyyTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieApp(
    modifier: Modifier
) {
    Scaffold(
        modifier = modifier,
        topBar = {
             TopAppBar(
                 title = { Text("Mofyy", modifier) }
             )
        },
        bottomBar = {
            BottomBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .padding(bottom = 10.dp)
                    .size(53.dp)
            )
        }
    ) { innerPadding ->
        // Content
        innerPadding
    }
}

@Composable
@Preview(showBackground = true)
fun MovieAppPreview() {
    MofyyTheme {
        MovieApp(modifier = Modifier)
    }
}
