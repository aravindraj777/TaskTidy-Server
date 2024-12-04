package com.buildlive.todoKotlinBack.utils

import com.github.f4b6a3.ulid.UlidCreator

object ULIDGenerator{

    fun generate():String{
        return UlidCreator.getUlid().toString()
    }
}