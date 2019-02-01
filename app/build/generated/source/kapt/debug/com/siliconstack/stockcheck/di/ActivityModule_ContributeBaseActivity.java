package com.siliconstack.stockcheck.di;

import android.app.Activity;
import com.siliconstack.stockcheck.view.ui.base.BaseActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_ContributeBaseActivity.BaseActivitySubcomponent.class)
public abstract class ActivityModule_ContributeBaseActivity {
  private ActivityModule_ContributeBaseActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(BaseActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      BaseActivitySubcomponent.Builder builder);

  @Subcomponent(modules = EmptyFragmentBuildersModule.class)
  public interface BaseActivitySubcomponent extends AndroidInjector<BaseActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity> {}
  }
}
