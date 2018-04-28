package com.brodgate.youtubelister.ui.main

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import com.brodgate.youtubelister.R
import com.brodgate.youtubelister.adapters.PlaylistAdapter
import com.brodgate.youtubelister.base.BaseActivity
import com.brodgate.youtubelister.models.DataItemsHolder
import com.brodgate.youtubelister.models.ItemOffsetDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<MainActivityContract.Presenter>(), MainActivityContract.View {


    override fun showData(data: DataItemsHolder) {
        recycler.adapter = PlaylistAdapter(data)
    }


    override fun getViewContext(): Context {
        return this
    }


    override fun init() {
        recycler.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            itemAnimator = DefaultItemAnimator()
            addItemDecoration(ItemOffsetDecoration(context, R.dimen.item_space))
        }
        presenter.getData()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.onCreate()
    }
}
