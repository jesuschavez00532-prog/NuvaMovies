package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import p331t.AbstractC6870a;

/* renamed from: androidx.core.widget.i */
/* loaded from: classes.dex */
public abstract class AbstractC0674i {

    /* renamed from: androidx.core.widget.i$a */
    /* loaded from: classes.dex */
    private static class a {
        /* renamed from: a */
        public static EdgeEffect m2966a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m2967b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m2968c(EdgeEffect edgeEffect, float f10, float f11) {
            try {
                return edgeEffect.onPullDistance(f10, f11);
            } catch (Throwable unused) {
                edgeEffect.onPull(f10, f11);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m2962a(Context context, AttributeSet attributeSet) {
        if (AbstractC6870a.m26777c()) {
            return a.m2966a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m2963b(EdgeEffect edgeEffect) {
        if (AbstractC6870a.m26777c()) {
            return a.m2967b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m2964c(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f10, f11);
        } else {
            edgeEffect.onPull(f10);
        }
    }

    /* renamed from: d */
    public static float m2965d(EdgeEffect edgeEffect, float f10, float f11) {
        if (AbstractC6870a.m26777c()) {
            return a.m2968c(edgeEffect, f10, f11);
        }
        m2964c(edgeEffect, f10, f11);
        return f10;
    }
}
