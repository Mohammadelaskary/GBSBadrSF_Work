package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Quality.manfacturing.RandomQualityInception.RandomQualityInceptionFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeRandomQualityInceptionFragment
          .RandomQualityInceptionFragmentSubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeRandomQualityInceptionFragment {
  private ActivityBuilderModule_ContributeRandomQualityInceptionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(RandomQualityInceptionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RandomQualityInceptionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface RandomQualityInceptionFragmentSubcomponent
      extends AndroidInjector<RandomQualityInceptionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RandomQualityInceptionFragment> {}
  }
}
