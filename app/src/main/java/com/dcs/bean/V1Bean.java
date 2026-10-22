package com.dcs.bean;

import com.umeng.analytics.pro.C3325bt;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class V1Bean {

    /* renamed from: s */
    private String f6764s;
    private int status;

    public V1Bean(String str, int i10) {
        AbstractC5868k.m23674f(str, C3325bt.f14190aH);
        this.f6764s = str;
        this.status = i10;
    }

    public static /* synthetic */ V1Bean copy$default(V1Bean v1Bean, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = v1Bean.f6764s;
        }
        if ((i11 & 2) != 0) {
            i10 = v1Bean.status;
        }
        return v1Bean.copy(str, i10);
    }

    public final String component1() {
        return this.f6764s;
    }

    public final int component2() {
        return this.status;
    }

    public final V1Bean copy(String str, int i10) {
        AbstractC5868k.m23674f(str, C3325bt.f14190aH);
        return new V1Bean(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V1Bean)) {
            return false;
        }
        V1Bean v1Bean = (V1Bean) obj;
        return AbstractC5868k.m23669a(this.f6764s, v1Bean.f6764s) && this.status == v1Bean.status;
    }

    public final String getS() {
        return this.f6764s;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.f6764s.hashCode() * 31) + this.status;
    }

    public final void setS(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f6764s = str;
    }

    public final void setStatus(int i10) {
        this.status = i10;
    }

    public String toString() {
        return "V1Bean(s=" + this.f6764s + ", status=" + this.status + ')';
    }
}
