package com.umeng.p079ut.p080a.p082b;

import android.text.TextUtils;
import com.umeng.ccg.C3417a;
import com.umeng.p079ut.p080a.p083c.C3753b;
import com.umeng.p079ut.p080a.p083c.C3756e;
import com.umeng.p079ut.p084b.p085a.p086a.C3757a;

/* renamed from: com.umeng.ut.a.b.a */
/* loaded from: classes3.dex */
public class C3745a {

    /* renamed from: a */
    public int f16779a = -1;
    public long timestamp = 0;
    public String signature = "";
    public byte[] data = null;

    /* renamed from: b */
    public long f16780b = 0;

    /* renamed from: a */
    public static boolean m15934a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C3756e.m15957b("", "result", str, C3417a.f15002x, str2);
                if (str2.equals(C3757a.m15960a(C3753b.m15945c(str).getBytes(), 2))) {
                    C3756e.m15954a("", "signature is ok");
                    return true;
                }
                C3756e.m15954a("", "signature is error");
            }
        } catch (Exception e10) {
            C3756e.m15954a("", e10);
        }
        return false;
    }
}
