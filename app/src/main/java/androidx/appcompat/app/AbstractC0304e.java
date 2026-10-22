package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p214l.C5304b;

/* renamed from: androidx.appcompat.app.e */
/* loaded from: classes.dex */
public abstract class AbstractC0304e {

    /* renamed from: a */
    private static int f1052a = -100;

    /* renamed from: b */
    private static final C5304b f1053b = new C5304b();

    /* renamed from: c */
    private static final Object f1054c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m1066c(AbstractC0304e abstractC0304e) {
        synchronized (f1054c) {
            m1071y(abstractC0304e);
            f1053b.add(new WeakReference(abstractC0304e));
        }
    }

    /* renamed from: g */
    public static AbstractC0304e m1067g(Activity activity, InterfaceC0303d interfaceC0303d) {
        return new LayoutInflaterFactory2C0305f(activity, interfaceC0303d);
    }

    /* renamed from: h */
    public static AbstractC0304e m1068h(Dialog dialog, InterfaceC0303d interfaceC0303d) {
        return new LayoutInflaterFactory2C0305f(dialog, interfaceC0303d);
    }

    /* renamed from: j */
    public static int m1069j() {
        return f1052a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m1070x(AbstractC0304e abstractC0304e) {
        synchronized (f1054c) {
            m1071y(abstractC0304e);
        }
    }

    /* renamed from: y */
    private static void m1071y(AbstractC0304e abstractC0304e) {
        synchronized (f1054c) {
            Iterator it = f1053b.iterator();
            while (it.hasNext()) {
                AbstractC0304e abstractC0304e2 = (AbstractC0304e) ((WeakReference) it.next()).get();
                if (abstractC0304e2 == abstractC0304e || abstractC0304e2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo1072A(int i10);

    /* renamed from: B */
    public abstract void mo1073B(View view);

    /* renamed from: C */
    public abstract void mo1074C(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: D */
    public abstract void mo1075D(int i10);

    /* renamed from: E */
    public abstract void mo1076E(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo1077d(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: e */
    public void m1078e(Context context) {
    }

    /* renamed from: f */
    public Context mo1079f(Context context) {
        m1078e(context);
        return context;
    }

    /* renamed from: i */
    public abstract View mo1080i(int i10);

    /* renamed from: k */
    public abstract int mo1081k();

    /* renamed from: l */
    public abstract MenuInflater mo1082l();

    /* renamed from: m */
    public abstract AbstractC0300a mo1083m();

    /* renamed from: n */
    public abstract void mo1084n();

    /* renamed from: o */
    public abstract void mo1085o();

    /* renamed from: p */
    public abstract void mo1086p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo1087q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo1088r();

    /* renamed from: s */
    public abstract void mo1089s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo1090t();

    /* renamed from: u */
    public abstract void mo1091u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo1092v();

    /* renamed from: w */
    public abstract void mo1093w();

    /* renamed from: z */
    public abstract boolean mo1094z(int i10);
}
