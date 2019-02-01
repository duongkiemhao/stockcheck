package com.siliconstack.stockcheck.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

 class GoogleVisionRequest() {
     @SerializedName("requests")
     var requests:ArrayList<Request>?=null


     class Request {
         @SerializedName("features")
         var features: ArrayList<Feature>?=null
         @SerializedName("image")
         var image: Image?=null

     }

         data class Feature(
             @SerializedName("type")
             var type: String?

         )


        data class Image(
            @SerializedName("content")
            var content: String?

        )

}