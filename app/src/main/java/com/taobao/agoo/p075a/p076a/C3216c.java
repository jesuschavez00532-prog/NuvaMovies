package com.taobao.agoo.p075a.p076a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3197j;
import com.taobao.accs.utl.C3202o;
import com.taobao.accs.utl.C3203p;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.message.MsgConstant;

/* renamed from: com.taobao.agoo.a.a.c */
/* loaded from: classes.dex */
public class C3216c extends AbstractC3215b {
    public static final String JSON_CMD_REGISTER = "register";

    /* renamed from: a */
    public String f13237a;

    /* renamed from: b */
    public String f13238b;

    /* renamed from: c */
    public String f13239c;

    /* renamed from: d */
    public String f13240d = String.valueOf(Constants.SDK_VERSION_CODE);

    /* renamed from: f */
    public String f13241f;

    /* renamed from: g */
    public String f13242g;

    /* renamed from: h */
    public String f13243h;

    /* renamed from: i */
    public String f13244i;

    /* renamed from: j */
    public String f13245j;

    /* renamed from: k */
    public String f13246k;

    /* renamed from: l */
    public String f13247l;

    /* renamed from: m */
    public String f13248m;

    /* renamed from: n */
    public String f13249n;

    /* renamed from: o */
    public String f13250o;

    /* renamed from: p */
    public String f13251p;

    /* renamed from: q */
    private String f13252q;

    /* renamed from: r */
    private String f13253r;

    /* renamed from: s */
    private boolean f13254s;

    /* renamed from: t */
    private String f13255t;

    /* renamed from: a */
    public byte[] m13064a() {
        try {
            String jSONObject = new C3203p.a().m13022a(AbstractC3215b.JSON_CMD, this.f13236e).m13022a(Constants.KEY_APP_KEY, this.f13237a).m13022a("utdid", this.f13238b).m13022a("appVersion", this.f13239c).m13022a(Constants.KEY_SDK_VERSION, this.f13240d).m13022a(Constants.KEY_TTID, this.f13241f).m13022a(Constants.KEY_PACKAGE_NAME, this.f13242g).m13022a("notifyEnable", this.f13243h).m13022a("romInfo", this.f13244i).m13022a("c0", this.f13245j).m13022a("c1", this.f13246k).m13022a("c2", this.f13247l).m13022a("c3", this.f13248m).m13022a("c4", this.f13249n).m13022a("c5", this.f13250o).m13022a("c6", this.f13251p).m13022a("pSdkV", this.f13252q).m13022a(C3325bt.f14265g, this.f13253r).m13022a("ohos", String.valueOf(this.f13254s)).m13022a("ohosV", this.f13255t).m13023a().toString();
            ALog.m12941i("RegisterDO", "buildData", "data", jSONObject);
            return jSONObject.getBytes("utf-8");
        } catch (Throwable th) {
            ALog.m12939e("RegisterDO", "buildData", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m13063a(Context context, String str, String str2) {
        C3216c c3216c;
        String m12986j;
        String packageName;
        String str3;
        try {
            m12986j = UtilityImpl.m12986j(context);
            packageName = context.getPackageName();
            str3 = GlobalClientInfo.getInstance(context).getPackageInfo().versionName;
        } catch (Throwable th) {
            th = th;
            c3216c = null;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(m12986j) && !TextUtils.isEmpty(str3)) {
            c3216c = new C3216c();
            try {
                c3216c.f13236e = JSON_CMD_REGISTER;
                c3216c.f13237a = str;
                c3216c.f13238b = m12986j;
                c3216c.f13239c = str3;
                c3216c.f13241f = str2;
                c3216c.f13242g = packageName;
                c3216c.f13245j = Build.BRAND;
                c3216c.f13246k = Build.MODEL;
                String m13008c = C3197j.m13008c(context);
                c3216c.f13243h = m13008c;
                UtilityImpl.m12960a(context, Constants.SP_CHANNEL_FILE_NAME, m13008c);
                c3216c.f13244i = new C3202o().mo13018a();
                try {
                    c3216c.f13252q = (String) MsgConstant.class.getField("SDK_VERSION").get(null);
                } catch (Throwable unused) {
                }
                try {
                    String str4 = UMUtils.UNKNOW;
                    c3216c.f13253r = (String) UMUtils.class.getMethod("getUMId", Context.class).invoke(null, context);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                try {
                    boolean m12987j = UtilityImpl.m12987j();
                    c3216c.f13254s = m12987j;
                    if (m12987j) {
                        c3216c.f13255t = UtilityImpl.m12989k();
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    ALog.m12944w("RegisterDO", "buildRegister", th.getMessage());
                    if (c3216c == null) {
                        return null;
                    }
                    return c3216c.m13064a();
                } finally {
                    if (c3216c != null) {
                        c3216c.m13064a();
                    }
                }
            }
            return c3216c.m13064a();
        }
        ALog.m12940e("RegisterDO", "buildRegister param null", Constants.KEY_APP_KEY, str, "utdid", m12986j, "appVersion", str3);
        return null;
    }
}
