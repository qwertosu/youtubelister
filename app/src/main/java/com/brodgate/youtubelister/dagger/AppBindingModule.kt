package com.brodgate.youtubelister.dagger

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

@Module
abstract class AppBindingModule(val app : Application){

    @Binds abstract fun bindApplicationContext(app: Application) : Context

}