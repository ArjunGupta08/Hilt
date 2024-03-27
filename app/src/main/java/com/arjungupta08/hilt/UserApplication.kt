package com.arjungupta08.hilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication : Application() {

    override fun onCreate() {
        super.onCreate()

    }
}