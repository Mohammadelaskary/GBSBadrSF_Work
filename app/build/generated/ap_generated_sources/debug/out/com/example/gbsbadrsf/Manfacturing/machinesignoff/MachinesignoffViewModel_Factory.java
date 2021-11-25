// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.Manfacturing.machinesignoff;

import com.example.gbsbadrsf.repository.Productionsequencerepository;
import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MachinesignoffViewModel_Factory implements Factory<MachinesignoffViewModel> {
  private final Provider<Productionsequencerepository> productionsequencerepositoryProvider;

  private final Provider<Gson> gsonProvider;

  public MachinesignoffViewModel_Factory(
      Provider<Productionsequencerepository> productionsequencerepositoryProvider,
      Provider<Gson> gsonProvider) {
    this.productionsequencerepositoryProvider = productionsequencerepositoryProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public MachinesignoffViewModel get() {
    return newInstance(productionsequencerepositoryProvider.get(), gsonProvider.get());
  }

  public static MachinesignoffViewModel_Factory create(
      Provider<Productionsequencerepository> productionsequencerepositoryProvider,
      Provider<Gson> gsonProvider) {
    return new MachinesignoffViewModel_Factory(productionsequencerepositoryProvider, gsonProvider);
  }

  public static MachinesignoffViewModel newInstance(
      Productionsequencerepository productionsequencerepository, Gson gson) {
    return new MachinesignoffViewModel(productionsequencerepository, gson);
  }
}
