package com.example.gbsbadrsf.Util;

import androidx.multidex.MultiDex;

import com.example.gbsbadrsf.di.component.DaggerApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class MyApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerApplicationComponent.builder().Application(this).build();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }


}
