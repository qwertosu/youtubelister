package com.brodgate.youtubelister.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DataItemsHolder(@Expose @SerializedName("Playlists")val list : List<Playlists>){

    data class Playlists(
            @Expose
            @SerializedName("ListTitle")
            val ListTitle: String,
            @Expose
            @SerializedName("ListItems")
            var ListItems: List<ListItems>)

    data class ListItems(
            @Expose
            @SerializedName("Title")
            val Title: String,
            @Expose
            @SerializedName("link")
            val link: String,
            @Expose
            @SerializedName("thumb")
            val thumb: String) : Serializable
}
