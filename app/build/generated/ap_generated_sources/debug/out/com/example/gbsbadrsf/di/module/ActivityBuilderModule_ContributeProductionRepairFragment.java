package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Production.ProductionRepairFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeProductionRepairFragment.ProductionRepairFragmentSubcomponent
          .class
)
public abstract class ActivityBuilderModule_ContributeProductionRepairFragment {
  private ActivityBuilderModule_ContributeProductionRepairFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProductionRepairFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProductionRepairFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProductionRepairFragmentSubcomponent
      extends AndroidInjector<ProductionRepairFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProductionRepairFragment> {}
  }
}
