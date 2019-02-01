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
import android.widget.FrameLayout;
import android.widget.TextView;

public abstract class SearchActivityBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnBack;

  @NonNull
  public final FrameLayout content;

  @NonNull
  public final Toolbar toolbar;

  protected SearchActivityBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView btnBack, FrameLayout content, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnBack = btnBack;
    this.content = content;
    this.toolbar = toolbar;
  }

  @NonNull
  public static SearchActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchActivityBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.search_activity, root, attachToRoot, component);
  }

  @NonNull
  public static SearchActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchActivityBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.search_activity, null, false, component);
  }

  public static SearchActivityBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchActivityBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchActivityBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.search_activity);
  }
}
