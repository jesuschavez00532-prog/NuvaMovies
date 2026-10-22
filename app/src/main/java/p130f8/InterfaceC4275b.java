package p130f8;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: f8.b */
/* loaded from: classes2.dex */
public interface InterfaceC4275b {

    /* renamed from: f8.b$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m17843a(InterfaceC4275b interfaceC4275b, ArrayList arrayList, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                interfaceC4275b.mo17838F5(arrayList, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setChannelData");
        }
    }

    /* renamed from: A2 */
    void mo17835A2(ArrayList arrayList);

    /* renamed from: B2 */
    void mo17836B2();

    /* renamed from: C3 */
    void mo17837C3(int i10);

    /* renamed from: F5 */
    void mo17838F5(ArrayList arrayList, boolean z10);

    /* renamed from: K2 */
    void mo17839K2(int i10, boolean z10);

    /* renamed from: U1 */
    void mo17840U1(int i10);

    /* renamed from: c2 */
    void mo17841c2(int i10, boolean z10);

    /* renamed from: j6 */
    void mo17842j6(HashMap hashMap);
}
