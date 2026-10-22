package com.umeng.analytics.pro;

import android.content.SharedPreferences;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;

/* renamed from: com.umeng.analytics.pro.ah */
/* loaded from: classes3.dex */
public class C3286ah implements InterfaceC3281ac {

    /* renamed from: a */
    private String f13966a;

    /* renamed from: b */
    private long f13967b;

    public C3286ah(String str, long j10) {
        this.f13966a = str;
        this.f13967b = j10;
    }

    @Override // com.umeng.analytics.pro.InterfaceC3281ac
    /* renamed from: a */
    public boolean mo13739a() {
        try {
            String str = C3299au.f14029b + this.f13966a;
            SharedPreferences m13805a = C3299au.m13805a(UMGlobalContext.getAppContext());
            if (m13805a != null) {
                long currentTimeMillis = System.currentTimeMillis() - m13805a.getLong(str, 0L);
                if (currentTimeMillis > this.f13967b * 1000) {
                    return true;
                }
                UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "internal period skipped. elapse: " + currentTimeMillis + "; config: " + (this.f13967b * 1000));
                return false;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
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
