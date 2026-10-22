package com.umeng.p079ut.p084b.p085a.p086a;

import android.text.TextUtils;
import java.util.Random;

/* renamed from: com.umeng.ut.b.a.a.c */
/* loaded from: classes3.dex */
public class C3759c {
    /* renamed from: e */
    private static String m15964e() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nanoTime = (int) System.nanoTime();
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] bytes = C3758b.getBytes(currentTimeMillis);
        byte[] bytes2 = C3758b.getBytes(nanoTime);
        byte[] bytes3 = C3758b.getBytes(nextInt);
        byte[] bytes4 = C3758b.getBytes(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, 4);
        System.arraycopy(bytes2, 0, bArr, 4, 4);
        System.arraycopy(bytes3, 0, bArr, 8, 4);
        System.arraycopy(bytes4, 0, bArr, 12, 4);
        return C3757a.m15960a(bArr, 2);
    }

    /* renamed from: f */
    public static String m15965f() {
        String m15966g = m15966g();
        if (C3760d.isEmpty(m15966g)) {
            return m15964e();
        }
        return m15966g;
    }

    /* renamed from: g */
    private static String m15966g() {
        String str = C3761e.get("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(str)) {
            str = C3761e.get("ro.sys.aliyun.clouduuid", "");
        }
        if (TextUtils.isEmpty(str)) {
            return m15967h();
        }
        return str;
    }

    /* renamed from: h */
    private static String m15967h() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return "";
        }
    }
}
