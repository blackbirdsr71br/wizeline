package com.example.wizeline_1.ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.jetmoviesapp.presentation.navigation.Screen
import curso.wizeline2023.wizeline_1.R
import curso.wizeline2023.wizeline_1.ui.theme.Purple200


@Composable
fun JokeCard(
    chiste : String,
    navController : NavHostController,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .clickable {
                navController.navigate(route = Screen.Risas.route)
            },
        backgroundColor = Purple200
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                modifier = Modifier
                    .size(60.dp)
                    .padding(4.dp),
                painter = painterResource(id = R.drawable.joker),
                contentDescription = ""
            )

            Text(text = chiste)
        }
    }
    Spacer(modifier = Modifier.height(8.dp))
}

