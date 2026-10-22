package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.umeng.analytics.process.c */
/* loaded from: classes3.dex */
class C3412c {

    /* renamed from: a */
    private static C3412c f14968a;

    /* renamed from: b */
    private ConcurrentHashMap<String, a> f14969b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private Context f14970c;

    private C3412c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C3412c m14452a(Context context) {
        if (f14968a == null) {
            synchronized (C3412c.class) {
                if (f14968a == null) {
                    f14968a = new C3412c();
                }
            }
        }
        C3412c c3412c = f14968a;
        c3412c.f14970c = context;
        return c3412c;
    }

    /* renamed from: c */
    private a m14453c(String str) {
        if (this.f14969b.get(str) == null) {
            a m14456a = a.m14456a(this.f14970c, str);
            this.f14969b.put(str, m14456a);
            return m14456a;
        }
        return this.f14969b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m14455b(String str) {
        m14453c(str).m14458b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.analytics.process.c$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private AtomicInteger f14971a = new AtomicInteger();

        /* renamed from: b */
        private SQLiteOpenHelper f14972b;

        /* renamed from: c */
        private SQLiteDatabase f14973c;

        private a() {
        }

        /* renamed from: a */
        static a m14456a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            a aVar = new a();
            aVar.f14972b = C3411b.m14448a(appContext, str);
            return aVar;
        }

        /* renamed from: b */
        synchronized void m14458b() {
            try {
                if (this.f14971a.decrementAndGet() == 0) {
                    this.f14973c.close();
                }
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        synchronized SQLiteDatabase m14457a() {
            if (this.f14971a.incrementAndGet() == 1) {
                this.f14973c = this.f14972b.getWritableDatabase();
            }
            return this.f14973c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized SQLiteDatabase m14454a(String str) {
        return m14453c(str).m14457a();
    }
}
