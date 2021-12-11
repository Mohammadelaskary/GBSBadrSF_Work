// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.Production.Data;

import com.example.gbsbadrsf.repository.ApiInterface;
import com.google.gson.Gson;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductionDefectRepairViewModel_MembersInjector implements MembersInjector<ProductionDefectRepairViewModel> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<Gson> gsonProvider;

  public ProductionDefectRepairViewModel_MembersInjector(
      Provider<ApiInterface> apiInterfaceProvider, Provider<Gson> gsonProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<ProductionDefectRepairViewModel> create(
      Provider<ApiInterface> apiInterfaceProvider, Provider<Gson> gsonProvider) {
    return new ProductionDefectRepairViewModel_MembersInjector(apiInterfaceProvider, gsonProvider);
  }

  @Override
  public void injectMembers(ProductionDefectRepairViewModel instance) {
    injectApiInterface(instance, apiInterfaceProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.Production.Data.ProductionDefectRepairViewModel.apiInterface")
  public static void injectApiInterface(ProductionDefectRepairViewModel instance,
      ApiInterface apiInterface) {
    instance.apiInterface = apiInterface;
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.Production.Data.ProductionDefectRepairViewModel.gson")
  public static void injectGson(ProductionDefectRepairViewModel instance, Gson gson) {
    instance.gson = gson;
  }
}
