package com.siliconstack.stockcheck.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.siliconstack.stockcheck.viewmodel.ScanViewModel;

public abstract class ScanResultFragmentBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnApply;

  @NonNull
  public final TextView btnCancel;

  @NonNull
  public final EditText ediFirstname;

  @NonNull
  public final EditText ediLastname;

  @NonNull
  public final EditText ediLicenseNo;

  @NonNull
  public final EditText ediPostcode;

  @NonNull
  public final EditText ediState;

  @NonNull
  public final EditText ediStreet;

  @NonNull
  public final EditText ediSuburb;

  @NonNull
  public final RelativeLayout layoutRoot;

  @NonNull
  public final TextView lblDob;

  @NonNull
  public final TextView lblLicenseExpired;

  @NonNull
  public final TextView lblPostcode;

  @NonNull
  public final TextView lblState;

  @NonNull
  public final TextView txtDob;

  @NonNull
  public final TextView txtLicenseExpired;

  @Bindable
  protected ScanViewModel mViewModel;

  protected ScanResultFragmentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView btnApply, TextView btnCancel, EditText ediFirstname,
      EditText ediLastname, EditText ediLicenseNo, EditText ediPostcode, EditText ediState,
      EditText ediStreet, EditText ediSuburb, RelativeLayout layoutRoot, TextView lblDob,
      TextView lblLicenseExpired, TextView lblPostcode, TextView lblState, TextView txtDob,
      TextView txtLicenseExpired) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnApply = btnApply;
    this.btnCancel = btnCancel;
    this.ediFirstname = ediFirstname;
    this.ediLastname = ediLastname;
    this.ediLicenseNo = ediLicenseNo;
    this.ediPostcode = ediPostcode;
    this.ediState = ediState;
    this.ediStreet = ediStreet;
    this.ediSuburb = ediSuburb;
    this.layoutRoot = layoutRoot;
    this.lblDob = lblDob;
    this.lblLicenseExpired = lblLicenseExpired;
    this.lblPostcode = lblPostcode;
    this.lblState = lblState;
    this.txtDob = txtDob;
    this.txtLicenseExpired = txtLicenseExpired;
  }

  public abstract void setViewModel(@Nullable ScanViewModel viewModel);

  @Nullable
  public ScanViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ScanResultFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ScanResultFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ScanResultFragmentBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.scan_result_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ScanResultFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ScanResultFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ScanResultFragmentBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.scan_result_fragment, null, false, component);
  }

  public static ScanResultFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ScanResultFragmentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ScanResultFragmentBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.scan_result_fragment);
  }
}
