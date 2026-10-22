package com.bytedance.boost_multidex;

import android.app.Application;
import android.content.Context;

/* loaded from: classes.dex */
public class BoostMultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (BoostMultiDex.isOptimizeProcess(Utility.getCurProcessName(context))) {
            BoostMultiDex.install(context);
        }
    }
}
