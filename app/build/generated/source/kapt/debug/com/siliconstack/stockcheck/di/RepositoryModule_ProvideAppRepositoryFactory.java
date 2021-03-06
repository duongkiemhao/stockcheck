// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.siliconstack.stockcheck.di;

import com.siliconstack.stockcheck.api.GoogleVisionApi;
import com.siliconstack.stockcheck.api.OCRApi;
import com.siliconstack.stockcheck.api.TeleserviceApi;
import com.siliconstack.stockcheck.repository.HomeRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class RepositoryModule_ProvideAppRepositoryFactory implements Factory<HomeRepository> {
  private final RepositoryModule module;

  private final Provider<OCRApi> oCRApiProvider;

  private final Provider<TeleserviceApi> teleserviceApiProvider;

  private final Provider<GoogleVisionApi> googleVisionApiProvider;

  public RepositoryModule_ProvideAppRepositoryFactory(
      RepositoryModule module,
      Provider<OCRApi> oCRApiProvider,
      Provider<TeleserviceApi> teleserviceApiProvider,
      Provider<GoogleVisionApi> googleVisionApiProvider) {
    assert module != null;
    this.module = module;
    assert oCRApiProvider != null;
    this.oCRApiProvider = oCRApiProvider;
    assert teleserviceApiProvider != null;
    this.teleserviceApiProvider = teleserviceApiProvider;
    assert googleVisionApiProvider != null;
    this.googleVisionApiProvider = googleVisionApiProvider;
  }

  @Override
  public HomeRepository get() {
    return Preconditions.checkNotNull(
        module.provideAppRepository(
            oCRApiProvider.get(), teleserviceApiProvider.get(), googleVisionApiProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HomeRepository> create(
      RepositoryModule module,
      Provider<OCRApi> oCRApiProvider,
      Provider<TeleserviceApi> teleserviceApiProvider,
      Provider<GoogleVisionApi> googleVisionApiProvider) {
    return new RepositoryModule_ProvideAppRepositoryFactory(
        module, oCRApiProvider, teleserviceApiProvider, googleVisionApiProvider);
  }
}
