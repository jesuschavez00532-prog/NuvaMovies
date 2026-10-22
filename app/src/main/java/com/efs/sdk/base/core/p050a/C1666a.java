package com.efs.sdk.base.core.p050a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.p056a.C1715b;
import com.efs.sdk.base.core.util.p056a.C1717d;
import com.efs.sdk.base.http.HttpResponse;
import com.taobao.accs.common.Constants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.message.MessageService;
import org.json.JSONObject;

/* renamed from: com.efs.sdk.base.core.a.a */
/* loaded from: classes.dex */
public final class C1666a {

    /* renamed from: b */
    private static volatile long f7013b = -1;

    /* renamed from: a */
    public boolean f7014a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.a.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private static final C1666a f7015a = new C1666a(0);
    }

    /* synthetic */ C1666a(byte b10) {
        this();
    }

    /* renamed from: a */
    public static C1666a m7610a() {
        return a.f7015a;
    }

    /* renamed from: b */
    public static long m7613b() {
        if (f7013b == -1) {
            return System.currentTimeMillis();
        }
        return SystemClock.elapsedRealtime() + f7013b;
    }

    private C1666a() {
        this.f7014a = true;
    }

    /* renamed from: a */
    public final HttpResponse m7614a(String str, C1668c c1668c, File file, boolean z10) {
        String m7623b = c1668c.m7623b();
        String m7611a = m7611a(str, c1668c);
        if (this.f7014a) {
            Log.m7730i("efs.px.api", "Upload file, url is ".concat(String.valueOf(m7611a)));
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("wpk-header", m7623b);
        C1717d m7764a = new C1717d(m7611a).m7764a(hashMap);
        m7764a.f7202a.f7197d = file;
        C1717d m7763a = m7764a.m7763a("type", c1668c.f7024h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c1668c.f7031o);
        return m7763a.m7763a("size", sb2.toString()).m7763a("flow_limit", Boolean.toString(z10)).m7762a(C1669d.m7624a()).m7761a().m7760b();
    }

    /* renamed from: a */
    public final HttpResponse m7615a(String str, C1668c c1668c, byte[] bArr, boolean z10) {
        String m7623b = c1668c.m7623b();
        String m7611a = m7611a(str, c1668c);
        if (this.f7014a) {
            Log.m7730i("efs.px.api", "upload buffer file, url is ".concat(String.valueOf(m7611a)));
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("wpk-header", m7623b);
        C1717d m7764a = new C1717d(m7611a).m7764a(hashMap);
        C1715b c1715b = m7764a.f7202a;
        c1715b.f7196c = bArr;
        c1715b.f7200g = true;
        C1717d m7763a = m7764a.m7763a("type", c1668c.f7024h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c1668c.f7031o);
        return m7763a.m7763a("size", sb2.toString()).m7763a("flow_limit", Boolean.toString(z10)).m7762a(C1669d.m7624a()).m7761a().m7760b();
    }

    /* renamed from: a */
    private static String m7611a(String str, C1668c c1668c) {
        byte b10 = c1668c.f7023g;
        return str + (b10 != 1 ? b10 != 2 ? b10 != 3 ? "/api/v1/raw/upload" : "/api/v1/mix/upload" : "/perf_upload" : "/apm_logs");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7612a(HttpResponse httpResponse) {
        if (httpResponse == null || !httpResponse.succ || TextUtils.isEmpty(httpResponse.data)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(httpResponse.data);
            String optString = jSONObject.optString(Constants.KEY_HTTP_CODE, "-1");
            httpResponse.setBizCode(optString);
            if (!MessageService.MSG_DB_READY_REPORT.equals(optString)) {
                httpResponse.succ = false;
            }
            if (jSONObject.has("cver")) {
                ((Map) httpResponse.extra).put("cver", jSONObject.getString("cver"));
            }
            long j10 = jSONObject.getLong("stm") * 1000;
            if (Math.abs(j10 - m7613b()) > 1500000) {
                f7013b = j10 - SystemClock.elapsedRealtime();
            }
        } catch (Throwable th) {
            Log.m7727e("efs.px.api", "checkPxReturn error", th);
        }
    }
}
