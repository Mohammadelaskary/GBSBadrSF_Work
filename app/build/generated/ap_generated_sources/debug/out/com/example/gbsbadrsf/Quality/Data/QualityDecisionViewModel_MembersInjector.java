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
public final class QualityDecisionViewModel_MembersInjector implements MembersInjector<QualityDecisionViewModel> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  private final Provider<Gson> gsonProvider;

  public QualityDecisionViewModel_MembersInjector(Provider<ApiInterface> apiInterfaceProvider,
      Provider<Gson> gsonProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<QualityDecisionViewModel> create(
      Provider<ApiInterface> apiInterfaceProvider, Provider<Gson> gsonProvider) {
    return new QualityDecisionViewModel_MembersInjector(apiInterfaceProvider, gsonProvider);
  }

  @Override
  public void injectMembers(QualityDecisionViewModel instance) {
    injectApiInterface(instance, apiInterfaceProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.Quality.Data.QualityDecisionViewModel.apiInterface")
  public static void injectApiInterface(QualityDecisionViewModel instance,
      ApiInterface apiInterface) {
    instance.apiInterface = apiInterface;
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.Quality.Data.QualityDecisionViewModel.gson")
  public static void injectGson(QualityDecisionViewModel instance, Gson gson) {
    instance.gson = gson;
  }
}
