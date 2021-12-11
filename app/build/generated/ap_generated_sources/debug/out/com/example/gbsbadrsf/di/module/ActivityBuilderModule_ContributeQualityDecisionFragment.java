package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Quality.manfacturing.qualitydesicion.QualityDecisionFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeQualityDecisionFragment.QualityDecisionFragmentSubcomponent
          .class
)
public abstract class ActivityBuilderModule_ContributeQualityDecisionFragment {
  private ActivityBuilderModule_ContributeQualityDecisionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(QualityDecisionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      QualityDecisionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface QualityDecisionFragmentSubcomponent
      extends AndroidInjector<QualityDecisionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<QualityDecisionFragment> {}
  }
}
