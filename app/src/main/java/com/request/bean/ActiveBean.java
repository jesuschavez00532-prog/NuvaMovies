package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ActiveBean implements Serializable {
    private String authCode;
    private String authVersion;
    private String channel;
    private String macAddr;
    private String matadata;
    private int openNum;
    private String preCode;
    private String reserve1;
    private String signdata;
    private String snToken;

    public ActiveBean(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, String str9) {
        AbstractC5868k.m23674f(str5, "macAddr");
        AbstractC5868k.m23674f(str6, "reserve1");
        AbstractC5868k.m23674f(str7, "channel");
        AbstractC5868k.m23674f(str8, "matadata");
        AbstractC5868k.m23674f(str9, "signdata");
        this.snToken = str;
        this.authVersion = str2;
        this.authCode = str3;
        this.preCode = str4;
        this.macAddr = str5;
        this.reserve1 = str6;
        this.openNum = i10;
        this.channel = str7;
        this.matadata = str8;
        this.signdata = str9;
    }

    public final String component1() {
        return this.snToken;
    }

    public final String component10() {
        return this.signdata;
    }

    public final String component2() {
        return this.authVersion;
    }

    public final String component3() {
        return this.authCode;
    }

    public final String component4() {
        return this.preCode;
    }

    public final String component5() {
        return this.macAddr;
    }

    public final String component6() {
        return this.reserve1;
    }

    public final int component7() {
        return this.openNum;
    }

    public final String component8() {
        return this.channel;
    }

    public final String component9() {
        return this.matadata;
    }

    public final ActiveBean copy(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, String str9) {
        AbstractC5868k.m23674f(str5, "macAddr");
        AbstractC5868k.m23674f(str6, "reserve1");
        AbstractC5868k.m23674f(str7, "channel");
        AbstractC5868k.m23674f(str8, "matadata");
        AbstractC5868k.m23674f(str9, "signdata");
        return new ActiveBean(str, str2, str3, str4, str5, str6, i10, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActiveBean)) {
            return false;
        }
        ActiveBean activeBean = (ActiveBean) obj;
        return AbstractC5868k.m23669a(this.snToken, activeBean.snToken) && AbstractC5868k.m23669a(this.authVersion, activeBean.authVersion) && AbstractC5868k.m23669a(this.authCode, activeBean.authCode) && AbstractC5868k.m23669a(this.preCode, activeBean.preCode) && AbstractC5868k.m23669a(this.macAddr, activeBean.macAddr) && AbstractC5868k.m23669a(this.reserve1, activeBean.reserve1) && this.openNum == activeBean.openNum && AbstractC5868k.m23669a(this.channel, activeBean.channel) && AbstractC5868k.m23669a(this.matadata, activeBean.matadata) && AbstractC5868k.m23669a(this.signdata, activeBean.signdata);
    }

    public final String getAuthCode() {
        return this.authCode;
    }

    public final String getAuthVersion() {
        return this.authVersion;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getMacAddr() {
        return this.macAddr;
    }

    public final String getMatadata() {
        return this.matadata;
    }

    public final int getOpenNum() {
        return this.openNum;
    }

    public final String getPreCode() {
        return this.preCode;
    }

    public final String getReserve1() {
        return this.reserve1;
    }

    public final String getSigndata() {
        return this.signdata;
    }

    public final String getSnToken() {
        return this.snToken;
    }

    public int hashCode() {
        String str = this.snToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authVersion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.authCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.preCode;
        return ((((((((((((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.macAddr.hashCode()) * 31) + this.reserve1.hashCode()) * 31) + this.openNum) * 31) + this.channel.hashCode()) * 31) + this.matadata.hashCode()) * 31) + this.signdata.hashCode();
    }

    public final void setAuthCode(String str) {
        this.authCode = str;
    }

    public final void setAuthVersion(String str) {
        this.authVersion = str;
    }

    public final void setChannel(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.channel = str;
    }

    public final void setMacAddr(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.macAddr = str;
    }

    public final void setMatadata(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.matadata = str;
    }

    public final void setOpenNum(int i10) {
        this.openNum = i10;
    }

    public final void setPreCode(String str) {
        this.preCode = str;
    }

    public final void setReserve1(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.reserve1 = str;
    }

    public final void setSigndata(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.signdata = str;
    }

    public final void setSnToken(String str) {
        this.snToken = str;
    }

    public String toString() {
        return "ActiveBean(snToken=" + this.snToken + ", authVersion=" + this.authVersion + ", authCode=" + this.authCode + ", preCode=" + this.preCode + ", macAddr=" + this.macAddr + ", reserve1=" + this.reserve1 + ", openNum=" + this.openNum + ", channel=" + this.channel + ", matadata=" + this.matadata + ", signdata=" + this.signdata + ')';
    }

    public /* synthetic */ ActiveBean(String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, String str8, String str9, int i11, AbstractC5864g abstractC5864g) {
        this(str, str2, str3, str4, str5, str6, i10, str7, (i11 & 256) != 0 ? "" : str8, (i11 & 512) != 0 ? "" : str9);
    }
}
