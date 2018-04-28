package com.brodgate.youtubelister.dagger

import com.brodgate.youtubelister.dagger.scopes.YoutubeActivityScope
import com.brodgate.youtubelister.ui.youtube.YoutubeActivityContract
import com.brodgate.youtubelister.ui.youtube.YoutubeActivityPresenter
import dagger.Module
import dagger.Provides

@Module
class YoutubeActivityProviderModule {

    @YoutubeActivityScope
    @Provides
    fun provideYoutubeActivityPresenter(view: YoutubeActivityContract.View): YoutubeActivityContract.Presenter {
        return YoutubeActivityPresenter(view)
    }
}