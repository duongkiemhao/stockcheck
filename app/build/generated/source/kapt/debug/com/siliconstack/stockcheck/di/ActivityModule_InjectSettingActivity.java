package com.siliconstack.stockcheck.di;

import android.app.Activity;
import com.siliconstack.stockcheck.view.ui.setting.SettingActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_InjectSettingActivity.SettingActivitySubcomponent.class)
public abstract class ActivityModule_InjectSettingActivity {
  private ActivityModule_InjectSettingActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(SettingActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SettingActivitySubcomponent.Builder builder);

  @Subcomponent(modules = EmptyFragmentBuildersModule.class)
  public interface SettingActivitySubcomponent extends AndroidInjector<SettingActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SettingActivity> {}
  }
}
