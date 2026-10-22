package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class TerminalAuthBean implements Serializable {
    private String authCode;
    private String authVersion;
    private int openNum;
    private String reserve1;

    public TerminalAuthBean(String str, String str2, String str3, int i10) {
        AbstractC5868k.m23674f(str, "authVersion");
        AbstractC5868k.m23674f(str2, "authCode");
        AbstractC5868k.m23674f(str3, "reserve1");
        this.authVersion = str;
        this.authCode = str2;
        this.reserve1 = str3;
        this.openNum = i10;
    }

    public static /* synthetic */ TerminalAuthBean copy$default(TerminalAuthBean terminalAuthBean, String str, String str2, String str3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = terminalAuthBean.authVersion;
        }
        if ((i11 & 2) != 0) {
            str2 = terminalAuthBean.authCode;
        }
        if ((i11 & 4) != 0) {
            str3 = terminalAuthBean.reserve1;
        }
        if ((i11 & 8) != 0) {
            i10 = terminalAuthBean.openNum;
        }
        return terminalAuthBean.copy(str, str2, str3, i10);
    }

    public final String component1() {
        return this.authVersion;
    }

    public final String component2() {
        return this.authCode;
    }

    public final String component3() {
        return this.reserve1;
    }

    public final int component4() {
        return this.openNum;
    }

    public final TerminalAuthBean copy(String str, String str2, String str3, int i10) {
        AbstractC5868k.m23674f(str, "authVersion");
        AbstractC5868k.m23674f(str2, "authCode");
        AbstractC5868k.m23674f(str3, "reserve1");
        return new TerminalAuthBean(str, str2, str3, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TerminalAuthBean)) {
            return false;
        }
        TerminalAuthBean terminalAuthBean = (TerminalAuthBean) obj;
        return AbstractC5868k.m23669a(this.authVersion, terminalAuthBean.authVersion) && AbstractC5868k.m23669a(this.authCode, terminalAuthBean.authCode) && AbstractC5868k.m23669a(this.reserve1, terminalAuthBean.reserve1) && this.openNum == terminalAuthBean.openNum;
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

    public int hashCode() {
        return (((((this.authVersion.hashCode() * 31) + this.authCode.hashCode()) * 31) + this.reserve1.hashCode()) * 31) + this.openNum;
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

    public String toString() {
        return "TerminalAuthBean(authVersion=" + this.authVersion + ", authCode=" + this.authCode + ", reserve1=" + this.reserve1 + ", openNum=" + this.openNum + ')';
    }
}
