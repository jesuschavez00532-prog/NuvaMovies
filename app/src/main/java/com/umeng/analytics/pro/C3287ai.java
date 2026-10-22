package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;

/* renamed from: com.umeng.analytics.pro.ai */
/* loaded from: classes3.dex */
public class C3287ai implements InterfaceC3281ac {

    /* renamed from: a */
    private int f13968a;

    public C3287ai(int i10) {
        this.f13968a = i10;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3281ac
    /* renamed from: a */
    public boolean mo13739a() {
        long j10 = 0;
        try {
            SharedPreferences m13805a = C3299au.m13805a(UMGlobalContext.getAppContext());
            if (m13805a != null) {
                j10 = m13805a.getLong(C3299au.f14028a, 0L);
                if (j10 >= this.f13968a) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "launch times skipped. times: " + j10 + " ; config: " + this.f13968a);
        return false;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3281ac
    /* renamed from: b */
    public boolean mo13740b() {
        return !mo13739a();
    }

    @Override // com.umeng.analytics.pro.InterfaceC3281ac
    /* renamed from: c */
    public long mo13741c() {
        return 0L;
    }
}
