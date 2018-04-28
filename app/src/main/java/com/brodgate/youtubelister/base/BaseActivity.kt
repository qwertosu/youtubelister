package com.brodgate.youtubelister.base

import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<T : BasePresenter> : DaggerAppCompatActivity(){

    @Inject lateinit var presenter : T
}