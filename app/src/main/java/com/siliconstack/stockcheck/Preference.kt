package com.siliconstack.stockcheck

import com.marcinmoskala.kotlinpreferences.PreferenceHolder

import com.siliconstack.stockcheck.model.FilterDialogModel


object PreferenceSetting : PreferenceHolder() {


    var locationSetting: FilterDialogModel? by bindToPreferenceFieldNullable("locationSetting")
    var floorSetting: FilterDialogModel? by bindToPreferenceFieldNullable("floorSetting")
    var nameSetting: FilterDialogModel? by bindToPreferenceFieldNullable("nameSetting")

}
