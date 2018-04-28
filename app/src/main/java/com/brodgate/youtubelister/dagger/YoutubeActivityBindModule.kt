package com.brodgate.youtubelister.dagger

import com.brodgate.youtubelister.dagger.scopes.YoutubeActivityScope
import com.brodgate.youtubelister.ui.youtube.YoutubeActivity
import com.brodgate.youtubelister.ui.youtube.YoutubeActivityContract
import dagger.Binds
import dagger.Module

@Module
abstract class YoutubeActivityBindModule {

    @Binds
    @YoutubeActivityScope
    abstract fun bindYoutubeActivityView(view: YoutubeActivity): YoutubeActivityContract.View

}