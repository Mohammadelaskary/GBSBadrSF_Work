package com.example.gbsbadrsf.di.module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.gbsbadrsf.Manfacturing.machinesignoff.MachinesignoffViewModel;
import com.example.gbsbadrsf.Production.Data.ProductionDefectRepairViewModel;
import com.example.gbsbadrsf.Production.Data.ProductionRejectionViewModel;
import com.example.gbsbadrsf.Production.Data.ProductionRepairViewModel;
import com.example.gbsbadrsf.Quality.Data.ManufacturingAddDefectsDetailsViewModel;
import com.example.gbsbadrsf.Quality.Data.ManufacturingAddDefectsViewModel;
import com.example.gbsbadrsf.Quality.Data.ManufacturingQualityOperationViewModel;
import com.example.gbsbadrsf.Quality.Data.QualityDecisionViewModel;
import com.example.gbsbadrsf.Quality.Data.QualityDefectRepairViewModel;
import com.example.gbsbadrsf.Quality.Data.RandomQualityInceptionViewModel;
import com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects.QualityRepairViewModel;
import com.example.gbsbadrsf.Quality.manfacturing.ProductionRejectionRequest.ProductionRejectionRequestsListQualityViewModel;
import com.example.gbsbadrsf.Util.ViewModelProviderFactory;
import com.example.gbsbadrsf.di.ViewModelKey;
import com.example.gbsbadrsf.machineloading.MachineloadingViewModel;
import com.example.gbsbadrsf.productionsequence.ProductionsequenceViewModel;
import com.example.gbsbadrsf.productionsequence.SelectedLoadinsequenceinfoViewModel;
import com.example.gbsbadrsf.signin.SignInViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelModule {
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);

    @Binds
    @IntoMap
    @ViewModelKey(ProductionsequenceViewModel.class)
    public abstract ViewModel bindProductionseqViewModel (ProductionsequenceViewModel productionsequenceViewModel);
    @Binds
    @IntoMap
    @ViewModelKey(SignInViewModel.class)
    public abstract ViewModel viewModel (SignInViewModel signInViewModel);
    @Binds
    @IntoMap
    @ViewModelKey(SelectedLoadinsequenceinfoViewModel.class)
    public abstract ViewModel selectedviemodel (SelectedLoadinsequenceinfoViewModel selectedLoadinsequenceinfoViewModel);
    @Binds
    @IntoMap
    @ViewModelKey(MachineloadingViewModel.class)
    public abstract ViewModel productionsequenceviewmodel (MachineloadingViewModel machineloadingViewModel );
    @Binds
    @IntoMap
    @ViewModelKey(MachinesignoffViewModel.class)
    public abstract ViewModel machinesignoffviemodel (MachinesignoffViewModel machinesignoffViewModel );

    @Binds
    @IntoMap
    @ViewModelKey(ManufacturingQualityOperationViewModel.class)
    public abstract ViewModel bindManufacturingQualityOperationViewModel (ManufacturingQualityOperationViewModel manfacturingViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ManufacturingAddDefectsViewModel.class)
    public abstract ViewModel bindManufacturingAddDefectsViewModel (ManufacturingAddDefectsViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ManufacturingAddDefectsDetailsViewModel.class)
    public abstract ViewModel bindManufacturingAddDefectsDetailsViewModel (ManufacturingAddDefectsDetailsViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ProductionRepairViewModel.class)
    public abstract ViewModel bindProductionRepairViewModel (ProductionRepairViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(ProductionDefectRepairViewModel.class)
    public abstract ViewModel bindProductionDefectRepairViewModel (ProductionDefectRepairViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(QualityRepairViewModel.class)
    public abstract ViewModel bindQualityRepairViewModel (QualityRepairViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(QualityDefectRepairViewModel.class)
    public abstract ViewModel bindQualityDefectRepairViewModel (QualityDefectRepairViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(RandomQualityInceptionViewModel.class)
    public abstract ViewModel bindRandomQualityInceptionViewModel (RandomQualityInceptionViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(ProductionRejectionViewModel.class)
    public abstract ViewModel bindProductionRejectionViewModel (ProductionRejectionViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(QualityDecisionViewModel.class)
    public abstract ViewModel bindQualityDecisionViewModel (QualityDecisionViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(ProductionRejectionRequestsListQualityViewModel.class)
    public abstract ViewModel bindQualityDecisionViewModel (ProductionRejectionRequestsListQualityViewModel viewModel);

}
