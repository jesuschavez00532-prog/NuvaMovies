package com.taobao.accs.p073ut.p074a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.d */
/* loaded from: classes.dex */
public class C3184d {

    /* renamed from: a */
    public String f13111a;

    /* renamed from: b */
    public String f13112b;

    /* renamed from: c */
    public String f13113c;

    /* renamed from: d */
    public String f13114d;

    /* renamed from: e */
    public String f13115e;

    /* renamed from: f */
    public String f13116f;

    /* renamed from: g */
    public String f13117g;

    /* renamed from: i */
    public String f13119i;

    /* renamed from: j */
    private final String f13120j = "receiveMessage";

    /* renamed from: h */
    public boolean f13118h = false;

    /* renamed from: k */
    private boolean f13121k = false;

    /* renamed from: a */
    public void m12931a() {
        String str;
        String str2;
        String str3;
        if (this.f13121k) {
            return;
        }
        this.f13121k = true;
        HashMap hashMap = new HashMap();
        try {
            str = this.f13111a;
            try {
                str2 = String.valueOf(Constants.SDK_VERSION_CODE);
                try {
                    hashMap.put("device_id", this.f13111a);
                    hashMap.put("data_id", this.f13112b);
                    hashMap.put("receive_date", this.f13113c);
                    hashMap.put("to_bz_date", this.f13114d);
                    hashMap.put("service_id", this.f13115e);
                    hashMap.put("data_length", this.f13116f);
                    hashMap.put("msg_type", this.f13117g);
                    if (this.f13118h) {
                        str3 = "y";
                    } else {
                        str3 = "n";
                    }
                    hashMap.put("repeat", str3);
                    hashMap.put("user_id", this.f13119i);
                    UTMini.getInstance().commitEvent(66001, "receiveMessage", str, (Object) null, str2, hashMap);
                } catch (Throwable th) {
                    th = th;
                    ALog.m12938d("ReceiveMessage", UTMini.getCommitInfo(66001, str, (String) null, str2, hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = null;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
            str2 = null;
        }
    }
}
