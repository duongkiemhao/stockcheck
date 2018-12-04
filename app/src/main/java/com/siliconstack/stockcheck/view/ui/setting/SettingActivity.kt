package com.siliconstack.stockcheck.view.ui.setting

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.graphics.Color
import android.os.Bundle
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.databinding.SettingActivityBinding
import com.siliconstack.stockcheck.viewmodel.MainViewModel
import dagger.android.AndroidInjection
import org.jetbrains.anko.startActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.text.InputType
import android.view.View
import android.widget.AdapterView
import com.afollestad.materialdialogs.GravityEnum
import com.afollestad.materialdialogs.MaterialDialog
import com.siliconstack.stockcheck.model.FloorModel
import com.siliconstack.stockcheck.model.LocationModel
import com.siliconstack.stockcheck.model.OperatorModel
import com.siliconstack.stockcheck.model.SettingDTO
import com.siliconstack.stockcheck.view.ui.base.BaseActivity
import com.siliconstack.stockcheck.view.ui.MainActivity
import com.siliconstack.stockcheck.view.ui.MainActivityListener
import android.widget.ArrayAdapter
import android.widget.TextView






class SettingActivity: BaseActivity() , MainActivityListener, SettingListener {


    //    @Inject
//    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>
    lateinit var settingActivityBinding: SettingActivityBinding
    lateinit var materialDialog: MaterialDialog
    lateinit var adapter: SettingAdapter
    val spinnerArr= arrayListOf("Location", "Floor", "Name")
    var selectedPos=-1;

   // override fun supportFragmentInjector() = dispatchingAndroidInjector


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)

        initViewBinding()
        setListener()
        init()

    }

    private fun initViewBinding() {
        settingActivityBinding = DataBindingUtil.setContentView(this, R.layout.setting_activity)
        mainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
        AppApplication.appComponent.injectViewModel(mainViewModel)
    }

    private fun init() {

        setTranslucentBarNoScrollView()
        settingActivityBinding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context!!, RecyclerView.VERTICAL, false)
            this@SettingActivity.adapter = SettingAdapter(this@SettingActivity)
            adapter = this@SettingActivity.adapter
            var divider = DividerItemDecoration(context, RecyclerView.VERTICAL)
            divider.setDrawable(resources.getDrawable(R.drawable.list_divider_transparent))
            addItemDecoration(divider)
            refreshListLocation()
        }


        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerArr)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        settingActivityBinding.spinner.adapter=adapter
        settingActivityBinding.spinner.onItemSelectedListener=object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                (parent!!.getChildAt(0) as TextView).setTextColor(Color.WHITE)
                when(position){
                    0 -> {
                        refreshListLocation()
                        selectedPos=0
                    }
                    1 -> {
                        refreshListFloor()
                        selectedPos=1
                    }
                    2 -> {
                        refreshListName()
                        selectedPos=2
                    }
                }
            }

        }

    }

    fun refreshListLocation(){
        val items= arrayListOf<SettingDTO>()
        mainViewModel.locationDAO.getAll().forEach {
            items.add(SettingDTO(it.name,it.id, SettingAdapter.SettingEnum.LOCATION.ordinal))
        }
        adapter.items= items
        adapter.notifyDataSetChanged()
    }


    fun refreshListFloor(){
        val items= arrayListOf<SettingDTO>()
        mainViewModel.floorDAO.getAll().forEach {
            items.add(SettingDTO(it.name,it.id, SettingAdapter.SettingEnum.FLOOR.ordinal))
        }
        adapter.items= items
        adapter.notifyDataSetChanged()
    }

    fun refreshListName(){
        val items= arrayListOf<SettingDTO>()
        mainViewModel.nameDAO.getAll().forEach {
            items.add(SettingDTO(it.name,it.id, SettingAdapter.SettingEnum.NAME.ordinal))
        }
        adapter.items= items
        adapter.notifyDataSetChanged()
    }

    fun createNewDialog(){
        materialDialog=MaterialDialog.Builder(this)
                .content("Enter value")
                .canceledOnTouchOutside(false)
                .cancelable(false)
                .contentGravity(GravityEnum.CENTER)
                .inputType(InputType.TYPE_CLASS_TEXT)
                .input("","", MaterialDialog.InputCallback { dialog, input ->
                }).positiveText("Save").negativeText("Cancel").onPositive { dialog, which ->
                    if(!dialog.inputEditText?.text.toString().trim().isEmpty()) {
                        when (selectedPos) {
                            0 -> {
                                mainViewModel.locationDAO.addRow(LocationModel(dialog.inputEditText?.text.toString(), 0))
                                refreshListLocation()

                            }
                            1 -> {
                                mainViewModel.floorDAO.addRow(FloorModel(dialog.inputEditText?.text.toString(), 0))
                                refreshListFloor()
                            }
                            2 -> {
                                mainViewModel.nameDAO.addRow(OperatorModel(dialog.inputEditText?.text.toString(), 0))
                                refreshListName()
                            }
                        }
                    }
                }.onNegative { dialog, which ->
                    dialog.dismiss()
                }
                .build()
    }
    private fun setListener() {
        settingActivityBinding.btnAdd.setOnClickListener { view->
            createNewDialog()
            materialDialog.show()
        }
        settingActivityBinding.btnBack.setOnClickListener {
            onBackPressed()
        }
    }


    override fun onBackPressed() {
        finish()
        startActivity<MainActivity>()
    }

    override fun onDestroy() {
        super.onDestroy()

    }

    override fun onRemove(settingDTO: SettingDTO) {
        when(settingDTO.settingEnum){
            SettingAdapter.SettingEnum.LOCATION.ordinal -> {
                mainViewModel.locationDAO.deleteById(settingDTO.id)
                refreshListLocation()
            }
            SettingAdapter.SettingEnum.FLOOR.ordinal -> {
                mainViewModel.floorDAO.deleteById(settingDTO.id)
                refreshListFloor()
            }
            SettingAdapter.SettingEnum.NAME.ordinal -> {
                mainViewModel.nameDAO.deleteById(settingDTO.id)
                refreshListName()
            }
        }
    }


}

interface SettingListener{
    fun onRemove(settingDTO: SettingDTO)
}