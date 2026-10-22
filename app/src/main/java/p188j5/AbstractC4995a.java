package p188j5;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p276p.AbstractC6128a;
import p282p5.AbstractC6215b;

/* renamed from: j5.a */
/* loaded from: classes.dex */
public abstract class AbstractC4995a {
    /* renamed from: a */
    public static int m20371a(Context context, int i10, int i11) {
        TypedValue m24787a = AbstractC6215b.m24787a(context, i10);
        if (m24787a != null) {
            return m24787a.data;
        }
        return i11;
    }

    /* renamed from: b */
    public static int m20372b(Context context, int i10, String str) {
        return AbstractC6215b.m24789c(context, i10, str);
    }

    /* renamed from: c */
    public static int m20373c(View view, int i10) {
        return AbstractC6215b.m24790d(view, i10);
    }

    /* renamed from: d */
    public static int m20374d(View view, int i10, int i11) {
        return m20371a(view.getContext(), i10, i11);
    }

    /* renamed from: e */
    public static int m20375e(int i10, int i11) {
        return AbstractC6128a.m24424c(i11, i10);
    }

    /* renamed from: f */
    public static int m20376f(int i10, int i11, float f10) {
        return m20375e(i10, AbstractC6128a.m24427f(i11, Math.round(Color.alpha(i11) * f10)));
    }
}
