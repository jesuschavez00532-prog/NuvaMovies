package com.google.android.gms.common.api.internal;

import android.util.Log;
import java.util.Map;
import p172i4.C4854b;
import p187j4.C4987a;
import p203k4.C5104b;

/* renamed from: com.google.android.gms.common.api.internal.n */
/* loaded from: classes.dex */
final class RunnableC1803n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4854b f7593a;

    /* renamed from: b */
    final /* synthetic */ C1804o f7594b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC1803n(C1804o c1804o, C4854b c4854b) {
        this.f7594b = c1804o;
        this.f7593a = c4854b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        C5104b c5104b;
        C4987a.f fVar;
        C4987a.f fVar2;
        C4987a.f fVar3;
        C4987a.f fVar4;
        C1804o c1804o = this.f7594b;
        map = c1804o.f7600f.f7553l;
        c5104b = c1804o.f7596b;
        C1801l c1801l = (C1801l) map.get(c5104b);
        if (c1801l == null) {
            return;
        }
        if (this.f7593a.m20021n()) {
            this.f7594b.f7599e = true;
            fVar = this.f7594b.f7595a;
            if (fVar.mo16774l()) {
                this.f7594b.m8033h();
                return;
            }
            try {
                C1804o c1804o2 = this.f7594b;
                fVar3 = c1804o2.f7595a;
                fVar4 = c1804o2.f7595a;
                fVar3.m20352e(null, fVar4.mo20348a());
                return;
            } catch (SecurityException e10) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                fVar2 = this.f7594b.f7595a;
                fVar2.m20349b("Failed to get service from broker.");
                c1801l.m8013G(new C4854b(10), null);
                return;
            }
        }
        c1801l.m8013G(this.f7593a, null);
    }
}
