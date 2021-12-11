package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.ProductionRejectionFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_ContributeProductionRejectionFragment
          .ProductionRejectionFragmentSubcomponent.class
)
public abstract class ActivityBuilderModule_ContributeProductionRejectionFragment {
  private ActivityBuilderModule_ContributeProductionRejectionFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProductionRejectionFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProductionRejectionFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProductionRejectionFragmentSubcomponent
      extends AndroidInjector<ProductionRejectionFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProductionRejectionFragment> {}
  }
}
