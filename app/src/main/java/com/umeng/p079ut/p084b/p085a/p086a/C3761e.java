package com.umeng.p079ut.p084b.p085a.p086a;

import com.umeng.p079ut.p080a.p083c.C3756e;

/* renamed from: com.umeng.ut.b.a.a.e */
/* loaded from: classes3.dex */
class C3761e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String get(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e10) {
            C3756e.m15956b("", e10, new Object[0]);
            return str2;
        }
    }
}
