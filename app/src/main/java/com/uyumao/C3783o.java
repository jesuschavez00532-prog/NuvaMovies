package com.uyumao;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3325bt;

/* renamed from: com.uyumao.o */
/* loaded from: classes3.dex */
public class C3783o {

    /* renamed from: a */
    public static volatile C3783o f16976a;

    /* renamed from: b */
    public final Context f16977b;

    /* renamed from: c */
    public final a f16978c = new a(this, "AZX");

    public C3783o(Context context) {
        this.f16977b = context.getApplicationContext();
    }

    /* renamed from: a */
    public void m16042a(long j10) {
        this.f16978c.m16046b("smart_" + C3325bt.f14236ba, j10);
        this.f16978c.m16046b("smart_ts", System.currentTimeMillis());
    }

    /* renamed from: a */
    public final boolean m16043a(String str) {
        long m16044a = this.f16978c.m16044a(str + C3325bt.f14236ba, 0L);
        if (m16044a <= 0) {
            return true;
        }
        a aVar = this.f16978c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("ts");
        return Math.abs(System.currentTimeMillis() - aVar.m16044a(sb2.toString(), 0L)) / 1000 >= m16044a;
    }

    /* renamed from: a */
    public long m16041a() {
        return this.f16978c.m16044a("smart_lc", 0L);
    }

    /* renamed from: com.uyumao.o$a */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a */
        public final String f16979a;

        public a(C3783o c3783o, String str) {
            if (!TextUtils.isEmpty(str)) {
                str = str + "_";
            }
            this.f16979a = str;
        }

        /* renamed from: a */
        public final void m16045a(String str, String str2) {
            try {
                if (C3782n.m16040c(C3773e.f16951a)) {
                    C3781m m16031a = C3781m.m16031a();
                    m16031a.getClass();
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    m16031a.f16971b.edit().putString(str, str2).apply();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: b */
        public void m16046b(String str, long j10) {
            m16045a(this.f16979a + str, String.valueOf(j10));
        }

        /* renamed from: a */
        public long m16044a(String str, long j10) {
            String str2 = this.f16979a + str;
            String valueOf = String.valueOf(j10);
            try {
                if (C3782n.m16040c(C3773e.f16951a)) {
                    valueOf = C3781m.m16031a().f16971b.getString(str2, valueOf);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            try {
                return Long.parseLong(valueOf);
            } catch (Exception unused) {
                return j10;
            }
        }
    }
}
