package com.siliconstack.stockcheck.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.camerakit.CameraKitView;
import com.siliconstack.stockcheck.view.control.CameraOverlayViewGroup;

public abstract class CameraActivityBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnTake;

  @NonNull
  public final CameraKitView camera;

  @NonNull
  public final ImageView capturedImage;

  @NonNull
  public final RelativeLayout llRoot;

  @NonNull
  public final CameraOverlayViewGroup overlayView;

  protected CameraActivityBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView btnTake, CameraKitView camera, ImageView capturedImage,
      RelativeLayout llRoot, CameraOverlayViewGroup overlayView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnTake = btnTake;
    this.camera = camera;
    this.capturedImage = capturedImage;
    this.llRoot = llRoot;
    this.overlayView = overlayView;
  }

  @NonNull
  public static CameraActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CameraActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CameraActivityBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.camera_activity, root, attachToRoot, component);
  }

  @NonNull
  public static CameraActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CameraActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CameraActivityBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.camera_activity, null, false, component);
  }

  public static CameraActivityBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CameraActivityBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CameraActivityBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.camera_activity);
  }
}
