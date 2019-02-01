package com.siliconstack.stockcheck.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class MapviewFragmentBinding extends ViewDataBinding {
  protected MapviewFragmentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  @NonNull
  public static MapviewFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MapviewFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MapviewFragmentBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.mapview_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static MapviewFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MapviewFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MapviewFragmentBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.mapview_fragment, null, false, component);
  }

  public static MapviewFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static MapviewFragmentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (MapviewFragmentBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.mapview_fragment);
  }
}
