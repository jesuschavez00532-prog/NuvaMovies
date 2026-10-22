package com.google.android.gms.common.api.internal;

import android.support.v4.media.session.AbstractC0272b;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p127f5.C4247j;
import p187j4.C4988b;

/* renamed from: com.google.android.gms.common.api.internal.e */
/* loaded from: classes.dex */
public final class C1794e {

    /* renamed from: a */
    private final Map f7568a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map f7569b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: f */
    private final void m7978f(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f7568a) {
            hashMap = new HashMap(this.f7568a);
        }
        synchronized (this.f7569b) {
            hashMap2 = new HashMap(this.f7569b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                AbstractC0272b.m941a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C4247j) entry2.getKey()).m17727d(new C4988b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m7979b(C4247j c4247j, boolean z10) {
        this.f7569b.put(c4247j, Boolean.valueOf(z10));
        c4247j.m17724a().mo17700b(new C1793d(this, c4247j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m7980c(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        m7978f(true, new Status(20, sb2.toString()));
    }

    /* renamed from: d */
    public final void m7981d() {
        m7978f(false, C1791b.f7538r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m7982e() {
        if (this.f7568a.isEmpty() && this.f7569b.isEmpty()) {
            return false;
        }
        return true;
    }
}
