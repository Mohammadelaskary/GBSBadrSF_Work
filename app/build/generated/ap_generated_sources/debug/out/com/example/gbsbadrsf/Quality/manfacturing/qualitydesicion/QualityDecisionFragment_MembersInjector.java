// Generated by Dagger (https://dagger.dev).
package com.example.gbsbadrsf.Quality.manfacturing.qualitydesicion;

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
public final class QualityDecisionFragment_MembersInjector implements MembersInjector<QualityDecisionFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProviderFactory> providerProvider;

  public QualityDecisionFragment_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProviderFactory> providerProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.providerProvider = providerProvider;
  }

  public static MembersInjector<QualityDecisionFragment> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProviderFactory> providerProvider) {
    return new QualityDecisionFragment_MembersInjector(androidInjectorProvider, providerProvider);
  }

  @Override
  public void injectMembers(QualityDecisionFragment instance) {
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectProvider(instance, providerProvider.get());
  }

  @InjectedFieldSignature("com.example.gbsbadrsf.Quality.manfacturing.qualitydesicion.QualityDecisionFragment.provider")
  public static void injectProvider(QualityDecisionFragment instance,
      ViewModelProviderFactory provider) {
    instance.provider = provider;
  }
}