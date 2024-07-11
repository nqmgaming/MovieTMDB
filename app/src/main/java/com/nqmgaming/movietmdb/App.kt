package com.nqmgaming.movietmdb

import android.app.Application
import timber.log.Timber

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        // Timber initialization
       if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

    }
}