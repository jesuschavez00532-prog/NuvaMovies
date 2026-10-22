package com.taobao.accs.p071a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3198k;
import com.taobao.accs.utl.UtilityImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.taobao.accs.a.b */
/* loaded from: classes.dex */
public final class ServiceConnectionC3115b implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ Intent f12828a;

    /* renamed from: b */
    final /* synthetic */ Context f12829b;

    /* renamed from: c */
    final /* synthetic */ Context f12830c;

    /* renamed from: d */
    final /* synthetic */ int f12831d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServiceConnectionC3115b(Intent intent, Context context, Context context2, int i10) {
        this.f12828a = intent;
        this.f12829b = context;
        this.f12830c = context2;
        this.f12831d = i10;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ALog.m12938d(C3114a.TAG, "bindService connected", "componentName", componentName.toString());
        try {
            Messenger messenger = new Messenger(iBinder);
            Message message = new Message();
            message.getData().putParcelable("intent", this.f12828a);
            messenger.send(message);
            try {
                this.f12829b.unbindService(this);
            } catch (Throwable unused) {
            }
            if (!this.f12830c.getPackageName().equals(componentName.getPackageName())) {
                return;
            }
        } catch (Throwable th) {
            try {
                ALog.m12939e(C3114a.TAG, "dispatch intent with exception", th, new Object[0]);
                try {
                    this.f12829b.unbindService(this);
                } catch (Throwable unused2) {
                }
                if (!this.f12830c.getPackageName().equals(componentName.getPackageName())) {
                    return;
                }
            } finally {
            }
        }
        C3198k.m13009a("accs", BaseMonitor.ALARM_POINT_BIND, componentName.getClassName());
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        ALog.m12938d(C3114a.TAG, "bindService on disconnect", "componentName", componentName.toString());
        try {
            this.f12829b.unbindService(this);
        } catch (Throwable unused) {
        }
        if (this.f12830c.getPackageName().equals(componentName.getPackageName())) {
            C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_BIND, componentName.getClassName(), UtilityImpl.m12952a(this.f12831d - 3), "onServiceDisconnected");
        }
    }
}
