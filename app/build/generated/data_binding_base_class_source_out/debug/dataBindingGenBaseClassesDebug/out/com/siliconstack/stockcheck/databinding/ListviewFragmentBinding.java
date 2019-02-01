package com.siliconstack.stockcheck.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class ListviewFragmentBinding extends ViewDataBinding {
  @NonNull
  public final TextView btnExport;

  @NonNull
  public final EditText ediKeyword;

  @NonNull
  public final LinearLayout layoutListview;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final TextView txtCompare;

  @NonNull
  public final TextView txtDate;

  @NonNull
  public final TextView txtLocation;

  protected ListviewFragmentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView btnExport, EditText ediKeyword, LinearLayout layoutListview,
      RecyclerView recyclerView, TextView txtCompare, TextView txtDate, TextView txtLocation) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnExport = btnExport;
    this.ediKeyword = ediKeyword;
    this.layoutListview = layoutListview;
    this.recyclerView = recyclerView;
    this.txtCompare = txtCompare;
    this.txtDate = txtDate;
    this.txtLocation = txtLocation;
  }

  @NonNull
  public static ListviewFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ListviewFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ListviewFragmentBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.listview_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ListviewFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ListviewFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ListviewFragmentBinding>inflate(inflater, com.siliconstack.stockcheck.R.layout.listview_fragment, null, false, component);
  }

  public static ListviewFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ListviewFragmentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ListviewFragmentBinding)bind(component, view, com.siliconstack.stockcheck.R.layout.listview_fragment);
  }
}
