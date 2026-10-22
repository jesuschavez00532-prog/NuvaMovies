package p151h0;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: h0.z */
/* loaded from: classes.dex */
abstract class AbstractC4502z {

    /* renamed from: a */
    private static boolean f19471a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC4500x m18815a(ViewGroup viewGroup) {
        return new C4499w(viewGroup);
    }

    /* renamed from: b */
    private static void m18816b(ViewGroup viewGroup, boolean z10) {
        if (f19471a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f19471a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m18817c(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else {
            m18816b(viewGroup, z10);
        }
    }
}
