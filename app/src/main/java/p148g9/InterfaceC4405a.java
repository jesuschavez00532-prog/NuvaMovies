package p148g9;

import ca.InterfaceC1439a;

/* renamed from: g9.a */
/* loaded from: classes2.dex */
public interface InterfaceC4405a extends InterfaceC1439a {

    /* renamed from: g9.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m18492a(InterfaceC4405a interfaceC4405a, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                interfaceC4405a.mo18491G(z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQrToken");
        }
    }

    /* renamed from: G */
    void mo18491G(boolean z10);
}
