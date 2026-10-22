package com.umeng.p079ut.p080a.p081a;

import android.text.TextUtils;
import anet.channel.request.Request;
import com.umeng.p079ut.p080a.p083c.C3755d;
import com.umeng.p079ut.p080a.p083c.C3756e;
import com.umeng.p079ut.p084b.p085a.p086a.C3757a;

/* renamed from: com.umeng.ut.a.a.b */
/* loaded from: classes3.dex */
public class C3744b {
    /* renamed from: b */
    public static String m15933b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(C3757a.m15961a(C3755d.m15949b(str.getBytes()), 2), Request.DEFAULT_CHARSET);
        } catch (Exception e10) {
            C3756e.m15953a("", e10, new Object[0]);
            return "";
        }
    }
}
