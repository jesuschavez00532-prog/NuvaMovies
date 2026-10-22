package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y3 */
/* loaded from: classes.dex */
public final class C2202y3 extends AbstractC2192x8 implements InterfaceC1907ea {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C2202y3(AbstractC2112s3 abstractC2112s3) {
        super(C2217z3.m9376C());
    }

    /* renamed from: s */
    public final int m9229s() {
        return ((C2217z3) this.f8255b).m9391y();
    }

    /* renamed from: t */
    public final C2187x3 m9230t(int i10) {
        return ((C2217z3) this.f8255b).m9380A(i10);
    }

    /* renamed from: u */
    public final C2202y3 m9231u() {
        if (this.f8256c) {
            m9178r();
            this.f8256c = false;
        }
        C2217z3.m9379L((C2217z3) this.f8255b);
        return this;
    }

    /* renamed from: v */
    public final C2202y3 m9232v(int i10, C2172w3 c2172w3) {
        if (this.f8256c) {
            m9178r();
            this.f8256c = false;
        }
        C2217z3.m9378K((C2217z3) this.f8255b, i10, (C2187x3) c2172w3.m9176o());
        return this;
    }

    /* renamed from: w */
    public final String m9233w() {
        return ((C2217z3) this.f8255b).m9382F();
    }

    /* renamed from: x */
    public final List m9234x() {
        return Collections.unmodifiableList(((C2217z3) this.f8255b).m9383G());
    }

    /* renamed from: y */
    public final List m9235y() {
        return Collections.unmodifiableList(((C2217z3) this.f8255b).m9384H());
    }
}
