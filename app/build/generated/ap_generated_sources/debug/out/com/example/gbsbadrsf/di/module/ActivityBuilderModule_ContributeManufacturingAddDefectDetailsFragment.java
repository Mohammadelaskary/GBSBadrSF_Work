package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects.ManufacturingAddDefectDetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeManufacturingAddDefectDetailsFragment
          .ManufacturingAddDefectDetailsFragmentSubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeManufacturingAddDefectDetailsFragment {
  private ActivityBuilderModule_ContributeManufacturingAddDefectDetailsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ManufacturingAddDefectDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ManufacturingAddDefectDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ManufacturingAddDefectDetailsFragmentSubcomponent
      extends AndroidInjector<ManufacturingAddDefectDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ManufacturingAddDefectDetailsFragment> {}
  }
}
