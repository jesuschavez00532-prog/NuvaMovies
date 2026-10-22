package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3333ca;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.net.URL;
import org.android.agoo.message.MessageService;

/* renamed from: com.umeng.analytics.pro.by */
/* loaded from: classes3.dex */
public class C3330by {

    /* renamed from: a */
    public static final String f14354a = "resolve.umeng.com";

    /* renamed from: b */
    public static final int f14355b = 15000;

    /* renamed from: c */
    private static C3335cc f14356c = null;

    /* renamed from: d */
    private static volatile int f14357d = -1;

    /* renamed from: com.umeng.analytics.pro.by$a */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a */
        public static final C3330by f14358a = new C3330by();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3330by m13997a() {
        return a.f14358a;
    }

    /* renamed from: c */
    private String m14000c() {
        if (f14356c == null) {
            f14356c = C3335cc.m14018b();
        }
        C3333ca c3333ca = new C3333ca("https://resolve.umeng.com/resolve", C3333ca.a.GET, null, f14356c);
        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> 发送domain下发请求。");
        return c3333ca.m14014a(f14355b, "");
    }

    /* renamed from: b */
    public synchronized boolean m14003b() {
        if (f14357d < 0) {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(UMGlobalContext.getAppContext(), "cj_domain", MessageService.MSG_DB_READY_REPORT);
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "--->>> cj_domain读取值：" + imprintProperty);
            if ("1".equalsIgnoreCase(imprintProperty)) {
                f14357d = 1;
            } else {
                f14357d = 0;
            }
        }
        return f14357d <= 0;
    }

    private C3330by() {
    }

    /* renamed from: a */
    public synchronized String m14002a(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        m14000c();
        String m14021c = C3335cc.m14018b().m14021c();
        if (!TextUtils.isEmpty(m14021c)) {
            str2 = "https://" + m14021c + Operator.Operation.DIVISION + str;
        }
        return str2;
    }

    /* renamed from: c */
    private static String m14001c(String str) {
        try {
            return new URL(str).getHost();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m13998a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        return "https://" + str + Operator.Operation.DIVISION + str2;
    }

    /* renamed from: b */
    public static String m13999b(String str) {
        try {
            String m14001c = m14001c(str);
            return str.substring(str.indexOf(m14001c) + m14001c.length() + 1);
        } catch (Throwable unused) {
            return "";
        }
    }
}
