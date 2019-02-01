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

public abstract class SettingItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnDelete;

  @NonNull
  public final SwipeLayout swipeLayout;

  @NonNull
  public final TextView txtName;

  protected SettingItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView btnDelete, SwipeLayout swipeLayout, TextView txtName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnDelete = btnDelete;
    this.swipeLayout = swipeLayout;
    this.txtName = txtName;
  }

  @NonNull
  public static SettingItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SettingItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SettingItemBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.setting_item, root, attachToRoot, component);
  }

  @NonNull
  public static SettingItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SettingItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SettingItemBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.setting_item, null, false, component);
  }

  public static SettingItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SettingItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SettingItemBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.setting_item);
  }
}
