package com.frogobox.frogolog

import android.util.Log

/*
 * Created by Faisal Amir on 14/02/2021
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
object FLog : IFLog {

    // Constant Variable Simple Message
    const val SIMPLE_MESSSAGE = "SIMPLE DEBUG FOR MARK LINE OF CODE"

    // Tag for get class name this function
    private fun tag() : String {
        return this.javaClass.simpleName
    }
    
    // Function Log Simple Debug without message params
    override fun d(){
        Log.d(tag(), SIMPLE_MESSSAGE)
    }

    // Function Log Debug
    override fun d(msg: String?) {
        Log.d(tag(), "$msg")
    }

    // Function Log Verbose
    override fun v(msg: String?) {
        Log.v(tag(), "$msg")
    }

    // Function Log Info
    override fun i(msg: String?) {
        Log.i(tag(), "$msg")
    }

    // Function Log Warn
    override fun w(msg: String?) {
        Log.w(tag(), "$msg")
    }

    // Function Log Warn
    override fun w(e: Throwable?) {
        Log.w(tag(), "${e?.localizedMessage}")
    }

    // Function Log Warn
    override fun w(e: Exception?) {
        Log.w(tag(), "${e?.localizedMessage}")
    }

    // Function Log Error
    override fun e(msg: String?) {
        Log.e(tag(), "$msg")
    }


}