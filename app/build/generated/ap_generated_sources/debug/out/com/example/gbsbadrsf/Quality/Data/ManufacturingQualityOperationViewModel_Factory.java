// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.Quality.Data;

import com.example.gbsbadrsf.repository.ApiInterface;
import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ManufacturingQualityOperationViewModel_Factory implements Factory<ManufacturingQualityOperationViewModel> {
  private final Provider<Gson> gsonProvider;

  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<Gson> gsonProvider2;

  public ManufacturingQualityOperationViewModel_Factory(Provider<Gson> gsonProvider,
      Provider<ApiInterface> apiInterfaceProvider, Provider<Gson> gsonProvider2) {
    this.gsonProvider = gsonProvider;
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.gsonProvider2 = gsonProvider2;
  }

  @Override
  public ManufacturingQualityOperationViewModel get() {
    ManufacturingQualityOperationViewModel instance = newInstance(gsonProvider.get());
    ManufacturingQualityOperationViewModel_MembersInjector.injectApiInterface(instance, apiInterfaceProvider.get());
    ManufacturingQualityOperationViewModel_MembersInjector.injectGson(instance, gsonProvider2.get());
    return instance;
  }

  public static ManufacturingQualityOperationViewModel_Factory create(Provider<Gson> gsonProvider,
      Provider<ApiInterface> apiInterfaceProvider, Provider<Gson> gsonProvider2) {
    return new ManufacturingQualityOperationViewModel_Factory(gsonProvider, apiInterfaceProvider, gsonProvider2);
  }

  public static ManufacturingQualityOperationViewModel newInstance(Gson gson) {
    return new ManufacturingQualityOperationViewModel(gson);
  }
}
