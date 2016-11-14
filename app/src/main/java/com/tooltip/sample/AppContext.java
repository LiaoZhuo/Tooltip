package com.tooltip.sample;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by liaoz on 2016/11/14 0014.
 */

public class AppContext extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }
}
