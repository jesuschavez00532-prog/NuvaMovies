package com.taobao.accs.p073ut.p074a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.a */
/* loaded from: classes.dex */
public class C3181a {

    /* renamed from: a */
    public String f13087a;

    /* renamed from: b */
    public String f13088b;

    /* renamed from: c */
    public boolean f13089c;

    /* renamed from: d */
    public String f13090d;

    /* renamed from: e */
    private final String f13091e = "BindApp";

    /* renamed from: f */
    private boolean f13092f = false;

    /* renamed from: b */
    private void m12922b(String str) {
        String str2;
        String str3;
        String str4;
        if (this.f13092f) {
            return;
        }
        this.f13092f = true;
        HashMap hashMap = new HashMap();
        try {
            str2 = this.f13087a;
            try {
                str3 = String.valueOf(Constants.SDK_VERSION_CODE);
                try {
                    hashMap.put("device_id", this.f13087a);
                    hashMap.put("bind_date", this.f13088b);
                    if (this.f13089c) {
                        str4 = "y";
                    } else {
                        str4 = "n";
                    }
                    hashMap.put("ret", str4);
                    hashMap.put("fail_reasons", this.f13090d);
                    hashMap.put("push_token", "");
                    UTMini.getInstance().commitEvent(66001, str, str2, (Object) null, str3, hashMap);
                } catch (Throwable th) {
                    th = th;
                    ALog.m12938d("BindAppStatistic", UTMini.getCommitInfo(66001, str2, (String) null, str3, hashMap) + " " + th.toString(), new Object[0]);
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
    public void m12925a(String str) {
        this.f13090d = str;
    }

    /* renamed from: a */
    public void m12924a(int i10) {
        if (i10 == -4) {
            m12925a("msg too large");
            return;
        }
        if (i10 == -3) {
            m12925a("service not available");
            return;
        }
        if (i10 == -2) {
            m12925a("param error");
            return;
        }
        if (i10 == -1) {
            m12925a("network fail");
        } else if (i10 != 200) {
            if (i10 != 300) {
                m12925a(String.valueOf(i10));
            } else {
                m12925a("app not bind");
            }
        }
    }

    /* renamed from: a */
    public void m12923a() {
        m12922b("BindApp");
    }
}
