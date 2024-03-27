package com.arjungupta08.hilt

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveUser(eMail : String, password : String) {
        Log.d("SAVED", "$eMail, $password")
    }

}