package com.taobao.accs.data;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3207t;
import com.taobao.accs.utl.C3209v;
import com.umeng.ccg.C3417a;

/* loaded from: classes.dex */
public class MsgDistributeService extends Service {

    /* renamed from: a */
    private static boolean f12912a;

    /* renamed from: b */
    private Messenger f12913b = new Messenger(new HandlerC3145j(this));

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (C3207t.m13037b() && C3209v.m13044a(this) && !f12912a) {
            f12912a = true;
            try {
                getApplicationContext().bindService(new Intent(this, getClass()), new ServiceConnectionC3146k(this), 1);
            } catch (Throwable th) {
                ALog.m12939e("MsgDistributeService", "bindService", th, new Object[0]);
                f12912a = false;
            }
        }
        return this.f12913b.getBinder();
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
        try {
            ALog.m12941i("MsgDistributeService", "onStartCommand", C3417a.f15001w, intent.getAction());
            if (!TextUtils.isEmpty(intent.getAction()) && TextUtils.equals(intent.getAction(), Constants.ACTION_SEND)) {
                ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3147l(this, intent));
            } else {
                ALog.m12941i("MsgDistributeService", "onStartCommand distribute message", new Object[0]);
                intent.setFlags(0);
                C3142g.m12798a(getApplicationContext(), intent);
            }
        } catch (Throwable th) {
            ALog.m12939e("MsgDistributeService", "onStartCommand", th, new Object[0]);
        }
        return 2;
    }
}
