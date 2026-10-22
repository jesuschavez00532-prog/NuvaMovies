package com.efs.sdk.base.core.p051b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.efs.sdk.base.core.config.GlobalInfoManager;
import com.efs.sdk.base.core.config.remote.C1698b;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.p055d.C1708f;
import com.efs.sdk.base.core.util.C1713a;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.concurrent.C1720a;
import com.efs.sdk.base.newsharedpreferences.SharedPreferencesUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.efs.sdk.base.core.b.c */
/* loaded from: classes.dex */
public class HandlerC1672c extends Handler {

    /* renamed from: a */
    private static final Map<String, Long> f7033a = new HashMap<String, Long>() { // from class: com.efs.sdk.base.core.b.c.1
        {
            put("flow_5min", 300000L);
            put("flow_hour", 3600000L);
            put("flow_day", 86400000L);
        }
    };

    /* renamed from: b */
    private static final Map<String, Long> f7034b = new HashMap<String, Long>() { // from class: com.efs.sdk.base.core.b.c.2
        {
            put("flow_5min", 1048576L);
            put("flow_hour", 1048576L);
            put("flow_day", 2097152L);
        }
    };

    /* renamed from: c */
    private Map<String, AtomicInteger> f7035c;

    /* renamed from: d */
    private volatile SharedPreferences f7036d;

    /* renamed from: e */
    private volatile SharedPreferences.Editor f7037e;

    /* renamed from: f */
    private Context f7038f;

    /* renamed from: g */
    private String f7039g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.b.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final HandlerC1672c f7040a = new HandlerC1672c(0);
    }

    /* synthetic */ HandlerC1672c(byte b10) {
        this();
    }

    /* renamed from: a */
    public static HandlerC1672c m7631a() {
        return a.f7040a;
    }

    /* renamed from: b */
    private void m7635b() {
        try {
            m7636c();
        } catch (Throwable th) {
            Log.m7727e("efs.flow", "init sharedpreferences error", th);
        }
    }

    /* renamed from: c */
    private void m7636c() {
        if (this.f7036d == null) {
            synchronized (HandlerC1672c.class) {
                if (this.f7036d == null) {
                    this.f7036d = SharedPreferencesUtils.getSharedPreferences(this.f7038f, this.f7039g.toLowerCase() + "_flow");
                }
            }
        }
        if (this.f7037e == null) {
            synchronized (HandlerC1672c.class) {
                if (this.f7037e == null) {
                    this.f7037e = this.f7036d.edit();
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                Log.m7738w("efs.flow", "flow stat listener not support action '" + message.what + "'");
                return;
            }
            String valueOf = String.valueOf(message.obj);
            long j10 = message.arg1;
            m7635b();
            if (this.f7036d == null) {
                Log.m7738w("efs.flow", "sharedpreferences is null, cann't get last refresh timestamp");
                return;
            }
            if (this.f7037e == null) {
                Log.m7738w("efs.flow", "sharedpreferences editor is null, cann't refresh timestamp");
                return;
            }
            String concat = "curr_time_".concat(valueOf);
            if (Math.abs(System.currentTimeMillis() - this.f7036d.getLong(concat, System.currentTimeMillis())) >= j10) {
                for (String str : this.f7036d.getAll().keySet()) {
                    if (str.startsWith(valueOf)) {
                        this.f7037e.putLong(str, 0L);
                    }
                }
                this.f7037e.putLong(concat, System.currentTimeMillis());
                this.f7037e.apply();
                this.f7035c.clear();
                return;
            }
            return;
        }
        m7635b();
        if (this.f7036d == null) {
            Log.m7738w("efs.flow", "sharedpreferences is null, cann't get last flow stat");
            return;
        }
        if (this.f7037e == null) {
            Log.m7738w("efs.flow", "sharedpreferences editor is null, cann't refresh flow stat");
            return;
        }
        String valueOf2 = String.valueOf(message.obj);
        long j11 = message.arg1;
        String netStatus = GlobalInfoManager.getInstance().getNetStatus();
        for (String str2 : f7033a.keySet()) {
            String concat2 = "curr_time_".concat(String.valueOf(str2));
            if (!this.f7036d.contains(concat2)) {
                this.f7037e.putLong(concat2, System.currentTimeMillis());
            }
            for (String str3 : m7632a(str2, valueOf2, netStatus)) {
                this.f7037e.putLong(str3, this.f7036d.getLong(str3, 0L) + j11);
            }
        }
        this.f7037e.apply();
    }

    private HandlerC1672c() {
        super(C1720a.f7206a.getLooper());
        this.f7035c = new ConcurrentHashMap(5);
        this.f7038f = ControllerCenter.getGlobalEnvStruct().mAppContext;
        this.f7039g = ControllerCenter.getGlobalEnvStruct().getAppid();
        m7635b();
        File m7745c = C1713a.m7745c(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (m7745c.exists()) {
            FileUtil.delete(m7745c);
        }
    }

    /* renamed from: a */
    public final boolean m7637a(String str, long j10) {
        String netStatus = GlobalInfoManager.getInstance().getNetStatus();
        boolean z10 = true;
        for (Map.Entry<String, Long> entry : f7033a.entrySet()) {
            z10 = m7634a(entry.getKey(), entry.getValue().longValue(), str, netStatus, j10);
            if (!z10) {
                break;
            }
        }
        return z10;
    }

    /* renamed from: a */
    private boolean m7634a(String str, long j10, String str2, String str3, long j11) {
        m7635b();
        if (this.f7036d == null) {
            Log.m7738w("efs.flow", "sharedpreferences is null, cann't get last flow stat");
            return false;
        }
        List<String> m7632a = m7632a(str, str2, str3);
        Map<String, String> m7696c = C1698b.m7679a().m7696c();
        for (String str4 : m7632a) {
            if (Math.abs(System.currentTimeMillis() - this.f7036d.getLong("curr_time_".concat(String.valueOf(str)), System.currentTimeMillis())) > j10) {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = str;
                obtain.arg1 = Long.valueOf(j10).intValue();
                sendMessage(obtain);
            }
            long m7630a = m7630a(m7696c, str, str4);
            long j12 = this.f7036d.getLong(str4, 0L);
            if (j12 + j11 > m7630a) {
                Log.m7730i("efs.flow", "flow limit, key: " + str4 + ", max: " + m7630a + ", now: " + j12 + ", size: " + j11);
                m7633a(str4);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m7633a(String str) {
        C1708f c1708f;
        C1708f c1708f2;
        if (!this.f7035c.containsKey(str) || this.f7035c.get(str) == null || this.f7035c.get(str).get() <= 10) {
            c1708f = C1708f.a.f7163a;
            c1708f.m7716a(C1698b.m7679a().f7118d.mConfigVersion, str);
            if (str.equals("flow_day")) {
                c1708f2 = C1708f.a.f7163a;
                c1708f2.m7715a(C1698b.m7679a().f7118d.mConfigVersion);
            }
            if (!this.f7035c.containsKey(str)) {
                this.f7035c.put(str, new AtomicInteger());
            }
            this.f7035c.get(str).incrementAndGet();
        }
    }

    /* renamed from: a */
    private static long m7630a(Map<String, String> map, String str, String str2) {
        long longValue = f7034b.get(str).longValue();
        if (map == null || !map.containsKey(str2) || TextUtils.isEmpty(map.get(str2))) {
            return longValue;
        }
        try {
            return Long.parseLong(map.get(str2));
        } catch (Throwable th) {
            Log.m7739w("efs.flow", "get max flow error", th);
            return longValue;
        }
    }

    /* renamed from: a */
    private static List<String> m7632a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str + "_" + str2);
        }
        if (!TextUtils.isEmpty(str3) && !"unknown".equalsIgnoreCase(str3)) {
            arrayList.add(str + "_" + str3);
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            arrayList.add(str + "_" + str2 + "_" + str3);
        }
        return arrayList;
    }
}
