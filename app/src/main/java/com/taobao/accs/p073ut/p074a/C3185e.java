package com.taobao.accs.p073ut.p074a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;

/* renamed from: com.taobao.accs.ut.a.e */
/* loaded from: classes.dex */
public class C3185e {

    /* renamed from: a */
    public String f13122a;

    /* renamed from: b */
    public String f13123b;

    /* renamed from: c */
    public String f13124c;

    /* renamed from: d */
    public String f13125d;

    /* renamed from: e */
    public String f13126e;

    /* renamed from: f */
    public String f13127f;

    /* renamed from: g */
    private final String f13128g = "sendAck";

    /* renamed from: h */
    private boolean f13129h = false;

    /* renamed from: a */
    public void m12932a() {
        String str;
        String str2;
        if (this.f13129h) {
            return;
        }
        this.f13129h = true;
        HashMap hashMap = new HashMap();
        try {
            str = this.f13122a;
            try {
                str2 = String.valueOf(Constants.SDK_VERSION_CODE);
                try {
                    hashMap.put("device_id", this.f13122a);
                    hashMap.put("session_id", this.f13123b);
                    hashMap.put("data_id", this.f13124c);
                    hashMap.put("ack_date", this.f13125d);
                    hashMap.put("service_id", this.f13126e);
                    hashMap.put("fail_reasons", this.f13127f);
                    UTMini.getInstance().commitEvent(66001, "sendAck", str, (Object) null, str2, hashMap);
                } catch (Throwable th) {
                    th = th;
                    ALog.m12938d("accs.SendAckStatistic", UTMini.getCommitInfo(66001, str, (String) null, str2, hashMap) + " " + th.toString(), new Object[0]);
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
