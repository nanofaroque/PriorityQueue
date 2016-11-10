package com.activebuilding.residents.mypriorityjobqueue;

import android.app.Application;

import com.activebuilding.residents.mypriorityjobqueue.job.AppJobManager;
import com.birbit.android.jobqueue.JobManager;

/**
 * Created by omarfaroque on 11/10/16.
 */

public class MyApplication extends Application {
    private static MyApplication instance;
    private JobManager jobManager;

    public MyApplication() {
        instance = this;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        getJobManager();
    }

    public  void getJobManager() {
            AppJobManager.getJobManager(this);
    }

    public static MyApplication getInstance() {
        return instance;
    }

}
