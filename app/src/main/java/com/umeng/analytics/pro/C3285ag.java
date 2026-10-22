package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.umeng.analytics.pro.ag */
/* loaded from: classes3.dex */
public class C3285ag implements InterfaceC3281ac {

    /* renamed from: a */
    private Set<Integer> f13965a;

    public C3285ag(Set<Integer> set) {
        this.f13965a = null;
        this.f13965a = new HashSet(set);
    }

    @Override // com.umeng.analytics.pro.InterfaceC3281ac
    /* renamed from: a */
    public boolean mo13739a() {
        try {
            int i10 = Calendar.getInstance().get(11);
            Set<Integer> set = this.f13965a;
            if (set != null && set.contains(Integer.valueOf(i10))) {
                return true;
            }
            String str = "";
            Iterator<Integer> it = this.f13965a.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "HourOn skipped. hour of day: " + i10 + "; config: " + str);
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
