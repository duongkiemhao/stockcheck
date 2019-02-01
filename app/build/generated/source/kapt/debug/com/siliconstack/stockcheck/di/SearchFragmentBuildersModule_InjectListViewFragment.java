package com.siliconstack.stockcheck.di;

import android.support.v4.app.Fragment;
import com.siliconstack.stockcheck.view.ui.search.ListViewFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      SearchFragmentBuildersModule_InjectListViewFragment.ListViewFragmentSubcomponent.class
)
public abstract class SearchFragmentBuildersModule_InjectListViewFragment {
  private SearchFragmentBuildersModule_InjectListViewFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ListViewFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ListViewFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ListViewFragmentSubcomponent extends AndroidInjector<ListViewFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ListViewFragment> {}
  }
}
