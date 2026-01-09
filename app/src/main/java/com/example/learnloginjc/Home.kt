package com.example.learnloginjc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.learnloginjc.ui.theme.GreenJc

@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize().background(Color.White)) {
        // Content of the Home Screen goes here
        Column(
            modifier = Modifier.fillMaxSize().align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,

        ) {
            Text(text = "Welcome to the Home Screen!", color = GreenJc , fontSize = 50.sp)
        }

    }
}