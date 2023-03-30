package com.example.wizeline_1.data.dto

/** * * * * * * * * *
 * Project wizeline_1
 * Created by Jacobo G Tamayo on 29/03/23.
 * * * * * * * * * * **/
data class RandomJokeResponse(
    val categories: List<String>,
    val created_at: String,
    val icon_url: String,
    val id: String,
    val updated_at: String,
    val url: String,
    val value: String,
)
