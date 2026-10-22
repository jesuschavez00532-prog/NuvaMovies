package p151h0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.AbstractC0616q0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h0.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC4464c0 {

    /* renamed from: a */
    private static final AbstractC4488o0 f19346a;

    /* renamed from: b */
    static final Property f19347b;

    /* renamed from: c */
    static final Property f19348c;

    /* renamed from: h0.c0$a */
    /* loaded from: classes.dex */
    static class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC4464c0.m18691c(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            AbstractC4464c0.m18695g(view, f10.floatValue());
        }
    }

    /* renamed from: h0.c0$b */
    /* loaded from: classes.dex */
    static class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return AbstractC0616q0.m2647t(view);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            AbstractC0616q0.m2648t0(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f19346a = new C4486n0();
        } else if (i10 >= 23) {
            f19346a = new C4484m0();
        } else if (i10 >= 22) {
            f19346a = new C4480k0();
        } else if (i10 >= 21) {
            f19346a = new C4476i0();
        } else {
            f19346a = new C4470f0();
        }
        f19347b = new a(Float.class, "translationAlpha");
        f19348c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m18689a(View view) {
        f19346a.mo18712a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC4462b0 m18690b(View view) {
        return new C4460a0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static float m18691c(View view) {
        return f19346a.mo18713c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static InterfaceC4494r0 m18692d(View view) {
        return new C4492q0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m18693e(View view) {
        f19346a.mo18714d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m18694f(View view, int i10, int i11, int i12, int i13) {
        f19346a.mo18727e(view, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m18695g(View view, float f10) {
        f19346a.mo18715f(view, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m18696h(View view, int i10) {
        f19346a.mo18732g(view, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m18697i(View view, Matrix matrix) {
        f19346a.mo18722h(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static void m18698j(View view, Matrix matrix) {
        f19346a.mo18723i(view, matrix);
    }
}
