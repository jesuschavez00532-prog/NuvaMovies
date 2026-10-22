package org.android.agoo.control;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.android.agoo.control.i */
/* loaded from: classes3.dex */
public class ServiceConnectionC6049i implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ BaseIntentService f23713a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC6049i(BaseIntentService baseIntentService) {
        this.f23713a = baseIntentService;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}
