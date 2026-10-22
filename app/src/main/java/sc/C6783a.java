package sc;

import android.app.Activity;
import android.app.Fragment;
import android.view.View;
import ne.AbstractC5868k;
import p302qc.C6447b;
import tc.InterfaceC6931a;

/* renamed from: sc.a */
/* loaded from: classes.dex */
public final class C6783a implements InterfaceC6931a {
    @Override // tc.InterfaceC6931a
    /* renamed from: a */
    public Object mo26766a(String str, Object obj, C6447b c6447b) {
        View m3182n7;
        if (c6447b == null || c6447b.m25232a() == 0) {
            return null;
        }
        if (obj instanceof View) {
            return ((View) obj).findViewById(c6447b.m25232a());
        }
        if (obj instanceof Activity) {
            return ((Activity) obj).findViewById(c6447b.m25232a());
        }
        if (obj instanceof Fragment) {
            View view = ((Fragment) obj).getView();
            AbstractC5868k.m23671c(view);
            return view.findViewById(c6447b.m25232a());
        }
        if (!(obj instanceof androidx.fragment.app.Fragment) || (m3182n7 = ((androidx.fragment.app.Fragment) obj).m3182n7()) == null) {
            return null;
        }
        return m3182n7.findViewById(c6447b.m25232a());
    }
}
