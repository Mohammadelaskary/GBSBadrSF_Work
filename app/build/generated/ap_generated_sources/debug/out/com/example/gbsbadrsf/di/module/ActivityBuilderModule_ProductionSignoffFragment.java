package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Manfacturing.machinesignoff.ProductionSignoffFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ProductionSignoffFragment.ProductionSignoffFragmentSubcomponent.class
)
public abstract class ActivityBuilderModule_ProductionSignoffFragment {
  private ActivityBuilderModule_ProductionSignoffFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProductionSignoffFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProductionSignoffFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProductionSignoffFragmentSubcomponent
      extends AndroidInjector<ProductionSignoffFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProductionSignoffFragment> {}
  }
}
