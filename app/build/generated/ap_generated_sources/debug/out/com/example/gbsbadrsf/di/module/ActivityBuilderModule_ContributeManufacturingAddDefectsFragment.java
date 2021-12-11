package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects.ManufacturingAddDefectsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeManufacturingAddDefectsFragment
          .ManufacturingAddDefectsFragmentSubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeManufacturingAddDefectsFragment {
  private ActivityBuilderModule_ContributeManufacturingAddDefectsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ManufacturingAddDefectsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ManufacturingAddDefectsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ManufacturingAddDefectsFragmentSubcomponent
      extends AndroidInjector<ManufacturingAddDefectsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ManufacturingAddDefectsFragment> {}
  }
}
