package com.brodgate.youtubelister.dagger

import com.brodgate.youtubelister.dagger.scopes.ListItemsActivityScope
import com.brodgate.youtubelister.dagger.scopes.MainActivityScope
import com.brodgate.youtubelister.ui.listitems.ListItemsActivityContract
import com.brodgate.youtubelister.ui.listitems.ListItemsActivityPresenter
import com.brodgate.youtubelister.ui.main.MainActivityContract
import com.brodgate.youtubelister.ui.main.MainActivityPresenter
import dagger.Module
import dagger.Provides

@Module
class ListItemsActivityProviderModule {

    @ListItemsActivityScope
    @Provides
    fun provideListItemsActivityPresenter(view: ListItemsActivityContract.View): ListItemsActivityContract.Presenter {
        return ListItemsActivityPresenter(view)
    }
}