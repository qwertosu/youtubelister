package com.brodgate.youtubelister.ui.youtube

import android.content.Context
import android.os.Bundle
import com.brodgate.youtubelister.R
import com.brodgate.youtubelister.utils.ConstantUtils
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_youtube.*

class YoutubeActivity : YouTubeBaseActivity(), YoutubeActivityContract.View, YouTubePlayer.OnInitializedListener {
    override fun onInitializationSuccess(provider: YouTubePlayer.Provider?, player: YouTubePlayer?, bool: Boolean) {
        val url = intent.getStringExtra("url")
        val id = url.substring(url.indexOf("=") + 1, url.length)
        player?.cueVideo(id)
        player?.play()
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun init() {
        //init
        youtubeView.initialize(ConstantUtils.youtubeApiKey, this)
    }

    override fun getViewContext(): Context {
        return this
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        init()
    }
}