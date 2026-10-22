package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.InterfaceC2197xd;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.i4 */
/* loaded from: classes.dex */
final class C2327i4 implements InterfaceC2197xd {

    /* renamed from: a */
    final /* synthetic */ C2349k4 f8682a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2327i4(C2349k4 c2349k4) {
        this.f8682a = c2349k4;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2197xd
    /* renamed from: a */
    public final void mo9192a(int i10, String str, List list, boolean z10, boolean z11) {
        C2348k3 m9799q;
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        m9799q = this.f8682a.f8714a.mo9577b().m9803u();
                    } else if (z10) {
                        m9799q = this.f8682a.f8714a.mo9577b().m9807y();
                    } else if (!z11) {
                        m9799q = this.f8682a.f8714a.mo9577b().m9806x();
                    } else {
                        m9799q = this.f8682a.f8714a.mo9577b().m9805w();
                    }
                } else {
                    m9799q = this.f8682a.f8714a.mo9577b().m9804v();
                }
            } else if (z10) {
                m9799q = this.f8682a.f8714a.mo9577b().m9802t();
            } else if (!z11) {
                m9799q = this.f8682a.f8714a.mo9577b().m9801s();
            } else {
                m9799q = this.f8682a.f8714a.mo9577b().m9800r();
            }
        } else {
            m9799q = this.f8682a.f8714a.mo9577b().m9799q();
        }
        int size = list.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    m9799q.m9699a(str);
                    return;
                } else {
                    m9799q.m9702d(str, list.get(0), list.get(1), list.get(2));
                    return;
                }
            }
            m9799q.m9701c(str, list.get(0), list.get(1));
            return;
        }
        m9799q.m9700b(str, list.get(0));
    }
}
