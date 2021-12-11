package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Production.ProductionDefectRepairFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeProductionDefectRepairFragment
          .ProductionDefectRepairFragmentSubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeProductionDefectRepairFragment {
  private ActivityBuilderModule_ContributeProductionDefectRepairFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProductionDefectRepairFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProductionDefectRepairFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProductionDefectRepairFragmentSubcomponent
      extends AndroidInjector<ProductionDefectRepairFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProductionDefectRepairFragment> {}
  }
}
