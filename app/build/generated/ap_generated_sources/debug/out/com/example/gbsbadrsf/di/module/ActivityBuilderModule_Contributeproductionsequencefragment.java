package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.productionsequence.ProductionSequence;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_Contributeproductionsequencefragment.ProductionSequenceSubcomponent
          .class
)
public abstract class ActivityBuilderModule_Contributeproductionsequencefragment {
  private ActivityBuilderModule_Contributeproductionsequencefragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProductionSequence.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProductionSequenceSubcomponent.Factory builder);

  @Subcomponent
  public interface ProductionSequenceSubcomponent extends AndroidInjector<ProductionSequence> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProductionSequence> {}
  }
}
