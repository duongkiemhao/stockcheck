package com.siliconstack.stockcheck.view.ui.scan

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.model.CarModel
import com.siliconstack.stockcheck.view.utility.Utility
import java.util.*


class ScanCarAdapter(var items: List<CarModel>) :
        RecyclerView.Adapter<ScanCarAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DataBindingUtil.inflate<com.siliconstack.stockcheck.databinding.ScanCarItemBinding>(LayoutInflater.from(parent.context), R.layout.scan_car_item,
                parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = items[position]
        holder.binding.txtMake.text="Make: "+item.make
        holder.binding.txtModel.text="Model: "+item.family
        holder.binding.txtVariant.text="Variant: "+item.variant
        holder.binding.txtBody.text="Body: "+item.bodyType
        holder.binding.txtSeries.text="Series: "+item.series
        holder.binding.txtTranmission.text="Transmission: "+item.transmission
        holder.binding.txtVin.text="VIN: "+item.vINNUMBER
        holder.binding.txtYear.text="Year: "+item.year
    }


    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }
    class ViewHolder(val binding: com.siliconstack.stockcheck.databinding.ScanCarItemBinding) : RecyclerView.ViewHolder(binding.root)




}
