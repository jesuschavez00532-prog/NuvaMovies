package p130f8;

import ca.InterfaceC1439a;
import com.request.result.Channel;

/* renamed from: f8.a */
/* loaded from: classes2.dex */
public interface InterfaceC4274a extends InterfaceC1439a {

    /* renamed from: f8.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m17834a(InterfaceC4274a interfaceC4274a, int i10, boolean z10, int i11, int i12, boolean z11, boolean z12, int i13, Object obj) {
            boolean z13 = false;
            if (obj == null) {
                if ((i13 & 32) != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                interfaceC4274a.mo17833z0(i10, z10, i11, i12, z11, z13);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadChannelData");
        }
    }

    /* renamed from: B1 */
    Channel mo17824B1(int i10);

    /* renamed from: B2 */
    void mo17825B2(int i10);

    /* renamed from: C3 */
    void mo17826C3(int i10, boolean z10);

    /* renamed from: Q2 */
    void mo17827Q2(int i10);

    /* renamed from: U1 */
    boolean mo17828U1(int i10);

    /* renamed from: Z0 */
    void mo17829Z0(int i10);

    /* renamed from: j3 */
    void mo17830j3();

    /* renamed from: n3 */
    void mo17831n3(int i10, String str);

    /* renamed from: s2 */
    void mo17832s2();

    /* renamed from: z0 */
    void mo17833z0(int i10, boolean z10, int i11, int i12, boolean z11, boolean z12);
}
