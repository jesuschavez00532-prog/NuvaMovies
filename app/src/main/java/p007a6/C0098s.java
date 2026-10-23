package p007a6;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.concurrent.Executor;
import p127f5.AbstractC4245i;
import p127f5.C4247j;
import p337t5.C6913d;
import p395x5.C7503f;

/* renamed from: a6.s */
/* loaded from: classes.dex */
public class C0098s {

    /* renamed from: a */
    private final SharedPreferences f318a;

    /* renamed from: b */
    private final C6913d f319b;

    /* renamed from: c */
    private final Object f320c;

    /* renamed from: d */
    C4247j f321d;

    /* renamed from: e */
    boolean f322e;

    /* renamed from: f */
    private boolean f323f;

    /* renamed from: g */
    private Boolean f324g;

    /* renamed from: h */
    private final C4247j f325h;

    public C0098s(C6913d c6913d) {
        Object obj = new Object();
        this.f320c = obj;
        this.f321d = new C4247j();
        this.f322e = false;
        this.f323f = false;
        this.f325h = new C4247j();
        Context m26867j = c6913d.m26867j();
        this.f319b = c6913d;
        this.f318a = AbstractC0074g.m268r(m26867j);
        Boolean m439b = m439b();
        this.f324g = m439b == null ? m438a(m26867j) : m439b;
        synchronized (obj) {
            if (m444d()) {
                this.f321d.m17728e(null);
                this.f322e = true;
            }
        }
    }

    /* renamed from: a */
    private Boolean m438a(Context context) {
        Boolean m441f = m441f(context);
        if (m441f == null) {
            this.f323f = false;
            return null;
        }
        this.f323f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(m441f));
    }

    /* renamed from: b */
    private Boolean m439b() {
        if (this.f318a.contains("firebase_crashlytics_collection_enabled")) {
            this.f323f = false;
            return Boolean.valueOf(this.f318a.getBoolean("firebase_crashlytics_collection_enabled", true));
        }
        return null;
    }

    /* renamed from: e */
    private void m440e(boolean z10) {
        String str = null;
        String str2 = null;
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.f324g == null) {
            str2 = "global Firebase setting";
        } else if (this.f323f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        C7503f.m28716f().m28717b(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
    }

    /* renamed from: f */
    private static Boolean m441f(Context context) {
        ApplicationInfo applicationInfo = null;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            C7503f.m28716f().m28720e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    /* renamed from: h */
    private static void m442h(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    /* renamed from: c */
    public void m443c(boolean z10) {
        if (z10) {
            this.f325h.m17728e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean m444d() {
        boolean m26871s;
        Boolean bool = this.f324g;
        if (bool != null) {
            m26871s = bool.booleanValue();
        } else {
            m26871s = this.f319b.m26871s();
        }
        m440e(m26871s);
        return m26871s;
    }

    /* renamed from: g */
    public synchronized void m445g(Boolean bool) {
        Boolean m438a;
        if (bool != null) {
            try {
                this.f323f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            m438a = bool;
        } else {
            m438a = m438a(this.f319b.m26867j());
        }
        this.f324g = m438a;
        m442h(this.f318a, bool);
        synchronized (this.f320c) {
            if (m444d()) {
                if (!this.f322e) {
                    this.f321d.m17728e(null);
                    this.f322e = true;
                }
            } else if (this.f322e) {
                this.f321d = new C4247j();
                this.f322e = false;
            }
        }
    }

    /* renamed from: i */
    public AbstractC4245i m446i() {
        AbstractC4245i m17724a;
        synchronized (this.f320c) {
            m17724a = this.f321d.m17724a();
        }
        return m17724a;
    }

    /* renamed from: j */
    public AbstractC4245i m447j(Executor executor) {
        return AbstractC0101t0.m459j(executor, this.f325h.m17724a(), m446i());
    }
}
