package com.frogobox.frogolog

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
interface IFLog {

    // Function Log Simple Debug without message params
    fun d()

    // Function Log Debug
    fun d(msg: String?)

    // Function Log Verbose
    fun v(msg: String?)

    // Function Log Info
    fun i(msg: String?)

    // Function Log Warn
    fun w(msg: String?)

    // Function Log Warn
    fun w(e: Throwable?)

    // Function Log Warn
    fun w(e: Exception?)

    // Function Log Error
    fun e(msg: String?)

}