package com.brodgate.youtubelister.dagger

import com.brodgate.youtubelister.dagger.scopes.MainActivityScope
import com.brodgate.youtubelister.ui.main.MainActivity
import com.brodgate.youtubelister.ui.main.MainActivityContract
import dagger.Binds
import dagger.Module

@Module
abstract class MainActivityBindModule {

    @Binds
    @MainActivityScope
    abstract fun bindMainActivityView(view: MainActivity): MainActivityContract.View

}