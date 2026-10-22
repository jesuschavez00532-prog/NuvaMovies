package p433zd;

import android.util.TypedValue;

/* renamed from: zd.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7787c {
    /* renamed from: a */
    private static int m30168a(int i10) {
        return (i10 >> 0) & 15;
    }

    /* renamed from: b */
    public static boolean m30169b(TypedValue typedValue) {
        if (typedValue != null && typedValue.type == 5 && m30168a(typedValue.data) == 0) {
            return true;
        }
        return false;
    }
}
