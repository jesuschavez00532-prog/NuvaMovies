package p285p8;

import ca.InterfaceC1439a;

/* renamed from: p8.c */
/* loaded from: classes2.dex */
public interface InterfaceC6240c extends InterfaceC1439a {

    /* renamed from: p8.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m24847a(InterfaceC6240c interfaceC6240c, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
            String str7 = null;
            String str8 = null;
            String str9 = null;
            if (obj == null) {
                if ((i10 & 8) != 0) {
                    str7 = null;
                } else {
                    str7 = str4;
                }
                if ((i10 & 16) != 0) {
                    str8 = null;
                } else {
                    str8 = str5;
                }
                if ((i10 & 32) != 0) {
                    str9 = null;
                } else {
                    str9 = str6;
                }
                interfaceC6240c.mo24846b0(str, str2, str3, str7, str8, str9);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
        }
    }

    /* renamed from: b0 */
    void mo24846b0(String str, String str2, String str3, String str4, String str5, String str6);
}
