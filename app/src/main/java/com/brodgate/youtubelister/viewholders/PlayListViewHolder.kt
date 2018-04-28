package com.brodgate.youtubelister.viewholders

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.brodgate.youtubelister.models.BundleSerializableWrapper
import com.brodgate.youtubelister.models.DataItemsHolder
import com.brodgate.youtubelister.ui.listitems.ListItemsActivity
import com.brodgate.youtubelister.utils.ConstantUtils
import kotlinx.android.synthetic.main.data_item.view.*

class PlayListViewHolder(private val v : View) : RecyclerView.ViewHolder(v){

    private val txtTitle = v.txtTitle
    private val cardView = v.cardView
//    private var playlists : DataItemsHolder.Playlists? = null

    fun bind(item : DataItemsHolder.Playlists){
//        playlists = item
        txtTitle.text = item.ListTitle
        cardView.setOnClickListener{
            val intent = Intent(v.context,ListItemsActivity::class.java)
            val bundle = Bundle()
            val wrapper = BundleSerializableWrapper(item.ListItems)
            bundle.putSerializable(ConstantUtils.playListItems,wrapper)
            intent.putExtras(bundle)
            v.context.startActivity(intent)
        }
    }




}