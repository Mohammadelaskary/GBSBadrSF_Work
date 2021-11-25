// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.repository;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Authenticationrepository_Factory implements Factory<Authenticationrepository> {
  private final Provider<ApiInterface> apiInterfaceProvider;

  public Authenticationrepository_Factory(Provider<ApiInterface> apiInterfaceProvider) {
    this.apiInterfaceProvider = apiInterfaceProvider;
  }

  @Override
  public Authenticationrepository get() {
    Authenticationrepository instance = newInstance();
    Authenticationrepository_MembersInjector.injectApiInterface(instance, apiInterfaceProvider.get());
    return instance;
  }

  public static Authenticationrepository_Factory create(
      Provider<ApiInterface> apiInterfaceProvider) {
    return new Authenticationrepository_Factory(apiInterfaceProvider);
  }

  public static Authenticationrepository newInstance() {
    return new Authenticationrepository();
  }
}
