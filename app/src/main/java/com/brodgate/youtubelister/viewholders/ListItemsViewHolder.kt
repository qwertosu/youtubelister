package com.brodgate.youtubelister.viewholders

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.View
import com.brodgate.youtubelister.models.DataItemsHolder
import com.brodgate.youtubelister.models.GlideApp
import com.brodgate.youtubelister.ui.youtube.YoutubeActivity
import kotlinx.android.synthetic.main.list_item.view.*

class ListItemsViewHolder(val v: View) : RecyclerView.ViewHolder(v) {

    private val txtListName = v.txtListName
    private val imgThumb = v.imgThumb
    private val cardView = v.cardView

    fun bind(item: DataItemsHolder.ListItems) {
        txtListName.text = item.Title
        GlideApp.with(v)
                .load(item.thumb.replace("\\s".toRegex(), ""))
                .into(imgThumb)
        cardView.setOnClickListener {
            val intent = Intent(v.context,YoutubeActivity::class.java)
            intent.putExtra("url",item.link)
            v.context.startActivity(intent)
        }
    }


}