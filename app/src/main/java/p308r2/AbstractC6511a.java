package p308r2;

import android.os.Build;
import java.lang.reflect.Field;
import p231m2.AbstractC5584b;

/* renamed from: r2.a */
/* loaded from: classes.dex */
public abstract class AbstractC6511a {

    /* renamed from: a */
    private static boolean f24980a;

    /* renamed from: a */
    public static void m25469a() {
        if (f24980a) {
            return;
        }
        f24980a = true;
        try {
            Class<?> cls = Class.forName("android.app.QueuedWork");
            if (Build.VERSION.SDK_INT >= 26) {
                Field declaredField = cls.getDeclaredField("sFinishers");
                declaredField.setAccessible(true);
                declaredField.set(null, new C6513c());
            } else {
                Field declaredField2 = cls.getDeclaredField("sPendingWorkFinishers");
                declaredField2.setAccessible(true);
                declaredField2.set(null, new C6512b());
            }
        } catch (Throwable th) {
            th.printStackTrace();
            AbstractC5584b.m22679a(th, "FIX SP ANR FAIL");
        }
    }
}
