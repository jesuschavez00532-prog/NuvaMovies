package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* renamed from: com.umeng.analytics.filter.b */
/* loaded from: classes3.dex */
public class C3275b extends EventList {

    /* renamed from: a */
    private C3277d f13930a;

    /* renamed from: b */
    private Object f13931b;

    public C3275b(String str, String str2) {
        super(str, str2);
        this.f13931b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    protected void eventListChange() {
        if (!TextUtils.isEmpty(this.mEventList)) {
            synchronized (this.f13931b) {
                this.f13930a = null;
                this.f13930a = new C3277d(true, this.mEventList);
            }
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean m13698a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return true;
        }
        synchronized (this.f13931b) {
            if (this.f13930a == null) {
                this.f13930a = new C3277d(true, this.mEventList);
            }
            m13698a = this.f13930a.m13698a(str);
        }
        return m13698a;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z10) {
        AnalyticsConfig.CLEAR_EKV_WL = z10;
    }
}
