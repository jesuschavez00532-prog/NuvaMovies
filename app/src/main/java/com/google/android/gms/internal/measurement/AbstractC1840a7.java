package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.StrictMode;
import android.support.v4.media.session.AbstractC0272b;
import java.util.Iterator;
import java.util.Map;
import p214l.C5303a;

/* renamed from: com.google.android.gms.internal.measurement.a7 */
/* loaded from: classes.dex */
public abstract class AbstractC1840a7 implements InterfaceC1919f6 {

    /* renamed from: a */
    private static final Map f7652a = new C5303a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC1840a7 m8088b(Context context, String str, Runnable runnable) {
        if (!AbstractC2189x5.m9171b()) {
            synchronized (AbstractC1840a7.class) {
                AbstractC0272b.m941a(f7652a.get(null));
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } finally {
                }
            }
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static synchronized void m8089c() {
        synchronized (AbstractC1840a7.class) {
            Map map = f7652a;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                AbstractC0272b.m941a(it.next());
                throw null;
            }
        }
    }
}
