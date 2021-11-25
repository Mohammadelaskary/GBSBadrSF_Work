package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.signin.SigninFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilderModule_SigninFragment.SigninFragmentSubcomponent.class)
public abstract class ActivityBuilderModule_SigninFragment {
  private ActivityBuilderModule_SigninFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SigninFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SigninFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SigninFragmentSubcomponent extends AndroidInjector<SigninFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SigninFragment> {}
  }
}
