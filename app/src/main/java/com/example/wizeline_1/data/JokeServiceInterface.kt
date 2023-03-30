package com.example.wizeline_1.data

import com.example.wizeline_1.data.dto.RandomJokeResponse
import retrofit2.http.GET

/** * * * * * * * * *
 * Project wizeline_1
 * Created by Jacobo G Tamayo on 29/03/23.
 * * * * * * * * * * **/
interface JokeServiceInterface {
    @GET("https://api.chucknorris.io/jokes/random")
    suspend fun doGetRandomJokeRequest(): RandomJokeResponse
}