package com.taobao.accs.client;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.taobao.accs.IProcessName;
import com.taobao.accs.utl.ALog;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.taobao.accs.client.a */
/* loaded from: classes.dex */
public class C3131a {

    /* renamed from: a */
    public static String f12857a;

    /* renamed from: b */
    public static String f12858b;

    /* renamed from: c */
    public static String f12859c;

    /* renamed from: d */
    public static String f12860d;

    /* renamed from: e */
    public static IProcessName f12861e;

    /* renamed from: f */
    public static AtomicInteger f12862f = new AtomicInteger(-1);

    /* renamed from: g */
    private static volatile C3131a f12863g;

    /* renamed from: h */
    private static Context f12864h;

    /* renamed from: i */
    private ActivityManager f12865i;

    private C3131a(Context context) {
        if (context != null) {
            if (f12864h == null) {
                f12864h = context.getApplicationContext();
                return;
            }
            return;
        }
        throw new RuntimeException("Context is null!!");
    }

    /* renamed from: a */
    public static C3131a m12732a(Context context) {
        if (f12863g == null) {
            synchronized (C3131a.class) {
                if (f12863g == null) {
                    f12863g = new C3131a(context);
                }
            }
        }
        return f12863g;
    }

    /* renamed from: b */
    public static String m12733b() {
        String str;
        if (TextUtils.isEmpty(f12857a)) {
            str = "com.umeng.message.component.UmengIntentService";
        } else {
            str = f12857a;
        }
        ALog.m12938d("AdapterGlobalClientInfo", "getAgooCustomServiceName", "serviceName", str);
        return str;
    }

    /* renamed from: c */
    public static boolean m12734c() {
        if (f12862f.intValue() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public ActivityManager m12735a() {
        if (this.f12865i == null) {
            this.f12865i = (ActivityManager) f12864h.getSystemService("activity");
        }
        return this.f12865i;
    }
}
