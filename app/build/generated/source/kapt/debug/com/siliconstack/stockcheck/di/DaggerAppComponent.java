// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.siliconstack.stockcheck.di;

import android.app.Activity;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.v4.app.Fragment;
import com.google.gson.Gson;
import com.siliconstack.stockcheck.AppApplication;
import com.siliconstack.stockcheck.AppApplication_MembersInjector;
import com.siliconstack.stockcheck.api.GoogleVisionApi;
import com.siliconstack.stockcheck.api.OCRApi;
import com.siliconstack.stockcheck.api.TeleserviceApi;
import com.siliconstack.stockcheck.repository.HomeRepository;
import com.siliconstack.stockcheck.view.ui.MainActivity;
import com.siliconstack.stockcheck.view.ui.MainActivity_MembersInjector;
import com.siliconstack.stockcheck.view.ui.base.BaseActivity;
import com.siliconstack.stockcheck.view.ui.base.BaseActivity_MembersInjector;
import com.siliconstack.stockcheck.view.ui.scan.ScanActivity;
import com.siliconstack.stockcheck.view.ui.scan.ScanActivity_MembersInjector;
import com.siliconstack.stockcheck.view.ui.scan.ScanCarActivity;
import com.siliconstack.stockcheck.view.ui.scan.ScanCarActivity_MembersInjector;
import com.siliconstack.stockcheck.view.ui.scan.ScanResultFragment;
import com.siliconstack.stockcheck.view.ui.scan.ScanResultFragment_MembersInjector;
import com.siliconstack.stockcheck.view.ui.search.ListViewFragment;
import com.siliconstack.stockcheck.view.ui.search.ListViewFragment_MembersInjector;
import com.siliconstack.stockcheck.view.ui.search.SearchActivity;
import com.siliconstack.stockcheck.view.ui.search.SearchActivity_MembersInjector;
import com.siliconstack.stockcheck.view.ui.setting.SettingActivity;
import com.siliconstack.stockcheck.view.ui.setting.SettingActivity_MembersInjector;
import com.siliconstack.stockcheck.viewmodel.MainViewModel;
import com.siliconstack.stockcheck.viewmodel.MainViewModel_Factory;
import com.siliconstack.stockcheck.viewmodel.MainViewModel_MembersInjector;
import com.siliconstack.stockcheck.viewmodel.ScanViewModel;
import com.siliconstack.stockcheck.viewmodel.ScanViewModel_Factory;
import com.siliconstack.stockcheck.viewmodel.ScanViewModel_MembersInjector;
import com.siliconstack.stockcheck.viewmodel.ViewModelFactory;
import com.siliconstack.stockcheck.viewmodel.ViewModelFactory_Factory;
import dagger.MembersInjector;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityModule_ContributeBaseActivity.BaseActivitySubcomponent.Builder>
      baseActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider;

  private Provider<ActivityModule_InjectLoginActivity.MainActivitySubcomponent.Builder>
      mainActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider2;

  private Provider<ActivityModule_InjectSearchActivity.SearchActivitySubcomponent.Builder>
      searchActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider3;

  private Provider<ActivityModule_InjectSettingActivity.SettingActivitySubcomponent.Builder>
      settingActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider4;

  private Provider<ActivityModule_InjectScanResultActivity.ScanActivitySubcomponent.Builder>
      scanActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider5;

  private Provider<ActivityModule_InjectScanCarActivity.ScanCarActivitySubcomponent.Builder>
      scanCarActivitySubcomponentBuilderProvider;

  private Provider<AndroidInjector.Factory<? extends Activity>> bindAndroidInjectorFactoryProvider6;

  private Provider<
          Map<Class<? extends Activity>, Provider<AndroidInjector.Factory<? extends Activity>>>>
      mapOfClassOfAndProviderOfFactoryOfProvider;

  private Provider<DispatchingAndroidInjector<Activity>> dispatchingAndroidInjectorProvider;

  private MembersInjector<AppApplication> appApplicationMembersInjector;

  private Provider<Gson> provideGSonProvider;

  private Provider<AppApplication> applicationProvider;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<OCRApi> provideAppApiProvider;

  private Provider<TeleserviceApi> provideTeleserviceApiProvider;

  private Provider<GoogleVisionApi> provideGoogleVisionApiProvider;

  private Provider<HomeRepository> provideAppRepositoryProvider;

  private MembersInjector<MainViewModel> mainViewModelMembersInjector;

  private Provider<MainViewModel> mainViewModelProvider;

  private Provider<ViewModel> bindMainViewModelProvider;

  private MembersInjector<ScanViewModel> scanViewModelMembersInjector;

  private Provider<ScanViewModel> scanViewModelProvider;

  private Provider<ViewModel> bindScanViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>>
      mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<ViewModelFactory> viewModelFactoryProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.baseActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            ActivityModule_ContributeBaseActivity.BaseActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_ContributeBaseActivity.BaseActivitySubcomponent.Builder get() {
            return new BaseActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider = (Provider) baseActivitySubcomponentBuilderProvider;

    this.mainActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            ActivityModule_InjectLoginActivity.MainActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_InjectLoginActivity.MainActivitySubcomponent.Builder get() {
            return new MainActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider2 = (Provider) mainActivitySubcomponentBuilderProvider;

    this.searchActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            ActivityModule_InjectSearchActivity.SearchActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_InjectSearchActivity.SearchActivitySubcomponent.Builder get() {
            return new SearchActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider3 = (Provider) searchActivitySubcomponentBuilderProvider;

    this.settingActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            ActivityModule_InjectSettingActivity.SettingActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_InjectSettingActivity.SettingActivitySubcomponent.Builder get() {
            return new SettingActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider4 =
        (Provider) settingActivitySubcomponentBuilderProvider;

    this.scanActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            ActivityModule_InjectScanResultActivity.ScanActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_InjectScanResultActivity.ScanActivitySubcomponent.Builder get() {
            return new ScanActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider5 = (Provider) scanActivitySubcomponentBuilderProvider;

    this.scanCarActivitySubcomponentBuilderProvider =
        new dagger.internal.Factory<
            ActivityModule_InjectScanCarActivity.ScanCarActivitySubcomponent.Builder>() {
          @Override
          public ActivityModule_InjectScanCarActivity.ScanCarActivitySubcomponent.Builder get() {
            return new ScanCarActivitySubcomponentBuilder();
          }
        };

    this.bindAndroidInjectorFactoryProvider6 =
        (Provider) scanCarActivitySubcomponentBuilderProvider;

    this.mapOfClassOfAndProviderOfFactoryOfProvider =
        MapProviderFactory
            .<Class<? extends Activity>, AndroidInjector.Factory<? extends Activity>>builder(6)
            .put(BaseActivity.class, bindAndroidInjectorFactoryProvider)
            .put(MainActivity.class, bindAndroidInjectorFactoryProvider2)
            .put(SearchActivity.class, bindAndroidInjectorFactoryProvider3)
            .put(SettingActivity.class, bindAndroidInjectorFactoryProvider4)
            .put(ScanActivity.class, bindAndroidInjectorFactoryProvider5)
            .put(ScanCarActivity.class, bindAndroidInjectorFactoryProvider6)
            .build();

    this.dispatchingAndroidInjectorProvider =
        DispatchingAndroidInjector_Factory.create(mapOfClassOfAndProviderOfFactoryOfProvider);

    this.appApplicationMembersInjector =
        AppApplication_MembersInjector.create(dispatchingAndroidInjectorProvider);

    this.provideGSonProvider =
        DoubleCheck.provider(AppModule_ProvideGSonFactory.create(builder.appModule));

    this.applicationProvider = InstanceFactory.create(builder.application);

    this.provideOkHttpClientProvider =
        DoubleCheck.provider(
            NetModule_ProvideOkHttpClientFactory.create(builder.netModule, applicationProvider));

    this.provideAppApiProvider =
        NetModule_ProvideAppApiFactory.create(
            builder.netModule, provideGSonProvider, provideOkHttpClientProvider);

    this.provideTeleserviceApiProvider =
        NetModule_ProvideTeleserviceApiFactory.create(
            builder.netModule, provideGSonProvider, provideOkHttpClientProvider);

    this.provideGoogleVisionApiProvider =
        NetModule_ProvideGoogleVisionApiFactory.create(
            builder.netModule, provideGSonProvider, provideOkHttpClientProvider);

    this.provideAppRepositoryProvider =
        DoubleCheck.provider(
            RepositoryModule_ProvideAppRepositoryFactory.create(
                builder.repositoryModule,
                provideAppApiProvider,
                provideTeleserviceApiProvider,
                provideGoogleVisionApiProvider));

    this.mainViewModelMembersInjector =
        MainViewModel_MembersInjector.create(provideAppRepositoryProvider);

    this.mainViewModelProvider =
        MainViewModel_Factory.create(mainViewModelMembersInjector, applicationProvider);

    this.bindMainViewModelProvider = (Provider) mainViewModelProvider;

    this.scanViewModelMembersInjector =
        ScanViewModel_MembersInjector.create(provideAppRepositoryProvider);

    this.scanViewModelProvider =
        ScanViewModel_Factory.create(scanViewModelMembersInjector, applicationProvider);

    this.bindScanViewModelProvider = (Provider) scanViewModelProvider;

    this.mapOfClassOfAndProviderOfViewModelProvider =
        MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(2)
            .put(MainViewModel.class, bindMainViewModelProvider)
            .put(ScanViewModel.class, bindScanViewModelProvider)
            .build();

    this.viewModelFactoryProvider =
        DoubleCheck.provider(
            ViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
  }

  @Override
  public void inject(AppApplication appApplication) {
    appApplicationMembersInjector.injectMembers(appApplication);
  }

  @Override
  public void injectViewModel(ViewModel viewModel) {
    MembersInjectors.<ViewModel>noOp().injectMembers(viewModel);
  }

  private static final class Builder implements AppComponent.Builder {
    private AppModule appModule;

    private NetModule netModule;

    private RepositoryModule repositoryModule;

    private AppApplication application;

    @Override
    public AppComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      if (netModule == null) {
        this.netModule = new NetModule();
      }
      if (repositoryModule == null) {
        this.repositoryModule = new RepositoryModule();
      }
      if (application == null) {
        throw new IllegalStateException(AppApplication.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    @Override
    public Builder application(AppApplication application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }
  }

  private final class BaseActivitySubcomponentBuilder
      extends ActivityModule_ContributeBaseActivity.BaseActivitySubcomponent.Builder {
    private BaseActivity seedInstance;

    @Override
    public ActivityModule_ContributeBaseActivity.BaseActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(BaseActivity.class.getCanonicalName() + " must be set");
      }
      return new BaseActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(BaseActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class BaseActivitySubcomponentImpl
      implements ActivityModule_ContributeBaseActivity.BaseActivitySubcomponent {
    private Provider<ViewModelProvider.Factory> bindViewModelFactoryProvider;

    private MembersInjector<BaseActivity> baseActivityMembersInjector;

    private BaseActivitySubcomponentImpl(BaseActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final BaseActivitySubcomponentBuilder builder) {

      this.bindViewModelFactoryProvider =
          (Provider) DaggerAppComponent.this.viewModelFactoryProvider;

      this.baseActivityMembersInjector =
          BaseActivity_MembersInjector.create(bindViewModelFactoryProvider);
    }

    @Override
    public void inject(BaseActivity arg0) {
      baseActivityMembersInjector.injectMembers(arg0);
    }
  }

  private final class MainActivitySubcomponentBuilder
      extends ActivityModule_InjectLoginActivity.MainActivitySubcomponent.Builder {
    private MainActivity seedInstance;

    @Override
    public ActivityModule_InjectLoginActivity.MainActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(MainActivity.class.getCanonicalName() + " must be set");
      }
      return new MainActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(MainActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl
      implements ActivityModule_InjectLoginActivity.MainActivitySubcomponent {
    private Provider<ViewModelProvider.Factory> bindViewModelFactoryProvider;

    private MembersInjector<MainActivity> mainActivityMembersInjector;

    private MainActivitySubcomponentImpl(MainActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivitySubcomponentBuilder builder) {

      this.bindViewModelFactoryProvider =
          (Provider) DaggerAppComponent.this.viewModelFactoryProvider;

      this.mainActivityMembersInjector =
          MainActivity_MembersInjector.create(bindViewModelFactoryProvider);
    }

    @Override
    public void inject(MainActivity arg0) {
      mainActivityMembersInjector.injectMembers(arg0);
    }
  }

  private final class SearchActivitySubcomponentBuilder
      extends ActivityModule_InjectSearchActivity.SearchActivitySubcomponent.Builder {
    private SearchActivity seedInstance;

    @Override
    public ActivityModule_InjectSearchActivity.SearchActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(SearchActivity.class.getCanonicalName() + " must be set");
      }
      return new SearchActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SearchActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SearchActivitySubcomponentImpl
      implements ActivityModule_InjectSearchActivity.SearchActivitySubcomponent {
    private Provider<ViewModelProvider.Factory> bindViewModelFactoryProvider;

    private Provider<
            SearchFragmentBuildersModule_InjectListViewFragment.ListViewFragmentSubcomponent
                .Builder>
        listViewFragmentSubcomponentBuilderProvider;

    private Provider<AndroidInjector.Factory<? extends Fragment>>
        bindAndroidInjectorFactoryProvider;

    private Provider<
            Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>>
        mapOfClassOfAndProviderOfFactoryOfProvider;

    private Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider;

    private MembersInjector<SearchActivity> searchActivityMembersInjector;

    private SearchActivitySubcomponentImpl(SearchActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SearchActivitySubcomponentBuilder builder) {

      this.bindViewModelFactoryProvider =
          (Provider) DaggerAppComponent.this.viewModelFactoryProvider;

      this.listViewFragmentSubcomponentBuilderProvider =
          new dagger.internal.Factory<
              SearchFragmentBuildersModule_InjectListViewFragment.ListViewFragmentSubcomponent
                  .Builder>() {
            @Override
            public SearchFragmentBuildersModule_InjectListViewFragment.ListViewFragmentSubcomponent
                    .Builder
                get() {
              return new ListViewFragmentSubcomponentBuilder();
            }
          };

      this.bindAndroidInjectorFactoryProvider =
          (Provider) listViewFragmentSubcomponentBuilderProvider;

      this.mapOfClassOfAndProviderOfFactoryOfProvider =
          MapProviderFactory
              .<Class<? extends Fragment>, AndroidInjector.Factory<? extends Fragment>>builder(1)
              .put(ListViewFragment.class, bindAndroidInjectorFactoryProvider)
              .build();

      this.dispatchingAndroidInjectorProvider =
          DispatchingAndroidInjector_Factory.create(mapOfClassOfAndProviderOfFactoryOfProvider);

      this.searchActivityMembersInjector =
          SearchActivity_MembersInjector.create(
              bindViewModelFactoryProvider, dispatchingAndroidInjectorProvider);
    }

    @Override
    public void inject(SearchActivity arg0) {
      searchActivityMembersInjector.injectMembers(arg0);
    }

    private final class ListViewFragmentSubcomponentBuilder
        extends SearchFragmentBuildersModule_InjectListViewFragment.ListViewFragmentSubcomponent
            .Builder {
      private ListViewFragment seedInstance;

      @Override
      public SearchFragmentBuildersModule_InjectListViewFragment.ListViewFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ListViewFragment.class.getCanonicalName() + " must be set");
        }
        return new ListViewFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ListViewFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ListViewFragmentSubcomponentImpl
        implements SearchFragmentBuildersModule_InjectListViewFragment
            .ListViewFragmentSubcomponent {
      private MembersInjector<ListViewFragment> listViewFragmentMembersInjector;

      private ListViewFragmentSubcomponentImpl(ListViewFragmentSubcomponentBuilder builder) {
        assert builder != null;
        initialize(builder);
      }

      @SuppressWarnings("unchecked")
      private void initialize(final ListViewFragmentSubcomponentBuilder builder) {

        this.listViewFragmentMembersInjector =
            ListViewFragment_MembersInjector.create(
                SearchActivitySubcomponentImpl.this.bindViewModelFactoryProvider);
      }

      @Override
      public void inject(ListViewFragment arg0) {
        listViewFragmentMembersInjector.injectMembers(arg0);
      }
    }
  }

  private final class SettingActivitySubcomponentBuilder
      extends ActivityModule_InjectSettingActivity.SettingActivitySubcomponent.Builder {
    private SettingActivity seedInstance;

    @Override
    public ActivityModule_InjectSettingActivity.SettingActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(SettingActivity.class.getCanonicalName() + " must be set");
      }
      return new SettingActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(SettingActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class SettingActivitySubcomponentImpl
      implements ActivityModule_InjectSettingActivity.SettingActivitySubcomponent {
    private Provider<ViewModelProvider.Factory> bindViewModelFactoryProvider;

    private MembersInjector<SettingActivity> settingActivityMembersInjector;

    private SettingActivitySubcomponentImpl(SettingActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SettingActivitySubcomponentBuilder builder) {

      this.bindViewModelFactoryProvider =
          (Provider) DaggerAppComponent.this.viewModelFactoryProvider;

      this.settingActivityMembersInjector =
          SettingActivity_MembersInjector.create(bindViewModelFactoryProvider);
    }

    @Override
    public void inject(SettingActivity arg0) {
      settingActivityMembersInjector.injectMembers(arg0);
    }
  }

  private final class ScanActivitySubcomponentBuilder
      extends ActivityModule_InjectScanResultActivity.ScanActivitySubcomponent.Builder {
    private ScanActivity seedInstance;

    @Override
    public ActivityModule_InjectScanResultActivity.ScanActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(ScanActivity.class.getCanonicalName() + " must be set");
      }
      return new ScanActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ScanActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ScanActivitySubcomponentImpl
      implements ActivityModule_InjectScanResultActivity.ScanActivitySubcomponent {
    private Provider<ViewModelProvider.Factory> bindViewModelFactoryProvider;

    private Provider<
            ScanFragmentBuildersModule_ContributeScanResultFragment.ScanResultFragmentSubcomponent
                .Builder>
        scanResultFragmentSubcomponentBuilderProvider;

    private Provider<AndroidInjector.Factory<? extends Fragment>>
        bindAndroidInjectorFactoryProvider;

    private Provider<
            Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>>
        mapOfClassOfAndProviderOfFactoryOfProvider;

    private Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider;

    private MembersInjector<ScanActivity> scanActivityMembersInjector;

    private ScanActivitySubcomponentImpl(ScanActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ScanActivitySubcomponentBuilder builder) {

      this.bindViewModelFactoryProvider =
          (Provider) DaggerAppComponent.this.viewModelFactoryProvider;

      this.scanResultFragmentSubcomponentBuilderProvider =
          new dagger.internal.Factory<
              ScanFragmentBuildersModule_ContributeScanResultFragment.ScanResultFragmentSubcomponent
                  .Builder>() {
            @Override
            public ScanFragmentBuildersModule_ContributeScanResultFragment
                    .ScanResultFragmentSubcomponent.Builder
                get() {
              return new ScanResultFragmentSubcomponentBuilder();
            }
          };

      this.bindAndroidInjectorFactoryProvider =
          (Provider) scanResultFragmentSubcomponentBuilderProvider;

      this.mapOfClassOfAndProviderOfFactoryOfProvider =
          MapProviderFactory
              .<Class<? extends Fragment>, AndroidInjector.Factory<? extends Fragment>>builder(1)
              .put(ScanResultFragment.class, bindAndroidInjectorFactoryProvider)
              .build();

      this.dispatchingAndroidInjectorProvider =
          DispatchingAndroidInjector_Factory.create(mapOfClassOfAndProviderOfFactoryOfProvider);

      this.scanActivityMembersInjector =
          ScanActivity_MembersInjector.create(
              bindViewModelFactoryProvider, dispatchingAndroidInjectorProvider);
    }

    @Override
    public void inject(ScanActivity arg0) {
      scanActivityMembersInjector.injectMembers(arg0);
    }

    private final class ScanResultFragmentSubcomponentBuilder
        extends ScanFragmentBuildersModule_ContributeScanResultFragment
            .ScanResultFragmentSubcomponent.Builder {
      private ScanResultFragment seedInstance;

      @Override
      public ScanFragmentBuildersModule_ContributeScanResultFragment.ScanResultFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ScanResultFragment.class.getCanonicalName() + " must be set");
        }
        return new ScanResultFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ScanResultFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ScanResultFragmentSubcomponentImpl
        implements ScanFragmentBuildersModule_ContributeScanResultFragment
            .ScanResultFragmentSubcomponent {
      private MembersInjector<ScanResultFragment> scanResultFragmentMembersInjector;

      private ScanResultFragmentSubcomponentImpl(ScanResultFragmentSubcomponentBuilder builder) {
        assert builder != null;
        initialize(builder);
      }

      @SuppressWarnings("unchecked")
      private void initialize(final ScanResultFragmentSubcomponentBuilder builder) {

        this.scanResultFragmentMembersInjector =
            ScanResultFragment_MembersInjector.create(
                ScanActivitySubcomponentImpl.this.bindViewModelFactoryProvider);
      }

      @Override
      public void inject(ScanResultFragment arg0) {
        scanResultFragmentMembersInjector.injectMembers(arg0);
      }
    }
  }

  private final class ScanCarActivitySubcomponentBuilder
      extends ActivityModule_InjectScanCarActivity.ScanCarActivitySubcomponent.Builder {
    private ScanCarActivity seedInstance;

    @Override
    public ActivityModule_InjectScanCarActivity.ScanCarActivitySubcomponent build() {
      if (seedInstance == null) {
        throw new IllegalStateException(ScanCarActivity.class.getCanonicalName() + " must be set");
      }
      return new ScanCarActivitySubcomponentImpl(this);
    }

    @Override
    public void seedInstance(ScanCarActivity arg0) {
      this.seedInstance = Preconditions.checkNotNull(arg0);
    }
  }

  private final class ScanCarActivitySubcomponentImpl
      implements ActivityModule_InjectScanCarActivity.ScanCarActivitySubcomponent {
    private Provider<ViewModelProvider.Factory> bindViewModelFactoryProvider;

    private Provider<
            ScanFragmentBuildersModule_ContributeScanResultFragment.ScanResultFragmentSubcomponent
                .Builder>
        scanResultFragmentSubcomponentBuilderProvider;

    private Provider<AndroidInjector.Factory<? extends Fragment>>
        bindAndroidInjectorFactoryProvider;

    private Provider<
            Map<Class<? extends Fragment>, Provider<AndroidInjector.Factory<? extends Fragment>>>>
        mapOfClassOfAndProviderOfFactoryOfProvider;

    private Provider<DispatchingAndroidInjector<Fragment>> dispatchingAndroidInjectorProvider;

    private MembersInjector<ScanCarActivity> scanCarActivityMembersInjector;

    private ScanCarActivitySubcomponentImpl(ScanCarActivitySubcomponentBuilder builder) {
      assert builder != null;
      initialize(builder);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final ScanCarActivitySubcomponentBuilder builder) {

      this.bindViewModelFactoryProvider =
          (Provider) DaggerAppComponent.this.viewModelFactoryProvider;

      this.scanResultFragmentSubcomponentBuilderProvider =
          new dagger.internal.Factory<
              ScanFragmentBuildersModule_ContributeScanResultFragment.ScanResultFragmentSubcomponent
                  .Builder>() {
            @Override
            public ScanFragmentBuildersModule_ContributeScanResultFragment
                    .ScanResultFragmentSubcomponent.Builder
                get() {
              return new ScanResultFragmentSubcomponentBuilder();
            }
          };

      this.bindAndroidInjectorFactoryProvider =
          (Provider) scanResultFragmentSubcomponentBuilderProvider;

      this.mapOfClassOfAndProviderOfFactoryOfProvider =
          MapProviderFactory
              .<Class<? extends Fragment>, AndroidInjector.Factory<? extends Fragment>>builder(1)
              .put(ScanResultFragment.class, bindAndroidInjectorFactoryProvider)
              .build();

      this.dispatchingAndroidInjectorProvider =
          DispatchingAndroidInjector_Factory.create(mapOfClassOfAndProviderOfFactoryOfProvider);

      this.scanCarActivityMembersInjector =
          ScanCarActivity_MembersInjector.create(
              bindViewModelFactoryProvider, dispatchingAndroidInjectorProvider);
    }

    @Override
    public void inject(ScanCarActivity arg0) {
      scanCarActivityMembersInjector.injectMembers(arg0);
    }

    private final class ScanResultFragmentSubcomponentBuilder
        extends ScanFragmentBuildersModule_ContributeScanResultFragment
            .ScanResultFragmentSubcomponent.Builder {
      private ScanResultFragment seedInstance;

      @Override
      public ScanFragmentBuildersModule_ContributeScanResultFragment.ScanResultFragmentSubcomponent
          build() {
        if (seedInstance == null) {
          throw new IllegalStateException(
              ScanResultFragment.class.getCanonicalName() + " must be set");
        }
        return new ScanResultFragmentSubcomponentImpl(this);
      }

      @Override
      public void seedInstance(ScanResultFragment arg0) {
        this.seedInstance = Preconditions.checkNotNull(arg0);
      }
    }

    private final class ScanResultFragmentSubcomponentImpl
        implements ScanFragmentBuildersModule_ContributeScanResultFragment
            .ScanResultFragmentSubcomponent {
      private MembersInjector<ScanResultFragment> scanResultFragmentMembersInjector;

      private ScanResultFragmentSubcomponentImpl(ScanResultFragmentSubcomponentBuilder builder) {
        assert builder != null;
        initialize(builder);
      }

      @SuppressWarnings("unchecked")
      private void initialize(final ScanResultFragmentSubcomponentBuilder builder) {

        this.scanResultFragmentMembersInjector =
            ScanResultFragment_MembersInjector.create(
                ScanCarActivitySubcomponentImpl.this.bindViewModelFactoryProvider);
      }

      @Override
      public void inject(ScanResultFragment arg0) {
        scanResultFragmentMembersInjector.injectMembers(arg0);
      }
    }
  }
}