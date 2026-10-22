package com.umeng.commonsdk.config;

import android.content.Context;
import android.util.Pair;
import com.umeng.commonsdk.config.C3437d;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class FieldManager {

    /* renamed from: a */
    private static final String f15090a = "cfgfd";

    /* renamed from: b */
    private static C3435b f15091b = C3435b.m14554b();

    /* renamed from: c */
    private static boolean f15092c = false;

    /* renamed from: d */
    private static Object f15093d = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.config.FieldManager$a */
    /* loaded from: classes3.dex */
    public static class C3433a {

        /* renamed from: a */
        private static final FieldManager f15094a = new FieldManager();

        private C3433a() {
        }
    }

    /* renamed from: a */
    public static FieldManager m14542a() {
        return C3433a.f15094a;
    }

    public static boolean allow(String str) {
        synchronized (f15093d) {
            if (!f15092c) {
                return false;
            }
            return C3435b.m14553a(str);
        }
    }

    /* renamed from: b */
    public static boolean m14543b() {
        boolean z10;
        synchronized (f15093d) {
            z10 = f15092c;
        }
        return z10;
    }

    private FieldManager() {
    }

    /* renamed from: a */
    public void m14544a(Context context) {
        String str;
        String str2 = "1001@3749699455,2130669566,262139,1983";
        String[] strArr = {C3437d.a.class.getName(), C3437d.b.class.getName(), C3437d.c.class.getName(), C3437d.d.class.getName()};
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "cfgfd", "1001@3749699455,2130669566,262139,1983");
        synchronized (f15093d) {
            Pair<Long, String> m14541a = m14541a(imprintProperty);
            if (((Long) m14541a.first).longValue() > 1000 && (str = (String) m14541a.second) != null && str.length() > 0) {
                str2 = str;
            }
            String[] split = str2.split(",");
            int length = split.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                C3440g c3440g = new C3440g();
                for (int i10 = 0; i10 < length; i10++) {
                    arrayList.add(c3440g);
                    ((InterfaceC3438e) arrayList.get(i10)).mo14558a(split[i10], f15091b, C3437d.m14560b(strArr[i10]));
                }
            }
            f15092c = true;
        }
    }

    /* renamed from: a */
    public void m14545a(Context context, String str) {
        String str2;
        String str3 = "1001@3749699455,2130669566,262139,1983";
        String[] strArr = {C3437d.a.class.getName(), C3437d.b.class.getName(), C3437d.c.class.getName(), C3437d.d.class.getName()};
        synchronized (f15093d) {
            f15091b.m14555a();
            if (str != null) {
                Pair<Long, String> m14541a = m14541a(str);
                if (((Long) m14541a.first).longValue() > 1000 && (str2 = (String) m14541a.second) != null && str2.length() > 0) {
                    str3 = str2;
                }
            }
            String[] split = str3.split(",");
            int length = split.length;
            if (length > 0) {
                ArrayList arrayList = new ArrayList();
                C3440g c3440g = new C3440g();
                for (int i10 = 0; i10 < length; i10++) {
                    arrayList.add(c3440g);
                    ((InterfaceC3438e) arrayList.get(i10)).mo14558a(split[i10], f15091b, C3437d.m14560b(strArr[i10]));
                }
            }
            f15092c = true;
        }
    }

    /* renamed from: a */
    private static Pair<Long, String> m14541a(String str) {
        Pair<Long, String> pair = new Pair<>(-1L, null);
        if (str != null && str.length() >= 2) {
            String[] split = str.split("@");
            if (split.length < 2) {
                return pair;
            }
            try {
                long parseLong = Long.parseLong(split[0]);
                return new Pair<>(Long.valueOf(parseLong), split[1]);
            } catch (Throwable unused) {
            }
        }
        return pair;
    }
}
