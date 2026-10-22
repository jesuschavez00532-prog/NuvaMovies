package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2320h8;
import p025b5.InterfaceC1128z;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC1128z {

    /* renamed from: a */
    private C2320h8 f8319a;

    /* renamed from: d */
    private final C2320h8 m9413d() {
        if (this.f8319a == null) {
            this.f8319a = new C2320h8(this);
        }
        return this.f8319a;
    }

    @Override // p025b5.InterfaceC1128z
    /* renamed from: a */
    public final boolean mo5107a(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // p025b5.InterfaceC1128z
    /* renamed from: b */
    public final void mo5108b(Intent intent) {
    }

    @Override // p025b5.InterfaceC1128z
    /* renamed from: c */
    public final void mo5109c(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m9413d().m9650e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m9413d().m9651f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m9413d().m9652g(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        m9413d().m9654i(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m9413d().m9655j(intent);
        return true;
    }
}
