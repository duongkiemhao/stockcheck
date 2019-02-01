package com.siliconstack.stockcheck;

import android.databinding.DataBinderMapper;
import android.databinding.DataBindingComponent;
import android.databinding.ViewDataBinding;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.siliconstack.stockcheck.databinding.CameraActivityBindingImpl;
import com.siliconstack.stockcheck.databinding.ListviewFragmentBindingImpl;
import com.siliconstack.stockcheck.databinding.LoadingViewBindingImpl;
import com.siliconstack.stockcheck.databinding.MainActivityBindingImpl;
import com.siliconstack.stockcheck.databinding.MapInfoWindowBindingImpl;
import com.siliconstack.stockcheck.databinding.MapviewFragmentBindingImpl;
import com.siliconstack.stockcheck.databinding.ScanActivityBindingImpl;
import com.siliconstack.stockcheck.databinding.ScanCarActivityBindingImpl;
import com.siliconstack.stockcheck.databinding.ScanCarItemBindingImpl;
import com.siliconstack.stockcheck.databinding.ScanResultFragmentBindingImpl;
import com.siliconstack.stockcheck.databinding.SearchActivityBindingImpl;
import com.siliconstack.stockcheck.databinding.SearchHeaderItemBindingImpl;
import com.siliconstack.stockcheck.databinding.SearchItemBindingImpl;
import com.siliconstack.stockcheck.databinding.SettingActivityBindingImpl;
import com.siliconstack.stockcheck.databinding.SettingItemBindingImpl;
import com.siliconstack.stockcheck.databinding.VehicleDetailBindingImpl;
import com.siliconstack.stockcheck.databinding.ViewVehicleFoundBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_CAMERAACTIVITY = 1;

  private static final int LAYOUT_LISTVIEWFRAGMENT = 2;

  private static final int LAYOUT_LOADINGVIEW = 3;

  private static final int LAYOUT_MAINACTIVITY = 4;

  private static final int LAYOUT_MAPINFOWINDOW = 5;

  private static final int LAYOUT_MAPVIEWFRAGMENT = 6;

  private static final int LAYOUT_SCANACTIVITY = 7;

  private static final int LAYOUT_SCANCARACTIVITY = 8;

  private static final int LAYOUT_SCANCARITEM = 9;

  private static final int LAYOUT_SCANRESULTFRAGMENT = 10;

  private static final int LAYOUT_SEARCHACTIVITY = 11;

  private static final int LAYOUT_SEARCHHEADERITEM = 12;

  private static final int LAYOUT_SEARCHITEM = 13;

  private static final int LAYOUT_SETTINGACTIVITY = 14;

  private static final int LAYOUT_SETTINGITEM = 15;

  private static final int LAYOUT_VEHICLEDETAIL = 16;

  private static final int LAYOUT_VIEWVEHICLEFOUND = 17;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(17);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.camera_activity, LAYOUT_CAMERAACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.listview_fragment, LAYOUT_LISTVIEWFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.loading_view, LAYOUT_LOADINGVIEW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.main_activity, LAYOUT_MAINACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.map_info_window, LAYOUT_MAPINFOWINDOW);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.mapview_fragment, LAYOUT_MAPVIEWFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.scan_activity, LAYOUT_SCANACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.scan_car_activity, LAYOUT_SCANCARACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.scan_car_item, LAYOUT_SCANCARITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.scan_result_fragment, LAYOUT_SCANRESULTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.search_activity, LAYOUT_SEARCHACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.search_header_item, LAYOUT_SEARCHHEADERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.search_item, LAYOUT_SEARCHITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.setting_activity, LAYOUT_SETTINGACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.setting_item, LAYOUT_SETTINGITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.vehicle_detail, LAYOUT_VEHICLEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.siliconstack.stockcheck.R.layout.view_vehicle_found, LAYOUT_VIEWVEHICLEFOUND);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_CAMERAACTIVITY: {
          if ("layout/camera_activity_0".equals(tag)) {
            return new CameraActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for camera_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTVIEWFRAGMENT: {
          if ("layout-port/listview_fragment_0".equals(tag)) {
            return new ListviewFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for listview_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_LOADINGVIEW: {
          if ("layout/loading_view_0".equals(tag)) {
            return new LoadingViewBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for loading_view is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITY: {
          if ("layout-port/main_activity_0".equals(tag)) {
            return new MainActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_MAPINFOWINDOW: {
          if ("layout-port/map_info_window_0".equals(tag)) {
            return new MapInfoWindowBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for map_info_window is invalid. Received: " + tag);
        }
        case  LAYOUT_MAPVIEWFRAGMENT: {
          if ("layout-port/mapview_fragment_0".equals(tag)) {
            return new MapviewFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for mapview_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_SCANACTIVITY: {
          if ("layout-port/scan_activity_0".equals(tag)) {
            return new ScanActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for scan_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_SCANCARACTIVITY: {
          if ("layout-port/scan_car_activity_0".equals(tag)) {
            return new ScanCarActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for scan_car_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_SCANCARITEM: {
          if ("layout-port/scan_car_item_0".equals(tag)) {
            return new ScanCarItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for scan_car_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SCANRESULTFRAGMENT: {
          if ("layout-port/scan_result_fragment_0".equals(tag)) {
            return new ScanResultFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for scan_result_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHACTIVITY: {
          if ("layout-port/search_activity_0".equals(tag)) {
            return new SearchActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHHEADERITEM: {
          if ("layout-port/search_header_item_0".equals(tag)) {
            return new SearchHeaderItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_header_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SEARCHITEM: {
          if ("layout-port/search_item_0".equals(tag)) {
            return new SearchItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for search_item is invalid. Received: " + tag);
        }
        case  LAYOUT_SETTINGACTIVITY: {
          if ("layout-port/setting_activity_0".equals(tag)) {
            return new SettingActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for setting_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_SETTINGITEM: {
          if ("layout-port/setting_item_0".equals(tag)) {
            return new SettingItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for setting_item is invalid. Received: " + tag);
        }
        case  LAYOUT_VEHICLEDETAIL: {
          if ("layout-port/vehicle_detail_0".equals(tag)) {
            return new VehicleDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for vehicle_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWVEHICLEFOUND: {
          if ("layout-port/view_vehicle_found_0".equals(tag)) {
            return new ViewVehicleFoundBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_vehicle_found is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(17);

    static {
      sKeys.put("layout/camera_activity_0", com.siliconstack.stockcheck.R.layout.camera_activity);
      sKeys.put("layout-port/listview_fragment_0", com.siliconstack.stockcheck.R.layout.listview_fragment);
      sKeys.put("layout/loading_view_0", com.siliconstack.stockcheck.R.layout.loading_view);
      sKeys.put("layout-port/main_activity_0", com.siliconstack.stockcheck.R.layout.main_activity);
      sKeys.put("layout-port/map_info_window_0", com.siliconstack.stockcheck.R.layout.map_info_window);
      sKeys.put("layout-port/mapview_fragment_0", com.siliconstack.stockcheck.R.layout.mapview_fragment);
      sKeys.put("layout-port/scan_activity_0", com.siliconstack.stockcheck.R.layout.scan_activity);
      sKeys.put("layout-port/scan_car_activity_0", com.siliconstack.stockcheck.R.layout.scan_car_activity);
      sKeys.put("layout-port/scan_car_item_0", com.siliconstack.stockcheck.R.layout.scan_car_item);
      sKeys.put("layout-port/scan_result_fragment_0", com.siliconstack.stockcheck.R.layout.scan_result_fragment);
      sKeys.put("layout-port/search_activity_0", com.siliconstack.stockcheck.R.layout.search_activity);
      sKeys.put("layout-port/search_header_item_0", com.siliconstack.stockcheck.R.layout.search_header_item);
      sKeys.put("layout-port/search_item_0", com.siliconstack.stockcheck.R.layout.search_item);
      sKeys.put("layout-port/setting_activity_0", com.siliconstack.stockcheck.R.layout.setting_activity);
      sKeys.put("layout-port/setting_item_0", com.siliconstack.stockcheck.R.layout.setting_item);
      sKeys.put("layout-port/vehicle_detail_0", com.siliconstack.stockcheck.R.layout.vehicle_detail);
      sKeys.put("layout-port/view_vehicle_found_0", com.siliconstack.stockcheck.R.layout.view_vehicle_found);
    }
  }
}
