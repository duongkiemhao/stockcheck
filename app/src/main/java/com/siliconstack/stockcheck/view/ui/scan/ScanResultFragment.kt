package com.siliconstack.stockcheck.view.ui.scan

import android.app.Dialog
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.LinearLayout
import com.siliconstack.stockcheck.AppApplication
import com.siliconstack.stockcheck.R
import com.siliconstack.stockcheck.databinding.ScanResultFragmentBinding
import com.siliconstack.stockcheck.di.Injectable
import com.siliconstack.stockcheck.model.OCRModel
import com.siliconstack.stockcheck.view.control.DateTimePickupListener
import com.siliconstack.stockcheck.view.utility.DateUtility
import com.siliconstack.stockcheck.viewmodel.ScanViewModel
import org.greenrobot.eventbus.EventBus
import org.jetbrains.anko.support.v4.act
import org.parceler.Parcels
import java.util.*
import javax.inject.Inject
import com.afollestad.materialdialogs.util.DialogUtils




class ScanResultFragment: DialogFragment(), Injectable {


    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var scanViewModel: ScanViewModel
    lateinit var scanResultFragmentBinding: ScanResultFragmentBinding



    var calendarExpiry = Calendar.getInstance()
    var calendarDOB = Calendar.getInstance()

    companion object {

        fun newInstance(ocrModel: OCRModel,marginTop:Int): ScanResultFragment {
            val fragment = ScanResultFragment()
            val args = Bundle()
            args.putParcelable("object", ocrModel)
            args.putInt("marginTop", marginTop)
            fragment.setArguments(args)
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        scanResultFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.scan_result_fragment, null, false);
        scanViewModel = ViewModelProviders.of(this, viewModelFactory).get(ScanViewModel::class.java)

        scanResultFragmentBinding.viewModel=scanViewModel
        AppApplication.appComponent.injectViewModel(scanViewModel)
        return scanResultFragmentBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            scanViewModel.ocrModel=it.getParcelable("object") as OCRModel
        }
        setListener()
        initInfo()
        loadInfo()
    }


    fun setListener(){
        scanResultFragmentBinding.txtLicenseExpired.setOnClickListener {
            DateUtility.showDatePickup(calendarExpiry,context!!,object : DateTimePickupListener {
                override fun onDateTimeSelect(text: String) {
                    scanViewModel.ocrModel.driverLicenceExpiryDate=text
                    scanViewModel.ocrModel.notifyChange()
                }
            })
        }
        scanResultFragmentBinding.txtDob.setOnClickListener {
            DateUtility.showDatePickup(calendarDOB,context!!,object :DateTimePickupListener{
                override fun onDateTimeSelect(text: String) {
                    scanViewModel.ocrModel.dob=text
                    scanViewModel.ocrModel.notifyChange()
                }
            })
        }
        scanResultFragmentBinding.btnApply.setOnClickListener {
            (activity as ScanActivityListener).save(scanViewModel.ocrModel)
            dismiss()
        }
        scanResultFragmentBinding.btnCancel.setOnClickListener {
            dismiss()
        }
    }

    fun initInfo(){
        (scanResultFragmentBinding.layoutRoot.layoutParams as LinearLayout.LayoutParams).setMargins(0, arguments?.getInt("marginTop",0)?:0,0,0)
    }

    fun loadInfo() {


    }

    override fun onStart() {
        super.onStart()
        if(dialog==null)
            return
        dialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        val window = dialog.window
        val windowParams = window!!.attributes
        windowParams.dimAmount = 0.0f
        windowParams.flags = windowParams.flags or WindowManager.LayoutParams.FLAG_DIM_BEHIND
        window.attributes = windowParams
    }


}
