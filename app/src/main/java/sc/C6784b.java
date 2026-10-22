package sc;

import java.lang.ref.SoftReference;
import p302qc.AbstractC6450e;
import p302qc.C6447b;
import tc.InterfaceC6931a;

/* renamed from: sc.b */
/* loaded from: classes.dex */
public final class C6784b implements InterfaceC6931a {
    @Override // tc.InterfaceC6931a
    /* renamed from: a */
    public Object mo26766a(String str, Object obj, C6447b c6447b) {
        SoftReference softReference;
        if (c6447b == null || c6447b.m25232a() != 0 || !AbstractC6450e.m25269g().keySet().contains(c6447b.m25233b()) || (softReference = (SoftReference) AbstractC6450e.m25269g().remove(c6447b.m25233b())) == null) {
            return null;
        }
        return softReference.get();
    }
}
