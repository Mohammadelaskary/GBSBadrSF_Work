// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.Quality.Data;

import com.example.gbsbadrsf.repository.ApiInterface;
import com.google.gson.Gson;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ManufacturingQualityOperationViewModel_MembersInjector implements MembersInjector<ManufacturingQualityOperationViewModel> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<Gson> gsonProvider;

  public ManufacturingQualityOperationViewModel_MembersInjector(
      Provider<ApiInterface> apiInterfaceProvider, Provider<Gson> gsonProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<ManufacturingQualityOperationViewModel> create(
      Provider<ApiInterface> apiInterfaceProvider, Provider<Gson> gsonProvider) {
    return new ManufacturingQualityOperationViewModel_MembersInjector(apiInterfaceProvider, gsonProvider);
  }

  @Override
  public void injectMembers(ManufacturingQualityOperationViewModel instance) {
    injectApiInterface(instance, apiInterfaceProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.Quality.Data.ManufacturingQualityOperationViewModel.apiInterface")
  public static void injectApiInterface(ManufacturingQualityOperationViewModel instance,
      ApiInterface apiInterface) {
    instance.apiInterface = apiInterface;
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.Quality.Data.ManufacturingQualityOperationViewModel.gson")
  public static void injectGson(ManufacturingQualityOperationViewModel instance, Gson gson) {
    instance.gson = gson;
  }
}
