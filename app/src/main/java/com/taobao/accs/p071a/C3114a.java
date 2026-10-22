package com.taobao.accs.p071a;

import android.content.Context;
import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3198k;
import com.taobao.accs.utl.C3209v;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.accs.a.a */
/* loaded from: classes.dex */
public class C3114a {
    public static final String TAG = "a";

    /* renamed from: a */
    public static void m12664a(Context context, Intent intent) {
        String className;
        String packageName;
        if (context != null && intent != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                if (intent.getComponent() == null) {
                    className = intent.toString();
                    packageName = "";
                } else {
                    className = intent.getComponent().getClassName();
                    packageName = intent.getComponent().getPackageName();
                }
                if (C3209v.m13044a(applicationContext)) {
                    ALog.m12941i(TAG, "dispatchIntent bind service start", "intent", intent.toString());
                    if (!applicationContext.bindService(intent, new ServiceConnectionC3115b(intent, applicationContext, context, 0), 1) && context.getPackageName().equals(packageName)) {
                        C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_BIND, intent.toString(), UtilityImpl.m12952a(-2), "dispatchIntent bindService return false");
                        return;
                    }
                    return;
                }
                ALog.m12941i(TAG, "dispatchIntent start service ", new Object[0]);
                applicationContext.startService(intent);
                if (context.getPackageName().equals(packageName)) {
                    C3198k.m13009a("accs", BaseMonitor.ALARM_POINT_BIND, className);
                    return;
                }
                return;
            } catch (Throwable th) {
                ALog.m12939e(TAG, "dispatchIntent method call with exception ", th, new Object[0]);
                if (context.getPackageName().equals(null)) {
                    C3198k.m13011a("accs", BaseMonitor.ALARM_POINT_BIND, intent.toString(), UtilityImpl.m12952a(-1), "dispatchIntent method call with exception");
                    return;
                }
                return;
            }
        }
        ALog.m12940e(TAG, "dispatchIntent context or intent is null", new Object[0]);
    }
}
