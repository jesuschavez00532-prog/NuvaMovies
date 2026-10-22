package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class DcsGetAddrBean implements Serializable {
    private String authCode;
    private String authVersion;
    private int openNum;
    private String pre_code;
    private String reserve1;

    /* renamed from: sn */
    private String f12695sn;
    private int type;

    public DcsGetAddrBean(String str, String str2, String str3, String str4, int i10, String str5, int i11) {
        AbstractC5868k.m23674f(str, "sn");
        AbstractC5868k.m23674f(str2, "authVersion");
        AbstractC5868k.m23674f(str3, "authCode");
        AbstractC5868k.m23674f(str5, "reserve1");
        this.f12695sn = str;
        this.authVersion = str2;
        this.authCode = str3;
        this.pre_code = str4;
        this.type = i10;
        this.reserve1 = str5;
        this.openNum = i11;
    }

    public static /* synthetic */ DcsGetAddrBean copy$default(DcsGetAddrBean dcsGetAddrBean, String str, String str2, String str3, String str4, int i10, String str5, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = dcsGetAddrBean.f12695sn;
        }
        if ((i12 & 2) != 0) {
            str2 = dcsGetAddrBean.authVersion;
        }
        String str6 = str2;
        if ((i12 & 4) != 0) {
            str3 = dcsGetAddrBean.authCode;
        }
        String str7 = str3;
        if ((i12 & 8) != 0) {
            str4 = dcsGetAddrBean.pre_code;
        }
        String str8 = str4;
        if ((i12 & 16) != 0) {
            i10 = dcsGetAddrBean.type;
        }
        int i13 = i10;
        if ((i12 & 32) != 0) {
            str5 = dcsGetAddrBean.reserve1;
        }
        String str9 = str5;
        if ((i12 & 64) != 0) {
            i11 = dcsGetAddrBean.openNum;
        }
        return dcsGetAddrBean.copy(str, str6, str7, str8, i13, str9, i11);
    }

    public final String component1() {
        return this.f12695sn;
    }

    public final String component2() {
        return this.authVersion;
    }

    public final String component3() {
        return this.authCode;
    }

    public final String component4() {
        return this.pre_code;
    }

    public final int component5() {
        return this.type;
    }

    public final String component6() {
        return this.reserve1;
    }

    public final int component7() {
        return this.openNum;
    }

    public final DcsGetAddrBean copy(String str, String str2, String str3, String str4, int i10, String str5, int i11) {
        AbstractC5868k.m23674f(str, "sn");
        AbstractC5868k.m23674f(str2, "authVersion");
        AbstractC5868k.m23674f(str3, "authCode");
        AbstractC5868k.m23674f(str5, "reserve1");
        return new DcsGetAddrBean(str, str2, str3, str4, i10, str5, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcsGetAddrBean)) {
            return false;
        }
        DcsGetAddrBean dcsGetAddrBean = (DcsGetAddrBean) obj;
        return AbstractC5868k.m23669a(this.f12695sn, dcsGetAddrBean.f12695sn) && AbstractC5868k.m23669a(this.authVersion, dcsGetAddrBean.authVersion) && AbstractC5868k.m23669a(this.authCode, dcsGetAddrBean.authCode) && AbstractC5868k.m23669a(this.pre_code, dcsGetAddrBean.pre_code) && this.type == dcsGetAddrBean.type && AbstractC5868k.m23669a(this.reserve1, dcsGetAddrBean.reserve1) && this.openNum == dcsGetAddrBean.openNum;
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

    public final String getPre_code() {
        return this.pre_code;
    }

    public final String getReserve1() {
        return this.reserve1;
    }

    public final String getSn() {
        return this.f12695sn;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((this.f12695sn.hashCode() * 31) + this.authVersion.hashCode()) * 31) + this.authCode.hashCode()) * 31;
        String str = this.pre_code;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type) * 31) + this.reserve1.hashCode()) * 31) + this.openNum;
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

    public final void setPre_code(String str) {
        this.pre_code = str;
    }

    public final void setReserve1(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.reserve1 = str;
    }

    public final void setSn(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f12695sn = str;
    }

    public final void setType(int i10) {
        this.type = i10;
    }

    public String toString() {
        return "DcsGetAddrBean(sn=" + this.f12695sn + ", authVersion=" + this.authVersion + ", authCode=" + this.authCode + ", pre_code=" + this.pre_code + ", type=" + this.type + ", reserve1=" + this.reserve1 + ", openNum=" + this.openNum + ')';
    }
}
