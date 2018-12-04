package com.siliconstack.stockcheck.view.listeners

import com.siliconstack.stockcheck.model.FilterDialogModel

interface FilterDialogListener{
    fun onSelectOk(filterDialogModel: FilterDialogModel)
}