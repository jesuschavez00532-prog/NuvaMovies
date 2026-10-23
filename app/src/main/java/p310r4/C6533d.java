package p310r4;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import p281p4.AbstractC6207k;

/* renamed from: r4.d */
/* loaded from: classes.dex */
public class C6533d {

    /* renamed from: a */
    protected final Context f25142a;

    public C6533d(Context context) {
        this.f25142a = context;
    }

    /* renamed from: a */
    public int m25563a(String str) {
        return this.f25142a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int m25564b(String str, String str2) {
        return this.f25142a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo m25565c(String str, int i10) throws android.content.pm.PackageManager.NameNotFoundException {
        return this.f25142a.getPackageManager().getApplicationInfo(str, i10);
    }

    /* renamed from: d */
    public CharSequence m25566d(String str) throws android.content.pm.PackageManager.NameNotFoundException {
        return this.f25142a.getPackageManager().getApplicationLabel(this.f25142a.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public PackageInfo m25567e(String str, int i10) throws android.content.pm.PackageManager.NameNotFoundException {
        return this.f25142a.getPackageManager().getPackageInfo(str, i10);
    }

    /* renamed from: f */
    public boolean m25568f() {
        String nameForUid = null;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC6531b.m25561a(this.f25142a);
        }
        if (AbstractC6207k.m24771h() && (nameForUid = this.f25142a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = this.f25142a.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m25569g(int i10, String str) {
        if (AbstractC6207k.m24767d()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f25142a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.f25142a.getPackageManager().getPackagesForUid(i10);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
