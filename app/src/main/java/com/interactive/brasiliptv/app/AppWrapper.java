package com.interactive.brasiliptv.app;

import android.app.Application;
import android.util.Log;

/**
 * Stub AppWrapper - original class excluded due to decompiler artifacts.
 * The original extends AbstractApplicationC7689d which initializes various SDKs.
 * This stub allows the app to launch without crashing on ClassNotFoundException.
 */
public final class AppWrapper extends Application {

    private static final String TAG = "AppWrapper";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "AppWrapper stub onCreate");
    }
}
