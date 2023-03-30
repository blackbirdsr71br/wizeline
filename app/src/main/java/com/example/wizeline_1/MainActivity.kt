package com.example.wizeline_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.jetmoviesapp.presentation.navigation.NavigateScreens
import com.example.wizeline_1.ui.presentation.JokeCard
import curso.wizeline2023.wizeline_1.ui.theme.Wizeline_1Theme

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainActivityViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Wizeline_1Theme {
                val navController = rememberNavController()

                NavigateScreens(navController = navController, viewModel = viewModel)

            }
        }


    }
}


@Composable
fun StartScreen(
    viewModel : MainActivityViewModel,
    navController : NavHostController,
)
{
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {

        viewModel.getJokes()
        Column() {

            Text("Remote config: ${viewModel.getNumberOfJokes()}")
            Column() {
                LazyColumn(
                    modifier = Modifier.padding(8.dp)
                ){
                    item{
                        viewModel.jokesMutable.collectAsState(initial = listOf()).value.forEach {
                            JokeCard(chiste = it, navController = navController)
                        }
                    }

                }

            }
        }

    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Wizeline_1Theme {
        Greeting("Android")
    }
}