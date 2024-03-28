package com.arjungupta08.hilt

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun saveUser(eMail : String, password : String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(eMail: String, password: String) {
        Log.d("TAG", "USER Saved in DB")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(eMail: String, password: String) {
        Log.d("TAG", "USER Saved in Firebase")
    }
}