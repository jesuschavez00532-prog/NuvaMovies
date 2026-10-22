package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.text.TextUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.commonsdk.statistics.internal.a */
/* loaded from: classes3.dex */
public class C3502a {

    /* renamed from: a */
    private static Context f15486a;

    /* renamed from: b */
    private String f15487b;

    /* renamed from: c */
    private String f15488c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.internal.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private static final C3502a f15489a = new C3502a();

        private a() {
        }
    }

    /* renamed from: a */
    public static C3502a m14898a(Context context) {
        if (f15486a == null && context != null) {
            f15486a = context.getApplicationContext();
        }
        return a.f15489a;
    }

    /* renamed from: f */
    private void m14899f(String str) {
        try {
            this.f15487b = str.replaceAll("&=", " ").replaceAll("&&", " ").replaceAll("==", Operator.Operation.DIVISION) + Operator.Operation.DIVISION + "Android " + HelperUtils.getUmengMD5(UMUtils.getAppkey(f15486a));
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f15486a, th);
        }
    }

    /* renamed from: g */
    private void m14900g(String str) {
        try {
            String str2 = str.split("&&")[0];
            if (!TextUtils.isEmpty(str2)) {
                String[] split = str2.split("&=");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C3325bt.f14205aW);
                for (String str3 : split) {
                    if (!TextUtils.isEmpty(str3)) {
                        String substring = str3.substring(0, 2);
                        if (substring.endsWith(Operator.Operation.EQUALS)) {
                            substring = substring.replace(Operator.Operation.EQUALS, "");
                        }
                        sb2.append(substring);
                    }
                }
                this.f15488c = sb2.toString();
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(f15486a, th);
        }
    }

    /* renamed from: b */
    public boolean m14904b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("t");
    }

    /* renamed from: c */
    public boolean m14905c(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(C3325bt.f14192aJ);
        }
        return false;
    }

    /* renamed from: d */
    public boolean m14906d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.startsWith(C3325bt.f14195aM);
        }
        return false;
    }

    /* renamed from: e */
    public void m14907e(String str) {
        String substring = str.substring(0, str.indexOf(95));
        m14900g(substring);
        m14899f(substring);
    }

    private C3502a() {
        this.f15487b = null;
        this.f15488c = null;
    }

    /* renamed from: b */
    public String m14903b() {
        return this.f15487b;
    }

    /* renamed from: a */
    public boolean m14902a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("a");
    }

    /* renamed from: a */
    public String m14901a() {
        return this.f15488c;
    }
}
