package com.example.gbsbadrsf.di.module;

import com.example.gbsbadrsf.Manfacturing.machinesignoff.ProductionSignoffFragment;
import com.example.gbsbadrsf.Production.ProductionDefectRepairFragment;
import com.example.gbsbadrsf.Production.ProductionRepairFragment;
import com.example.gbsbadrsf.ProductionRejectionFragment;
import com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects.ManufacturingAddDefectDetailsFragment;
import com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects.ManufacturingAddDefectsFragment;
import com.example.gbsbadrsf.Quality.manfacturing.ManufacturingQualityOperationFragment;
import com.example.gbsbadrsf.Quality.manfacturing.RandomQualityInception.RandomQualityInceptionFragment;
import com.example.gbsbadrsf.Quality.manfacturing.qualityrepair.QualityDefectRepairFragment;
import com.example.gbsbadrsf.Quality.manfacturing.qualityrepair.QualityRepairFragment;
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
    @ContributesAndroidInjector
    abstract ManufacturingQualityOperationFragment contributeQualityManufacturingOperationFragment();
    @ContributesAndroidInjector
    abstract ManufacturingAddDefectsFragment contributeManufacturingAddDefectsFragment();
    @ContributesAndroidInjector
    abstract ManufacturingAddDefectDetailsFragment contributeManufacturingAddDefectDetailsFragment();
    @ContributesAndroidInjector
    abstract ProductionDefectRepairFragment contributeProductionDefectRepairFragment();
    @ContributesAndroidInjector
    abstract ProductionRepairFragment contributeProductionRepairFragment();
    @ContributesAndroidInjector
    abstract QualityDefectRepairFragment contributeQualityDefectRepairFragment();
    @ContributesAndroidInjector
    abstract QualityRepairFragment contributeQualityRepairFragment();
    @ContributesAndroidInjector
    abstract RandomQualityInceptionFragment contributeRandomQualityInceptionFragment();
    @ContributesAndroidInjector
    abstract ProductionRejectionFragment contributeProductionRejectionFragment();

}
