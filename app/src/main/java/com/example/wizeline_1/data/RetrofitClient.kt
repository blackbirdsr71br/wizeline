package com.example.wizeline_1.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/** * * * * * * * * *
 * Project wizeline_1
 * Created by Jacobo G Tamayo on 29/03/23.
 * * * * * * * * * * **/
object RetrofitClient {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.chucknorris.io/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    var service: JokeServiceInterface = retrofit.create(JokeServiceInterface::class.java)
}