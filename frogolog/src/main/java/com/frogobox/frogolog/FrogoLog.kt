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
object FrogoLog : IFrogoLog {

    // Constant Variable Simple Message
    const val SIMPLE_MESSSAGE = "SIMPLE DEBUG FOR MARK LINE OF CODE"

    // Tag for get class name this function
    private fun tag() : String {
        return this.javaClass.simpleName
    }

    // Function for get line number of code
    private fun lineNumber(): String {
        return Thread.currentThread().stackTrace[4].let {
            "${it.className.substringAfterLast(".")}.${it.methodName}(${it.fileName}:${it.lineNumber})"
        }
    }

    // Function Log Simple Debug without message params
    override fun d(){
        Log.d(tag(), "${lineNumber()}: $SIMPLE_MESSSAGE")
    }

    // Function Log Debug
    override fun d(msg: String?) {
        Log.d(tag(), "${lineNumber()}: $msg")
    }

    // Function Log Verbose
    override fun v(msg: String?) {
        Log.v(tag(), "${lineNumber()}: $msg")
    }

    // Function Log Info
    override fun i(msg: String?) {
        Log.i(tag(), "${lineNumber()}: $msg")
    }

    // Function Log Warn
    override fun w(msg: String?) {
        Log.w(tag(), "${lineNumber()}: $msg")
    }

    // Function Log Warn
    override fun w(e: Throwable?) {
        Log.w(tag(), "${lineNumber()}: ${e?.localizedMessage}")
    }

    // Function Log Warn
    override fun w(e: Exception?) {
        Log.w(tag(), "${lineNumber()}: ${e?.localizedMessage}")
    }

    // Function Log Error
    override fun e(msg: String?) {
        Log.e(tag(), "${lineNumber()}: $msg")
    }

}