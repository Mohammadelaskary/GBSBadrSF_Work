// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.di.module;

import android.app.Application;
import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_ProvideContextFactory implements Factory<Context> {
  private final ApplicationModule module;

  private final Provider<Application> applicationProvider;

  public ApplicationModule_ProvideContextFactory(ApplicationModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return provideContext(module, applicationProvider.get());
  }

  public static ApplicationModule_ProvideContextFactory create(ApplicationModule module,
      Provider<Application> applicationProvider) {
    return new ApplicationModule_ProvideContextFactory(module, applicationProvider);
  }

  public static Context provideContext(ApplicationModule instance, Application application) {
    return Preconditions.checkNotNull(instance.provideContext(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}