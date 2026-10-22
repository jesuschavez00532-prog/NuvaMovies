package com.taobao.agoo.p075a.p076a;

import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3203p;

/* renamed from: com.taobao.agoo.a.a.a */
/* loaded from: classes.dex */
public class C3214a extends AbstractC3215b {
    public static final String JSON_CMD_REMOVEALIAS = "removeAlias";
    public static final String JSON_CMD_REMOVEALLALIAS = "unbindAllAlias";
    public static final String JSON_CMD_SETALIAS = "setAlias";
    public static final String JSON_PUSH_USER_TOKEN = "pushAliasToken";

    /* renamed from: a */
    public String f13232a;

    /* renamed from: b */
    public String f13233b;

    /* renamed from: c */
    public String f13234c;

    /* renamed from: d */
    public String f13235d;

    /* renamed from: b */
    public static byte[] m13060b(String str, String str2, String str3) {
        C3214a c3214a = new C3214a();
        c3214a.f13232a = str;
        c3214a.f13233b = str2;
        c3214a.f13235d = str3;
        c3214a.f13236e = JSON_CMD_REMOVEALIAS;
        return c3214a.m13062a();
    }

    /* renamed from: c */
    public static byte[] m13061c(String str, String str2, String str3) {
        C3214a c3214a = new C3214a();
        c3214a.f13232a = str;
        c3214a.f13233b = str2;
        c3214a.f13234c = str3;
        c3214a.f13236e = JSON_CMD_REMOVEALIAS;
        return c3214a.m13062a();
    }

    /* renamed from: a */
    public byte[] m13062a() {
        try {
            String jSONObject = new C3203p.a().m13022a(AbstractC3215b.JSON_CMD, this.f13236e).m13022a(Constants.KEY_APP_KEY, this.f13232a).m13022a("deviceId", this.f13233b).m13022a("alias", this.f13234c).m13022a(JSON_PUSH_USER_TOKEN, this.f13235d).m13023a().toString();
            ALog.m12941i("AliasDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m12939e("AliasDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m13059a(String str, String str2, String str3) {
        C3214a c3214a = new C3214a();
        c3214a.f13232a = str;
        c3214a.f13233b = str2;
        c3214a.f13234c = str3;
        c3214a.f13236e = JSON_CMD_SETALIAS;
        return c3214a.m13062a();
    }

    /* renamed from: a */
    public static byte[] m13058a(String str, String str2) {
        C3214a c3214a = new C3214a();
        c3214a.f13232a = str;
        c3214a.f13233b = str2;
        c3214a.f13236e = JSON_CMD_REMOVEALLALIAS;
        return c3214a.m13062a();
    }
}
