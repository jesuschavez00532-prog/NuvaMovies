package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import p127f5.AbstractC4245i;
import p127f5.InterfaceC4235d;
import p172i4.C4854b;
import p187j4.C4988b;
import p203k4.C5104b;
import p219l4.AbstractC5358c;
import p219l4.C5364e;
import p219l4.C5385l;
import p219l4.C5394o;
import p219l4.C5397p;
import p281p4.AbstractC6198b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.p */
/* loaded from: classes.dex */
public final class C1805p implements InterfaceC4235d {

    /* renamed from: a */
    private final C1791b f7601a;

    /* renamed from: b */
    private final int f7602b;

    /* renamed from: c */
    private final C5104b f7603c;

    /* renamed from: d */
    private final long f7604d;

    /* renamed from: e */
    private final long f7605e;

    C1805p(C1791b c1791b, int i10, C5104b c5104b, long j10, long j11, String str, String str2) {
        this.f7601a = c1791b;
        this.f7602b = i10;
        this.f7603c = c5104b;
        this.f7604d = j10;
        this.f7605e = j11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C1805p m8037b(C1791b c1791b, int i10, C5104b c5104b) {
        boolean z10;
        long j10;
        long j11;
        if (!c1791b.m7963f()) {
            return null;
        }
        C5397p m21793a = C5394o.m21792b().m21793a();
        if (m21793a != null) {
            if (!m21793a.m21799j()) {
                return null;
            }
            z10 = m21793a.m21800k();
            C1801l m7966w = c1791b.m7966w(c5104b);
            if (m7966w != null) {
                if (!(m7966w.m8025u() instanceof AbstractC5358c)) {
                    return null;
                }
                AbstractC5358c abstractC5358c = (AbstractC5358c) m7966w.m8025u();
                if (abstractC5358c.m21667I() && !abstractC5358c.m21679c()) {
                    C5364e m8038c = m8038c(m7966w, abstractC5358c, i10);
                    if (m8038c == null) {
                        return null;
                    }
                    m7966w.m8012F();
                    z10 = m8038c.m21721n();
                }
            }
        } else {
            z10 = true;
        }
        if (z10) {
            j10 = System.currentTimeMillis();
        } else {
            j10 = 0;
        }
        if (z10) {
            j11 = SystemClock.elapsedRealtime();
        } else {
            j11 = 0;
        }
        return new C1805p(c1791b, i10, c5104b, j10, j11, null, null);
    }

    /* renamed from: c */
    private static C5364e m8038c(C1801l c1801l, AbstractC5358c abstractC5358c, int i10) {
        int[] m21718i;
        int[] m21719j;
        C5364e m21665G = abstractC5358c.m21665G();
        if (m21665G == null || !m21665G.m21720k() || ((m21718i = m21665G.m21718i()) != null ? !AbstractC6198b.m24744b(m21718i, i10) : !((m21719j = m21665G.m21719j()) == null || !AbstractC6198b.m24744b(m21719j, i10))) || c1801l.m8024s() >= m21665G.m21717g()) {
            return null;
        }
        return m21665G;
    }

    @Override // p127f5.InterfaceC4235d
    /* renamed from: a */
    public final void mo488a(AbstractC4245i abstractC4245i) {
        C1801l m7966w;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int m20017g;
        int i14;
        long j10;
        long j11;
        int i15;
        if (!this.f7601a.m7963f()) {
            return;
        }
        C5397p m21793a = C5394o.m21792b().m21793a();
        if ((m21793a == null || m21793a.m21799j()) && (m7966w = this.f7601a.m7966w(this.f7603c)) != null && (m7966w.m8025u() instanceof AbstractC5358c)) {
            AbstractC5358c abstractC5358c = (AbstractC5358c) m7966w.m8025u();
            boolean z11 = true;
            if (this.f7604d > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int m21697y = abstractC5358c.m21697y();
            if (m21793a != null) {
                z10 &= m21793a.m21800k();
                int m21797g = m21793a.m21797g();
                int m21798i = m21793a.m21798i();
                i10 = m21793a.m21801n();
                if (abstractC5358c.m21667I() && !abstractC5358c.m21679c()) {
                    C5364e m8038c = m8038c(m7966w, abstractC5358c, this.f7602b);
                    if (m8038c == null) {
                        return;
                    }
                    if (!m8038c.m21721n() || this.f7604d <= 0) {
                        z11 = false;
                    }
                    m21798i = m8038c.m21717g();
                    z10 = z11;
                }
                i11 = m21797g;
                i12 = m21798i;
            } else {
                i10 = 0;
                i11 = 5000;
                i12 = 100;
            }
            C1791b c1791b = this.f7601a;
            if (abstractC4245i.mo17712n()) {
                i13 = 0;
                i14 = 0;
            } else {
                if (abstractC4245i.mo17710l()) {
                    i13 = 100;
                } else {
                    Exception mo17707i = abstractC4245i.mo17707i();
                    if (mo17707i instanceof C4988b) {
                        Status m20360a = ((C4988b) mo17707i).m20360a();
                        int m7913i = m20360a.m7913i();
                        C4854b m7912g = m20360a.m7912g();
                        if (m7912g == null) {
                            m20017g = -1;
                        } else {
                            m20017g = m7912g.m20017g();
                        }
                        i14 = m20017g;
                        i13 = m7913i;
                    } else {
                        i13 = 101;
                    }
                }
                i14 = -1;
            }
            if (z10) {
                long j12 = this.f7604d;
                j11 = System.currentTimeMillis();
                j10 = j12;
                i15 = (int) (SystemClock.elapsedRealtime() - this.f7605e);
            } else {
                j10 = 0;
                j11 = 0;
                i15 = -1;
            }
            c1791b.m7957E(new C5385l(this.f7602b, i13, i14, j10, j11, null, null, m21697y, i15), i10, i11, i12);
        }
    }
}
