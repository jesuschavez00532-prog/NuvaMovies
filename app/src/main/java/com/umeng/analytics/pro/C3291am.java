package com.umeng.analytics.pro;

import com.umeng.commonsdk.debug.UMRTLog;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.umeng.analytics.pro.am */
/* loaded from: classes3.dex */
public class C3291am implements InterfaceC3281ac {

    /* renamed from: a */
    private Set<Integer> f13976a;

    public C3291am(Set<Integer> set) {
        this.f13976a = null;
        this.f13976a = new HashSet(set);
    }

    @Override // com.umeng.analytics.pro.InterfaceC3281ac
    /* renamed from: a */
    public boolean mo13739a() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(System.currentTimeMillis());
            int i10 = 7;
            int i11 = calendar.get(7) - 1;
            if (i11 != 0) {
                i10 = i11;
            }
            Set<Integer> set = this.f13976a;
            if (set != null && set.contains(Integer.valueOf(i10))) {
                return true;
            }
            String str = "";
            Iterator<Integer> it = this.f13976a.iterator();
            while (it.hasNext()) {
                str = str + it.next() + ",";
            }
            UMRTLog.m14569i(UMRTLog.RTLOG_TAG, "WeekOn skipped. day of week: " + i10 + "; config: " + str);
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
