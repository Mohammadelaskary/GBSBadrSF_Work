// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.repository.ApiInterface;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvidesAPiInterfaceFactory implements Factory<ApiInterface> {
  private final Provider<Retrofit> retrofitProvider;

  public RetrofitModule_ProvidesAPiInterfaceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiInterface get() {
    return providesAPiInterface(retrofitProvider.get());
  }

  public static RetrofitModule_ProvidesAPiInterfaceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new RetrofitModule_ProvidesAPiInterfaceFactory(retrofitProvider);
  }

  public static ApiInterface providesAPiInterface(Retrofit retrofit) {
    return Preconditions.checkNotNull(RetrofitModule.providesAPiInterface(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
