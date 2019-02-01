// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.siliconstack.stockcheck.view.ui.search;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v4.app.Fragment;
import com.siliconstack.stockcheck.view.ui.base.BaseActivity;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import javax.inject.Provider;

public final class SearchActivity_MembersInjector implements MembersInjector<SearchActivity> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  private final Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider;

  public SearchActivity_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider) {
    assert viewModelFactoryProvider != null;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
    assert dispatchingAndroidInjectorProvider != null;
    this.dispatchingAndroidInjectorProvider = dispatchingAndroidInjectorProvider;
  }

  public static MembersInjector<SearchActivity> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider,
      Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider) {
    return new SearchActivity_MembersInjector(
        viewModelFactoryProvider, dispatchingAndroidInjectorProvider);
  }

  @Override
  public void injectMembers(SearchActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BaseActivity) instance).viewModelFactory = viewModelFactoryProvider.get();
    instance.dispatchingAndroidInjector = dispatchingAndroidInjectorProvider.get();
  }
}
