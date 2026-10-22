package com.umeng.analytics.pro;

import com.raizlabs.android.dbflow.sql.language.Operator;

/* renamed from: com.umeng.analytics.pro.de */
/* loaded from: classes3.dex */
public final class C3364de {

    /* renamed from: a */
    public final String f14493a;

    /* renamed from: b */
    public final byte f14494b;

    /* renamed from: c */
    public final int f14495c;

    public C3364de() {
        this("", (byte) 0, 0);
    }

    /* renamed from: a */
    public boolean m14207a(C3364de c3364de) {
        if (this.f14493a.equals(c3364de.f14493a) && this.f14494b == c3364de.f14494b && this.f14495c == c3364de.f14495c) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3364de) {
            return m14207a((C3364de) obj);
        }
        return false;
    }

    public String toString() {
        return "<TMessage name:'" + this.f14493a + "' type: " + ((int) this.f14494b) + " seqid:" + this.f14495c + Operator.Operation.GREATER_THAN;
    }

    public C3364de(String str, byte b10, int i10) {
        this.f14493a = str;
        this.f14494b = b10;
        this.f14495c = i10;
    }
}
