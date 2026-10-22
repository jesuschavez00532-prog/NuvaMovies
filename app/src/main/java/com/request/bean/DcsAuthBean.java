package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class DcsAuthBean implements Serializable {
    private String authCode;
    private String authVersion;
    private int openNum;
    private String reserve1;

    /* renamed from: sn */
    private String f12694sn;

    public DcsAuthBean(String str, String str2, String str3, String str4, int i10) {
        AbstractC5868k.m23674f(str, "sn");
        AbstractC5868k.m23674f(str2, "authVersion");
        AbstractC5868k.m23674f(str3, "authCode");
        AbstractC5868k.m23674f(str4, "reserve1");
        this.f12694sn = str;
        this.authVersion = str2;
        this.authCode = str3;
        this.reserve1 = str4;
        this.openNum = i10;
    }

    public static /* synthetic */ DcsAuthBean copy$default(DcsAuthBean dcsAuthBean, String str, String str2, String str3, String str4, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dcsAuthBean.f12694sn;
        }
        if ((i11 & 2) != 0) {
            str2 = dcsAuthBean.authVersion;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            str3 = dcsAuthBean.authCode;
        }
        String str6 = str3;
        if ((i11 & 8) != 0) {
            str4 = dcsAuthBean.reserve1;
        }
        String str7 = str4;
        if ((i11 & 16) != 0) {
            i10 = dcsAuthBean.openNum;
        }
        return dcsAuthBean.copy(str, str5, str6, str7, i10);
    }

    public final String component1() {
        return this.f12694sn;
    }

    public final String component2() {
        return this.authVersion;
    }

    public final String component3() {
        return this.authCode;
    }

    public final String component4() {
        return this.reserve1;
    }

    public final int component5() {
        return this.openNum;
    }

    public final DcsAuthBean copy(String str, String str2, String str3, String str4, int i10) {
        AbstractC5868k.m23674f(str, "sn");
        AbstractC5868k.m23674f(str2, "authVersion");
        AbstractC5868k.m23674f(str3, "authCode");
        AbstractC5868k.m23674f(str4, "reserve1");
        return new DcsAuthBean(str, str2, str3, str4, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcsAuthBean)) {
            return false;
        }
        DcsAuthBean dcsAuthBean = (DcsAuthBean) obj;
        return AbstractC5868k.m23669a(this.f12694sn, dcsAuthBean.f12694sn) && AbstractC5868k.m23669a(this.authVersion, dcsAuthBean.authVersion) && AbstractC5868k.m23669a(this.authCode, dcsAuthBean.authCode) && AbstractC5868k.m23669a(this.reserve1, dcsAuthBean.reserve1) && this.openNum == dcsAuthBean.openNum;
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final String getAuthVersion() {
        return this.authVersion;
    }

    public final int getOpenNum() {
        return this.openNum;
    }

    public final String getReserve1() {
        return this.reserve1;
    }

    public final String getSn() {
        return this.f12694sn;
    }

    public int hashCode() {
        return (((((((this.f12694sn.hashCode() * 31) + this.authVersion.hashCode()) * 31) + this.authCode.hashCode()) * 31) + this.reserve1.hashCode()) * 31) + this.openNum;
    }

    public final void setAuthCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.authCode = str;
    }

    public final void setAuthVersion(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.authVersion = str;
    }

    public final void setOpenNum(int i10) {
        this.openNum = i10;
    }

    public final void setReserve1(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.reserve1 = str;
    }

    public final void setSn(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f12694sn = str;
    }

    public String toString() {
        return "DcsAuthBean(sn=" + this.f12694sn + ", authVersion=" + this.authVersion + ", authCode=" + this.authCode + ", reserve1=" + this.reserve1 + ", openNum=" + this.openNum + ')';
    }
}
