package com.nqmgaming.movietmdb

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {
    override fun onCreate() {
        super.onCreate()

        // Timber initialization
       if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

    }
}