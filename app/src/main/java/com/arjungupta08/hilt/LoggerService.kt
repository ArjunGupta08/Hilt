package com.arjungupta08.hilt

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {

    fun logging() {
        Log.d("TAG", "User Saved in DB")
    }

}