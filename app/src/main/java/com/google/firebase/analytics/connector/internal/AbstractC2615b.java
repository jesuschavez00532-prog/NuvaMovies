package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import anet.channel.entity.ConnType;
import com.umeng.message.api.UPushThirdTokenCallback;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p025b5.AbstractC1119q;
import p025b5.AbstractC1121s;
import p281p4.AbstractC6198b;

/* renamed from: com.google.firebase.analytics.connector.internal.b */
/* loaded from: classes.dex */
public abstract class AbstractC2615b {

    /* renamed from: a */
    private static final Set f10001a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b */
    private static final List f10002b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c */
    private static final List f10003c = Arrays.asList(ConnType.PK_AUTO, "app", "am");

    /* renamed from: d */
    private static final List f10004d = Arrays.asList("_r", "_dbg");

    /* renamed from: e */
    private static final List f10005e = Arrays.asList((String[]) AbstractC6198b.m24743a(AbstractC1121s.f4418a, AbstractC1121s.f4419b));

    /* renamed from: f */
    private static final List f10006f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    /* renamed from: a */
    public static String m10842a(String str) {
        String m5087a = AbstractC1119q.m5087a(str);
        if (m5087a != null) {
            return m5087a;
        }
        return str;
    }

    /* renamed from: b */
    public static void m10843b(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    /* renamed from: c */
    public static boolean m10844c(String str, String str2, Bundle bundle) {
        char c10;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!m10847f(str) || bundle == null) {
            return false;
        }
        Iterator it = f10004d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey((String) it.next())) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else {
                if (str.equals("fdl")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals(UPushThirdTokenCallback.TYPE_FCM)) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return false;
                }
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }

    /* renamed from: d */
    public static boolean m10845d(String str, Bundle bundle) {
        if (f10002b.contains(str)) {
            return false;
        }
        if (bundle != null) {
            Iterator it = f10004d.iterator();
            while (it.hasNext()) {
                if (bundle.containsKey((String) it.next())) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m10846e(String str) {
        if (!f10001a.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m10847f(String str) {
        if (!f10003c.contains(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m10848g(String str, String str2) {
        if (!"_ce1".equals(str2) && !"_ce2".equals(str2)) {
            if ("_ln".equals(str2)) {
                if (str.equals(UPushThirdTokenCallback.TYPE_FCM) || str.equals("fiam")) {
                    return true;
                }
                return false;
            }
            if (f10005e.contains(str2)) {
                return false;
            }
            Iterator it = f10006f.iterator();
            while (it.hasNext()) {
                if (str2.matches((String) it.next())) {
                    return false;
                }
            }
            return true;
        }
        if (str.equals(UPushThirdTokenCallback.TYPE_FCM) || str.equals("frc")) {
            return true;
        }
        return false;
    }
}
