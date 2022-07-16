package com.poilkar.nehank.testcases_examples.util

import android.content.Context

class ResourceComparer {

    fun isEqual(
        context: Context,
        resId: Int,
        value: String
    ): Boolean{
        return context.getString(resId) == value
    }

}