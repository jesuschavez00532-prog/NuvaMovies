package p345u;

import android.os.Handler;
import android.os.Looper;

/* renamed from: u.b */
/* loaded from: classes.dex */
abstract class AbstractC7001b {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Handler m27012a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
