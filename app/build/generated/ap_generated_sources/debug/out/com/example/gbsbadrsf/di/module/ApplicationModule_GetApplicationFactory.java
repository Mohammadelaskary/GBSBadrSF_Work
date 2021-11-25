// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Util.MyApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplicationModule_GetApplicationFactory implements Factory<MyApplication> {
  private final ApplicationModule module;

  public ApplicationModule_GetApplicationFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public MyApplication get() {
    return getApplication(module);
  }

  public static ApplicationModule_GetApplicationFactory create(ApplicationModule module) {
    return new ApplicationModule_GetApplicationFactory(module);
  }

  public static MyApplication getApplication(ApplicationModule instance) {
    return Preconditions.checkNotNull(instance.getApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
