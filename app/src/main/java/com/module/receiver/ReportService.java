package com.module.receiver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p421z0.C7734h;

/* loaded from: classes2.dex */
public class ReportService extends Service {

    /* renamed from: a */
    private String f12110a = ReportService.class.getSimpleName();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        C7734h.f28449q.m29905a().m29899t();
        return super.onStartCommand(intent, i10, i11);
    }
}
