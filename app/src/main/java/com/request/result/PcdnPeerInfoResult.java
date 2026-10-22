package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PcdnPeerInfoResult {
    private String addr;
    private Boolean isServer;
    private String mode;
    private Double priority;

    /* renamed from: sn */
    private String f12713sn;
    private Integer sync;

    public PcdnPeerInfoResult(String str, String str2, String str3, Double d10, Integer num, Boolean bool) {
        this.f12713sn = str;
        this.mode = str2;
        this.addr = str3;
        this.priority = d10;
        this.sync = num;
        this.isServer = bool;
    }

    public static /* synthetic */ PcdnPeerInfoResult copy$default(PcdnPeerInfoResult pcdnPeerInfoResult, String str, String str2, String str3, Double d10, Integer num, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pcdnPeerInfoResult.f12713sn;
        }
        if ((i10 & 2) != 0) {
            str2 = pcdnPeerInfoResult.mode;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = pcdnPeerInfoResult.addr;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            d10 = pcdnPeerInfoResult.priority;
        }
        Double d11 = d10;
        if ((i10 & 16) != 0) {
            num = pcdnPeerInfoResult.sync;
        }
        Integer num2 = num;
        if ((i10 & 32) != 0) {
            bool = pcdnPeerInfoResult.isServer;
        }
        return pcdnPeerInfoResult.copy(str, str4, str5, d11, num2, bool);
    }

    public final String component1() {
        return this.f12713sn;
    }

    public final String component2() {
        return this.mode;
    }

    public final String component3() {
        return this.addr;
    }

    public final Double component4() {
        return this.priority;
    }

    public final Integer component5() {
        return this.sync;
    }

    public final Boolean component6() {
        return this.isServer;
    }

    public final PcdnPeerInfoResult copy(String str, String str2, String str3, Double d10, Integer num, Boolean bool) {
        return new PcdnPeerInfoResult(str, str2, str3, d10, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcdnPeerInfoResult)) {
            return false;
        }
        PcdnPeerInfoResult pcdnPeerInfoResult = (PcdnPeerInfoResult) obj;
        return AbstractC5868k.m23669a(this.f12713sn, pcdnPeerInfoResult.f12713sn) && AbstractC5868k.m23669a(this.mode, pcdnPeerInfoResult.mode) && AbstractC5868k.m23669a(this.addr, pcdnPeerInfoResult.addr) && AbstractC5868k.m23669a(this.priority, pcdnPeerInfoResult.priority) && AbstractC5868k.m23669a(this.sync, pcdnPeerInfoResult.sync) && AbstractC5868k.m23669a(this.isServer, pcdnPeerInfoResult.isServer);
    }

    public final String getAddr() {
        return this.addr;
    }

    public final String getMode() {
        return this.mode;
    }

    public final Double getPriority() {
        return this.priority;
    }

    public final String getSn() {
        return this.f12713sn;
    }

    public final Integer getSync() {
        return this.sync;
    }

    public int hashCode() {
        String str = this.f12713sn;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addr;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d10 = this.priority;
        int hashCode4 = (hashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.sync;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isServer;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isServer() {
        return this.isServer;
    }

    public final void setAddr(String str) {
        this.addr = str;
    }

    public final void setMode(String str) {
        this.mode = str;
    }

    public final void setPriority(Double d10) {
        this.priority = d10;
    }

    public final void setServer(Boolean bool) {
        this.isServer = bool;
    }

    public final void setSn(String str) {
        this.f12713sn = str;
    }

    public final void setSync(Integer num) {
        this.sync = num;
    }

    public String toString() {
        return "PcdnPeerInfoResult(sn=" + this.f12713sn + ", mode=" + this.mode + ", addr=" + this.addr + ", priority=" + this.priority + ", sync=" + this.sync + ", isServer=" + this.isServer + ')';
    }
}
