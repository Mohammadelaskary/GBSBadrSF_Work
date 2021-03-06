package com.example.gbsbadrsf.Quality.manfacturing.ManufacturingAddDefects;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.gbsbadrsf.Model.ApiResponseDefectsManufacturing;
import com.example.gbsbadrsf.Model.ApiResponseLastMoveManufacturingBasket;
import com.example.gbsbadrsf.data.response.ResponseStatus;
import com.example.gbsbadrsf.data.response.Status;
import com.example.gbsbadrsf.repository.ApiInterface;
import com.google.gson.Gson;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class QualityRepairViewModel extends ViewModel {
    @Inject
    ApiInterface apiInterface;
    private final CompositeDisposable disposable;
    MutableLiveData<ApiResponseLastMoveManufacturingBasket> apiResponseBasketDataLiveData;
    MutableLiveData<Status> apiResponseBasketDataStatus;
    MutableLiveData<ApiResponseDefectsManufacturing> defectsManufacturingListLiveData;
    MutableLiveData<Status> defectsManufacturingListStatus;
    MutableLiveData<ResponseStatus> addManufacturingRepairQuality;
    MutableLiveData<Status> addManufacturingRepairQualityStatus;
    @Inject
    Gson gson;
    @Inject
    public QualityRepairViewModel(Gson gson) {
        this.gson = gson;
        disposable = new CompositeDisposable();
        apiResponseBasketDataLiveData = new MutableLiveData<>();
        apiResponseBasketDataStatus   = new MutableLiveData<>();
        defectsManufacturingListLiveData = new MutableLiveData<>();
        defectsManufacturingListStatus = new MutableLiveData<>();
        addManufacturingRepairQuality = new MutableLiveData<>();
        addManufacturingRepairQualityStatus = new MutableLiveData<>();
    }

    public void getBasketDataViewModel(String basketCode){
        disposable.add(apiInterface.getBasketData(basketCode)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe( __ -> apiResponseBasketDataStatus.postValue(Status.LOADING))
                .subscribe(
                        response -> {apiResponseBasketDataLiveData.postValue(response);
                            apiResponseBasketDataStatus.postValue(Status.SUCCESS); },
                        throwable -> {
                            apiResponseBasketDataStatus.postValue(Status.ERROR);
                        }
                ));
    }

    public void getDefectsManufacturingViewModel(String basketCode){
        disposable.add(apiInterface.getManufacturingDefectedQtyByBasketCode(basketCode)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe( __ -> defectsManufacturingListStatus.postValue(Status.LOADING))
                .subscribe(
                        response -> {defectsManufacturingListLiveData.postValue(response);
                            defectsManufacturingListStatus.postValue(Status.SUCCESS); },
                        throwable -> {
                            defectsManufacturingListStatus.postValue(Status.ERROR);
                        }
                ));
    }
    public void addManufacturingRepairQualityViewModel(
            int userId,
            String deviceSerialNumber,
            int defectsManufacturingDetailsId,
            String notes,
            int defectStatus,
            int qtyApproved
    ){
        disposable.add(apiInterface.addManufacturingRepair_Production(
                userId,
                deviceSerialNumber,
                defectsManufacturingDetailsId,
                notes,
                defectStatus,
                qtyApproved
        )
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe( __ -> addManufacturingRepairQualityStatus.postValue(Status.LOADING))
                .subscribe(
                        response -> {addManufacturingRepairQuality.postValue(response);
                            addManufacturingRepairQualityStatus.postValue(Status.SUCCESS); },
                        throwable -> {
                            addManufacturingRepairQualityStatus.postValue(Status.ERROR);
                        }
                ));
    }

    public MutableLiveData<ApiResponseLastMoveManufacturingBasket> getApiResponseBasketDataLiveData() {
        return apiResponseBasketDataLiveData;
    }

    public MutableLiveData<Status> getApiResponseBasketDataStatus() {
        return apiResponseBasketDataStatus;
    }

    public MutableLiveData<ApiResponseDefectsManufacturing> getDefectsManufacturingListLiveData() {
        return defectsManufacturingListLiveData;
    }

    public MutableLiveData<Status> getDefectsManufacturingListStatus() {
        return defectsManufacturingListStatus;
    }

    public MutableLiveData<Status> getAddManufacturingRepairQualityStatus() {
        return addManufacturingRepairQualityStatus;
    }

}
