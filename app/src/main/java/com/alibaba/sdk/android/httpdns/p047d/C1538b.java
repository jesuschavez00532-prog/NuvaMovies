package com.alibaba.sdk.android.httpdns.p047d;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.utils.AlicloudTracker;
import com.alibaba.sdk.android.utils.AlicloudTrackerManager;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import com.taobao.agoo.p075a.p076a.AbstractC3215b;
import java.util.HashMap;

/* renamed from: com.alibaba.sdk.android.httpdns.d.b */
/* loaded from: classes.dex */
public class C1538b {

    /* renamed from: b */
    private static volatile C1538b f5909b;

    /* renamed from: a */
    private AlicloudTracker f5910a;

    /* renamed from: a */
    private AlicloudTrackerManager f5911a;

    /* renamed from: q */
    private boolean f5913q = true;

    /* renamed from: r */
    private boolean f5914r = false;

    /* renamed from: b */
    private C1537a f5912b = new C1537a();

    private C1538b(Context context) {
        this.f5910a = null;
        this.f5911a = null;
        if (context == null || !(context.getApplicationContext() instanceof Application)) {
            return;
        }
        AlicloudTrackerManager alicloudTrackerManager = AlicloudTrackerManager.getInstance((Application) context.getApplicationContext());
        this.f5911a = alicloudTrackerManager;
        if (alicloudTrackerManager != null) {
            this.f5910a = alicloudTrackerManager.getTracker("httpdns", "1.3.2.3-no-bssid-ssid");
        }
    }

    /* renamed from: a */
    public static C1538b m7126a() {
        return f5909b;
    }

    /* renamed from: b */
    public void m7136b(String str, int i10, int i11, int i12) {
        String str2;
        if (!this.f5913q) {
            str2 = "report is disabled";
        } else {
            if (this.f5910a == null) {
                Log.e("HttpDns:ReportManager", "report http dns succes failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && ((i10 == 0 || i10 == 1) && ((i11 == 0 || i11 == 1) && (i12 == 0 || i12 == 1)))) {
                final HashMap hashMap = new HashMap();
                hashMap.put("host", str);
                hashMap.put(AbstractC3215b.JSON_SUCCESS, String.valueOf(i10));
                hashMap.put("ipv6", String.valueOf(i11));
                hashMap.put("cacheOpen", String.valueOf(i12));
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.6
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("perf_user_getip", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str2 = "report http dns success failed due to invalid params";
        }
        Log.e("HttpDns:ReportManager", str2);
    }

    /* renamed from: c */
    public void m7139c(int i10) {
        String str;
        if (!this.f5913q) {
            str = "report is disabled";
        } else if (this.f5910a == null) {
            Log.e("HttpDns:ReportManager", "report cache failed due to tracker is null");
            return;
        } else {
            if (i10 == 0 || i10 == 1) {
                final HashMap hashMap = new HashMap();
                hashMap.put("enable", String.valueOf(i10));
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.10
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("biz_cache", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str = "report cache failed, due to invalid param enable, enable can only be 0 or 1";
        }
        Log.e("HttpDns:ReportManager", str);
    }

    /* renamed from: d */
    public void m7140d(int i10) {
        String str;
        if (!this.f5913q) {
            str = "report is disabled";
        } else if (this.f5910a == null) {
            Log.e("HttpDns:ReportManager", "report set expired ip enabled failed due to tracker is null");
            return;
        } else {
            if (i10 == 0 || i10 == 1) {
                final HashMap hashMap = new HashMap();
                hashMap.put("enable", String.valueOf(i10));
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.11
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("biz_expired_ip", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str = "report set expired ip enabled failed, due to invalid param enable, enable can only be 0 or 1";
        }
        Log.e("HttpDns:ReportManager", str);
    }

    /* renamed from: e */
    public void m7141e(int i10) {
        try {
            if (!this.f5913q) {
                Log.e("HttpDns:ReportManager", "report is disabled");
                return;
            }
            if (this.f5910a == null) {
                Log.e("HttpDns:ReportManager", "report ipv6 failed due to tracker is null");
                return;
            }
            if (i10 != 0 && i10 != 1) {
                Log.e("HttpDns:ReportManager", "report ipv6 failed, due to invalid param enable, enable can only be 0 or 1");
                return;
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("enable", String.valueOf(i10));
            this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.12
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1538b.this.f5910a.sendCustomHit("biz_ipv6_enable", hashMap);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: k */
    public void m7143k() {
        synchronized (C1538b.class) {
            this.f5914r = true;
            this.f5913q = false;
        }
    }

    /* renamed from: l */
    public void m7145l() {
        if (!this.f5913q) {
            Log.e("HttpDns:ReportManager", "report is disabled");
        } else if (this.f5910a != null) {
            this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        C1538b.this.f5910a.sendCustomHit("biz_active", null);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            });
        } else {
            Log.e("HttpDns:ReportManager", "report sdk start failed due to tracker is null");
        }
    }

    public void setAccountId(String str) {
        AlicloudTracker alicloudTracker = this.f5910a;
        if (alicloudTracker != null) {
            alicloudTracker.setGlobalProperty("accountId", str);
        } else {
            Log.e("HttpDns:ReportManager", "tracker null, set global properties failed");
        }
    }

    /* renamed from: a */
    public static C1538b m7127a(Context context) {
        if (f5909b == null) {
            synchronized (C1538b.class) {
                if (f5909b == null) {
                    f5909b = new C1538b(context);
                }
            }
        }
        return f5909b;
    }

    /* renamed from: b */
    public void m7137b(String str, long j10, int i10) {
        String str2;
        if (!this.f5913q) {
            str2 = "report is disabled";
        } else {
            if (this.f5910a == null) {
                Log.e("HttpDns:ReportManager", "report http dns request time cost failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && j10 > 0 && (i10 == 0 || i10 == 1)) {
                if (j10 > 30000) {
                    j10 = 30000;
                }
                final HashMap hashMap = new HashMap();
                hashMap.put("srvAddr", str);
                hashMap.put("cost", String.valueOf(j10));
                hashMap.put("ipv6", String.valueOf(i10));
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.4
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("perf_srv", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str2 = "report http dns request time cost failed due to invalid param";
        }
        Log.e("HttpDns:ReportManager", str2);
    }

    /* renamed from: e */
    public void m7142e(boolean z10) {
        synchronized (C1538b.class) {
            if (!this.f5914r) {
                this.f5913q = z10;
            }
        }
    }

    /* renamed from: k */
    public void m7144k(String str) {
        String str2;
        if (!this.f5913q) {
            str2 = "report is disabled";
        } else if (this.f5910a == null) {
            Log.e("HttpDns:ReportManager", "report uncaught exception failed due to tacker is null");
            return;
        } else {
            if (!TextUtils.isEmpty(str)) {
                final HashMap hashMap = new HashMap();
                hashMap.put("exception", str);
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("err_uncaught_exception", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str2 = "report uncaught exception failed due to exception msg is null";
        }
        Log.e("HttpDns:ReportManager", str2);
    }

    /* renamed from: b */
    public void m7138b(String str, String str2, String str3) {
        String str4;
        if (!this.f5913q) {
            str4 = "report is disabled";
        } else {
            if (this.f5910a == null) {
                Log.e("HttpDns:ReportManager", "report local disable failed due to tracker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                final HashMap hashMap = new HashMap();
                hashMap.put("host", str);
                hashMap.put("scAddr", str2);
                hashMap.put("srvAddr", str3);
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.9
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("biz_local_disable", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str4 = "report local disable failed due to missing params";
        }
        Log.e("HttpDns:ReportManager", str4);
    }

    /* renamed from: a */
    public void m7129a(String str, int i10, int i11, int i12) {
        String str2;
        if (!this.f5913q) {
            str2 = "report is disabled";
        } else {
            if (this.f5910a == null) {
                Log.e("HttpDns:ReportManager", "report http dns succes failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && ((i10 == 0 || i10 == 1) && ((i11 == 0 || i11 == 1) && (i12 == 0 || i12 == 1)))) {
                final HashMap hashMap = new HashMap();
                hashMap.put("host", str);
                hashMap.put(AbstractC3215b.JSON_SUCCESS, String.valueOf(i10));
                hashMap.put("ipv6", String.valueOf(i11));
                hashMap.put("cacheOpen", String.valueOf(i12));
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.5
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("perf_getip", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str2 = "report http dns success failed due to invalid params";
        }
        Log.e("HttpDns:ReportManager", str2);
    }

    /* renamed from: a */
    public void m7130a(String str, long j10, int i10) {
        String str2;
        if (!this.f5913q) {
            str2 = "report is disabled";
        } else {
            if (this.f5910a == null) {
                Log.e("HttpDns:ReportManager", "report sc request time cost failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && j10 > 0 && (i10 == 0 || i10 == 1)) {
                if (j10 > 30000) {
                    j10 = 30000;
                }
                final HashMap hashMap = new HashMap();
                hashMap.put("scAddr", str);
                hashMap.put("cost", String.valueOf(j10));
                hashMap.put("ipv6", String.valueOf(i10));
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("perf_sc", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str2 = "report sc request time cost failed due to invalid params";
        }
        Log.e("HttpDns:ReportManager", str2);
    }

    /* renamed from: a */
    public void m7131a(String str, String str2, String str3) {
        String str4;
        if (!this.f5913q) {
            str4 = "report is disabled";
        } else {
            if (this.f5910a == null) {
                Log.e("HttpDns:ReportManager", "report sniffer failed due to tracker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                final HashMap hashMap = new HashMap();
                hashMap.put("host", str);
                hashMap.put("scAddr", str2);
                hashMap.put("srvAddr", str3);
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.8
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("biz_sniffer", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str4 = "report sniffer failed due to missing params";
        }
        Log.e("HttpDns:ReportManager", str4);
    }

    /* renamed from: a */
    public void m7132a(String str, String str2, String str3, int i10) {
        String str4;
        if (!this.f5913q) {
            str4 = "report is disabled";
        } else {
            if (this.f5910a == null) {
                Log.e("HttpDns:ReportManager", "report error sc failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && (i10 == 0 || i10 == 1)) {
                final HashMap hashMap = new HashMap();
                hashMap.put("scAddr", str);
                hashMap.put("errCode", str2);
                hashMap.put("errMsg", str3);
                hashMap.put("ipv6", String.valueOf(i10));
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.13
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("err_sc", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str4 = "report error sc failed, due to invalid params";
        }
        Log.e("HttpDns:ReportManager", str4);
    }

    /* renamed from: a */
    public void m7133a(String str, String str2, String str3, int i10, int i11) {
        try {
            if (!this.f5913q) {
                Log.e("HttpDns:ReportManager", "report is disabled");
                return;
            }
            if (this.f5910a == null) {
                Log.e("HttpDns:ReportManager", "report error http dns request failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && ((i10 == 0 || i10 == 1) && (i11 == 0 || i11 == 1))) {
                final HashMap hashMap = new HashMap();
                hashMap.put("srvAddr", str);
                hashMap.put("errCode", str2);
                hashMap.put("errMsg", str3);
                hashMap.put("ipv6", String.valueOf(i10));
                hashMap.put("ipv6_srv", String.valueOf(i11));
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.14
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("err_srv", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            Log.e("HttpDns:ReportManager", "report error http dns request failed, due to invalid params");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m7134a(String str, String str2, String str3, long j10, long j11, int i10) {
        String str4;
        if (!this.f5913q) {
            str4 = "report is disabled";
        } else {
            if (this.f5910a == null) {
                Log.e("HttpDns:ReportManager", "report ip selection failed due to tacker is null");
                return;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && i10 > 0) {
                if (j10 > 5000) {
                    j10 = 5000;
                }
                if (j11 > 5000) {
                    j11 = 5000;
                }
                final HashMap hashMap = new HashMap();
                hashMap.put("host", str);
                hashMap.put("defaultIp", str2);
                hashMap.put("selectedIp", str3);
                hashMap.put("defaultIpCost", String.valueOf(j10));
                hashMap.put("selectedIpCost", String.valueOf(j11));
                hashMap.put("ipCount", String.valueOf(i10));
                this.f5912b.m7125b().submit(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.d.b.7
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C1538b.this.f5910a.sendCustomHit("perf_ipselection", hashMap);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                });
                return;
            }
            str4 = "report ip selection failed due to invalid params";
        }
        Log.e("HttpDns:ReportManager", str4);
    }

    /* renamed from: a */
    public boolean m7135a(SDKMessageCallback sDKMessageCallback) {
        try {
            AlicloudTrackerManager alicloudTrackerManager = this.f5911a;
            if (alicloudTrackerManager != null) {
                return alicloudTrackerManager.registerCrashDefend("httpdns", "1.3.2.3-no-bssid-ssid", 2, 7, sDKMessageCallback);
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }
}
