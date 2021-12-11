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
public final class ManufacturingAddDefectsDetailsViewModel_Factory implements Factory<ManufacturingAddDefectsDetailsViewModel> {
  private final Provider<Gson> gsonProvider;

  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<Gson> gsonProvider2;

  public ManufacturingAddDefectsDetailsViewModel_Factory(Provider<Gson> gsonProvider,
      Provider<ApiInterface> apiInterfaceProvider, Provider<Gson> gsonProvider2) {
    this.gsonProvider = gsonProvider;
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.gsonProvider2 = gsonProvider2;
  }

  @Override
  public ManufacturingAddDefectsDetailsViewModel get() {
    ManufacturingAddDefectsDetailsViewModel instance = newInstance(gsonProvider.get());
    ManufacturingAddDefectsDetailsViewModel_MembersInjector.injectApiInterface(instance, apiInterfaceProvider.get());
    ManufacturingAddDefectsDetailsViewModel_MembersInjector.injectGson(instance, gsonProvider2.get());
    return instance;
  }

  public static ManufacturingAddDefectsDetailsViewModel_Factory create(Provider<Gson> gsonProvider,
      Provider<ApiInterface> apiInterfaceProvider, Provider<Gson> gsonProvider2) {
    return new ManufacturingAddDefectsDetailsViewModel_Factory(gsonProvider, apiInterfaceProvider, gsonProvider2);
  }

  public static ManufacturingAddDefectsDetailsViewModel newInstance(Gson gson) {
    return new ManufacturingAddDefectsDetailsViewModel(gson);
  }
}
