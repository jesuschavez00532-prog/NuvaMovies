package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.support.v4.media.session.AbstractC0272b;
import android.util.Log;
import com.lzy.okgo.cache.CacheEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p214l.C5303a;

/* renamed from: com.google.android.gms.internal.measurement.b6 */
/* loaded from: classes.dex */
public final class C1855b6 implements InterfaceC1919f6 {

    /* renamed from: h */
    private static final Map f7670h = new C5303a();

    /* renamed from: i */
    public static final String[] f7671i = {CacheEntity.KEY, "value"};

    /* renamed from: a */
    private final ContentResolver f7672a;

    /* renamed from: b */
    private final Uri f7673b;

    /* renamed from: c */
    private final Runnable f7674c;

    /* renamed from: d */
    private final ContentObserver f7675d;

    /* renamed from: e */
    private final Object f7676e;

    /* renamed from: f */
    private volatile Map f7677f;

    /* renamed from: g */
    private final List f7678g;

    private C1855b6(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C1839a6 c1839a6 = new C1839a6(this, null);
        this.f7675d = c1839a6;
        this.f7676e = new Object();
        this.f7678g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.f7672a = contentResolver;
        this.f7673b = uri;
        this.f7674c = runnable;
        contentResolver.registerContentObserver(uri, false, c1839a6);
    }

    /* renamed from: b */
    public static C1855b6 m8134b(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C1855b6 c1855b6;
        synchronized (C1855b6.class) {
            Map map = f7670h;
            c1855b6 = (C1855b6) map.get(uri);
            if (c1855b6 == null) {
                try {
                    C1855b6 c1855b62 = new C1855b6(contentResolver, uri, runnable);
                    try {
                        map.put(uri, c1855b62);
                    } catch (SecurityException unused) {
                    }
                    c1855b6 = c1855b62;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c1855b6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static synchronized void m8135e() {
        synchronized (C1855b6.class) {
            for (C1855b6 c1855b6 : f7670h.values()) {
                c1855b6.f7672a.unregisterContentObserver(c1855b6.f7675d);
            }
            f7670h.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1919f6
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8136a(String str) {
        return (String) m8137c().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final Map m8137c() {
        Map map;
        Map map2;
        Map map3 = this.f7677f;
        Map map4 = map3;
        if (map3 == null) {
            synchronized (this.f7676e) {
                Map map5 = this.f7677f;
                map = map5;
                if (map5 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            map2 = (Map) AbstractC1887d6.m8247a(new InterfaceC1903e6() { // from class: com.google.android.gms.internal.measurement.z5
                                @Override // com.google.android.gms.internal.measurement.InterfaceC1903e6
                                /* renamed from: a */
                                public final Object mo8287a() {
                                    return C1855b6.this.m8138d();
                                }
                            });
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map2 = null;
                    }
                    this.f7677f = map2;
                    allowThreadDiskReads = map2;
                    map = allowThreadDiskReads;
                }
            }
            map4 = map;
        }
        if (map4 != null) {
            return map4;
        }
        return Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Map m8138d() {
        Map hashMap;
        Cursor query = this.f7672a.query(this.f7673b, f7671i, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new C5303a(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    /* renamed from: f */
    public final void m8139f() {
        synchronized (this.f7676e) {
            this.f7677f = null;
            this.f7674c.run();
        }
        synchronized (this) {
            Iterator it = this.f7678g.iterator();
            if (it.hasNext()) {
                AbstractC0272b.m941a(it.next());
                throw null;
            }
        }
    }
}
