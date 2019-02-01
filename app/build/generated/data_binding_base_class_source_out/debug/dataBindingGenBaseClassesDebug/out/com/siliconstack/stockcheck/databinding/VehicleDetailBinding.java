package com.siliconstack.stockcheck.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class VehicleDetailBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnBack;

  @NonNull
  public final ImageView imgMap;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView txtBay;

  @NonNull
  public final TextView txtCompare;

  @NonNull
  public final TextView txtFloor;

  @NonNull
  public final TextView txtLocation;

  @NonNull
  public final TextView txtOperator;

  @NonNull
  public final TextView txtTimestamp;

  @NonNull
  public final TextView txtValue;

  protected VehicleDetailBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView btnBack, ImageView imgMap, Toolbar toolbar, TextView txtBay,
      TextView txtCompare, TextView txtFloor, TextView txtLocation, TextView txtOperator,
      TextView txtTimestamp, TextView txtValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBack = btnBack;
    this.imgMap = imgMap;
    this.toolbar = toolbar;
    this.txtBay = txtBay;
    this.txtCompare = txtCompare;
    this.txtFloor = txtFloor;
    this.txtLocation = txtLocation;
    this.txtOperator = txtOperator;
    this.txtTimestamp = txtTimestamp;
    this.txtValue = txtValue;
  }

  @NonNull
  public static VehicleDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static VehicleDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<VehicleDetailBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.vehicle_detail, root, attachToRoot, component);
  }

  @NonNull
  public static VehicleDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static VehicleDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<VehicleDetailBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.vehicle_detail, null, false, component);
  }

  public static VehicleDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static VehicleDetailBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (VehicleDetailBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.vehicle_detail);
  }
}
