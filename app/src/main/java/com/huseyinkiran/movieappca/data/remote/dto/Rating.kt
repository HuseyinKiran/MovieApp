package com.huseyinkiran.movieappca.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Rating (
    @SerializedName("Source")
    val source : String,
    @SerializedName("Value")
    val value : String
)