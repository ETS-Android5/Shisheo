package com.shisheo.net.models

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("name") val name: String = "",
    @SerializedName("image_url") val image_url: String = "",
    @SerializedName("offer") val offer: String = "",
    @SerializedName("description") val description: String = "",
    var isSelected: Boolean = false,
    var latitude: Double,
    var longitude: Double
)
