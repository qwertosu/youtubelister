package com.brodgate.youtubelister.ui.main

import com.brodgate.youtubelister.base.BasePresenter
import com.brodgate.youtubelister.base.BaseView
import com.brodgate.youtubelister.models.DataItemsHolder
import io.reactivex.Observable

interface MainActivityContract{

    interface View : BaseView{
        fun showData(data : DataItemsHolder)
    }

    interface Presenter : BasePresenter{
        fun getData()
    }

}