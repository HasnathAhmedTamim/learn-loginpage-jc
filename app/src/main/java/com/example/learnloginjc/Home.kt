package com.example.learnloginjc

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.learnloginjc.ui.theme.GreenJc

@Composable
fun HomeScreen(onLogout: () -> Unit = {}) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            // Ensure text is large and high-contrast so it's visible on top of background
            Text(
                text = "Welcome to the Home Screen!",
                color = Color.White, // or use GreenJc if preferred: color = GreenJc
                fontSize = 28.sp
            )

            // Logout button so user can go back to login
            androidx.compose.foundation.layout.Spacer(modifier = Modifier)

            Button(onClick = onLogout) {
                Text(text = "Logout")
            }
        }

    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}