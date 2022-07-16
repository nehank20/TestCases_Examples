package com.poilkar.nehank.testcases_examples.util

import android.content.Context

import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import com.poilkar.nehank.testcases_examples.R
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{

    lateinit var resourceComparer : ResourceComparer

    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
    }

    @After
    fun teardown(){
        // gc will collect in this case..
        // close room db connection if any..
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(
            context, R.string.app_name, "TestCases_Examples"
        )
        assertThat(result).isTrue()
    }



    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(
            context, R.string.app_name, "Hello"
        )
        assertThat(result).isFalse()
    }
}