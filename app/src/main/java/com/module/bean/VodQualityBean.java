package com.module.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class VodQualityBean extends QualityBean {
    private boolean isAuth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VodQualityBean(String str, String str2, boolean z10, boolean z11) {
        super(str, str2, z10);
        AbstractC5868k.m23674f(str, "display");
        AbstractC5868k.m23674f(str2, "value");
        this.isAuth = z11;
    }

    public final boolean isAuth() {
        return this.isAuth;
    }

    public final void setAuth(boolean z10) {
        this.isAuth = z10;
    }
}
