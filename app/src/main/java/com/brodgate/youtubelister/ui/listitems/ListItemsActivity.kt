package com.brodgate.youtubelister.ui.listitems

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import com.brodgate.youtubelister.R
import com.brodgate.youtubelister.adapters.ItemsListAdapter
import com.brodgate.youtubelister.base.BaseActivity
import com.brodgate.youtubelister.models.BundleSerializableWrapper
import com.brodgate.youtubelister.models.DataItemsHolder
import com.brodgate.youtubelister.models.ItemOffsetDecoration
import com.brodgate.youtubelister.utils.ConstantUtils
import kotlinx.android.synthetic.main.activity_list_items.*

class ListItemsActivity : BaseActivity<ListItemsActivityContract.Presenter>(), ListItemsActivityContract.View {


    @Suppress("UNCHECKED_CAST")
    override fun init() {
        val bundle = intent?.extras
        val wrapper = bundle?.getSerializable(ConstantUtils.playListItems) as BundleSerializableWrapper
        val list = wrapper.data as List<DataItemsHolder.ListItems>
        if (list.isNotEmpty()) {
            recycler.apply {
                layoutManager = LinearLayoutManager(getViewContext())
                itemAnimator = DefaultItemAnimator()
                addItemDecoration(ItemOffsetDecoration(getViewContext(), R.dimen.item_space))
                adapter = ItemsListAdapter(list)
            }
        }
    }

    override fun getViewContext(): Context {
        return this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_items)
        presenter.onCreate()
    }
}
