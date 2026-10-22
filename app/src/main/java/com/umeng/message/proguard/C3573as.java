package com.umeng.message.proguard;

import android.app.Activity;
import android.content.Context;
import android.view.WindowManager;
import com.umeng.message.common.UPLog;

/* renamed from: com.umeng.message.proguard.as */
/* loaded from: classes3.dex */
public final class C3573as {

    /* renamed from: a */
    public C3571aq f15975a;

    /* renamed from: a */
    public final boolean m15345a() {
        C3571aq c3571aq = this.f15975a;
        if (c3571aq == null) {
            return false;
        }
        return c3571aq.f15965b.isShown();
    }

    /* renamed from: a */
    public final void m15344a(Activity activity) {
        if (activity == null || activity.isFinishing() || !m15345a()) {
            return;
        }
        final C3574at c3574at = this.f15975a.f15965b;
        final WindowManager m15343a = m15343a((Context) activity);
        activity.runOnUiThread(new Runnable() { // from class: com.umeng.message.proguard.as.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    m15343a.removeViewImmediate(c3574at);
                } catch (Throwable th) {
                    UPLog.m15197e("Pop", "dismiss", th);
                }
            }
        });
        this.f15975a = null;
    }

    /* renamed from: a */
    static WindowManager m15343a(Context context) {
        return (WindowManager) context.getSystemService("window");
    }
}
