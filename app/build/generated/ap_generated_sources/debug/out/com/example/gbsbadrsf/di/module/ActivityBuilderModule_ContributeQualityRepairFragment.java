package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Quality.manfacturing.QualityRepair.QualityRepairFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeQualityRepairFragment.QualityRepairFragmentSubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeQualityRepairFragment {
  private ActivityBuilderModule_ContributeQualityRepairFragment() {}

  @Binds
  @IntoMap
  @ClassKey(QualityRepairFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      QualityRepairFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface QualityRepairFragmentSubcomponent
      extends AndroidInjector<QualityRepairFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<QualityRepairFragment> {}
  }
}
