package com.umeng.message.proguard;

import android.text.TextUtils;
import com.umeng.message.entity.UMessage;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.umeng.message.proguard.x */
/* loaded from: classes3.dex */
public class C3705x {

    /* renamed from: b */
    private static volatile C3705x f16643b;

    /* renamed from: a */
    private final LinkedList<C3558ad> f16644a = new LinkedList<>();

    private C3705x() {
    }

    /* renamed from: a */
    public static C3705x m15834a() {
        if (f16643b == null) {
            synchronized (C3705x.class) {
                if (f16643b == null) {
                    f16643b = new C3705x();
                }
            }
        }
        return f16643b;
    }

    /* renamed from: b */
    public final C3558ad m15837b() {
        C3558ad pollFirst;
        synchronized (this.f16644a) {
            pollFirst = this.f16644a.pollFirst();
        }
        return pollFirst;
    }

    /* renamed from: c */
    public final int m15839c() {
        int size;
        synchronized (this.f16644a) {
            size = this.f16644a.size();
        }
        return size;
    }

    /* renamed from: b */
    public final void m15838b(C3558ad c3558ad) {
        synchronized (this.f16644a) {
            this.f16644a.remove(c3558ad);
        }
    }

    /* renamed from: a */
    public final void m15836a(C3558ad c3558ad) {
        synchronized (this.f16644a) {
            this.f16644a.addLast(c3558ad);
        }
    }

    /* renamed from: a */
    public final C3558ad m15835a(String str) {
        synchronized (this.f16644a) {
            Iterator<C3558ad> it = this.f16644a.iterator();
            while (it.hasNext()) {
                C3558ad next = it.next();
                UMessage uMessage = next.f15880b;
                if (uMessage != null && TextUtils.equals(str, uMessage.getMsgId())) {
                    return next;
                }
            }
            return null;
        }
    }
}
