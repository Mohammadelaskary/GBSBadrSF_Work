// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.productionsequence;

import com.example.gbsbadrsf.Util.ViewModelProviderFactory;
import com.google.gson.Gson;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProductionSequence_MembersInjector implements MembersInjector<ProductionSequence> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProviderFactory> providerProvider;

  private final Provider<Gson> gsonProvider;

  public ProductionSequence_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProviderFactory> providerProvider, Provider<Gson> gsonProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.providerProvider = providerProvider;
    this.gsonProvider = gsonProvider;
  }

  public static MembersInjector<ProductionSequence> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProviderFactory> providerProvider, Provider<Gson> gsonProvider) {
    return new ProductionSequence_MembersInjector(androidInjectorProvider, providerProvider, gsonProvider);
  }

  @Override
  public void injectMembers(ProductionSequence instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectProvider(instance, providerProvider.get());
    injectGson(instance, gsonProvider.get());
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.productionsequence.ProductionSequence.provider")
  public static void injectProvider(ProductionSequence instance,
      ViewModelProviderFactory provider) {
    instance.provider = provider;
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.productionsequence.ProductionSequence.gson")
  public static void injectGson(ProductionSequence instance, Gson gson) {
    instance.gson = gson;
  }
}
