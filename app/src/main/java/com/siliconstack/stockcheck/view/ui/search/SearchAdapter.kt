package com.siliconstack.stockcheck.view.ui.search

import android.annotation.SuppressLint
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import com.orhanobut.logger.Logger
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.databinding.SearchHeaderItemBinding
import com.siliconstack.stockcheck.databinding.SearchItemBinding
import com.siliconstack.stockcheck.model.MainDTO
import com.siliconstack.stockcheck.view.utility.DateUtility
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder
import org.jetbrains.anko.collections.forEachReversedWithIndex
import java.util.*


class SearchAdapter(val searchListener: ListViewFragmentListener, groups: List<ExpandableGroup<*>>) : ExpandableRecyclerViewAdapter<SearchAdapter.MyGroupViewHolder, SearchAdapter.MyChildViewHolder>(groups) {
    override fun onBindChildViewHolder(viewHolder: MyChildViewHolder?, flatPosition: Int, group: ExpandableGroup<*>?, childIndex: Int) {

        val item = group!!.items.get(childIndex) as MainDTO

        viewHolder!!.binding.txtValue.text = item.scanText

        viewHolder.binding.txtLocation.text = item.locationName
        viewHolder.binding.txtFloor.text = item.floorName
        viewHolder.binding.txtBay.text = item.bayNumber
        viewHolder.binding.txtName.text = item.operatorName
        viewHolder.binding.txtTime.text = DateUtility.parseDateToDateTimeStr("dd/MM/yyyy",Date(item.timestamp?:0))

        viewHolder.binding.btnDelete.setOnClickListener {
            searchListener.deleteItem(item)

        }
        if (item.isSelected)
            viewHolder.itemView.setBackgroundColor(viewHolder.itemView.context.resources.getColor(R.color.color_5))
        else viewHolder.itemView.setBackgroundColor(Color.WHITE)
        viewHolder.binding.swipeLayout.surfaceView.setOnClickListener {
            searchListener.onItemClick(item)
        }
        viewHolder.binding.txtCompare.text=item.compareTime

    }

    @SuppressLint("SetTextI18n")
    override fun onBindGroupViewHolder(holder: MyGroupViewHolder?, flatPosition: Int, group: ExpandableGroup<*>?) {
        holder!!.binding.txtHeader.text = group!!.title + " (" + group.itemCount + ")"
        holder.binding.checkbox.setOnCheckedChangeListener { _, isChecked ->
            group.items.forEach {
                val item = it as MainDTO
                item.isSelected = isChecked
            }
            notifyDataSetChanged()
        }
        holder.binding.btnDelete.setOnClickListener {
            searchListener.deleteGroup(group.items as List<MainDTO>)

        }

    }

    override fun onCreateGroupViewHolder(parent: ViewGroup?, viewType: Int): MyGroupViewHolder {
        val binding: ViewDataBinding = DataBindingUtil.inflate<SearchHeaderItemBinding>(LayoutInflater.from(parent!!.context), R.layout.search_header_item,
                parent, false)
        return MyGroupViewHolder(binding as SearchHeaderItemBinding)

    }

    override fun onCreateChildViewHolder(parent: ViewGroup?, viewType: Int): MyChildViewHolder {
        val binding: ViewDataBinding = DataBindingUtil.inflate<SearchItemBinding>(LayoutInflater.from(parent!!.context), R.layout.search_item,
                parent, false)
        return MyChildViewHolder(binding as SearchItemBinding)

    }

    fun expandGroup() {
//        groups.forEachReversedWithIndex { index, expandableGroup ->
//            if (!isGroupExpanded(expandableGroup)) {
//                toggleGroup(expandableGroup)
//            }
//
//        }

    }


    class MyChildViewHolder(val binding: SearchItemBinding) : ChildViewHolder(binding.root)

    class MyGroupViewHolder(val binding: SearchHeaderItemBinding) : GroupViewHolder(binding.root)

}


