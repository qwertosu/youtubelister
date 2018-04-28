package com.brodgate.youtubelister.dagger

import com.brodgate.youtubelister.dagger.scopes.MainActivityScope
import com.brodgate.youtubelister.ui.main.MainActivityContract
import com.brodgate.youtubelister.ui.main.MainActivityPresenter
import dagger.Module
import dagger.Provides

@Module
class MainActivityProviderModule {

    @MainActivityScope
    @Provides
    fun provideMainActivityPresenter(view: MainActivityContract.View): MainActivityContract.Presenter {
        return MainActivityPresenter(view)
    }
}