package com.siliconstack.stockcheck.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.daimajia.swipe.SwipeLayout;

public abstract class SearchHeaderItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnDelete;

  @NonNull
  public final CheckBox checkbox;

  @NonNull
  public final SwipeLayout swipeLayout;

  @NonNull
  public final TextView txtHeader;

  protected SearchHeaderItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView btnDelete, CheckBox checkbox, SwipeLayout swipeLayout,
      TextView txtHeader) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnDelete = btnDelete;
    this.checkbox = checkbox;
    this.swipeLayout = swipeLayout;
    this.txtHeader = txtHeader;
  }

  @NonNull
  public static SearchHeaderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchHeaderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchHeaderItemBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.search_header_item, root, attachToRoot, component);
  }

  @NonNull
  public static SearchHeaderItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchHeaderItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchHeaderItemBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.search_header_item, null, false, component);
  }

  public static SearchHeaderItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchHeaderItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchHeaderItemBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.search_header_item);
  }
}
