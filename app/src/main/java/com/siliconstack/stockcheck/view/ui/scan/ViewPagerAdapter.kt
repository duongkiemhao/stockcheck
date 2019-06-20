package com.siliconstack.stockcheck.view.ui.scan

import android.databinding.DataBindingUtil
import android.graphics.Color
import android.support.v4.view.PagerAdapter
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.model.CarModel
import org.jetbrains.anko.backgroundColor

class ViewPagerAdapter : PagerAdapter {

    var carModels: List<CarModel>
    var imagePath: String

    constructor(carModels: List<CarModel>,imagePath:String) {
        this.carModels = carModels
        this.imagePath=imagePath
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val dataBinding = DataBindingUtil.inflate<com.siliconstack.stockcheck.databinding.PagerItemCarBinding>(LayoutInflater.from(container.context), R.layout.pager_item_car,
                container, false)
        val carModel = carModels[position]
//        Glide.with(container.context).load(imagePath).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL))
//                .apply(RequestOptions()
//                ).into(dataBinding.imgCar)
        dataBinding.txtMake.text = "Make: " + (carModel.make ?: "")
        dataBinding.txtModel.text = "Model: " + (carModel.family ?: "")
        dataBinding.txtVariant.text = "Variant: " + (carModel.variant ?: "")
        val year=if(carModel.year.isNullOrBlank()) "" else if(carModel.year=="0") "" else carModel.year
        dataBinding.txtYear.text = "Year: " + year
        dataBinding.txtDesc.text = "Description: " + (carModel.desc ?: "")
        if(!carModel.color.isNullOrBlank())
            dataBinding.viewColor.backgroundColor = Color.parseColor(carModel.color)
        dataBinding.recyclerView.apply {
            adapter = ScanCarItemAdapter(carModel.items?: arrayListOf())
            layoutManager = LinearLayoutManager(container.context)
            val divider = DividerItemDecoration(context, RecyclerView.VERTICAL)
            divider.setDrawable(resources.getDrawable(R.drawable.list_divider_gray))
            addItemDecoration(divider)
        }
        container.addView(dataBinding.root)

        return dataBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, view: Any) {
        container.removeView(view as View)
    }

    override fun isViewFromObject(view: View, any: Any): Boolean {
        return view == any
    }

    override fun getCount(): Int {
        return carModels.count()
    }

}