package p001a0;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC0553a1;
import androidx.core.view.AbstractC0652z0;
import androidx.customview.poolingcontainer.R$id;
import java.util.Iterator;
import ne.AbstractC5868k;

/* renamed from: a0.a */
/* loaded from: classes.dex */
public abstract class AbstractC0000a {

    /* renamed from: a */
    private static final int f0a = R$id.pooling_container_listener_holder_tag;

    /* renamed from: b */
    private static final int f1b = R$id.is_pooling_container_tag;

    /* renamed from: a */
    public static final void m0a(View view) {
        AbstractC5868k.m23674f(view, "<this>");
        Iterator it = AbstractC0553a1.m2389a(view).iterator();
        while (it.hasNext()) {
            m2c((View) it.next()).m4a();
        }
    }

    /* renamed from: b */
    public static final void m1b(ViewGroup viewGroup) {
        AbstractC5868k.m23674f(viewGroup, "<this>");
        Iterator it = AbstractC0652z0.m2843a(viewGroup).iterator();
        while (it.hasNext()) {
            m2c((View) it.next()).m4a();
        }
    }

    /* renamed from: c */
    private static final C0001b m2c(View view) {
        int i10 = f0a;
        C0001b c0001b = (C0001b) view.getTag(i10);
        if (c0001b == null) {
            C0001b c0001b2 = new C0001b();
            view.setTag(i10, c0001b2);
            return c0001b2;
        }
        return c0001b;
    }

    /* renamed from: d */
    public static final void m3d(View view, boolean z10) {
        AbstractC5868k.m23674f(view, "<this>");
        view.setTag(f1b, Boolean.valueOf(z10));
    }
}
