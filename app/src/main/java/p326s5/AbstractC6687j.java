package p326s5;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.AbstractC2589g;

/* renamed from: s5.j */
/* loaded from: classes.dex */
public abstract class AbstractC6687j {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC6681d m26117a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return m26118b();
            }
            return new C6682e();
        }
        return new C6689l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC6681d m26118b() {
        return new C6689l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C6683f m26119c() {
        return new C6683f();
    }

    /* renamed from: d */
    public static void m26120d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof C6686i) {
            ((C6686i) background).m26095Q(f10);
        }
    }

    /* renamed from: e */
    public static void m26121e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C6686i) {
            m26122f(view, (C6686i) background);
        }
    }

    /* renamed from: f */
    public static void m26122f(View view, C6686i c6686i) {
        if (c6686i.m26093L()) {
            c6686i.m26099U(AbstractC2589g.m10663b(view));
        }
    }
}
