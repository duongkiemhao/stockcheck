package com.siliconstack.stockcheck.view.ui.search

import android.databinding.DataBindingUtil
import android.os.Build
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.config.Config
import com.siliconstack.stockcheck.config.Constant
import com.siliconstack.stockcheck.databinding.VehicleDetailBinding
import com.siliconstack.stockcheck.model.MainDTO
import com.siliconstack.stockcheck.view.utility.DateUtility
import com.siliconstack.stockcheck.view.utility.Utility
import java.util.*

class VehicleActivity : AppCompatActivity(){

    lateinit var vehicleDetailBinding:VehicleDetailBinding
    val mainDTO by lazy {
        intent.getParcelableExtra("object") as MainDTO
    }

    public override fun onCreate(state: Bundle?) {
        super.onCreate(state)

//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//                val w = window // in Activity's onCreate() for instance
//                w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
//            }

        vehicleDetailBinding = DataBindingUtil.setContentView(this, R.layout.vehicle_detail)
        vehicleDetailBinding.txtValue.text=mainDTO.scanText
        vehicleDetailBinding.txtLocation.text=mainDTO.locationName
        vehicleDetailBinding.txtFloor.text=mainDTO.floorName
        vehicleDetailBinding.txtBay.text=mainDTO.bayNumber
        vehicleDetailBinding.txtOperator.text=mainDTO.operatorName
        vehicleDetailBinding.txtTimestamp.text=DateUtility.parseDateToDateTimeStr(Config.COMBINE_DATE_TIME_FORMAT, Date(mainDTO.timestamp?:0))
        vehicleDetailBinding.txtCompare.text=mainDTO.compareTimeFullStr
        vehicleDetailBinding.btnBack.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);

        }
        if(!mainDTO.image.isNullOrBlank())
        vehicleDetailBinding.imgMap.setImageBitmap(Utility.convertBase64ToBitmap(mainDTO.image!!))

    }

}