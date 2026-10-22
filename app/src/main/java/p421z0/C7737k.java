package p421z0;

import android.text.TextUtils;
import com.bigbee.bean.CommonParamBean;
import com.taobao.accs.common.Constants;
import ne.AbstractC5868k;

/* renamed from: z0.k */
/* loaded from: classes.dex */
public final class C7737k {

    /* renamed from: a */
    public static final C7737k f28482a = new C7737k();

    /* renamed from: b */
    private static final String f28483b = C7737k.class.getSimpleName();

    /* renamed from: c */
    private static CommonParamBean f28484c = new CommonParamBean();

    private C7737k() {
    }

    /* renamed from: a */
    public final CommonParamBean m29914a() {
        return f28484c;
    }

    /* renamed from: b */
    public final void m29915b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC5868k.m23674f(str, "appId");
        AbstractC5868k.m23674f(str2, "appVer");
        AbstractC5868k.m23674f(str3, "sysVer");
        AbstractC5868k.m23674f(str4, Constants.KEY_MODEL);
        AbstractC5868k.m23674f(str5, "macAddr");
        AbstractC5868k.m23674f(str6, "reserve1");
        AbstractC5868k.m23674f(str7, "sn");
        f28484c.setAppId(str);
        f28484c.setAppVer(str2);
        f28484c.setSysVer(str3);
        f28484c.setModel(str4);
        f28484c.setMacAddr(str5);
        f28484c.setReserve1(str6);
        f28484c.setSn(str7);
    }

    /* renamed from: c */
    public final void m29916c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        AbstractC5868k.m23674f(str, "appId");
        AbstractC5868k.m23674f(str2, "appVer");
        AbstractC5868k.m23674f(str3, "sysVer");
        AbstractC5868k.m23674f(str4, Constants.KEY_MODEL);
        AbstractC5868k.m23674f(str5, "macAddr");
        AbstractC5868k.m23674f(str6, "reserve1");
        AbstractC5868k.m23674f(str7, "sn");
        AbstractC5868k.m23674f(str8, "userId");
        AbstractC5868k.m23674f(str9, "userName");
        m29915b(str, str2, str3, str4, str5, str6, str7);
        f28484c.setUserId(str8);
        f28484c.setUserName(str9);
    }

    /* renamed from: d */
    public final void m29917d(String str, String str2) {
        AbstractC5868k.m23674f(str, "userId");
        AbstractC5868k.m23674f(str2, "sn");
        f28484c.setUserId(str);
        f28484c.setSn(str2);
    }

    /* renamed from: e */
    public final void m29918e(String str, String str2) {
        AbstractC5868k.m23674f(str, "userName");
        f28484c.setUserName(str);
        if (!TextUtils.isEmpty(str2)) {
            f28484c.setUserId(str2);
        }
    }
}
