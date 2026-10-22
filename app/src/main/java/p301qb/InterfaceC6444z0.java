package p301qb;

import com.request.result.LoginResult;

/* renamed from: qb.z0 */
/* loaded from: classes2.dex */
public interface InterfaceC6444z0 extends InterfaceC6433v1 {

    /* renamed from: qb.z0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m25230a(InterfaceC6444z0 interfaceC6444z0, boolean z10, LoginResult loginResult, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    loginResult = null;
                }
                interfaceC6444z0.mo18505N(z10, loginResult);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSucceedLogin");
        }
    }

    /* renamed from: H4 */
    void mo18504H4(String str, boolean z10, LoginResult loginResult);

    /* renamed from: N */
    void mo18505N(boolean z10, LoginResult loginResult);

    /* renamed from: f0 */
    void mo18506f0(boolean z10, String str);
}
