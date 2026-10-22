package p281p4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.umeng.analytics.pro.C3309bd;
import p172i4.AbstractC4884q;

/* renamed from: p4.h */
/* loaded from: classes.dex */
public abstract class AbstractC6204h {

    /* renamed from: a */
    private static Boolean f24371a;

    /* renamed from: b */
    private static Boolean f24372b;

    /* renamed from: c */
    private static Boolean f24373c;

    /* renamed from: d */
    private static Boolean f24374d;

    /* renamed from: a */
    public static boolean m24755a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f24374d == null) {
            boolean z10 = false;
            if (AbstractC6207k.m24771h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z10 = true;
            }
            f24374d = Boolean.valueOf(z10);
        }
        return f24374d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m24756b() {
        int i10 = AbstractC4884q.f20380a;
        return C3309bd.f14106m.equals(Build.TYPE);
    }

    /* renamed from: c */
    public static boolean m24757c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f24371a == null) {
            boolean z10 = false;
            if (AbstractC6207k.m24768e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z10 = true;
            }
            f24371a = Boolean.valueOf(z10);
        }
        return f24371a.booleanValue();
    }

    /* renamed from: d */
    public static boolean m24758d(Context context) {
        if (!m24757c(context) || AbstractC6207k.m24770g()) {
            if (m24759e(context)) {
                if (!AbstractC6207k.m24771h() || AbstractC6207k.m24774k()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m24759e(Context context) {
        if (f24372b == null) {
            boolean z10 = false;
            if (AbstractC6207k.m24769f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z10 = true;
            }
            f24372b = Boolean.valueOf(z10);
        }
        return f24372b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m24760f(Context context) {
        if (f24373c == null) {
            boolean z10 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z10 = false;
            }
            f24373c = Boolean.valueOf(z10);
        }
        return f24373c.booleanValue();
    }
}
