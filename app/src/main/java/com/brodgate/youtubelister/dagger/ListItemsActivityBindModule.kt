package com.brodgate.youtubelister.dagger

import com.brodgate.youtubelister.dagger.scopes.ListItemsActivityScope
import com.brodgate.youtubelister.dagger.scopes.MainActivityScope
import com.brodgate.youtubelister.ui.listitems.ListItemsActivity
import com.brodgate.youtubelister.ui.listitems.ListItemsActivityContract
import com.brodgate.youtubelister.ui.main.MainActivity
import com.brodgate.youtubelister.ui.main.MainActivityContract
import dagger.Binds
import dagger.Module

@Module
abstract class ListItemsActivityBindModule {

    @Binds
    @ListItemsActivityScope
    abstract fun bindListItemsActivityView(view: ListItemsActivity): ListItemsActivityContract.View

}