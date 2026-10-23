package p172i4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import p219l4.AbstractC5391n;

/* renamed from: i4.r */
/* loaded from: classes.dex */
public class C4886r {

    /* renamed from: c */
    private static C4886r f20390c;

    /* renamed from: a */
    private final Context f20391a;

    /* renamed from: b */
    private volatile String f20392b;

    public C4886r(Context context) {
        this.f20391a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4886r m20090a(Context context) {
        AbstractC5391n.m21783i(context);
        synchronized (C4886r.class) {
            if (f20390c == null) {
                AbstractC4865g0.m20035d(context);
                f20390c = new C4886r(context);
            }
        }
        return f20390c;
    }

    /* renamed from: d */
    static final AbstractBinderC4857c0 m20091d(PackageInfo packageInfo, AbstractBinderC4857c0... abstractBinderC4857c0Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC4859d0 binderC4859d0 = new BinderC4859d0(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < abstractBinderC4857c0Arr.length; i10++) {
            if (abstractBinderC4857c0Arr[i10].equals(binderC4859d0)) {
                return abstractBinderC4857c0Arr[i10];
            }
        }
        return null;
    }

    /* renamed from: e */
    public static final boolean m20092e(PackageInfo packageInfo, boolean z10) {
        AbstractBinderC4857c0 m20091d;
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z10) {
                m20091d = m20091d(packageInfo, AbstractC4863f0.f20350a);
            } else {
                m20091d = m20091d(packageInfo, AbstractC4863f0.f20350a[0]);
            }
            if (m20091d != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final C4885q0 m20093f(String str, boolean z10, boolean z11) {
        C4885q0 m20085c;
        ApplicationInfo applicationInfo = null;
        if (str == null) {
            return C4885q0.m20085c("null pkg");
        }
        if (!str.equals(this.f20392b)) {
            if (AbstractC4865g0.m20036e()) {
                m20085c = AbstractC4865g0.m20033b(str, AbstractC4884q.m20077d(this.f20391a), false, false);
            } else {
                try {
                    PackageInfo packageInfo = this.f20391a.getPackageManager().getPackageInfo(str, 64);
                    boolean m20077d = AbstractC4884q.m20077d(this.f20391a);
                    if (packageInfo == null) {
                        m20085c = C4885q0.m20085c("null pkg");
                    } else {
                        Signature[] signatureArr = packageInfo.signatures;
                        if (signatureArr != null && signatureArr.length == 1) {
                            BinderC4859d0 binderC4859d0 = new BinderC4859d0(packageInfo.signatures[0].toByteArray());
                            String str2 = packageInfo.packageName;
                            C4885q0 m20032a = AbstractC4865g0.m20032a(str2, binderC4859d0, m20077d, false);
                            if (m20032a.f20386a && (applicationInfo = packageInfo.applicationInfo) != null && (applicationInfo.flags & 2) != 0 && AbstractC4865g0.m20032a(str2, binderC4859d0, false, true).f20386a) {
                                m20085c = C4885q0.m20085c("debuggable release cert app rejected");
                            } else {
                                m20085c = m20032a;
                            }
                        } else {
                            m20085c = C4885q0.m20085c("single cert required");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e10) {
                    return C4885q0.m20086d("no pkg ".concat(str), e10);
                }
            }
            if (m20085c.f20386a) {
                this.f20392b = str;
            }
            return m20085c;
        }
        return C4885q0.m20084b();
    }

    /* renamed from: b */
    public boolean m20094b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m20092e(packageInfo, false)) {
            return true;
        }
        if (m20092e(packageInfo, true)) {
            if (AbstractC4884q.m20077d(this.f20391a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    /* renamed from: c */
    public boolean m20095c(int i10) {
        C4885q0 m20085c;
        int length;
        String[] packagesForUid = this.f20391a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            m20085c = null;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    m20085c = m20093f(packagesForUid[i11], false, false);
                    if (m20085c.f20386a) {
                        break;
                    }
                    i11++;
                } else {
                    AbstractC5391n.m21783i(m20085c);
                    break;
                }
            }
        } else {
            m20085c = C4885q0.m20085c("no pkgs");
        }
        m20085c.m20089e();
        return m20085c.f20386a;
    }
}
