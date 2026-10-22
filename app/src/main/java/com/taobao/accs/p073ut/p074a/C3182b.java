package com.taobao.accs.p073ut.p074a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.b */
/* loaded from: classes.dex */
public class C3182b {

    /* renamed from: a */
    public String f13093a;

    /* renamed from: b */
    public String f13094b;

    /* renamed from: c */
    public boolean f13095c;

    /* renamed from: d */
    public String f13096d;

    /* renamed from: e */
    public String f13097e;

    /* renamed from: f */
    private final String f13098f = "BindUser";

    /* renamed from: g */
    private boolean f13099g = false;

    /* renamed from: b */
    private void m12926b(String str) {
        String str2;
        String str3;
        String str4;
        if (this.f13099g) {
            return;
        }
        this.f13099g = true;
        HashMap hashMap = new HashMap();
        try {
            str2 = this.f13093a;
            try {
                str3 = String.valueOf(Constants.SDK_VERSION_CODE);
                try {
                    hashMap.put("device_id", this.f13093a);
                    hashMap.put("bind_date", this.f13094b);
                    if (this.f13095c) {
                        str4 = "y";
                    } else {
                        str4 = "n";
                    }
                    hashMap.put("ret", str4);
                    hashMap.put("fail_reasons", this.f13096d);
                    hashMap.put("user_id", this.f13097e);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        ALog.m12938d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str2, (String) null, str3, hashMap), new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(66001, str, str2, (Object) null, str3, hashMap);
                } catch (Throwable th) {
                    th = th;
                    ALog.m12938d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str2, (String) null, str3, hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                str3 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            str2 = null;
            str3 = null;
        }
    }

    /* renamed from: a */
    public void m12929a(String str) {
        this.f13096d = str;
    }

    /* renamed from: a */
    public void m12928a(int i10) {
        if (i10 == -4) {
            m12929a("msg too large");
            return;
        }
        if (i10 == -3) {
            m12929a("service not available");
            return;
        }
        if (i10 == -2) {
            m12929a("param error");
            return;
        }
        if (i10 == -1) {
            m12929a("network fail");
        } else if (i10 != 200) {
            if (i10 != 300) {
                m12929a(String.valueOf(i10));
            } else {
                m12929a("app not bind");
            }
        }
    }

    /* renamed from: a */
    public void m12927a() {
        m12926b("BindUser");
    }
}
