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
import com.daimajia.swipe.SwipeLayout;

public abstract class SearchItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnDelete;

  @NonNull
  public final SwipeLayout swipeLayout;

  @NonNull
  public final TextView txtBay;

  @NonNull
  public final TextView txtCompare;

  @NonNull
  public final TextView txtFloor;

  @NonNull
  public final TextView txtLocation;

  @NonNull
  public final TextView txtName;

  @NonNull
  public final TextView txtTime;

  @NonNull
  public final TextView txtValue;

  protected SearchItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView btnDelete, SwipeLayout swipeLayout, TextView txtBay,
      TextView txtCompare, TextView txtFloor, TextView txtLocation, TextView txtName,
      TextView txtTime, TextView txtValue) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnDelete = btnDelete;
    this.swipeLayout = swipeLayout;
    this.txtBay = txtBay;
    this.txtCompare = txtCompare;
    this.txtFloor = txtFloor;
    this.txtLocation = txtLocation;
    this.txtName = txtName;
    this.txtTime = txtTime;
    this.txtValue = txtValue;
  }

  @NonNull
  public static SearchItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchItemBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.search_item, root, attachToRoot, component);
  }

  @NonNull
  public static SearchItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchItemBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.search_item, null, false, component);
  }

  public static SearchItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchItemBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.search_item);
  }
}
