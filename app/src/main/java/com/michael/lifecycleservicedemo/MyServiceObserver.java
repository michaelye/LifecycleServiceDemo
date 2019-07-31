package com.michael.lifecycleservicedemo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.util.Log;

public class MyServiceObserver implements LifecycleObserver
{
    private String TAG = this.getClass().getName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void startGetLocation()
    {
        Log.d(TAG, "startGetLocation()");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void stopGetLocation()
    {
        Log.d(TAG, "stopGetLocation()");
    }
}
