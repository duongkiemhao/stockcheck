package com.siliconstack.stockcheck.di;

import android.app.Activity;
import com.siliconstack.stockcheck.view.ui.scan.ScanActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_InjectScanResultActivity.ScanActivitySubcomponent.class)
public abstract class ActivityModule_InjectScanResultActivity {
  private ActivityModule_InjectScanResultActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(ScanActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      ScanActivitySubcomponent.Builder builder);

  @Subcomponent(modules = ScanFragmentBuildersModule.class)
  public interface ScanActivitySubcomponent extends AndroidInjector<ScanActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ScanActivity> {}
  }
}
