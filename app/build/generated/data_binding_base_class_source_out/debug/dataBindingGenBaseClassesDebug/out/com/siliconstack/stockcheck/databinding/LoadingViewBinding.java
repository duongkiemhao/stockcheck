package com.siliconstack.stockcheck.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;

public abstract class LoadingViewBinding extends ViewDataBinding {
  @NonNull
  public final LottieAnimationView animationView;

  protected LoadingViewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LottieAnimationView animationView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.animationView = animationView;
  }

  @NonNull
  public static LoadingViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LoadingViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LoadingViewBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.loading_view, root, attachToRoot, component);
  }

  @NonNull
  public static LoadingViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LoadingViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LoadingViewBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.loading_view, null, false, component);
  }

  public static LoadingViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LoadingViewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LoadingViewBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.loading_view);
  }
}
