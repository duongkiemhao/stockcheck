package com.siliconstack.stockcheck.model

import com.google.gson.annotations.SerializedName

data class CarModel(
        @SerializedName("Color")
        var color: String,
        @SerializedName("Desc")
        var desc: String,
        @SerializedName("Family")
        var family: String,
        @SerializedName("ImageURL")
        var imageURL: String,
        @SerializedName("Items")
        var items: List<CarDetail>,
        @SerializedName("Make")
        var make: String,
        @SerializedName("Variant")
        var variant: String,
        @SerializedName("Year")
        var year: Int
) {
    data class CarDetail(
            @SerializedName("BodyType")
            var bodyType: String,
            @SerializedName("Family")
            var family: String,
            @SerializedName("Make")
            var make: String,
            @SerializedName("Series")
            var series: String,
            @SerializedName("Transmission")
            var transmission: String,
            @SerializedName("VIN_NUMBER")
            var vINNUMBER: String,
            @SerializedName("Variant")
            var variant: String,
            @SerializedName("Year")
            var year: Int
    )
}