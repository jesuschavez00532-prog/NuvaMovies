package com.umeng.message.proguard;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.taobao.accs.common.Constants;
import com.umeng.analytics.pro.C3309bd;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.proguard.InterfaceC3606bx;
import com.umeng.umzid.IZIDCompletionCallback;
import com.umeng.umzid.Spy;
import com.umeng.umzid.ZIDManager;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.umeng.message.proguard.cj */
/* loaded from: classes3.dex */
final class C3620cj extends AbstractC3618ch {

    /* renamed from: c */
    private static final AtomicInteger f16159c = new AtomicInteger(0);

    /* renamed from: a */
    private final InterfaceC3606bx.c f16160a;

    /* renamed from: b */
    private volatile boolean f16161b = false;

    public C3620cj(InterfaceC3606bx.c cVar) {
        this.f16160a = cVar;
    }

    /* renamed from: b */
    private JSONObject m15520b(C3636cz c3636cz) {
        int m15696b;
        String str;
        if (this.f16161b) {
            C3615ce.m15509a("Load", "ad load too frequency");
            return null;
        }
        this.f16161b = true;
        try {
            if (C3663dy.m15716b()) {
                C3615ce.m15512d("Load", "silent mode skipped!");
                this.f16161b = false;
                return null;
            }
            if (c3636cz != null && !TextUtils.isEmpty(c3636cz.f16276a.f16105a)) {
                Context m15638a = C3643de.m15638a();
                String appkey = UMUtils.getAppkey(m15638a);
                if (TextUtils.isEmpty(appkey)) {
                    C3615ce.m15512d("Load", "appkey empty! please call UMConfigure.init(...)");
                    this.f16161b = false;
                    return null;
                }
                String zid = UMUtils.getZid(m15638a);
                if (TextUtils.isEmpty(zid)) {
                    zid = m15517a(m15638a, appkey);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("slot_id", c3636cz.f16276a.f16105a);
                jSONObject.put("v", "6.0");
                jSONObject.put("ts", System.currentTimeMillis());
                String[] networkAccessMode = UMUtils.getNetworkAccessMode(m15638a);
                if (TextUtils.isEmpty(networkAccessMode[0])) {
                    networkAccessMode[0] = "Unknown";
                }
                jSONObject.put(C3325bt.f14172Q, networkAccessMode[0]);
                jSONObject.put(Constants.KEY_MODEL, C3611ca.m15490b());
                jSONObject.put(Constants.KEY_BRAND, C3611ca.m15492c());
                jSONObject.put("osv", Build.VERSION.RELEASE);
                jSONObject.put("os", DispatchConstants.ANDROID);
                Point m15729a = C3670ed.m15729a(m15638a);
                jSONObject.put("w", m15729a.x);
                jSONObject.put(C3325bt.f14195aM, m15729a.y);
                jSONObject.put(C3325bt.f14190aH, C3670ed.m15727a(m15729a));
                jSONObject.put("app_ver", UMUtils.getAppVersionName(m15638a));
                jSONObject.put("pkg_name", m15638a.getPackageName());
                jSONObject.put("app_name", UMUtils.getAppName(m15638a));
                jSONObject.put("app_key", appkey);
                jSONObject.put("sdk_ver", "2.0.0");
                jSONObject.put(C3309bd.f14097d, m15516a(m15638a));
                boolean z10 = c3636cz.f16278c;
                jSONObject.put("render", 0);
                if (!TextUtils.isEmpty(C3611ca.m15487a())) {
                    jSONObject.put("ui_ver", C3611ca.m15487a());
                }
                C3658dt m15682a = C3658dt.m15682a();
                if ((m15682a.f16442a.m15696b("as") == 1) && (m15696b = m15682a.f16442a.m15696b("an")) > 0) {
                    AtomicInteger atomicInteger = f16159c;
                    if (atomicInteger.getAndIncrement() % m15696b == 0) {
                        atomicInteger.set(1);
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        try {
                            str = Spy.getTag(m15638a);
                        } catch (Throwable unused) {
                            str = null;
                        }
                        String str2 = str == null ? "" : str;
                        C3615ce.m15509a("Load", "get tag consume:", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        jSONObject.put("at", str2);
                    }
                }
                String m15698b = m15682a.f16442a.m15698b("et", "");
                if (!TextUtils.isEmpty(m15698b)) {
                    jSONObject.put("et", m15698b);
                }
                jSONObject.put(C3325bt.f14265g, C3611ca.m15494d(m15638a));
                try {
                    jSONObject.put("oaid", C3611ca.m15493c(m15638a));
                    jSONObject.put("idfa", C3611ca.m15488a(m15638a));
                } catch (Throwable unused2) {
                }
                jSONObject.put("u2", C3611ca.m15496f(m15638a));
                jSONObject.put(Constants.KEY_IMEI, C3611ca.m15495e(m15638a));
                jSONObject.put("android_id", C3611ca.m15491b(m15638a));
                if (zid == null) {
                    zid = "";
                }
                jSONObject.put(C3325bt.f14220al, zid);
                jSONObject.put("b_mark", m15515a());
                jSONObject.put("u_mark", m15519b());
                JSONObject m15503a = C3613cc.m15503a(jSONObject, C3603bu.f16101a, appkey);
                try {
                    m15503a.put("slot_id", c3636cz.f16276a.f16105a);
                } catch (Exception unused3) {
                }
                if (m15503a.optInt(Constants.KEY_HTTP_CODE, -1) == 0) {
                    String optString = m15503a.optString("et");
                    if (optString.length() <= 2048) {
                        if (!TextUtils.equals(optString, m15698b)) {
                            m15682a.m15684a(optString);
                        }
                    } else {
                        m15682a.m15684a("");
                    }
                }
                if (z10) {
                    int optInt = m15503a.optInt("cfg_interval", -1);
                    if (optInt != -1) {
                        long j10 = optInt;
                        if (j10 > 0) {
                            m15682a.f16442a.m15693a(C3325bt.f14236ba, j10);
                        }
                    }
                    int optInt2 = m15503a.optInt("cfg_start", -1);
                    if (optInt2 != -1) {
                        long j11 = optInt2;
                        if (j11 > 0) {
                            m15682a.f16442a.m15693a("delay", j11);
                        }
                    }
                }
                int optInt3 = m15503a.optInt("as");
                int optInt4 = m15503a.optInt("an");
                m15682a.f16442a.m15692a("as", optInt3);
                m15682a.f16442a.m15692a("an", optInt4);
                return m15503a;
            }
            C3615ce.m15512d("Load", "config error! please setSlotId");
            this.f16161b = false;
            return null;
        } finally {
        }
    }

    @Override // com.umeng.message.proguard.AbstractC3618ch
    /* renamed from: a */
    public final C3621ck mo15513a(C3636cz c3636cz) {
        try {
            try {
                JSONObject m15520b = m15520b(c3636cz);
                if (m15520b == null) {
                    return new C3621ck(this.f16160a, "request ad failure.");
                }
                int optInt = m15520b.optInt(Constants.KEY_HTTP_CODE, -1);
                if (optInt != 0) {
                    C3615ce.m15510b("Load", "sid:", m15520b.optString("sid", ""), " code:", Integer.valueOf(optInt), " msg:", m15520b.optString("msg", ""));
                    return new C3621ck(this.f16160a, "no ad, code:".concat(String.valueOf(optInt)));
                }
                int optInt2 = m15520b.optInt("after_clk");
                if (optInt2 > 0 && optInt2 <= 6 && optInt2 != 5) {
                    C3621ck c3621ck = new C3621ck(m15520b);
                    if (!C3628cr.m15569a().mo15565b(c3621ck)) {
                        C3615ce.m15510b("Load", "pre check false");
                        C3628cr.m15569a().mo15564b(c3621ck, 2300);
                        return null;
                    }
                    InterfaceC3606bx.c cVar = c3621ck.f16165a;
                    if (cVar == null) {
                        C3615ce.m15510b("Load", "ad type = null. error");
                        return null;
                    }
                    if (this.f16160a != cVar) {
                        C3615ce.m15510b("Load", "ad type not match req:" + this.f16160a + " resp:" + cVar);
                        return null;
                    }
                    c3621ck.f16173i = System.currentTimeMillis();
                    return c3621ck;
                }
                C3615ce.m15510b("Load", "after_clk error:", Integer.valueOf(optInt2));
                return null;
            } catch (Throwable th) {
                C3615ce.m15512d("Load", "load fail:", th.getMessage());
                return null;
            }
        } catch (Throwable th2) {
            C3615ce.m15512d("Load", "load ad ", th2.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private String m15517a(Context context, String str) {
        final AtomicReference atomicReference = new AtomicReference();
        try {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            ZIDManager.getInstance().init(context, str, new IZIDCompletionCallback() { // from class: com.umeng.message.proguard.cj.1
                @Override // com.umeng.umzid.IZIDCompletionCallback
                public final void onFailure(String str2, String str3) {
                    try {
                        countDownLatch.countDown();
                    } catch (Throwable unused) {
                    }
                }

                @Override // com.umeng.umzid.IZIDCompletionCallback
                public final void onSuccess(String str2) {
                    try {
                        atomicReference.set(str2);
                        countDownLatch.countDown();
                    } catch (Throwable unused) {
                    }
                }
            });
            countDownLatch.await(5L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
        return (String) atomicReference.get();
    }

    /* renamed from: a */
    private static String m15516a(Context context) {
        if (C3663dy.m15711a(context)) {
            return C3663dy.m15705a();
        }
        String str = null;
        try {
            Cursor query = context.getContentResolver().query(C3635cy.m15592b(context), null, null, null, null);
            if (query != null && query.moveToFirst()) {
                str = query.getString(query.getColumnIndex(C3309bd.f14097d));
            }
            if (query != null) {
                query.close();
            }
        } catch (Throwable unused) {
        }
        return str == null ? "" : str;
    }

    /* renamed from: a */
    private static String m15515a() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/sys/kernel/random/boot_id"));
            String readLine = bufferedReader.readLine();
            r0 = readLine != null ? readLine : null;
            bufferedReader.close();
        } catch (Throwable unused) {
        }
        return r0;
    }

    /* renamed from: a */
    private static Date m15518a(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m15519b() {
        String str = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("stat -c %x /data/data").getInputStream()));
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                String[] split = readLine.split("\\.");
                int i10 = 0;
                String str2 = (m15518a(split[0]).getTime() / 1000) + ".";
                String str3 = split[1];
                String str4 = str3 != null ? str3.split(" ")[0] : "";
                if (!TextUtils.isEmpty(str4)) {
                    try {
                        i10 = Integer.parseInt(str4);
                    } catch (Throwable unused) {
                    }
                    str = str2 + i10;
                } else {
                    str = str2 + 0;
                }
            }
            bufferedReader.close();
        } catch (Throwable unused2) {
        }
        return str;
    }
}
