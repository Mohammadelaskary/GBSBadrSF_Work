package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Quality.manfacturing.QualityRepair.QualityDefectRepairFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeQualityDefectRepairFragment
          .QualityDefectRepairFragmentSubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeQualityDefectRepairFragment {
  private ActivityBuilderModule_ContributeQualityDefectRepairFragment() {}

  @Binds
  @IntoMap
  @ClassKey(QualityDefectRepairFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      QualityDefectRepairFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface QualityDefectRepairFragmentSubcomponent
      extends AndroidInjector<QualityDefectRepairFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<QualityDefectRepairFragment> {}
  }
}
