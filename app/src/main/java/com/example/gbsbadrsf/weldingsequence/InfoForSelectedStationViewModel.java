package com.example.gbsbadrsf.weldingsequence;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.gbsbadrsf.data.response.APIResponseLoadingsequenceinfo;
import com.example.gbsbadrsf.data.response.Apigetinfoforselectedstation;
import com.example.gbsbadrsf.data.response.LoadingSequenceInfo;
import com.example.gbsbadrsf.data.response.StationLoading;
import com.example.gbsbadrsf.data.response.Status;
import com.example.gbsbadrsf.productionsequence.Loadingstatus;
import com.example.gbsbadrsf.repository.ApiInterface;
import com.example.gbsbadrsf.repository.Productionsequencerepository;
import com.google.gson.Gson;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.schedulers.Schedulers;

public class InfoForSelectedStationViewModel extends ViewModel {
    Gson gson;
    @Inject
    ApiInterface apiinterface;
    private MutableLiveData<StationLoading> responseLiveData ;
    private MutableLiveData<Status> status;
    private MutableLiveData<Staustype> statustype;

    private CompositeDisposable disposable = new CompositeDisposable();

    @Inject
    public InfoForSelectedStationViewModel( Gson gson) {
        this.gson = gson;
        responseLiveData = new MutableLiveData<>();
        status = new MutableLiveData<>(Status.IDLE);
        statustype = new MutableLiveData<>(Staustype.global);

    }
    void getselectedweldingsequence(String UserID,String DeviceSerialNo,String ProductionStationEnName){
        disposable.add(apiinterface.getinfoforselectedstation(UserID,DeviceSerialNo,ProductionStationEnName).doOnSubscribe(__ -> status.postValue(Status.LOADING)).subscribe(new BiConsumer<Apigetinfoforselectedstation<StationLoading>, Throwable>() {
            @Override
            public void accept(Apigetinfoforselectedstation<StationLoading>getinfoforselectedstationloading, Throwable throwable) throws Exception {
                if (getinfoforselectedstationloading.getResponseStatus().getStatusMessage().equals("Getting data successfully"))
                {
                    statustype.postValue(Staustype.gettingdatasuccesfully);


                }
                else if (getinfoforselectedstationloading.getResponseStatus().getStatusMessage().equals("There is no loading quantity on the machine!")){
                    statustype.postValue(Staustype.noloadingquantityformachine);

                }


            }
        }));



    }
    public MutableLiveData<StationLoading> getResponseLiveData() {
        return responseLiveData;
    }

    public MutableLiveData<Status> getStatus() {
        return status;
    }
    public MutableLiveData<Staustype> getstaustype() {
        return statustype;
    }



}
