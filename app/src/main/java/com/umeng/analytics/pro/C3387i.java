package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.pro.i */
/* loaded from: classes3.dex */
class C3387i {

    /* renamed from: b */
    private static SQLiteOpenHelper f14702b;

    /* renamed from: d */
    private static Context f14703d;

    /* renamed from: a */
    private AtomicInteger f14704a;

    /* renamed from: c */
    private SQLiteDatabase f14705c;

    /* renamed from: com.umeng.analytics.pro.i$a */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a */
        private static final C3387i f14706a = new C3387i();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3387i m14248a(Context context) {
        if (f14703d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f14703d = applicationContext;
            f14702b = C3386h.m14237a(applicationContext);
        }
        return a.f14706a;
    }

    /* renamed from: b */
    public synchronized void m14250b() {
        try {
            if (this.f14704a.decrementAndGet() == 0) {
                this.f14705c.close();
            }
        } catch (Throwable unused) {
        }
    }

    private C3387i() {
        this.f14704a = new AtomicInteger();
    }

    /* renamed from: a */
    public synchronized SQLiteDatabase m14249a() {
        if (this.f14704a.incrementAndGet() == 1) {
            this.f14705c = f14702b.getWritableDatabase();
        }
        return this.f14705c;
    }
}
