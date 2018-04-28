package com.brodgate.youtubelister.dagger

import com.brodgate.youtubelister.dagger.scopes.ListItemsActivityScope
import com.brodgate.youtubelister.dagger.scopes.MainActivityScope
import com.brodgate.youtubelister.dagger.scopes.YoutubeActivityScope
import com.brodgate.youtubelister.ui.listitems.ListItemsActivity
import com.brodgate.youtubelister.ui.main.MainActivity
import com.brodgate.youtubelister.ui.youtube.YoutubeActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [
        (MainActivityBindModule::class),
        (MainActivityProviderModule::class)])
    @MainActivityScope
    abstract fun loadMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [
        (ListItemsActivityBindModule::class),
        (ListItemsActivityProviderModule::class)])
    @ListItemsActivityScope
    abstract fun loadListItemsActivity(): ListItemsActivity

//    @ContributesAndroidInjector(modules = [
//        (YoutubeActivityBindModule::class),
//        (YoutubeActivityProviderModule::class)])
//    @YoutubeActivityScope
//    abstract fun loadYoutubeActivity(): YoutubeActivity
}