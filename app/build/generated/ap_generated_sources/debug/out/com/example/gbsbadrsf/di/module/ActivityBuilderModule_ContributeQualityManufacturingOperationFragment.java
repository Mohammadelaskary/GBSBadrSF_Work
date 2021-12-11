package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Quality.manfacturing.ManufacturingQualityOperationFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeQualityManufacturingOperationFragment
          .ManufacturingQualityOperationFragmentSubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeQualityManufacturingOperationFragment {
  private ActivityBuilderModule_ContributeQualityManufacturingOperationFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ManufacturingQualityOperationFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ManufacturingQualityOperationFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ManufacturingQualityOperationFragmentSubcomponent
      extends AndroidInjector<ManufacturingQualityOperationFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ManufacturingQualityOperationFragment> {}
  }
}
