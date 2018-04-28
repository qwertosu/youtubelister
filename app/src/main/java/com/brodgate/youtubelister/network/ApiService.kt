package com.brodgate.youtubelister.network

import com.brodgate.youtubelister.models.DataItemsHolder
import com.brodgate.youtubelister.utils.ConstantUtils
import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.util.concurrent.TimeUnit

interface ApiService {

    @GET(ConstantUtils.path)
    fun getDataItems(): Observable<DataItemsHolder>


    class ServiceFactory {
        companion object {
            fun createService(): ApiService {
                return Retrofit.Builder()
                        .baseUrl(ConstantUtils.endPoint)
                        .client(OkHttpClient.Builder()
                                .connectTimeout(20, TimeUnit.SECONDS)
                                .readTimeout(20, TimeUnit.SECONDS)
                                .build())
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build().create(ApiService::class.java)
            }
        }
    }
}