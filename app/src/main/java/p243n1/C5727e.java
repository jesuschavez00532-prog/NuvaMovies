package p243n1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p140g1.C4334b;
import p184j1.InterfaceC4975f;
import p243n1.InterfaceC5723a;

/* renamed from: n1.e */
/* loaded from: classes.dex */
public class C5727e implements InterfaceC5723a {

    /* renamed from: b */
    private final File f22996b;

    /* renamed from: c */
    private final long f22997c;

    /* renamed from: e */
    private C4334b f22999e;

    /* renamed from: d */
    private final C5725c f22998d = new C5725c();

    /* renamed from: a */
    private final C5733k f22995a = new C5733k();

    protected C5727e(File file, long j10) {
        this.f22996b = file;
        this.f22997c = j10;
    }

    /* renamed from: c */
    public static InterfaceC5723a m23125c(File file, long j10) {
        return new C5727e(file, j10);
    }

    /* renamed from: d */
    private synchronized C4334b m23126d() {
        if (this.f22999e == null) {
            this.f22999e = C4334b.m18152B(this.f22996b, 1, 1, this.f22997c);
        }
        return this.f22999e;
    }

    /* renamed from: e */
    private synchronized void m23127e() {
        this.f22999e = null;
    }

    @Override // p243n1.InterfaceC5723a
    /* renamed from: a */
    public void mo23117a(InterfaceC4975f interfaceC4975f, InterfaceC5723a.b bVar) {
        C4334b m23126d;
        String m23146b = this.f22995a.m23146b(interfaceC4975f);
        this.f22998d.m23120a(m23146b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + m23146b + " for for Key: " + interfaceC4975f);
            }
            try {
                m23126d = m23126d();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            if (m23126d.m18176z(m23146b) != null) {
                return;
            }
            C4334b.c m18175t = m23126d.m18175t(m23146b);
            if (m18175t != null) {
                try {
                    if (bVar.mo21457a(m18175t.m18183f(0))) {
                        m18175t.m18182e();
                    }
                    m18175t.m18181b();
                    return;
                } catch (Throwable th) {
                    m18175t.m18181b();
                    throw th;
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: " + m23146b);
        } finally {
            this.f22998d.m23121b(m23146b);
        }
    }

    @Override // p243n1.InterfaceC5723a
    /* renamed from: b */
    public File mo23118b(InterfaceC4975f interfaceC4975f) {
        String m23146b = this.f22995a.m23146b(interfaceC4975f);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + m23146b + " for for Key: " + interfaceC4975f);
        }
        try {
            C4334b.e m18176z = m23126d().m18176z(m23146b);
            if (m18176z == null) {
                return null;
            }
            return m18176z.m18198a(0);
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // p243n1.InterfaceC5723a
    public synchronized void clear() {
        try {
            try {
                m23126d().m18174r();
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e10);
                }
            }
        } finally {
            m23127e();
        }
    }
}
