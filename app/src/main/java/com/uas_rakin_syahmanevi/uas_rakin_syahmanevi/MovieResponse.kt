package com.uas_rakin_syahmanevi.uas_rakin_syahmanevi

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse(
    @SerializedName("results")
    val movies : List<Movie>
) : Parcelable {
    constructor() : this(mutableListOf())
}