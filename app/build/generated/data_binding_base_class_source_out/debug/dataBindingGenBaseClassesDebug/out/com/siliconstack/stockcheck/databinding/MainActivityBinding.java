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
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class MainActivityBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnScanBarcode;

  @NonNull
  public final TextView btnScanCar;

  @NonNull
  public final TextView btnScanDriver;

  @NonNull
  public final TextView btnScanQrcode;

  @NonNull
  public final TextView btnScanRego;

  @NonNull
  public final TextView btnScanVin;

  @NonNull
  public final LinearLayout frameContainer;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView txtAppVersion;

  protected MainActivityBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView btnScanBarcode, TextView btnScanCar, TextView btnScanDriver,
      TextView btnScanQrcode, TextView btnScanRego, TextView btnScanVin,
      LinearLayout frameContainer, ImageView imageView, Toolbar toolbar, TextView txtAppVersion) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnScanBarcode = btnScanBarcode;
    this.btnScanCar = btnScanCar;
    this.btnScanDriver = btnScanDriver;
    this.btnScanQrcode = btnScanQrcode;
    this.btnScanRego = btnScanRego;
    this.btnScanVin = btnScanVin;
    this.frameContainer = frameContainer;
    this.imageView = imageView;
    this.toolbar = toolbar;
    this.txtAppVersion = txtAppVersion;
  }

  @NonNull
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MainActivityBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.main_activity, root, attachToRoot, component);
  }

  @NonNull
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MainActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MainActivityBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.main_activity, null, false, component);
  }

  public static MainActivityBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static MainActivityBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (MainActivityBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.main_activity);
  }
}
