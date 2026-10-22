package com.google.android.gms.measurement.internal;

import android.util.Log;
import anet.channel.entity.EventType;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.j3 */
/* loaded from: classes.dex */
public final class RunnableC2337j3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f8706a;

    /* renamed from: b */
    final /* synthetic */ String f8707b;

    /* renamed from: c */
    final /* synthetic */ Object f8708c;

    /* renamed from: d */
    final /* synthetic */ Object f8709d;

    /* renamed from: e */
    final /* synthetic */ Object f8710e;

    /* renamed from: f */
    final /* synthetic */ C2370m3 f8711f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2337j3(C2370m3 c2370m3, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f8711f = c2370m3;
        this.f8706a = i10;
        this.f8707b = str;
        this.f8708c = obj;
        this.f8709d = obj2;
        this.f8710e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j10;
        char c11;
        long j11;
        C2238a4 m10024F = this.f8711f.f8714a.m10024F();
        if (m10024F.m9734n()) {
            C2370m3 c2370m3 = this.f8711f;
            c10 = c2370m3.f8787c;
            if (c10 == 0) {
                if (c2370m3.f8714a.m10051z().m9620H()) {
                    C2370m3 c2370m32 = this.f8711f;
                    c2370m32.f8714a.mo9580d();
                    c2370m32.f8787c = 'C';
                } else {
                    C2370m3 c2370m33 = this.f8711f;
                    c2370m33.f8714a.mo9580d();
                    c2370m33.f8787c = 'c';
                }
            }
            C2370m3 c2370m34 = this.f8711f;
            j10 = c2370m34.f8788d;
            if (j10 < 0) {
                c2370m34.f8714a.m10051z().m9627q();
                c2370m34.f8788d = 73000L;
            }
            char charAt = "01VDIWEA?".charAt(this.f8706a);
            C2370m3 c2370m35 = this.f8711f;
            c11 = c2370m35.f8787c;
            j11 = c2370m35.f8788d;
            String str = "2" + charAt + c11 + j11 + ":" + C2370m3.m9789A(true, this.f8707b, this.f8708c, this.f8709d, this.f8710e);
            if (str.length() > 1024) {
                str = this.f8707b.substring(0, EventType.AUTH_FAIL);
            }
            C2502y3 c2502y3 = m10024F.f8337d;
            if (c2502y3 != null) {
                c2502y3.m10113b(str, 1L);
                return;
            }
            return;
        }
        Log.println(6, this.f8711f.m9797C(), "Persisted config not initialized. Not logging error/warn");
    }
}
