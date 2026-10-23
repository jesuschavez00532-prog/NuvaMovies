package p155h4;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p127f5.AbstractC4245i;
import p295q4.ThreadFactoryC6342a;
import p378w4.AbstractC7365e;

/* renamed from: h4.x */
/* loaded from: classes.dex */
public final class C4544x {

    /* renamed from: e */
    private static C4544x f19586e;

    /* renamed from: a */
    private final Context f19587a;

    /* renamed from: b */
    private final ScheduledExecutorService f19588b;

    /* renamed from: c */
    private ServiceConnectionC4538r f19589c = new ServiceConnectionC4538r(this, null);

    /* renamed from: d */
    private int f19590d = 1;

    C4544x(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f19588b = scheduledExecutorService;
        this.f19587a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m18935a(C4544x c4544x) {
        return c4544x.f19587a;
    }

    /* renamed from: b */
    public static synchronized C4544x m18936b(Context context) {
        C4544x c4544x;
        synchronized (C4544x.class) {
            if (f19586e == null) {
                AbstractC7365e.m28425a();
                f19586e = new C4544x(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ThreadFactoryC6342a("MessengerIpcClient"))));
            }
            c4544x = f19586e;
        }
        return c4544x;
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ ScheduledExecutorService m18937e(C4544x c4544x) {
        return c4544x.f19588b;
    }

    /* renamed from: f */
    private final synchronized int m18938f() {
        int i10 = 0;
        i10 = this.f19590d;
        this.f19590d = i10 + 1;
        return i10;
    }

    /* renamed from: g */
    private final synchronized AbstractC4245i m18939g(AbstractC4541u abstractC4541u) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(abstractC4541u);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append("Queueing ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        if (!this.f19589c.m18929g(abstractC4541u)) {
            ServiceConnectionC4538r serviceConnectionC4538r = new ServiceConnectionC4538r(this, null);
            this.f19589c = serviceConnectionC4538r;
            serviceConnectionC4538r.m18929g(abstractC4541u);
        }
        return abstractC4541u.f19583b.m17724a();
    }

    /* renamed from: c */
    public final AbstractC4245i m18940c(int i10, Bundle bundle) {
        return m18939g(new C4540t(m18938f(), 2, bundle));
    }

    /* renamed from: d */
    public final AbstractC4245i m18941d(int i10, Bundle bundle) {
        return m18939g(new C4543w(m18938f(), 1, bundle));
    }
}
