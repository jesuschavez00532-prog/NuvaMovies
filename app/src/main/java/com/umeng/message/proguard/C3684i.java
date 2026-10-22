package com.umeng.message.proguard;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import com.taobao.accs.EventReceiver;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.AgooCommondReceiver;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.message.common.UPLog;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.i */
/* loaded from: classes3.dex */
public final class C3684i {

    /* renamed from: a */
    private static boolean f16518a = false;

    /* renamed from: b */
    private static volatile boolean f16519b = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.i$a */
    /* loaded from: classes3.dex */
    public static class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final Context context, final Intent intent) {
            if (C3684i.f16519b && intent != null && intent.getData() != null) {
                C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.i.a.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            C3684i.m15775a(context, intent);
                        } catch (Throwable th) {
                            UPLog.m15196e("ReceiverHelper", th);
                        }
                    }
                });
            }
        }

        /* synthetic */ a(byte b10) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.umeng.message.proguard.i$b */
    /* loaded from: classes3.dex */
    public static class b extends BroadcastReceiver {

        /* renamed from: a */
        private final BroadcastReceiver f16523a = new EventReceiver();

        b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            C3581b.m15378c(new Runnable() { // from class: com.umeng.message.proguard.i.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        b.this.f16523a.onReceive(context, intent);
                    } catch (Throwable th) {
                        UPLog.m15196e("ReceiverHelper", th);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m15777a(boolean z10) {
        f16519b = z10;
    }

    /* renamed from: a */
    public static synchronized void m15774a() {
        synchronized (C3684i.class) {
            if (f16518a) {
                return;
            }
            Application m15840a = C3706y.m15840a();
            if (m15840a == null) {
                return;
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                if (Build.VERSION.SDK_INT >= 33) {
                    m15840a.registerReceiver(new b(), intentFilter, 2);
                } else {
                    m15840a.registerReceiver(new b(), intentFilter);
                }
            } catch (Throwable unused) {
            }
            if (f16519b) {
                try {
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter2.addDataScheme(Constants.KEY_PACKAGE);
                    byte b10 = 0;
                    if (Build.VERSION.SDK_INT >= 33) {
                        m15840a.registerReceiver(new a(b10), intentFilter2, 2);
                    } else {
                        m15840a.registerReceiver(new a(b10), intentFilter2);
                    }
                } catch (Throwable unused2) {
                }
                f16518a = true;
            }
        }
    }

    /* renamed from: a */
    private static void m15776a(String str, int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pkg", str);
            jSONObject.put("action_type", i10);
            UMWorkDispatch.sendEvent(C3706y.m15840a(), 16390, C3704w.m15832a(), jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m15775a(Context context, Intent intent) {
        Uri data;
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        String action = intent.getAction();
        String schemeSpecificPart = data.getSchemeSpecificPart();
        if (schemeSpecificPart == null || schemeSpecificPart.length() == 0) {
            return;
        }
        if ("android.intent.action.PACKAGE_REMOVED".equals(action) && !booleanExtra) {
            m15776a(schemeSpecificPart, 80);
            new AgooCommondReceiver().onReceive(context, intent);
        } else if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
            if (booleanExtra) {
                m15776a(schemeSpecificPart, 81);
            } else {
                m15776a(schemeSpecificPart, 82);
            }
        }
    }
}
