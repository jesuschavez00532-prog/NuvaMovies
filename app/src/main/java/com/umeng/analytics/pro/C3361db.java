package com.umeng.analytics.pro;

import com.raizlabs.android.dbflow.sql.language.Operator;

/* renamed from: com.umeng.analytics.pro.db */
/* loaded from: classes3.dex */
public class C3361db {

    /* renamed from: a */
    public final String f14485a;

    /* renamed from: b */
    public final byte f14486b;

    /* renamed from: c */
    public final short f14487c;

    public C3361db() {
        this("", (byte) 0, (short) 0);
    }

    /* renamed from: a */
    public boolean m14206a(C3361db c3361db) {
        if (this.f14486b == c3361db.f14486b && this.f14487c == c3361db.f14487c) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "<TField name:'" + this.f14485a + "' type:" + ((int) this.f14486b) + " field-id:" + ((int) this.f14487c) + Operator.Operation.GREATER_THAN;
    }

    public C3361db(String str, byte b10, short s10) {
        this.f14485a = str;
        this.f14486b = b10;
        this.f14487c = s10;
    }
}
