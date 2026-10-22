package com.taobao.agoo.p075a.p076a;

import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3203p;

/* renamed from: com.taobao.agoo.a.a.d */
/* loaded from: classes.dex */
public class C3217d extends AbstractC3215b {
    public static final String JSON_CMD_DISABLEPUSH = "disablePush";
    public static final String JSON_CMD_ENABLEPUSH = "enablePush";

    /* renamed from: a */
    public String f13256a;

    /* renamed from: b */
    public String f13257b;

    /* renamed from: c */
    public String f13258c;

    /* renamed from: a */
    public byte[] m13066a() {
        try {
            C3203p.a aVar = new C3203p.a();
            aVar.m13022a(AbstractC3215b.JSON_CMD, this.f13236e).m13022a(Constants.KEY_APP_KEY, this.f13256a);
            if (TextUtils.isEmpty(this.f13257b)) {
                aVar.m13022a("utdid", this.f13258c);
            } else {
                aVar.m13022a("deviceId", this.f13257b);
            }
            String jSONObject = aVar.m13023a().toString();
            ALog.m12941i("SwitchDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m12939e("SwitchDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m13065a(String str, String str2, String str3, boolean z10) {
        C3217d c3217d = new C3217d();
        c3217d.f13256a = str;
        c3217d.f13257b = str2;
        c3217d.f13258c = str3;
        if (z10) {
            c3217d.f13236e = JSON_CMD_ENABLEPUSH;
        } else {
            c3217d.f13236e = JSON_CMD_DISABLEPUSH;
        }
        return c3217d.m13066a();
    }
}
