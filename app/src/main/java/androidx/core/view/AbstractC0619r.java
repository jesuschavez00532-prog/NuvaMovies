package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: androidx.core.view.r */
/* loaded from: classes.dex */
public abstract class AbstractC0619r {
    /* renamed from: a */
    public static void m2799a(int i10, int i11, int i12, Rect rect, Rect rect2, int i13) {
        Gravity.apply(i10, i11, i12, rect, rect2, i13);
    }

    /* renamed from: b */
    public static int m2800b(int i10, int i11) {
        return Gravity.getAbsoluteGravity(i10, i11);
    }
}
