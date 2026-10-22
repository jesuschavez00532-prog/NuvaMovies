package com.umeng.message.proguard;

import android.app.Activity;
import anet.channel.entity.ConnType;
import com.umeng.analytics.pro.C3309bd;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.umeng.message.proguard.dt */
/* loaded from: classes3.dex */
public class C3658dt {

    /* renamed from: b */
    private static volatile C3658dt f16441b;

    /* renamed from: a */
    public final C3659du f16442a = new C3659du("union");

    /* renamed from: c */
    private volatile Set<String> f16443c;

    private C3658dt() {
    }

    /* renamed from: a */
    public static C3658dt m15682a() {
        if (f16441b == null) {
            synchronized (C3658dt.class) {
                if (f16441b == null) {
                    f16441b = new C3658dt();
                }
            }
        }
        return f16441b;
    }

    /* renamed from: a */
    public final void m15686a(boolean z10) {
        this.f16442a.m15695a(ConnType.PK_AUTO, z10);
    }

    /* renamed from: a */
    public final void m15684a(String str) {
        this.f16442a.m15694a("et", str);
    }

    /* renamed from: a */
    private void m15683a(Set<String> set) {
        C3659du c3659du = this.f16442a;
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            C3659du.m15688c(c3659du.m15690a(C3309bd.f14113t), jSONArray.toString());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void m15685a(List<Class<? extends Activity>> list) {
        HashSet hashSet = new HashSet();
        if (!list.isEmpty()) {
            for (Class<? extends Activity> cls : list) {
                if (cls != null) {
                    hashSet.add(cls.getName());
                }
            }
        }
        this.f16443c = hashSet;
        synchronized (this) {
            m15683a(hashSet);
        }
    }

    /* renamed from: a */
    public final boolean m15687a(Class<? extends Activity> cls) {
        Set<String> set = this.f16443c;
        if (set == null) {
            synchronized (this) {
                if (this.f16443c == null) {
                    this.f16443c = m15682a().f16442a.m15691a(C3309bd.f14113t, new HashSet());
                }
                set = this.f16443c;
            }
        }
        return set != null && set.contains(cls.getName());
    }
}
