package p172i4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import p219l4.AbstractBinderC5395o0;
import p219l4.AbstractC5391n;
import p219l4.InterfaceC5398p0;
import p281p4.AbstractC6197a;
import p281p4.AbstractC6205i;
import p325s4.BinderC6676b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i4.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC4865g0 {

    /* renamed from: e */
    private static volatile InterfaceC5398p0 f20355e;

    /* renamed from: g */
    private static Context f20357g;

    /* renamed from: a */
    static final AbstractBinderC4861e0 f20351a = new BinderC4894y(AbstractBinderC4857c0.m20023M("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* renamed from: b */
    static final AbstractBinderC4861e0 f20352b = new BinderC4895z(AbstractBinderC4857c0.m20023M("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* renamed from: c */
    static final AbstractBinderC4861e0 f20353c = new BinderC4853a0(AbstractBinderC4857c0.m20023M("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* renamed from: d */
    static final AbstractBinderC4861e0 f20354d = new BinderC4855b0(AbstractBinderC4857c0.m20023M("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* renamed from: f */
    private static final Object f20356f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4885q0 m20032a(String str, AbstractBinderC4857c0 abstractBinderC4857c0, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m20037f(str, abstractBinderC4857c0, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C4885q0 m20033b(String str, boolean z10, boolean z11, boolean z12) {
        return m20038g(str, z10, false, false, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ String m20034c(boolean z10, String str, AbstractBinderC4857c0 abstractBinderC4857c0) {
        boolean z11 = false;
        String str2 = null;
        if (!z10 && m20037f(str, abstractBinderC4857c0, true, false).f20386a) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (true != z11) {
            str2 = "not allowed";
        } else {
            str2 = "debug cert rejected";
        }
        MessageDigest m24742b = AbstractC6197a.m24742b("SHA-256");
        AbstractC5391n.m21783i(m24742b);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, AbstractC6205i.m24761a(m24742b.digest(abstractBinderC4857c0.mo20024N())), Boolean.valueOf(z10), "12451000.false");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static synchronized void m20035d(Context context) {
        synchronized (AbstractC4865g0.class) {
            if (f20357g == null) {
                if (context != null) {
                    f20357g = context.getApplicationContext();
                    return;
                }
                return;
            }
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m20036e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                m20039h();
                return f20355e.mo21791i();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.C1816a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        }
    }

    /* renamed from: f */
    private static C4885q0 m20037f(final String str, final AbstractBinderC4857c0 abstractBinderC4857c0, final boolean z10, boolean z11) {
        try {
            m20039h();
            AbstractC5391n.m21783i(f20357g);
            try {
                if (f20355e.mo21789J(new C4875l0(str, abstractBinderC4857c0, z10, z11), BinderC6676b.m26053M(f20357g.getPackageManager()))) {
                    return C4885q0.m20084b();
                }
                return new C4881o0(new Callable() { // from class: i4.x
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return AbstractC4865g0.m20034c(z10, str, abstractBinderC4857c0);
                    }
                }, null);
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return C4885q0.m20086d("module call", e10);
            }
        } catch (DynamiteModule.C1816a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return C4885q0.m20086d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [s4.a, android.os.IBinder] */
    /* renamed from: g */
    private static C4885q0 m20038g(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        C4885q0 m20086d;
        C4871j0 mo21790K;
        PackageManager.NameNotFoundException nameNotFoundException;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            AbstractC5391n.m21783i(f20357g);
            try {
                m20039h();
                C4867h0 c4867h0 = new C4867h0(str, z10, false, BinderC6676b.m26053M(f20357g), false);
                try {
                    if (z13) {
                        mo21790K = f20355e.mo21788H(c4867h0);
                    } else {
                        mo21790K = f20355e.mo21790K(c4867h0);
                    }
                    if (mo21790K.m20065i()) {
                        m20086d = C4885q0.m20087f(mo21790K.m20066j());
                    } else {
                        String m20064g = mo21790K.m20064g();
                        if (mo21790K.m20067k() == 4) {
                            nameNotFoundException = new PackageManager.NameNotFoundException();
                        } else {
                            nameNotFoundException = null;
                        }
                        if (m20064g == null) {
                            m20064g = "error checking package certificate";
                        }
                        m20086d = C4885q0.m20088g(mo21790K.m20066j(), mo21790K.m20067k(), m20064g, nameNotFoundException);
                    }
                } catch (RemoteException e10) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                    m20086d = C4885q0.m20086d("module call", e10);
                }
            } catch (DynamiteModule.C1816a e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                m20086d = C4885q0.m20086d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
            }
            return m20086d;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: h */
    private static void m20039h() {
        if (f20355e != null) {
            return;
        }
        AbstractC5391n.m21783i(f20357g);
        synchronized (f20356f) {
            if (f20355e == null) {
                f20355e = AbstractBinderC5395o0.m21795c(DynamiteModule.m8058d(f20357g, DynamiteModule.f7630f, "com.google.android.gms.googlecertificates").m8066c("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
