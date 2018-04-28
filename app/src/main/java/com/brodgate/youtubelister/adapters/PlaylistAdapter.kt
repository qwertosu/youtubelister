package com.brodgate.youtubelister.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.brodgate.youtubelister.R
import com.brodgate.youtubelister.models.DataItemsHolder
import com.brodgate.youtubelister.viewholders.PlayListViewHolder

class PlaylistAdapter(val data :DataItemsHolder) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.data_item, parent, false)
        return PlayListViewHolder(v)
    }

    override fun getItemCount(): Int {
        return data.list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PlayListViewHolder).bind(data.list[position])
    }

}