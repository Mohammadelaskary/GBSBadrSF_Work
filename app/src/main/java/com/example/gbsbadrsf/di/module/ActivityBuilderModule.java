package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Manfacturing.machinesignoff.ProductionSignoffFragment;
import com.example.gbsbadrsf.machineloading.MachineLoadingFragment;
import com.example.gbsbadrsf.productionsequence.ProductionSequence;
import com.example.gbsbadrsf.signin.SigninFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract ProductionSequence contributeproductionsequencefragment();
    @ContributesAndroidInjector
    abstract SigninFragment signinFragment();
    @ContributesAndroidInjector
    abstract MachineLoadingFragment machineLoadingFragment();
    @ContributesAndroidInjector
    abstract ProductionSignoffFragment productionSignoffFragment();

}
