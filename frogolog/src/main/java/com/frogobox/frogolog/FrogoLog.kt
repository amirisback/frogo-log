package com.frogobox.frogolog

import android.util.Log

/*
 * Created by Faisal Amir on 14/01/2021
 * LogCat Source Code
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.      
 * All rights reserved
 *
 */
object FrogoLog {

    private fun tag() : String {
        return this.javaClass.simpleName
    }

    private fun logMessage(): String {
        return Thread.currentThread().stackTrace[4].let {
            "${it.className.substringAfterLast(".")}.${it.methodName}(${it.fileName}:${it.lineNumber})"
        }
    }

    fun d(){
        Log.d(tag(), "${logMessage()}: SIMPLE DEBUG FOR MARK LINE OF CODE")
    }

    fun d(msg: String?) {
        Log.d(tag(), "${logMessage()}: $msg")
    }

    fun v(msg: String?) {
        Log.v(tag(), "${logMessage()}: $msg")
    }

    fun i(msg: String?) {
        Log.i(tag(), "${logMessage()}: $msg")
    }

    fun w(msg: String?) {
        Log.w(tag(), "${logMessage()}: $msg")
    }

    fun w(e: Throwable?) {
        Log.w(tag(), "${logMessage()}: ${e?.localizedMessage}")
    }

    fun w(e: Exception?) {
        Log.w(tag(), "${logMessage()}: ${e?.localizedMessage}")
    }

    fun e(msg: String?) {
        Log.e(tag(), "${logMessage()}: $msg")
    }


}