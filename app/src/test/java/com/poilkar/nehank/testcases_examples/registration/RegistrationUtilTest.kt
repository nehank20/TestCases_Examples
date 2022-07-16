package com.poilkar.nehank.testcases_examples.registration

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class RegistrationUtilTest{


    @Test
    fun `empty username return false`(){
        val result = RegistrationUtil.validateRegistrationUtil(
            username = "",
            password = "neh123",
            confirmPassword = "neh123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`(){
        val result = RegistrationUtil.validateRegistrationUtil(
            username = "nehank",
            password = "",
            confirmPassword = "neh123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password and confirm password does not match returns false`(){
        val result = RegistrationUtil.validateRegistrationUtil(
            username = "nehank",
            password = "neh123",
            confirmPassword = "neh124"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correct password returns true`(){
        val result = RegistrationUtil.validateRegistrationUtil(
            username = "nehank",
            password = "neh123",
            confirmPassword = "neh123"
        )
        assertThat(result).isTrue()
    }

}
