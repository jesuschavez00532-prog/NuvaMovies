package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.C2320h8;
import p025b5.InterfaceC1128z;
import p107e0.AbstractC4106a;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC1128z {

    /* renamed from: a */
    private C2320h8 f8321a;

    /* renamed from: d */
    private final C2320h8 m9414d() {
        if (this.f8321a == null) {
            this.f8321a = new C2320h8(this);
        }
        return this.f8321a;
    }

    @Override // p025b5.InterfaceC1128z
    /* renamed from: a */
    public final boolean mo5107a(int i10) {
        return stopSelfResult(i10);
    }

    @Override // p025b5.InterfaceC1128z
    /* renamed from: b */
    public final void mo5108b(Intent intent) {
        AbstractC4106a.m17174b(intent);
    }

    @Override // p025b5.InterfaceC1128z
    /* renamed from: c */
    public final void mo5109c(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return m9414d().m9647b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m9414d().m9650e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m9414d().m9651f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m9414d().m9652g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        m9414d().m9646a(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m9414d().m9655j(intent);
        return true;
    }
}
