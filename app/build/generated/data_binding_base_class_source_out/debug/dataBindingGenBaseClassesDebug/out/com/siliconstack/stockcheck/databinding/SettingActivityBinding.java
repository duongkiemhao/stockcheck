package com.siliconstack.stockcheck.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import fr.ganfra.materialspinner.MaterialSpinner;

public abstract class SettingActivityBinding extends ViewDataBinding {
  @NonNull
  public final ImageView btnAdd;

  @NonNull
  public final TextView btnBack;

  @NonNull
  public final RelativeLayout frameContainer;

  @NonNull
  public final LinearLayout layoutSpinner;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final MaterialSpinner spinner;

  @NonNull
  public final Toolbar toolbar;

  protected SettingActivityBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView btnAdd, TextView btnBack, RelativeLayout frameContainer,
      LinearLayout layoutSpinner, RecyclerView recyclerView, MaterialSpinner spinner,
      Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnAdd = btnAdd;
    this.btnBack = btnBack;
    this.frameContainer = frameContainer;
    this.layoutSpinner = layoutSpinner;
    this.recyclerView = recyclerView;
    this.spinner = spinner;
    this.toolbar = toolbar;
  }

  @NonNull
  public static SettingActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SettingActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SettingActivityBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.setting_activity, root, attachToRoot, component);
  }

  @NonNull
  public static SettingActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SettingActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SettingActivityBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.setting_activity, null, false, component);
  }

  public static SettingActivityBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SettingActivityBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SettingActivityBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.setting_activity);
  }
}
