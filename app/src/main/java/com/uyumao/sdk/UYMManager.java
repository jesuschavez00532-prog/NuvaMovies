package com.uyumao.sdk;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.umeng.ccg.ActionInfo;
import com.umeng.ccg.C3417a;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.uyumao.C3771c;
import com.uyumao.C3772d;
import com.uyumao.C3773e;
import com.uyumao.C3775g;
import com.uyumao.C3776h;
import com.uyumao.C3780l;
import com.uyumao.C3787s;
import com.uyumao.C3790t;
import com.uyumao.RunnableC3769a;
import com.uyumao.RunnableC3770b;
import com.uyumao.RunnableC3785q;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class UYMManager {

    /* renamed from: a */
    public static UYMManager f17002a;

    /* renamed from: com.uyumao.sdk.UYMManager$a */
    /* loaded from: classes3.dex */
    public class C3789a implements ActionInfo {
        public C3789a(UYMManager uYMManager) {
        }

        @Override // com.umeng.ccg.ActionInfo
        public String getModule(Context context) {
            return "anti";
        }

        @Override // com.umeng.ccg.ActionInfo
        public String[] getSupportAction(Context context) {
            return new String[]{C3417a.f14983e, C3417a.f14982d, C3417a.f14981c, C3417a.f14980b};
        }

        @Override // com.umeng.ccg.ActionInfo
        public boolean getSwitchState(Context context, String str) {
            boolean z10;
            if (C3417a.f14983e.equals(str)) {
                z10 = C3772d.f16938f;
            } else {
                z10 = false;
            }
            if (C3417a.f14982d.equals(str)) {
                boolean z11 = C3772d.f16933a;
                boolean z12 = C3772d.f16934b;
                if (z11 || z12) {
                    z10 = true;
                }
            }
            if (C3417a.f14981c.equals(str)) {
                z10 = C3772d.f16937e;
            }
            if (C3417a.f14980b.equals(str)) {
                boolean z13 = C3772d.f16935c;
                boolean z14 = C3772d.f16936d;
                if (z13 || z14) {
                    return true;
                }
            }
            return z10;
        }

        @Override // com.umeng.ccg.ActionInfo
        public void onCommand(Context context, String str, Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            boolean z10 = C3772d.f16933a;
            C3772d.f16939g = context.getApplicationContext();
            if (jSONObject != null) {
                try {
                    if (jSONObject.has("actionName")) {
                        Integer num = C3772d.f16945m.get(jSONObject.optString("actionName"));
                        if (num != null) {
                            C3775g.m16025a(context, num.intValue(), C3772d.e.f16950a, jSONObject);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static void enableYm1(Context context, boolean z10) {
        C3772d.f16933a = z10;
    }

    public static void enableYm2(Context context, boolean z10) {
        C3772d.f16934b = z10;
    }

    public static void enableYm3(Context context, boolean z10) {
        C3772d.f16935c = z10;
    }

    public static void enableYm4(Context context, boolean z10) {
        C3772d.f16936d = z10;
    }

    public static void enableYm5(Context context, boolean z10) {
        C3772d.f16937e = z10;
    }

    public static void enableYm6(Context context, boolean z10) {
        C3772d.f16938f = z10;
        try {
            Method m16058a = C3790t.m16058a("com.umeng.commonsdk.UMConfigure", "enableAplCollection", (Class<?>[]) new Class[]{Boolean.TYPE});
            if (m16058a != null) {
                C3790t.m16056a(m16058a, (Object) null, new Object[]{Boolean.valueOf(z10)});
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized UYMManager getInstance() {
        UYMManager uYMManager;
        synchronized (UYMManager.class) {
            if (f17002a == null) {
                f17002a = new UYMManager();
            }
            uYMManager = f17002a;
        }
        return uYMManager;
    }

    public static String getSdkVersion() {
        return "1.1.4";
    }

    public static void processEvent(Context context, String str) {
        boolean z10 = C3772d.f16933a;
        C3772d.f16939g = context.getApplicationContext();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("actionName")) {
                    Integer num = C3772d.f16945m.get(jSONObject.optString("actionName"));
                    if (num != null) {
                        C3775g.m16025a(context, num.intValue(), C3772d.e.f16950a, jSONObject);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized void init(Context context) {
        Future<?> future;
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        boolean z10 = true;
        if (!C3771c.f16931a) {
            C3771c.f16931a = true;
            if (applicationContext.getSharedPreferences("uyumao_info", 0).getBoolean(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date()), false)) {
                new Thread(new RunnableC3769a(applicationContext)).start();
            } else {
                C3780l.m16029a().m16030b().execute(new RunnableC3770b(applicationContext));
            }
            try {
                C3776h c3776h = C3771c.f16932b;
                if (c3776h != null) {
                    applicationContext.unregisterReceiver(c3776h);
                }
                C3771c.f16932b = new C3776h();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                applicationContext.registerReceiver(C3771c.f16932b, intentFilter);
            } catch (Throwable unused) {
            }
        }
        C3773e.f16951a = context;
        try {
            UMLog uMLog = UMConfigure.umDebugLog;
            if (UMConfigure.class.getDeclaredMethod("registerActionInfo", ActionInfo.class) == null) {
                z10 = false;
            }
            if (z10) {
                UMConfigure.registerActionInfo(new C3789a(this));
            }
        } catch (Throwable unused2) {
        }
        if (!C3772d.f16938f) {
            return;
        }
        try {
            WeakReference<Future<?>> weakReference = C3773e.f16952b;
            if (weakReference == null || (future = weakReference.get()) == null || future.isDone() || future.isCancelled()) {
                C3773e.f16952b = new WeakReference<>(C3787s.m16049a(new RunnableC3785q()));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
