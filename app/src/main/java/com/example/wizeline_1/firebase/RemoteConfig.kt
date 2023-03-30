package com.example.wizeline_1.firebase

import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings

/** * * * * * * * * *
 * Project wizeline_1
 * Created by Jacobo G Tamayo on 29/03/23.
 * * * * * * * * * * **/
class RemoteConfig {
    val remoteConfig: FirebaseRemoteConfig = Firebase.remoteConfig

    val configSettings = remoteConfigSettings {
        minimumFetchIntervalInSeconds = 3600
    }

    init {
        remoteConfig.setConfigSettingsAsync(configSettings)
        remoteConfig.setDefaultsAsync(mapOf(
            "number_of_jokes" to 1
        ))
        remoteConfig.fetchAndActivate()
    }
}