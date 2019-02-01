package com.siliconstack.stockcheck.di;

import android.app.Activity;
import com.siliconstack.stockcheck.view.ui.search.SearchActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_InjectSearchActivity.SearchActivitySubcomponent.class)
public abstract class ActivityModule_InjectSearchActivity {
  private ActivityModule_InjectSearchActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(SearchActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      SearchActivitySubcomponent.Builder builder);

  @Subcomponent(modules = SearchFragmentBuildersModule.class)
  public interface SearchActivitySubcomponent extends AndroidInjector<SearchActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SearchActivity> {}
  }
}
