package p172i4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.R$string;
import com.umeng.analytics.pro.C3309bd;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p219l4.AbstractC5391n;
import p219l4.AbstractC5401q0;
import p281p4.AbstractC6204h;
import p281p4.AbstractC6207k;
import p281p4.AbstractC6210n;
import p281p4.AbstractC6212p;
import p310r4.C6534e;

/* renamed from: i4.q */
/* loaded from: classes.dex */
public abstract class AbstractC4884q {

    /* renamed from: a */
    public static final int f20380a = 12451000;

    /* renamed from: c */
    private static boolean f20382c;

    /* renamed from: d */
    static boolean f20383d;

    /* renamed from: b */
    static final AtomicBoolean f20381b = new AtomicBoolean();

    /* renamed from: e */
    private static final AtomicBoolean f20384e = new AtomicBoolean();

    /* renamed from: a */
    public static int m20074a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* renamed from: b */
    public static String m20075b(int i10) {
        return C4854b.m20016o(i10);
    }

    /* renamed from: c */
    public static Resources m20076c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m20077d(Context context) {
        try {
            if (!f20383d) {
                PackageInfo m25567e = C6534e.m25570a(context).m25567e("com.google.android.gms", 64);
                C4886r.m20090a(context);
                if (m25567e != null && !C4886r.m20092e(m25567e, false) && C4886r.m20092e(m25567e, true)) {
                    f20382c = true;
                } else {
                    f20382c = false;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
        } finally {
            f20383d = true;
        }
        if (!f20382c && AbstractC6204h.m24756b()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static int m20078e(Context context, int i10) {
        boolean z10 = false;
        boolean z11 = false;
        PackageInfo packageInfo = null;
        try {
            context.getResources().getString(R$string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f20384e.get()) {
            int m21803a = AbstractC5401q0.m21803a(context);
            if (m21803a != 0) {
                if (m21803a != f20380a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(m21803a);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        if (!AbstractC6204h.m24758d(context) && !AbstractC6204h.m24760f(context)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC5391n.m21775a(z11);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C4886r.m20090a(context);
            if (!C4886r.m20092e(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z10) {
                    AbstractC5391n.m21783i(packageInfo);
                    if (!C4886r.m20092e(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z10 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else {
                    if (AbstractC6212p.m24783a(packageInfo2.versionCode) < AbstractC6212p.m24783a(i10)) {
                        Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + packageInfo2.versionCode);
                        return 2;
                    }
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                            return 1;
                        }
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    return 3;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    /* renamed from: f */
    public static boolean m20079f(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return m20083j(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m20080g(Context context) {
        if (AbstractC6207k.m24766c()) {
            Object systemService = context.getSystemService(C3309bd.f14106m);
            AbstractC5391n.m21783i(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public static boolean m20081h(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    /* renamed from: i */
    public static boolean m20082i(Context context, int i10, String str) {
        return AbstractC6210n.m24779b(context, i10, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static boolean m20083j(Context context, String str) {
        PackageInstaller packageInstaller;
        List allSessions;
        String appPackageName = null;
        ApplicationInfo applicationInfo = null;
        boolean equals = str.equals("com.google.android.gms");
        if (AbstractC6207k.m24769f()) {
            try {
                packageInstaller = context.getPackageManager().getPackageInstaller();
                allSessions = packageInstaller.getAllSessions();
                Iterator it = allSessions.iterator();
                while (it.hasNext()) {
                    appPackageName = AbstractC4880o.m20071a(it.next()).getAppPackageName();
                    if (str.equals(appPackageName)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled && !m20080g(context)) {
            return true;
        }
        return false;
    }
}
