// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.productionsequence;

import com.example.gbsbadrsf.repository.Productionsequencerepository;
import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SelectedLoadinsequenceinfoViewModel_Factory implements Factory<SelectedLoadinsequenceinfoViewModel> {
  private final Provider<Productionsequencerepository> productionsequencerepositoryProvider;

  private final Provider<Gson> gsonProvider;

  public SelectedLoadinsequenceinfoViewModel_Factory(
      Provider<Productionsequencerepository> productionsequencerepositoryProvider,
      Provider<Gson> gsonProvider) {
    this.productionsequencerepositoryProvider = productionsequencerepositoryProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public SelectedLoadinsequenceinfoViewModel get() {
    return newInstance(productionsequencerepositoryProvider.get(), gsonProvider.get());
  }

  public static SelectedLoadinsequenceinfoViewModel_Factory create(
      Provider<Productionsequencerepository> productionsequencerepositoryProvider,
      Provider<Gson> gsonProvider) {
    return new SelectedLoadinsequenceinfoViewModel_Factory(productionsequencerepositoryProvider, gsonProvider);
  }

  public static SelectedLoadinsequenceinfoViewModel newInstance(
      Productionsequencerepository productionsequencerepository, Gson gson) {
    return new SelectedLoadinsequenceinfoViewModel(productionsequencerepository, gson);
  }
}