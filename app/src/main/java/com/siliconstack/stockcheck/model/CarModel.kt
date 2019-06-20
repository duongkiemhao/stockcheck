package com.siliconstack.stockcheck.model

import com.google.gson.annotations.SerializedName

data class CarModel(
        @SerializedName("color")
        var color: String?,
        @SerializedName("desc")
        var desc: String?,
        @SerializedName("family")
        var family: String?,
        @SerializedName("imageURL")
        var imageURL: String?,
        @SerializedName("items")
        var items: List<CarDetail>?,
        @SerializedName("make")
        var make: String?,
        @SerializedName("variant")
        var variant: String?,
        @SerializedName("year")
        var year: String?
) {
    data class CarDetail(
            @SerializedName("bodyType")
            var bodyType: String?,
            @SerializedName("family")
            var family: String?,
            @SerializedName("make")
            var make: String?,
            @SerializedName("series")
            var series: String?,
            @SerializedName("transmission")
            var transmission: String?,
            @SerializedName("vinNumber")
            var vINNUMBER: String?,
            @SerializedName("variant")
            var variant: String?,
            @SerializedName("year")
            var year: String?
    )
}