package com.umeng.commonsdk.internal;

import android.content.Context;

/* renamed from: com.umeng.commonsdk.internal.b */
/* loaded from: classes3.dex */
public class C3453b {

    /* renamed from: b */
    private static C3453b f15287b;

    /* renamed from: a */
    private Context f15288a;

    /* renamed from: c */
    private C3454c f15289c;

    private C3453b(Context context) {
        this.f15288a = context;
        this.f15289c = new C3454c(context);
    }

    /* renamed from: a */
    public static synchronized C3453b m14605a(Context context) {
        C3453b c3453b;
        synchronized (C3453b.class) {
            if (f15287b == null) {
                f15287b = new C3453b(context.getApplicationContext());
            }
            c3453b = f15287b;
        }
        return c3453b;
    }

    /* renamed from: a */
    public C3454c m14606a() {
        return this.f15289c;
    }
}
