package com.example.gbsbadrsf.di.module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.gbsbadrsf.Manfacturing.machineloading.ContinueLoadingViewModel;
import com.example.gbsbadrsf.Manfacturing.machinesignoff.MachinesignoffViewModel;
import com.example.gbsbadrsf.Production.Data.ProductionDefectRepairViewModel;
import com.example.gbsbadrsf.Production.Data.ProductionRepairViewModel;
import com.example.gbsbadrsf.Quality.Data.ManufacturingAddDefectsDetailsViewModel;
import com.example.gbsbadrsf.Quality.Data.ManufacturingAddDefectsViewModel;
import com.example.gbsbadrsf.Quality.Data.ManufacturingQualityOperationViewModel;
import com.example.gbsbadrsf.Quality.Data.QualityDefectRepairViewModel;
import com.example.gbsbadrsf.Quality.Data.RandomQualityInceptionViewModel;
import com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects.QualityRepairViewModel;
import com.example.gbsbadrsf.Util.ViewModelProviderFactory;
import com.example.gbsbadrsf.di.ViewModelKey;
import com.example.gbsbadrsf.machineloading.MachineloadingViewModel;
import com.example.gbsbadrsf.machinewip.MachinewipViewModel;
import com.example.gbsbadrsf.productionsequence.ProductionsequenceViewModel;
import com.example.gbsbadrsf.productionsequence.SelectedLoadinsequenceinfoViewModel;
import com.example.gbsbadrsf.signin.SignInViewModel;
import com.example.gbsbadrsf.welding.machineloadingwe.SaveweldingViewModel;
import com.example.gbsbadrsf.welding.weldingsignoff.SignoffweViewModel;
import com.example.gbsbadrsf.welding.weldingwip.WeldingvieModel;
import com.example.gbsbadrsf.weldingsequence.InfoForSelectedStationViewModel;
import com.example.gbsbadrsf.weldingsequence.WeldingsequenceViewModel;

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
    @ViewModelKey(ContinueLoadingViewModel.class)
    public abstract ViewModel bindcontinueloadingViewmodel (ContinueLoadingViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(WeldingsequenceViewModel.class)
    public abstract ViewModel bindweldingsequenceViewmodel (WeldingsequenceViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(InfoForSelectedStationViewModel.class)
    public abstract ViewModel bindinfoforselectedstationviewmodel (InfoForSelectedStationViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(SaveweldingViewModel.class)
    public abstract ViewModel bindsaveweldingviewmodel (SaveweldingViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(MachinewipViewModel.class)
    public abstract ViewModel bindmachinewipviewmodel (MachinewipViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(SignoffweViewModel.class)
    public abstract ViewModel bindsignoffviewmodel (SignoffweViewModel viewModel);
    @Binds
    @IntoMap
    @ViewModelKey(WeldingvieModel.class)
    public abstract ViewModel bindweldingwipviewmodel (WeldingvieModel viewModel);



}
