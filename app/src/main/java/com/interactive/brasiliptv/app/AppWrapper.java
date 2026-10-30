package com.interactive.brasiliptv.app;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * AppWrapper - Application class.
 * Registers an activity lifecycle callback to redirect stub activities
 * to their real decompiled counterparts in pNNNui packages.
 */
public final class AppWrapper extends Application {
    private static final String TAG = "AppWrapper";

    // Maps stub package -> real jadx package
    private static final String[][] PKG_MAP = {
        {"com.main.ui.activity.",   "com.main.p067ui.activity."},
        {"com.live.ui.activity.",   "com.live.p064ui.activity."},
        {"com.login.ui.activity.",  "com.login.p065ui.activity."},
        {"com.mine.ui.activity.",   "com.mine.p068ui.activity."},
        {"com.module.ui.activity.", "com.module.p070ui.activity."},
        {"com.vod.ui.activity.",    "com.vod.p089ui.activity."},
        {"com.interactive.brasiliptv.ui.activity.", "com.interactive.brasiliptv.p061ui.activity."},
    };

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "AppWrapper onCreate - registering activity redirect");

        registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                String stubClass = activity.getClass().getName();
                // Check if this is one of our stubs (simple Activity with no real logic)
                if (activity.getClass().getSuperclass() == Activity.class) {
                    for (String[] map : PKG_MAP) {
                        if (stubClass.startsWith(map[0])) {
                            String realClass = stubClass.replace(map[0], map[1]);
                            try {
                                Class<?> real = Class.forName(realClass);
                                Log.d(TAG, "Redirecting " + stubClass + " -> " + realClass);
                                Intent intent = new Intent(activity, real);
                                if (savedInstanceState != null) {
                                    intent.putExtras(savedInstanceState);
                                }
                                activity.startActivity(intent);
                                activity.finish();
                                return;
                            } catch (ClassNotFoundException e) {
                                // Real class not available, keep stub
                                Log.w(TAG, "Real class not found: " + realClass);
                            }
                        }
                    }
                }
            }
            @Override public void onActivityStarted(Activity a) {}
            @Override public void onActivityResumed(Activity a) {}
            @Override public void onActivityPaused(Activity a) {}
            @Override public void onActivityStopped(Activity a) {}
            @Override public void onActivitySaveInstanceState(Activity a, Bundle b) {}
            @Override public void onActivityDestroyed(Activity a) {}
        });
    }
}
