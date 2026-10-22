package com.umeng.analytics.pro;

import com.umeng.analytics.AnalyticsConfig;
import java.lang.Thread;

/* renamed from: com.umeng.analytics.pro.r */
/* loaded from: classes3.dex */
public class C3396r implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f14894a;

    /* renamed from: b */
    private InterfaceC3400v f14895b;

    public C3396r() {
        if (Thread.getDefaultUncaughtExceptionHandler() == this) {
            return;
        }
        this.f14894a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    public void m14391a(InterfaceC3400v interfaceC3400v) {
        this.f14895b = interfaceC3400v;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m14390a(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14894a;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != Thread.getDefaultUncaughtExceptionHandler()) {
            this.f14894a.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    private void m14390a(Throwable th) {
        if (AnalyticsConfig.CATCH_EXCEPTION) {
            this.f14895b.mo13653a(th);
        } else {
            this.f14895b.mo13653a(null);
        }
    }
}
