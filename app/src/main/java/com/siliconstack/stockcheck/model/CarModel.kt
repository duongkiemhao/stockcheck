package com.siliconstack.stockcheck.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

 class CarModel() : Parcelable {
         @SerializedName("BodyType")
         var bodyType: String?=null
         @SerializedName("Family")
         var family: String?=null
         @SerializedName("Make")
         var make: String?=null
         @SerializedName("Series")
         var series: String?=null
         @SerializedName("Transmission")
         var transmission: String?=null
         @SerializedName("VIN_NUMBER")
         var vINNUMBER: String?=null
         @SerializedName("Variant")
         var variant: String?=null
         @SerializedName("Year")
         var year: String?=null

         var desc: String?=null
         var color: String?=null
         var fullImageURL: String?=null

         constructor(parcel: Parcel) : this() {
                 bodyType = parcel.readString()
                 family = parcel.readString()
                 make = parcel.readString()
                 series = parcel.readString()
                 transmission = parcel.readString()
                 vINNUMBER = parcel.readString()
                 variant = parcel.readString()
                 year = parcel.readString()
                 desc = parcel.readString()
                 color = parcel.readString()
                 fullImageURL = parcel.readString()
         }

         override fun writeToParcel(parcel: Parcel, flags: Int) {
                 parcel.writeString(bodyType)
                 parcel.writeString(family)
                 parcel.writeString(make)
                 parcel.writeString(series)
                 parcel.writeString(transmission)
                 parcel.writeString(vINNUMBER)
                 parcel.writeString(variant)
                 parcel.writeString(year)
                 parcel.writeString(desc)
                 parcel.writeString(color)
                 parcel.writeString(fullImageURL)
         }

         override fun describeContents(): Int {
                 return 0
         }

         companion object CREATOR : Parcelable.Creator<CarModel> {
                 override fun createFromParcel(parcel: Parcel): CarModel {
                         return CarModel(parcel)
                 }

                 override fun newArray(size: Int): Array<CarModel?> {
                         return arrayOfNulls(size)
                 }
         }

 }