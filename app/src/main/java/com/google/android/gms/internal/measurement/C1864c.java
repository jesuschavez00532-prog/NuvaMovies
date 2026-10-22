package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c */
/* loaded from: classes.dex */
public final class C1864c {

    /* renamed from: a */
    private C1848b f7682a;

    /* renamed from: b */
    private C1848b f7683b;

    /* renamed from: c */
    private final List f7684c;

    public C1864c() {
        this.f7682a = new C1848b("", 0L, null);
        this.f7683b = new C1848b("", 0L, null);
        this.f7684c = new ArrayList();
    }

    /* renamed from: a */
    public final C1848b m8153a() {
        return this.f7682a;
    }

    /* renamed from: b */
    public final C1848b m8154b() {
        return this.f7683b;
    }

    /* renamed from: c */
    public final List m8155c() {
        return this.f7684c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C1864c c1864c = new C1864c(this.f7682a.clone());
        Iterator it = this.f7684c.iterator();
        while (it.hasNext()) {
            c1864c.f7684c.add(((C1848b) it.next()).clone());
        }
        return c1864c;
    }

    /* renamed from: d */
    public final void m8156d(C1848b c1848b) {
        this.f7682a = c1848b;
        this.f7683b = c1848b.clone();
        this.f7684c.clear();
    }

    /* renamed from: e */
    public final void m8157e(String str, long j10, Map map) {
        this.f7684c.add(new C1848b(str, j10, map));
    }

    /* renamed from: f */
    public final void m8158f(C1848b c1848b) {
        this.f7683b = c1848b;
    }

    public C1864c(C1848b c1848b) {
        this.f7682a = c1848b;
        this.f7683b = c1848b.clone();
        this.f7684c = new ArrayList();
    }
}
