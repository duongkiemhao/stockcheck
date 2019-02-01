package com.siliconstack.stockcheck.databinding;
import com.siliconstack.stockcheck.R;
import com.siliconstack.stockcheck.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ScanResultFragmentBindingImpl extends ScanResultFragmentBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.layout_root, 10);
        sViewsWithIds.put(R.id.btn_cancel, 11);
        sViewsWithIds.put(R.id.lbl_state, 12);
        sViewsWithIds.put(R.id.lbl_postcode, 13);
        sViewsWithIds.put(R.id.lbl_dob, 14);
        sViewsWithIds.put(R.id.lbl_license_expired, 15);
        sViewsWithIds.put(R.id.btn_apply, 16);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener ediFirstnameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.ocrModel.firstName
            //         is viewModel.ocrModel.setFirstName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(ediFirstname);
            // localize variables for thread safety
            // viewModel
            com.siliconstack.stockcheck.viewmodel.ScanViewModel viewModel = mViewModel;
            // viewModel.ocrModel.firstName
            java.lang.String viewModelOcrModelFirstName = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.ocrModel
            com.siliconstack.stockcheck.model.OCRModel viewModelOcrModel = null;
            // viewModel.ocrModel != null
            boolean viewModelOcrModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOcrModel = viewModel.getOcrModel();

                viewModelOcrModelJavaLangObjectNull = (viewModelOcrModel) != (null);
                if (viewModelOcrModelJavaLangObjectNull) {




                    viewModelOcrModel.setFirstName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener ediLastnameandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.ocrModel.lastName
            //         is viewModel.ocrModel.setLastName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(ediLastname);
            // localize variables for thread safety
            // viewModel.ocrModel.lastName
            java.lang.String viewModelOcrModelLastName = null;
            // viewModel
            com.siliconstack.stockcheck.viewmodel.ScanViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.ocrModel
            com.siliconstack.stockcheck.model.OCRModel viewModelOcrModel = null;
            // viewModel.ocrModel != null
            boolean viewModelOcrModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOcrModel = viewModel.getOcrModel();

                viewModelOcrModelJavaLangObjectNull = (viewModelOcrModel) != (null);
                if (viewModelOcrModelJavaLangObjectNull) {




                    viewModelOcrModel.setLastName(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener ediLicenseNoandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.ocrModel.driverLicenceNumber
            //         is viewModel.ocrModel.setDriverLicenceNumber((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(ediLicenseNo);
            // localize variables for thread safety
            // viewModel
            com.siliconstack.stockcheck.viewmodel.ScanViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.ocrModel
            com.siliconstack.stockcheck.model.OCRModel viewModelOcrModel = null;
            // viewModel.ocrModel.driverLicenceNumber
            java.lang.String viewModelOcrModelDriverLicenceNumber = null;
            // viewModel.ocrModel != null
            boolean viewModelOcrModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOcrModel = viewModel.getOcrModel();

                viewModelOcrModelJavaLangObjectNull = (viewModelOcrModel) != (null);
                if (viewModelOcrModelJavaLangObjectNull) {




                    viewModelOcrModel.setDriverLicenceNumber(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener ediPostcodeandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.ocrModel.postCode
            //         is viewModel.ocrModel.setPostCode((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(ediPostcode);
            // localize variables for thread safety
            // viewModel.ocrModel.postCode
            java.lang.String viewModelOcrModelPostCode = null;
            // viewModel
            com.siliconstack.stockcheck.viewmodel.ScanViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.ocrModel
            com.siliconstack.stockcheck.model.OCRModel viewModelOcrModel = null;
            // viewModel.ocrModel != null
            boolean viewModelOcrModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOcrModel = viewModel.getOcrModel();

                viewModelOcrModelJavaLangObjectNull = (viewModelOcrModel) != (null);
                if (viewModelOcrModelJavaLangObjectNull) {




                    viewModelOcrModel.setPostCode(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener ediStateandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.ocrModel.state
            //         is viewModel.ocrModel.setState((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(ediState);
            // localize variables for thread safety
            // viewModel.ocrModel.state
            java.lang.String viewModelOcrModelState = null;
            // viewModel
            com.siliconstack.stockcheck.viewmodel.ScanViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.ocrModel
            com.siliconstack.stockcheck.model.OCRModel viewModelOcrModel = null;
            // viewModel.ocrModel != null
            boolean viewModelOcrModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOcrModel = viewModel.getOcrModel();

                viewModelOcrModelJavaLangObjectNull = (viewModelOcrModel) != (null);
                if (viewModelOcrModelJavaLangObjectNull) {




                    viewModelOcrModel.setState(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener ediStreetandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.ocrModel.streetLine1
            //         is viewModel.ocrModel.setStreetLine1((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(ediStreet);
            // localize variables for thread safety
            // viewModel.ocrModel.streetLine1
            java.lang.String viewModelOcrModelStreetLine1 = null;
            // viewModel
            com.siliconstack.stockcheck.viewmodel.ScanViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.ocrModel
            com.siliconstack.stockcheck.model.OCRModel viewModelOcrModel = null;
            // viewModel.ocrModel != null
            boolean viewModelOcrModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOcrModel = viewModel.getOcrModel();

                viewModelOcrModelJavaLangObjectNull = (viewModelOcrModel) != (null);
                if (viewModelOcrModelJavaLangObjectNull) {




                    viewModelOcrModel.setStreetLine1(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private android.databinding.InverseBindingListener ediSuburbandroidTextAttrChanged = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.ocrModel.suburb
            //         is viewModel.ocrModel.setSuburb((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(ediSuburb);
            // localize variables for thread safety
            // viewModel.ocrModel.suburb
            java.lang.String viewModelOcrModelSuburb = null;
            // viewModel
            com.siliconstack.stockcheck.viewmodel.ScanViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.ocrModel
            com.siliconstack.stockcheck.model.OCRModel viewModelOcrModel = null;
            // viewModel.ocrModel != null
            boolean viewModelOcrModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOcrModel = viewModel.getOcrModel();

                viewModelOcrModelJavaLangObjectNull = (viewModelOcrModel) != (null);
                if (viewModelOcrModelJavaLangObjectNull) {




                    viewModelOcrModel.setSuburb(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ScanResultFragmentBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ScanResultFragmentBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[11]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[4]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            );
        this.ediFirstname.setTag(null);
        this.ediLastname.setTag(null);
        this.ediLicenseNo.setTag(null);
        this.ediPostcode.setTag(null);
        this.ediState.setTag(null);
        this.ediStreet.setTag(null);
        this.ediSuburb.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtDob.setTag(null);
        this.txtLicenseExpired.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.siliconstack.stockcheck.viewmodel.ScanViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.siliconstack.stockcheck.viewmodel.ScanViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelOcrModel((com.siliconstack.stockcheck.model.OCRModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelOcrModel(com.siliconstack.stockcheck.model.OCRModel ViewModelOcrModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelOcrModelDob = null;
        java.lang.String viewModelOcrModelLastName = null;
        java.lang.String viewModelOcrModelFirstName = null;
        java.lang.String viewModelOcrModelDriverLicenceExpiryDate = null;
        java.lang.String viewModelOcrModelPostCode = null;
        com.siliconstack.stockcheck.model.OCRModel viewModelOcrModel = null;
        java.lang.String viewModelOcrModelSuburb = null;
        java.lang.String viewModelOcrModelStreetLine1 = null;
        java.lang.String viewModelOcrModelState = null;
        com.siliconstack.stockcheck.viewmodel.ScanViewModel viewModel = mViewModel;
        java.lang.String viewModelOcrModelDriverLicenceNumber = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.ocrModel
                    viewModelOcrModel = viewModel.getOcrModel();
                }
                updateRegistration(0, viewModelOcrModel);


                if (viewModelOcrModel != null) {
                    // read viewModel.ocrModel.dob
                    viewModelOcrModelDob = viewModelOcrModel.getDob();
                    // read viewModel.ocrModel.lastName
                    viewModelOcrModelLastName = viewModelOcrModel.getLastName();
                    // read viewModel.ocrModel.firstName
                    viewModelOcrModelFirstName = viewModelOcrModel.getFirstName();
                    // read viewModel.ocrModel.driverLicenceExpiryDate
                    viewModelOcrModelDriverLicenceExpiryDate = viewModelOcrModel.getDriverLicenceExpiryDate();
                    // read viewModel.ocrModel.postCode
                    viewModelOcrModelPostCode = viewModelOcrModel.getPostCode();
                    // read viewModel.ocrModel.suburb
                    viewModelOcrModelSuburb = viewModelOcrModel.getSuburb();
                    // read viewModel.ocrModel.streetLine1
                    viewModelOcrModelStreetLine1 = viewModelOcrModel.getStreetLine1();
                    // read viewModel.ocrModel.state
                    viewModelOcrModelState = viewModelOcrModel.getState();
                    // read viewModel.ocrModel.driverLicenceNumber
                    viewModelOcrModelDriverLicenceNumber = viewModelOcrModel.getDriverLicenceNumber();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.ediFirstname, viewModelOcrModelFirstName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.ediLastname, viewModelOcrModelLastName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.ediLicenseNo, viewModelOcrModelDriverLicenceNumber);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.ediPostcode, viewModelOcrModelPostCode);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.ediState, viewModelOcrModelState);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.ediStreet, viewModelOcrModelStreetLine1);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.ediSuburb, viewModelOcrModelSuburb);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.txtDob, viewModelOcrModelDob);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.txtLicenseExpired, viewModelOcrModelDriverLicenceExpiryDate);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.ediFirstname, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ediFirstnameandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.ediLastname, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ediLastnameandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.ediLicenseNo, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ediLicenseNoandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.ediPostcode, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ediPostcodeandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.ediState, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ediStateandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.ediStreet, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ediStreetandroidTextAttrChanged);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.ediSuburb, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, ediSuburbandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.ocrModel
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}