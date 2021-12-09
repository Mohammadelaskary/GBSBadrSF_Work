package com.example.gbsbadrsf.Quality.Data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.gbsbadrsf.Model.ApiResponseDefectsManufacturing;
import com.example.gbsbadrsf.Model.ApiResponseDepartmentsList;
import com.example.gbsbadrsf.Model.ApiResponseGetBasketInfo;
import com.example.gbsbadrsf.Production.Data.ApiResponseSaveRejectionRequest;
import com.example.gbsbadrsf.data.response.ResponseStatus;
import com.example.gbsbadrsf.data.response.Status;
import com.example.gbsbadrsf.repository.ApiInterface;
import com.google.gson.Gson;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class QualityDecisionViewModel extends ViewModel {
    MutableLiveData<ApiResponseDefectsManufacturing> defectsManufacturingListLiveData;
    MutableLiveData<Status> defectsManufacturingListStatus;
    MutableLiveData<ApiResponseGettingFinalQualityDecision> apiResponseGettingFinalQualityDecisionMutableLiveData;
    MutableLiveData<Status> apiResponseGettingFinalQualityDecisionStatus;
    MutableLiveData<ApiResponseSavingOperationSignOffDecision> saveQualityOperationSignOffLiveData;
    MutableLiveData<Status> saveQualityOperationSignOffStatus;

    @Inject
    ApiInterface apiInterface;
    private final CompositeDisposable disposable;


    @Inject
    Gson gson;
    @Inject
    public QualityDecisionViewModel(Gson gson) {
        this.gson = gson;
        disposable = new CompositeDisposable();
        defectsManufacturingListLiveData = new MutableLiveData<>();
        defectsManufacturingListStatus = new MutableLiveData<>();
        apiResponseGettingFinalQualityDecisionMutableLiveData = new MutableLiveData<>();
        apiResponseGettingFinalQualityDecisionStatus = new MutableLiveData<>();
        saveQualityOperationSignOffLiveData = new MutableLiveData<>();
        saveQualityOperationSignOffStatus = new MutableLiveData<>();
    }

    public void getQualityOperationByBasketCode(int userId,String deviceSerialNumber,String basketCode){
        disposable.add(apiInterface.getQualityOperationByBasketCode(userId,deviceSerialNumber,basketCode)
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
    public void getFinalQualityDecision(int userId){
        disposable.add(apiInterface.getFinalQualityDecision(userId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe( __ -> apiResponseGettingFinalQualityDecisionStatus.postValue(Status.LOADING))
                .subscribe(
                        response -> {apiResponseGettingFinalQualityDecisionMutableLiveData.postValue(response);
                            apiResponseGettingFinalQualityDecisionStatus.postValue(Status.SUCCESS); },
                        throwable -> {
                            apiResponseGettingFinalQualityDecisionStatus.postValue(Status.ERROR);
                        }
                ));
    }

    public void saveQualityOperationSignOff(int userId,String deviceSerialNumber,String date,int finalQualityDecisionId){
        disposable.add(apiInterface.saveQualityOperationSignOff(userId,deviceSerialNumber,date,finalQualityDecisionId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe( __ -> saveQualityOperationSignOffStatus.postValue(Status.LOADING))
                .subscribe(
                        response -> {saveQualityOperationSignOffLiveData.postValue(response);
                            saveQualityOperationSignOffStatus.postValue(Status.SUCCESS); },
                        throwable -> {
                            saveQualityOperationSignOffStatus.postValue(Status.ERROR);
                        }
                ));
    }

    public MutableLiveData<ApiResponseDefectsManufacturing> getDefectsManufacturingListLiveData() {
        return defectsManufacturingListLiveData;
    }

    public MutableLiveData<Status> getDefectsManufacturingListStatus() {
        return defectsManufacturingListStatus;
    }

    public MutableLiveData<ApiResponseGettingFinalQualityDecision> getApiResponseGettingFinalQualityDecisionMutableLiveData() {
        return apiResponseGettingFinalQualityDecisionMutableLiveData;
    }

    public MutableLiveData<Status> getApiResponseGettingFinalQualityDecisionStatus() {
        return apiResponseGettingFinalQualityDecisionStatus;
    }

    public MutableLiveData<ApiResponseSavingOperationSignOffDecision> getSaveQualityOperationSignOffLiveData() {
        return saveQualityOperationSignOffLiveData;
    }

    public MutableLiveData<Status> getSaveQualityOperationSignOffStatus() {
        return saveQualityOperationSignOffStatus;
    }
}
