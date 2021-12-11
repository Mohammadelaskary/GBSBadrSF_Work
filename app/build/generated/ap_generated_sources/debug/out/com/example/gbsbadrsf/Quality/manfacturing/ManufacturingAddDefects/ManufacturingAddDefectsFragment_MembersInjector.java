// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects;

import com.example.gbsbadrsf.Util.ViewModelProviderFactory;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ManufacturingAddDefectsFragment_MembersInjector implements MembersInjector<ManufacturingAddDefectsFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProviderFactory> providerProvider;

  public ManufacturingAddDefectsFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProviderFactory> providerProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.providerProvider = providerProvider;
  }

  public static MembersInjector<ManufacturingAddDefectsFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProviderFactory> providerProvider) {
    return new ManufacturingAddDefectsFragment_MembersInjector(androidInjectorProvider, providerProvider);
  }

  @Override
  public void injectMembers(ManufacturingAddDefectsFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectProvider(instance, providerProvider.get());
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects.ManufacturingAddDefectsFragment.provider")
  public static void injectProvider(ManufacturingAddDefectsFragment instance,
      ViewModelProviderFactory provider) {
    instance.provider = provider;
  }
}