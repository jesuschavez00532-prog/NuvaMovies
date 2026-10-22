package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.IBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.net.AbstractC3156a;
import com.taobao.accs.net.C3177v;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3209v;
import com.umeng.ccg.C3417a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.taobao.accs.internal.d */
/* loaded from: classes.dex */
public abstract class AbstractC3152d implements IBaseService {

    /* renamed from: a */
    protected static ConcurrentHashMap<String, AbstractC3156a> f12972a = new ConcurrentHashMap<>(2);

    /* renamed from: b */
    private Context f12973b;

    /* renamed from: c */
    private Service f12974c;

    public AbstractC3152d(Service service) {
        this.f12974c = service;
        this.f12973b = service.getApplicationContext();
    }

    /* renamed from: a */
    protected static AbstractC3156a m12834a(Context context, String str, boolean z10) {
        AbstractC3156a abstractC3156a = null;
        try {
        } catch (Throwable th) {
            ALog.m12939e("ElectionServiceImpl", "getConnection", th, new Object[0]);
        }
        if (TextUtils.isEmpty(str)) {
            ALog.m12944w("ElectionServiceImpl", "getConnection configTag null or env invalid", "conns.size", Integer.valueOf(f12972a.size()));
            if (f12972a.size() > 0) {
                return f12972a.elements().nextElement();
            }
            return null;
        }
        ALog.m12941i("ElectionServiceImpl", "getConnection", Constants.KEY_CONFIG_TAG, str, "start", Boolean.valueOf(z10));
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag != null && configByTag.getDisableChannel()) {
            ALog.m12940e("ElectionServiceImpl", "getConnection channel disabled!", Constants.KEY_CONFIG_TAG, str);
            return null;
        }
        int m13046b = C3209v.m13046b(context);
        String str2 = str + "|" + m13046b;
        synchronized (AbstractC3152d.class) {
            try {
                AbstractC3156a abstractC3156a2 = f12972a.get(str2);
                if (abstractC3156a2 == null) {
                    try {
                        AccsClientConfig.mEnv = m13046b;
                        abstractC3156a = new C3177v(context, 0, str);
                        f12972a.put(str2, abstractC3156a);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    abstractC3156a = abstractC3156a2;
                }
                if (z10) {
                    abstractC3156a.mo12840a();
                }
                return abstractC3156a;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* renamed from: b */
    private void m12836b(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra(Constants.KEY_APP_KEY);
            String stringExtra3 = intent.getStringExtra(Constants.KEY_TTID);
            String stringExtra4 = intent.getStringExtra("app_sercet");
            String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
            int intExtra = intent.getIntExtra(Constants.KEY_MODE, 0);
            ALog.m12941i("ElectionServiceImpl", "handleStartCommand", Constants.KEY_CONFIG_TAG, stringExtra5, "appkey", stringExtra2, "appSecret", stringExtra4, Constants.KEY_TTID, stringExtra3, "pkg", stringExtra);
            if (!TextUtils.isEmpty(stringExtra) && !TextUtils.isEmpty(stringExtra2) && stringExtra.equals(this.f12973b.getPackageName())) {
                C3209v.m13043a(this.f12973b, intExtra);
                AbstractC3156a m12834a = m12834a(this.f12973b, stringExtra5, false);
                if (m12834a != null) {
                    m12834a.f12978a = stringExtra3;
                } else {
                    ALog.m12940e("ElectionServiceImpl", "handleStartCommand start action, no connection", Constants.KEY_CONFIG_TAG, stringExtra5);
                }
            }
        } catch (Throwable th) {
            ALog.m12939e("ElectionServiceImpl", "handleStartCommand", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public abstract int mo12831a(Intent intent);

    @Override // com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onCreate() {
        ALog.m12941i("ElectionServiceImpl", "onCreate,", Constants.KEY_SDK_VERSION, Integer.valueOf(Constants.SDK_VERSION_CODE));
    }

    @Override // com.taobao.accs.base.IBaseService
    public void onDestroy() {
        ALog.m12940e("ElectionServiceImpl", "Service onDestroy", new Object[0]);
        this.f12973b = null;
        this.f12974c = null;
    }

    @Override // com.taobao.accs.base.IBaseService
    public int onStartCommand(Intent intent, int i10, int i11) {
        if (intent == null) {
            return 2;
        }
        String action = intent.getAction();
        ALog.m12941i("ElectionServiceImpl", "onStartCommand begin", C3417a.f15001w, action);
        if (TextUtils.equals(action, Constants.ACTION_START_SERVICE)) {
            m12836b(intent);
        }
        return mo12831a(intent);
    }

    @Override // com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public static AbstractC3156a m12835b(Context context, String str, boolean z10) {
        return m12834a(context, str, z10);
    }
}
