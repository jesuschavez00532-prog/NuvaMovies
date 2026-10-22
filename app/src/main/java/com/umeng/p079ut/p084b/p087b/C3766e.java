package com.umeng.p079ut.p084b.p087b;

import anet.channel.request.Request;
import com.umeng.p079ut.p080a.p082b.C3745a;
import com.umeng.p079ut.p080a.p083c.C3756e;

/* renamed from: com.umeng.ut.b.b.e */
/* loaded from: classes3.dex */
public class C3766e {
    /* renamed from: a */
    public static boolean m15995a(C3745a c3745a) {
        String str;
        try {
            str = new String(c3745a.data, Request.DEFAULT_CHARSET);
        } catch (Exception e10) {
            Object[] objArr = {e10};
            str = "";
            C3756e.m15954a("", objArr);
        }
        if (!C3745a.m15934a(str, c3745a.signature)) {
            return false;
        }
        return C3763b.m15976a(C3763b.m15975a(str).f16812d);
    }
}
