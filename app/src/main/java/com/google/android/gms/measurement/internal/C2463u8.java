package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.AbstractC2139u0;
import com.google.android.gms.internal.measurement.AbstractC2184x0;
import com.umeng.ccg.C3417a;
import p005a4.AbstractC0025e;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
/* loaded from: classes.dex */
public final class C2463u8 extends AbstractC2485w8 {

    /* renamed from: d */
    private final AlarmManager f9134d;

    /* renamed from: e */
    private AbstractC2388o f9135e;

    /* renamed from: f */
    private Integer f9136f;

    /* JADX INFO: Access modifiers changed from: protected */
    public C2463u8(C2310g9 c2310g9) {
        super(c2310g9);
        this.f9134d = (AlarmManager) this.f8714a.mo9584f().getSystemService("alarm");
    }

    /* renamed from: o */
    private final int m10083o() {
        if (this.f9136f == null) {
            this.f9136f = Integer.valueOf("measurement".concat(String.valueOf(this.f8714a.mo9584f().getPackageName())).hashCode());
        }
        return this.f9136f.intValue();
    }

    /* renamed from: p */
    private final PendingIntent m10084p() {
        Context mo9584f = this.f8714a.mo9584f();
        return PendingIntent.getBroadcast(mo9584f, 0, new Intent().setClassName(mo9584f, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC2139u0.f8134a);
    }

    /* renamed from: q */
    private final AbstractC2388o m10085q() {
        if (this.f9135e == null) {
            this.f9135e = new C2452t8(this, this.f9168b.m9579c0());
        }
        return this.f9135e;
    }

    /* renamed from: r */
    private final void m10086r() {
        JobScheduler m150a = AbstractC0025e.m150a(this.f8714a.mo9584f().getSystemService("jobscheduler"));
        if (m150a != null) {
            m150a.cancel(m10083o());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485w8
    /* renamed from: l */
    protected final boolean mo9454l() {
        AlarmManager alarmManager = this.f9134d;
        if (alarmManager != null) {
            alarmManager.cancel(m10084p());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            m10086r();
            return false;
        }
        return false;
    }

    /* renamed from: m */
    public final void m10087m() {
        m10099i();
        this.f8714a.mo9577b().m9804v().m9699a("Unscheduling upload");
        AlarmManager alarmManager = this.f9134d;
        if (alarmManager != null) {
            alarmManager.cancel(m10084p());
        }
        m10085q().m9879b();
        if (Build.VERSION.SDK_INT >= 24) {
            m10086r();
        }
    }

    /* renamed from: n */
    public final void m10088n(long j10) {
        JobInfo.Builder minimumLatency;
        JobInfo.Builder overrideDeadline;
        JobInfo.Builder extras;
        JobInfo build;
        m10099i();
        this.f8714a.mo9580d();
        Context mo9584f = this.f8714a.mo9584f();
        if (!C2398o9.m9900Y(mo9584f)) {
            this.f8714a.mo9577b().m9799q().m9699a("Receiver not registered/enabled");
        }
        if (!C2398o9.m9901Z(mo9584f, false)) {
            this.f8714a.mo9577b().m9799q().m9699a("Service not registered/enabled");
        }
        m10087m();
        this.f8714a.mo9577b().m9804v().m9700b("Scheduling upload, millis", Long.valueOf(j10));
        long mo24748b = this.f8714a.mo9578c().mo24748b() + j10;
        this.f8714a.m10051z();
        if (j10 < Math.max(0L, ((Long) AbstractC2260c3.f8494y.m9456a(null)).longValue()) && !m10085q().m9881e()) {
            m10085q().m9880d(j10);
        }
        this.f8714a.mo9580d();
        if (Build.VERSION.SDK_INT >= 24) {
            Context mo9584f2 = this.f8714a.mo9584f();
            ComponentName componentName = new ComponentName(mo9584f2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int m10083o = m10083o();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(C3417a.f15001w, "com.google.android.gms.measurement.UPLOAD");
            minimumLatency = new JobInfo.Builder(m10083o, componentName).setMinimumLatency(j10);
            overrideDeadline = minimumLatency.setOverrideDeadline(j10 + j10);
            extras = overrideDeadline.setExtras(persistableBundle);
            build = extras.build();
            AbstractC2184x0.m9088a(mo9584f2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f9134d;
        if (alarmManager != null) {
            this.f8714a.m10051z();
            alarmManager.setInexactRepeating(2, mo24748b, Math.max(((Long) AbstractC2260c3.f8484t.m9456a(null)).longValue(), j10), m10084p());
        }
    }
}
