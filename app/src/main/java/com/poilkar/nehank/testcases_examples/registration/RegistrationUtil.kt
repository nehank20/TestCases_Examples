package com.poilkar.nehank.testcases_examples.registration

object RegistrationUtil {

    fun validateRegistrationUtil(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean{

        if(username.trim().isEmpty() || password.trim().isEmpty() )
            return false
        if(password.trim() != confirmPassword.trim())
            return false
        return true
    }
}