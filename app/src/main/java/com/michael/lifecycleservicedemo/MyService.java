package com.michael.lifecycleservicedemo;

import android.arch.lifecycle.LifecycleService;

public class MyService extends LifecycleService
{
    private MyServiceObserver myServiceObserver;

    public MyService()
    {
        myServiceObserver = new MyServiceObserver();
        getLifecycle().addObserver(myServiceObserver);//添加观察者
    }
}
