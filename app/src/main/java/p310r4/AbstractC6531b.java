package p310r4;

import android.content.Context;
import p281p4.AbstractC6207k;

/* renamed from: r4.b */
/* loaded from: classes.dex */
public abstract class AbstractC6531b {

    /* renamed from: a */
    private static Context f25140a;

    /* renamed from: b */
    private static Boolean f25141b;

    /* renamed from: a */
    public static synchronized boolean m25561a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (AbstractC6531b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f25140a;
            if (context2 != null && (bool = f25141b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f25141b = null;
            if (AbstractC6207k.m24771h()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f25141b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f25141b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f25141b = Boolean.FALSE;
                }
            }
            f25140a = applicationContext;
            return f25141b.booleanValue();
        }
    }
}
