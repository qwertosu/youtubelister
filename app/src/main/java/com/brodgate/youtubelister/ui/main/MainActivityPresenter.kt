package com.brodgate.youtubelister.ui.main

import com.brodgate.youtubelister.network.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivityPresenter(val view: MainActivityContract.View) : MainActivityContract.Presenter {

    override fun getData() {
        ApiService.ServiceFactory
                .createService()
                .getDataItems()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({d->view.showData(d)},Throwable::printStackTrace)
    }

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