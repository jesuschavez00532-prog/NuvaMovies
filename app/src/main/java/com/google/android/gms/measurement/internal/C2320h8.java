package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PersistableBundle;
import com.umeng.ccg.C3417a;
import p025b5.InterfaceC1128z;
import p219l4.AbstractC5391n;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
/* loaded from: classes.dex */
public final class C2320h8 {

    /* renamed from: a */
    private final Context f8673a;

    public C2320h8(Context context) {
        AbstractC5391n.m21783i(context);
        this.f8673a = context;
    }

    /* renamed from: k */
    private final C2370m3 m9645k() {
        return C2415q4.m10013H(this.f8673a, null, null).mo9577b();
    }

    /* renamed from: a */
    public final int m9646a(final Intent intent, int i10, final int i11) {
        C2415q4 m10013H = C2415q4.m10013H(this.f8673a, null, null);
        final C2370m3 mo9577b = m10013H.mo9577b();
        if (intent == null) {
            mo9577b.m9805w().m9699a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        m10013H.mo9580d();
        mo9577b.m9804v().m9701c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m9653h(new Runnable() { // from class: com.google.android.gms.measurement.internal.f8
                @Override // java.lang.Runnable
                public final void run() {
                    C2320h8.this.m9648c(i11, mo9577b, intent);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m9647b(Intent intent) {
        if (intent == null) {
            m9645k().m9800r().m9699a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC2328i5(C2310g9.m9559f0(this.f8673a), null);
        }
        m9645k().m9805w().m9700b("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m9648c(int i10, C2370m3 c2370m3, Intent intent) {
        if (((InterfaceC1128z) this.f8673a).mo5107a(i10)) {
            c2370m3.m9804v().m9700b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            m9645k().m9804v().m9699a("Completed wakeful intent.");
            ((InterfaceC1128z) this.f8673a).mo5108b(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m9649d(C2370m3 c2370m3, JobParameters jobParameters) {
        c2370m3.m9804v().m9699a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC1128z) this.f8673a).mo5109c(jobParameters, false);
    }

    /* renamed from: e */
    public final void m9650e() {
        C2415q4 m10013H = C2415q4.m10013H(this.f8673a, null, null);
        C2370m3 mo9577b = m10013H.mo9577b();
        m10013H.mo9580d();
        mo9577b.m9804v().m9699a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void m9651f() {
        C2415q4 m10013H = C2415q4.m10013H(this.f8673a, null, null);
        C2370m3 mo9577b = m10013H.mo9577b();
        m10013H.mo9580d();
        mo9577b.m9804v().m9699a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void m9652g(Intent intent) {
        if (intent == null) {
            m9645k().m9800r().m9699a("onRebind called with null intent");
        } else {
            m9645k().m9804v().m9700b("onRebind called. action", intent.getAction());
        }
    }

    /* renamed from: h */
    public final void m9653h(Runnable runnable) {
        C2310g9 m9559f0 = C2310g9.m9559f0(this.f8673a);
        m9559f0.mo9575a().m9897z(new RunnableC2309g8(this, m9559f0, runnable));
    }

    /* renamed from: i */
    public final boolean m9654i(final JobParameters jobParameters) {
        PersistableBundle extras;
        String string;
        C2415q4 m10013H = C2415q4.m10013H(this.f8673a, null, null);
        final C2370m3 mo9577b = m10013H.mo9577b();
        extras = jobParameters.getExtras();
        string = extras.getString(C3417a.f15001w);
        m10013H.mo9580d();
        mo9577b.m9804v().m9700b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m9653h(new Runnable() { // from class: com.google.android.gms.measurement.internal.e8
                @Override // java.lang.Runnable
                public final void run() {
                    C2320h8.this.m9649d(mo9577b, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m9655j(Intent intent) {
        if (intent == null) {
            m9645k().m9800r().m9699a("onUnbind called with null intent");
            return true;
        }
        m9645k().m9804v().m9700b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
