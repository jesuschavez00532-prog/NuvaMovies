package com.alibaba.sdk.android.httpdns;

/* renamed from: com.alibaba.sdk.android.httpdns.h */
/* loaded from: classes.dex */
public class C1544h extends Exception {

    /* renamed from: b */
    private int f5957b;

    public C1544h(int i10, String str) {
        super(str);
        this.f5957b = i10;
    }

    public int getErrorCode() {
        return this.f5957b;
    }
}
