package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.q */
/* loaded from: classes.dex */
public final class C2410q {

    /* renamed from: a */
    final String f8950a;

    /* renamed from: b */
    final String f8951b;

    /* renamed from: c */
    final String f8952c;

    /* renamed from: d */
    final long f8953d;

    /* renamed from: e */
    final long f8954e;

    /* renamed from: f */
    final C2443t f8955f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2410q(C2415q4 c2415q4, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        C2443t c2443t;
        AbstractC5391n.m21779e(str2);
        AbstractC5391n.m21779e(str3);
        this.f8950a = str2;
        this.f8951b = str3;
        this.f8952c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8953d = j10;
        this.f8954e = j11;
        if (j11 != 0 && j11 > j10) {
            c2415q4.mo9577b().m9805w().m9700b("Event created with reverse previous/current timestamps. appId", C2370m3.m9796z(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c2415q4.mo9577b().m9800r().m9699a("Param name can't be null");
                    it.remove();
                } else {
                    Object m9942o = c2415q4.m10031N().m9942o(next, bundle2.get(next));
                    if (m9942o == null) {
                        c2415q4.mo9577b().m9805w().m9700b("Param value can't be null", c2415q4.m10022D().m9642e(next));
                        it.remove();
                    } else {
                        c2415q4.m10031N().m9915C(bundle2, next, m9942o);
                    }
                }
            }
            c2443t = new C2443t(bundle2);
        } else {
            c2443t = new C2443t(new Bundle());
        }
        this.f8955f = c2443t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2410q m10012a(C2415q4 c2415q4, long j10) {
        return new C2410q(c2415q4, this.f8952c, this.f8950a, this.f8951b, this.f8953d, j10, this.f8955f);
    }

    public final String toString() {
        return "Event{appId='" + this.f8950a + "', name='" + this.f8951b + "', params=" + this.f8955f.toString() + "}";
    }

    private C2410q(C2415q4 c2415q4, String str, String str2, String str3, long j10, long j11, C2443t c2443t) {
        AbstractC5391n.m21779e(str2);
        AbstractC5391n.m21779e(str3);
        AbstractC5391n.m21783i(c2443t);
        this.f8950a = str2;
        this.f8951b = str3;
        this.f8952c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8953d = j10;
        this.f8954e = j11;
        if (j11 != 0 && j11 > j10) {
            c2415q4.mo9577b().m9805w().m9701c("Event created with reverse previous/current timestamps. appId, name", C2370m3.m9796z(str2), C2370m3.m9796z(str3));
        }
        this.f8955f = c2443t;
    }
}
