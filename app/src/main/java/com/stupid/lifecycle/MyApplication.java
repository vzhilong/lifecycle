package com.stupid.lifecycle;

import android.app.Application;
import android.util.Log;

/**
 * Created by vincent on 16/5/5.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("vincent", String.format("=== %s onCreate", this.getClass().getSimpleName()));
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d("vincent", String.format("=== %s onTerminate", this.getClass().getSimpleName()));
    }
}
