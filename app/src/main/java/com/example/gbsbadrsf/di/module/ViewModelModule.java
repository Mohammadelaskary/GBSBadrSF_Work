package com.example.gbsbadrsf.di.module;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.gbsbadrsf.Manfacturing.machinesignoff.MachinesignoffViewModel;
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
}
