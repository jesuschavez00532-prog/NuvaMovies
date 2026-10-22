package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C2038n4;
import com.google.android.gms.internal.measurement.C2203y4;
import java.util.ArrayList;
import java.util.List;
import p025b5.AbstractC1101c0;
import p219l4.AbstractC5391n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.e9 */
/* loaded from: classes.dex */
public final class C2288e9 {

    /* renamed from: a */
    C2203y4 f8581a;

    /* renamed from: b */
    List f8582b;

    /* renamed from: c */
    List f8583c;

    /* renamed from: d */
    long f8584d;

    /* renamed from: e */
    final /* synthetic */ C2310g9 f8585e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2288e9(C2310g9 c2310g9, AbstractC1101c0 abstractC1101c0) {
        this.f8585e = c2310g9;
    }

    /* renamed from: b */
    private static final long m9533b(C2038n4 c2038n4) {
        return ((c2038n4.m8726A() / 1000) / 60) / 60;
    }

    /* renamed from: a */
    public final boolean m9534a(long j10, C2038n4 c2038n4) {
        AbstractC5391n.m21783i(c2038n4);
        if (this.f8583c == null) {
            this.f8583c = new ArrayList();
        }
        if (this.f8582b == null) {
            this.f8582b = new ArrayList();
        }
        if (!this.f8583c.isEmpty() && m9533b((C2038n4) this.f8583c.get(0)) != m9533b(c2038n4)) {
            return false;
        }
        long mo8250e = this.f8584d + c2038n4.mo8250e();
        this.f8585e.m9569U();
        if (mo8250e >= Math.max(0, ((Integer) AbstractC2260c3.f8464j.m9456a(null)).intValue())) {
            return false;
        }
        this.f8584d = mo8250e;
        this.f8583c.add(c2038n4);
        this.f8582b.add(Long.valueOf(j10));
        int size = this.f8583c.size();
        this.f8585e.m9569U();
        if (size >= Math.max(1, ((Integer) AbstractC2260c3.f8466k.m9456a(null)).intValue())) {
            return false;
        }
        return true;
    }
}
