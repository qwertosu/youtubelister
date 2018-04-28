package com.brodgate.youtubelister.models

import android.content.Context
import android.graphics.Rect
import android.support.v7.widget.RecyclerView
import android.view.View

class ItemOffsetDecoration(val offset: Int) : RecyclerView.ItemDecoration() {

    constructor(context: Context, resId: Int) : this(context.resources.getDimension(resId).toInt())

    override fun getItemOffsets(outRect: Rect?, view: View?, parent: RecyclerView?, state: RecyclerView.State?) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect?.set(offset, offset, offset, offset)
    }
}