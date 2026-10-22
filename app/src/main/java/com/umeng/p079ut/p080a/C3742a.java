package com.umeng.p079ut.p080a;

import android.content.Context;

/* renamed from: com.umeng.ut.a.a */
/* loaded from: classes3.dex */
public class C3742a {

    /* renamed from: a */
    private static final C3742a f16776a = new C3742a();

    /* renamed from: a */
    private Context f16778a = null;

    /* renamed from: a */
    private long f16777a = 0;

    private C3742a() {
    }

    /* renamed from: a */
    public static C3742a m15925a() {
        return f16776a;
    }

    /* renamed from: a */
    public synchronized void m15930a(Context context) {
        if (this.f16778a == null) {
            if (context == null) {
                return;
            }
            if (context.getApplicationContext() != null) {
                this.f16778a = context.getApplicationContext();
            } else {
                this.f16778a = context;
            }
        }
    }

    /* renamed from: a */
    public Context m15927a() {
        return this.f16778a;
    }

    /* renamed from: a */
    public void m15929a(long j10) {
        this.f16777a = j10 - System.currentTimeMillis();
    }

    /* renamed from: a */
    public long m15926a() {
        return System.currentTimeMillis() + this.f16777a;
    }

    /* renamed from: a */
    public String m15928a() {
        return "" + m15926a();
    }
}
