package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PcdnStationInfoResult {
    private String appVer;
    private String mode;
    private Boolean online;
    private Integer peers;
    private String playAddr;
    private String startUp;

    public PcdnStationInfoResult(String str, String str2, String str3, String str4, Boolean bool, Integer num) {
        this.playAddr = str;
        this.appVer = str2;
        this.startUp = str3;
        this.mode = str4;
        this.online = bool;
        this.peers = num;
    }

    public static /* synthetic */ PcdnStationInfoResult copy$default(PcdnStationInfoResult pcdnStationInfoResult, String str, String str2, String str3, String str4, Boolean bool, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pcdnStationInfoResult.playAddr;
        }
        if ((i10 & 2) != 0) {
            str2 = pcdnStationInfoResult.appVer;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = pcdnStationInfoResult.startUp;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = pcdnStationInfoResult.mode;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            bool = pcdnStationInfoResult.online;
        }
        Boolean bool2 = bool;
        if ((i10 & 32) != 0) {
            num = pcdnStationInfoResult.peers;
        }
        return pcdnStationInfoResult.copy(str, str5, str6, str7, bool2, num);
    }

    public final String component1() {
        return this.playAddr;
    }

    public final String component2() {
        return this.appVer;
    }

    public final String component3() {
        return this.startUp;
    }

    public final String component4() {
        return this.mode;
    }

    public final Boolean component5() {
        return this.online;
    }

    public final Integer component6() {
        return this.peers;
    }

    public final PcdnStationInfoResult copy(String str, String str2, String str3, String str4, Boolean bool, Integer num) {
        return new PcdnStationInfoResult(str, str2, str3, str4, bool, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcdnStationInfoResult)) {
            return false;
        }
        PcdnStationInfoResult pcdnStationInfoResult = (PcdnStationInfoResult) obj;
        return AbstractC5868k.m23669a(this.playAddr, pcdnStationInfoResult.playAddr) && AbstractC5868k.m23669a(this.appVer, pcdnStationInfoResult.appVer) && AbstractC5868k.m23669a(this.startUp, pcdnStationInfoResult.startUp) && AbstractC5868k.m23669a(this.mode, pcdnStationInfoResult.mode) && AbstractC5868k.m23669a(this.online, pcdnStationInfoResult.online) && AbstractC5868k.m23669a(this.peers, pcdnStationInfoResult.peers);
    }

    public final String getAppVer() {
        return this.appVer;
    }

    public final String getMode() {
        return this.mode;
    }

    public final Boolean getOnline() {
        return this.online;
    }

    public final Integer getPeers() {
        return this.peers;
    }

    public final String getPlayAddr() {
        return this.playAddr;
    }

    public final String getStartUp() {
        return this.startUp;
    }

    public int hashCode() {
        String str = this.playAddr;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appVer;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startUp;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.online;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.peers;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final void setAppVer(String str) {
        this.appVer = str;
    }

    public final void setMode(String str) {
        this.mode = str;
    }

    public final void setOnline(Boolean bool) {
        this.online = bool;
    }

    public final void setPeers(Integer num) {
        this.peers = num;
    }

    public final void setPlayAddr(String str) {
        this.playAddr = str;
    }

    public final void setStartUp(String str) {
        this.startUp = str;
    }

    public String toString() {
        return "PcdnStationInfoResult(playAddr=" + this.playAddr + ", appVer=" + this.appVer + ", startUp=" + this.startUp + ", mode=" + this.mode + ", online=" + this.online + ", peers=" + this.peers + ')';
    }
}
