package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* renamed from: com.umeng.analytics.filter.a */
/* loaded from: classes3.dex */
public class C3274a extends EventList {

    /* renamed from: a */
    private C3277d f13928a;

    /* renamed from: b */
    private Object f13929b;

    public C3274a(String str, String str2) {
        super(str, str2);
        this.f13929b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    protected void eventListChange() {
        if (!TextUtils.isEmpty(this.mEventList)) {
            synchronized (this.f13929b) {
                this.f13928a = null;
                this.f13928a = new C3277d(false, this.mEventList);
            }
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean m13698a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return false;
        }
        synchronized (this.f13929b) {
            if (this.f13928a == null) {
                this.f13928a = new C3277d(false, this.mEventList);
            }
            m13698a = this.f13928a.m13698a(str);
        }
        return m13698a;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z10) {
        AnalyticsConfig.CLEAR_EKV_BL = z10;
    }
}
