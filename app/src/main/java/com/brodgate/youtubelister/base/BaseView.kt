package com.brodgate.youtubelister.base

import android.content.Context

interface BaseView{

    fun init()
    fun getViewContext() : Context
}