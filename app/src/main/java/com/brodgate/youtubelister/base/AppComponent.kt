package com.brodgate.youtubelister.base

import android.app.Application
import com.brodgate.youtubelister.dagger.ActivityBindingModule
import com.brodgate.youtubelister.dagger.AppBindingModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    (AndroidSupportInjectionModule::class),
    (AppBindingModule::class),
    (ActivityBindingModule::class)])
interface AppComponent : AndroidInjector<DaggerApplication>{

    fun inject(app : App)

    @Component.Builder
    interface Builder{
        fun build() : AppComponent

        @BindsInstance
        fun application(app : Application) : Builder
    }
}