package p281p4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p172i4.C4886r;
import p310r4.C6534e;

/* renamed from: p4.n */
/* loaded from: classes.dex */
public abstract class AbstractC6210n {
    /* renamed from: a */
    public static boolean m24778a(Context context, int i10) {
        if (!m24779b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return C4886r.m20090a(context).m20094b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m24779b(Context context, int i10, String str) {
        return C6534e.m25570a(context).m25569g(i10, str);
    }
}
