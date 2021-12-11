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
public final class QualityDefectRepairViewModel_MembersInjector implements MembersInjector<QualityDefectRepairViewModel> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<Gson> gsonProvider;

  public QualityDefectRepairViewModel_MembersInjector(Provider<ApiInterface> apiInterfaceProvider,
      Provider<Gson> gsonProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<QualityDefectRepairViewModel> create(
      Provider<ApiInterface> apiInterfaceProvider, Provider<Gson> gsonProvider) {
    return new QualityDefectRepairViewModel_MembersInjector(apiInterfaceProvider, gsonProvider);
  }

  @Override
  public void injectMembers(QualityDefectRepairViewModel instance) {
    injectApiInterface(instance, apiInterfaceProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.Quality.Data.QualityDefectRepairViewModel.apiInterface")
  public static void injectApiInterface(QualityDefectRepairViewModel instance,
      ApiInterface apiInterface) {
    instance.apiInterface = apiInterface;
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.Quality.Data.QualityDefectRepairViewModel.gson")
  public static void injectGson(QualityDefectRepairViewModel instance, Gson gson) {
    instance.gson = gson;
  }
}
