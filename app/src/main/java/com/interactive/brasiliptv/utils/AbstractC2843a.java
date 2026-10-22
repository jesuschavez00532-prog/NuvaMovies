package com.interactive.brasiliptv.utils;

import android.app.Activity;
import android.view.Window;

/* renamed from: com.interactive.brasiliptv.utils.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2843a {
    /* renamed from: a */
    public static void m11410a(Activity activity) {
        Window window = activity.getWindow();
        window.getDecorView().setSystemUiVisibility(((window.getDecorView().getSystemUiVisibility() ^ 2) ^ 4) ^ 4096);
    }
}
