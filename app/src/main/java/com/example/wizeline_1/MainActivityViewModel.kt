package com.example.wizeline_1

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.wizeline_1.data.RetrofitClient
import com.example.wizeline_1.firebase.RemoteConfig
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

/** * * * * * * * * *
 * Project wizeline_1
 * Created by Jacobo G Tamayo on 29/03/23.
 * * * * * * * * * * **/
class MainActivityViewModel( application: Application ): AndroidViewModel(application) {
    val fbRemoteConfig = RemoteConfig()
    val client = RetrofitClient
    private val _jokesMutable = MutableStateFlow<List<String>>( listOf() )
    val jokesMutable: StateFlow<List<String>> = _jokesMutable

    fun getNumberOfJokes(): Int {
        return fbRemoteConfig.remoteConfig.getLong("number_of_jokes").toInt()
    }

    fun getJokes(){
        val jokeList = mutableListOf<String>()
        Log.d("JOKES", getNumberOfJokes().toString())
        viewModelScope.launch {
            for (i in (0 .. getNumberOfJokes() )) {
                Log.d("JOKES", getNumberOfJokes().toString())

                jokeList.add( client.service.doGetRandomJokeRequest().value )
            }
            Log.d("JOKES", jokeList.toString())
            _jokesMutable.value =  jokeList
        }
    }
}