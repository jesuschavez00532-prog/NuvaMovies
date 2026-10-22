package com.umeng.analytics.pro;

import java.io.Serializable;

/* renamed from: com.umeng.analytics.pro.cu */
/* loaded from: classes3.dex */
public class C3353cu implements Serializable {

    /* renamed from: a */
    private final boolean f14422a;

    /* renamed from: b */
    public final byte f14423b;

    /* renamed from: c */
    private final String f14424c;

    /* renamed from: d */
    private final boolean f14425d;

    public C3353cu(byte b10, boolean z10) {
        this.f14423b = b10;
        this.f14422a = false;
        this.f14424c = null;
        this.f14425d = z10;
    }

    /* renamed from: a */
    public boolean m14127a() {
        return this.f14422a;
    }

    /* renamed from: b */
    public String m14128b() {
        return this.f14424c;
    }

    /* renamed from: c */
    public boolean m14129c() {
        if (this.f14423b == 12) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m14130d() {
        byte b10 = this.f14423b;
        if (b10 != 15 && b10 != 13 && b10 != 14) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public boolean m14131e() {
        return this.f14425d;
    }

    public C3353cu(byte b10) {
        this(b10, false);
    }

    public C3353cu(byte b10, String str) {
        this.f14423b = b10;
        this.f14422a = true;
        this.f14424c = str;
        this.f14425d = false;
    }
}
