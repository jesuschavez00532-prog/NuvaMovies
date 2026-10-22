package androidx.core.view;

import android.view.MotionEvent;

/* renamed from: androidx.core.view.c0 */
/* loaded from: classes.dex */
public abstract class AbstractC0560c0 {
    /* renamed from: a */
    public static boolean m2430a(MotionEvent motionEvent, int i10) {
        if ((motionEvent.getSource() & i10) == i10) {
            return true;
        }
        return false;
    }
}
