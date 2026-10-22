package p130f8;

import com.request.bean.EpgProgram;
import java.util.List;

/* renamed from: f8.j */
/* loaded from: classes2.dex */
public interface InterfaceC4283j {

    /* renamed from: f8.j$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m17930a(InterfaceC4283j interfaceC4283j, String str, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    z10 = false;
                }
                interfaceC4283j.mo17925I2(str, z10);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAuthError");
        }
    }

    /* renamed from: I2 */
    void mo17925I2(String str, boolean z10);

    /* renamed from: I4 */
    EpgProgram mo17926I4();

    /* renamed from: Q */
    void mo17927Q();

    /* renamed from: k3 */
    void mo17928k3(List list);

    /* renamed from: z */
    void mo17929z(int i10);
}
