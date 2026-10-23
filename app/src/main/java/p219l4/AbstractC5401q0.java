package p219l4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p310r4.C6534e;

/* renamed from: l4.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC5401q0 {

    /* renamed from: a */
    private static final Object f22033a = new Object();

    /* renamed from: b */
    private static boolean f22034b;

    /* renamed from: c */
    private static String f22035c;

    /* renamed from: d */
    private static int f22036d;

    /* renamed from: a */
    public static int m21803a(Context context) {
        m21804b(context);
        return f22036d;
    }

    /* renamed from: b */
    private static void m21804b(Context context) {
        Bundle bundle = null;
        synchronized (f22033a) {
            if (f22034b) {
                return;
            }
            f22034b = true;
            try {
                bundle = C6534e.m25570a(context).m25565c(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
            if (bundle == null) {
                return;
            }
            f22035c = bundle.getString("com.google.app.id");
            f22036d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
