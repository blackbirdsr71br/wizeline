package com.example.wizeline_1.ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import curso.wizeline2023.wizeline_1.R

@Composable
fun ImageScreen()
{
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Image(
            modifier = Modifier
                .size(200.dp)
                .padding(4.dp),
            painter = painterResource(id = R.drawable.risa),
            contentDescription = ""
        )
    }
}