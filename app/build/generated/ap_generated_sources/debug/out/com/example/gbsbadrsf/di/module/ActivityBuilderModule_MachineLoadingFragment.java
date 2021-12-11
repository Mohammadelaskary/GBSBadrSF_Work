package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.machineloading.MachineLoadingFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBuilderModule_MachineLoadingFragment.MachineLoadingFragmentSubcomponent.class
)
public abstract class ActivityBuilderModule_MachineLoadingFragment {
  private ActivityBuilderModule_MachineLoadingFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MachineLoadingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MachineLoadingFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MachineLoadingFragmentSubcomponent
      extends AndroidInjector<MachineLoadingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MachineLoadingFragment> {}
  }
}
