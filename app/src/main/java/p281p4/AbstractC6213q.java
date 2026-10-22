package p281p4;

import android.os.Looper;

/* renamed from: p4.q */
/* loaded from: classes.dex */
public abstract class AbstractC6213q {
    /* renamed from: a */
    public static boolean m24784a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
