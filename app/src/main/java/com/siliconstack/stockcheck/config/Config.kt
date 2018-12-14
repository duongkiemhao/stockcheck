package com.siliconstack.stockcheck.config

import com.google.android.gms.maps.GoogleMap
import com.siliconstack.stockcheck.BuildConfig

class Config{

        companion object  {

            val CLOUD_VISION_API_KEY= "AIzaSyD6d3sgKi3TKw9nQ0nMe_5YmCAQtZsR8VU"
            val CLOUD_VISION_DETECT_TYPE= "DOCUMENT_TEXT_DETECTION"
            val CUSTOMER_TYPE="Customer"
            val MAX_CACHE_DIR_SIZE = 20*1000*1000L


            var DATE_TIME_PATTERN="dd/MM/yyyy HH:mm"
            var LIMIT=5000
            var MAP_ZOOM=18F
            var MAP_DEFAULT_TYPE= GoogleMap.MAP_TYPE_TERRAIN


            var AUTHEN_KEY="Basic c3RvY2tjaGVjazpuc2Jtd3NpbGljb24="
            val SERVER_DATE_FORMAT : String = "yyyy-MM-dd'T'HH:mm:ssZ"
            val COMBINE_DATE_TIME_FORMAT : String = "dd/MM/yyyy HH:mm"
                        val UI_DATE_FORMAT : String = "dd/MM/yyyy"
            val UI_TIME_FORMAT : String = "h:mm a"
        }

}


