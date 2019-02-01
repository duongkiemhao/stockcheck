package com.siliconstack.stockcheck.di;

import android.support.v4.app.Fragment;
import com.siliconstack.stockcheck.view.ui.scan.ScanResultFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ScanFragmentBuildersModule_ContributeScanResultFragment.ScanResultFragmentSubcomponent.class
)
public abstract class ScanFragmentBuildersModule_ContributeScanResultFragment {
  private ScanFragmentBuildersModule_ContributeScanResultFragment() {}

  @Binds
  @IntoMap
  @FragmentKey(ScanResultFragment.class)
  abstract AndroidInjector.Factory<? extends Fragment> bindAndroidInjectorFactory(
      ScanResultFragmentSubcomponent.Builder builder);

  @Subcomponent
  public interface ScanResultFragmentSubcomponent extends AndroidInjector<ScanResultFragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScanResultFragment> {}
  }
}
