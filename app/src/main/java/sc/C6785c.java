package sc;

import mc.C5634i;
import p302qc.C6447b;
import tc.InterfaceC6931a;

/* renamed from: sc.c */
/* loaded from: classes.dex */
public final class C6785c implements InterfaceC6931a {
    @Override // tc.InterfaceC6931a
    /* renamed from: a */
    public Object mo26766a(String str, Object obj, C6447b c6447b) {
        if (c6447b != null && c6447b.m25232a() == 0) {
            try {
                C5634i.m22844e(Class.forName(c6447b.m25234c()), new Object[0]);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
