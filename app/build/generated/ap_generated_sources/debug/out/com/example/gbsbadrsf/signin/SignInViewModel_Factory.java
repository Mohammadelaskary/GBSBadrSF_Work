// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.signin;

import com.example.gbsbadrsf.repository.Authenticationrepository;
import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SignInViewModel_Factory implements Factory<SignInViewModel> {
  private final Provider<Authenticationrepository> authenticationRepositoryProvider;

  private final Provider<Gson> gsonProvider;

  public SignInViewModel_Factory(
      Provider<Authenticationrepository> authenticationRepositoryProvider,
      Provider<Gson> gsonProvider) {
    this.authenticationRepositoryProvider = authenticationRepositoryProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public SignInViewModel get() {
    return newInstance(authenticationRepositoryProvider.get(), gsonProvider.get());
  }

  public static SignInViewModel_Factory create(
      Provider<Authenticationrepository> authenticationRepositoryProvider,
      Provider<Gson> gsonProvider) {
    return new SignInViewModel_Factory(authenticationRepositoryProvider, gsonProvider);
  }

  public static SignInViewModel newInstance(Authenticationrepository authenticationRepository,
      Gson gson) {
    return new SignInViewModel(authenticationRepository, gson);
  }
}
