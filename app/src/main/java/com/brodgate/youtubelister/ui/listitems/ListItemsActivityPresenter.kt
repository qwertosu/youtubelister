package com.brodgate.youtubelister.ui.listitems

class ListItemsActivityPresenter(val view : ListItemsActivityContract.View) : ListItemsActivityContract.Presenter {


    override fun onCreate() {
        view.init()
    }

    override fun onResume() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onPause() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}