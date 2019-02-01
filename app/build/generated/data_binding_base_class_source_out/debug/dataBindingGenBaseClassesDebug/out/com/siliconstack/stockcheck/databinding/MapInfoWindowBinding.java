package com.siliconstack.stockcheck.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class MapInfoWindowBinding extends ViewDataBinding {
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

  protected MapInfoWindowBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView txtBay, TextView txtCompare, TextView txtFloor,
      TextView txtLocation, TextView txtOperator, TextView txtTimestamp, TextView txtValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.txtBay = txtBay;
    this.txtCompare = txtCompare;
    this.txtFloor = txtFloor;
    this.txtLocation = txtLocation;
    this.txtOperator = txtOperator;
    this.txtTimestamp = txtTimestamp;
    this.txtValue = txtValue;
  }

  @NonNull
  public static MapInfoWindowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MapInfoWindowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MapInfoWindowBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.map_info_window, root, attachToRoot, component);
  }

  @NonNull
  public static MapInfoWindowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MapInfoWindowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MapInfoWindowBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.map_info_window, null, false, component);
  }

  public static MapInfoWindowBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static MapInfoWindowBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (MapInfoWindowBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.map_info_window);
  }
}
