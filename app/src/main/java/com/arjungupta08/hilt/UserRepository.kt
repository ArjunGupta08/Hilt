package com.arjungupta08.hilt

import javax.inject.Inject

class UserRepository @Inject constructor(val loggerService: LoggerService) {

    fun saveUser(eMail : String, password : String) {
        loggerService.logging()
    }

}