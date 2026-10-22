package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.umeng.umcrash.UMCrash;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.umeng.analytics.pro.bd */
/* loaded from: classes3.dex */
public class C3309bd {

    /* renamed from: A */
    public static final String f14089A = "rtd";

    /* renamed from: B */
    public static final String f14090B = "lepd";

    /* renamed from: C */
    public static final String f14091C = "ccfg";

    /* renamed from: D */
    private static Map<String, String> f14092D = null;

    /* renamed from: E */
    private static String f14093E = null;

    /* renamed from: a */
    public static final String f14094a = "env";

    /* renamed from: b */
    public static final String f14095b = "exp";

    /* renamed from: c */
    public static final String f14096c = "imp";

    /* renamed from: d */
    public static final String f14097d = "ua";

    /* renamed from: e */
    public static final String f14098e = "zc";

    /* renamed from: f */
    public static final String f14099f = "id";

    /* renamed from: g */
    public static final String f14100g = "zf";

    /* renamed from: h */
    public static final String f14101h = "exid";

    /* renamed from: i */
    public static final String f14102i = "ucc";

    /* renamed from: j */
    public static final String f14103j = "ugc";

    /* renamed from: k */
    public static final String f14104k = "usi";

    /* renamed from: l */
    public static final String f14105l = "uso";

    /* renamed from: m */
    public static final String f14106m = "user";

    /* renamed from: n */
    public static final String f14107n = "uspi";

    /* renamed from: o */
    public static final String f14108o = "dtfn";

    /* renamed from: p */
    public static final String f14109p = "pr";

    /* renamed from: q */
    public static final String f14110q = "upg";

    /* renamed from: r */
    public static final String f14111r = "pri";

    /* renamed from: s */
    public static final String f14112s = "probe";

    /* renamed from: t */
    public static final String f14113t = "bl";

    /* renamed from: u */
    public static final String f14114u = "wl";

    /* renamed from: v */
    public static final String f14115v = "subp";

    /* renamed from: w */
    public static final String f14116w = "subua";

    /* renamed from: x */
    public static final String f14117x = "sta";

    /* renamed from: y */
    public static final String f14118y = "emi";

    /* renamed from: z */
    public static final String f14119z = "sli";

    /* renamed from: com.umeng.analytics.pro.bd$a */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a */
        private static final C3309bd f14120a = new C3309bd();

        private a() {
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f14092D = hashMap;
        f14093E = "";
        hashMap.put(f14094a, "envelope");
        f14092D.put(f14095b, ".umeng");
        f14092D.put(f14096c, ".imprint");
        f14092D.put(f14097d, "ua.db");
        f14092D.put(f14098e, "umeng_zero_cache.db");
        f14092D.put("id", "umeng_it.cache");
        f14092D.put(f14100g, "umeng_zcfg_flag");
        f14092D.put(f14101h, "exid.dat");
        f14092D.put(f14102i, "umeng_common_config");
        f14092D.put(f14103j, "umeng_general_config");
        f14092D.put(f14104k, UMCrash.KEY_CALLBACK_SESSION_ID);
        f14092D.put(f14105l, "umeng_sp_oaid");
        f14092D.put(f14106m, "mobclick_agent_user_");
        f14092D.put(f14107n, "umeng_subprocess_info");
        f14092D.put(f14108o, "delayed_transmission_flag_new");
        f14092D.put("pr", "umeng_policy_result_flag");
        f14092D.put(f14110q, "um_policy_grant");
        f14092D.put(f14111r, "um_pri");
        f14092D.put(f14112s, "UM_PROBE_DATA");
        f14092D.put(f14113t, "ekv_bl");
        f14092D.put(f14114u, "ekv_wl");
        f14092D.put(f14115v, C3385g.f14632a);
        f14092D.put(f14116w, "ua_");
        f14092D.put(f14117x, "stateless");
        f14092D.put(f14118y, ".emitter");
        f14092D.put(f14119z, "um_slmode_sp");
        f14092D.put(f14089A, "um_rtd_conf");
        f14092D.put(f14090B, "");
        f14092D.put(f14091C, ".dmpvedpogjhejs.cfg");
    }

    private C3309bd() {
    }

    /* renamed from: a */
    public void m13862a(String str) {
        if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(f14093E)) {
            if (str.length() > 3) {
                f14093E = str.substring(0, 3) + "_";
                return;
            }
            f14093E = str + "_";
        }
    }

    /* renamed from: b */
    public String m13863b(String str) {
        if (!f14092D.containsKey(str)) {
            return "";
        }
        String str2 = f14092D.get(str);
        if (!f14095b.equalsIgnoreCase(str) && !f14096c.equalsIgnoreCase(str) && !f14118y.equalsIgnoreCase(str)) {
            return f14093E + str2;
        }
        return "." + f14093E + str2.substring(1);
    }

    /* renamed from: a */
    public void m13861a() {
        f14093E = "";
    }

    /* renamed from: b */
    public static C3309bd m13860b() {
        return a.f14120a;
    }
}
