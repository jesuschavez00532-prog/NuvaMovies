package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PcdnDebugInfoResult {
    private String appData;
    private String appName;
    private String appVerion;
    private Integer availMem;
    private String buildTime;
    private String deviceType;
    private Integer downBandwidth;
    private String localIp;
    private String localtime;
    private String mode;
    private Integer mtcpConns;
    private String natType;
    private Integer peerTraffic;
    private Integer peers;
    private String publicIp;
    private Integer selfCpu;
    private Integer selfMem;
    private Long serverTraffic;

    /* renamed from: sn */
    private String f12712sn;
    private String startUp;
    private String status;
    private String streamAddr;
    private String sysVersion;
    private String timeZone;
    private String tlvStatus;
    private String unixAddr;
    private Integer upBandwidth;
    private String upnpAddr;
    private String upnpAvail;

    public PcdnDebugInfoResult(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, Long l10, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str20) {
        this.deviceType = str;
        this.sysVersion = str2;
        this.appName = str3;
        this.appVerion = str4;
        this.buildTime = str5;
        this.mode = str6;
        this.f12712sn = str7;
        this.startUp = str8;
        this.localtime = str9;
        this.timeZone = str10;
        this.status = str11;
        this.appData = str12;
        this.localIp = str13;
        this.unixAddr = str14;
        this.streamAddr = str15;
        this.publicIp = str16;
        this.natType = str17;
        this.upnpAvail = str18;
        this.upnpAddr = str19;
        this.peers = num;
        this.serverTraffic = l10;
        this.peerTraffic = num2;
        this.mtcpConns = num3;
        this.selfCpu = num4;
        this.selfMem = num5;
        this.availMem = num6;
        this.upBandwidth = num7;
        this.downBandwidth = num8;
        this.tlvStatus = str20;
    }

    public final String component1() {
        return this.deviceType;
    }

    public final String component10() {
        return this.timeZone;
    }

    public final String component11() {
        return this.status;
    }

    public final String component12() {
        return this.appData;
    }

    public final String component13() {
        return this.localIp;
    }

    public final String component14() {
        return this.unixAddr;
    }

    public final String component15() {
        return this.streamAddr;
    }

    public final String component16() {
        return this.publicIp;
    }

    public final String component17() {
        return this.natType;
    }

    public final String component18() {
        return this.upnpAvail;
    }

    public final String component19() {
        return this.upnpAddr;
    }

    public final String component2() {
        return this.sysVersion;
    }

    public final Integer component20() {
        return this.peers;
    }

    public final Long component21() {
        return this.serverTraffic;
    }

    public final Integer component22() {
        return this.peerTraffic;
    }

    public final Integer component23() {
        return this.mtcpConns;
    }

    public final Integer component24() {
        return this.selfCpu;
    }

    public final Integer component25() {
        return this.selfMem;
    }

    public final Integer component26() {
        return this.availMem;
    }

    public final Integer component27() {
        return this.upBandwidth;
    }

    public final Integer component28() {
        return this.downBandwidth;
    }

    public final String component29() {
        return this.tlvStatus;
    }

    public final String component3() {
        return this.appName;
    }

    public final String component4() {
        return this.appVerion;
    }

    public final String component5() {
        return this.buildTime;
    }

    public final String component6() {
        return this.mode;
    }

    public final String component7() {
        return this.f12712sn;
    }

    public final String component8() {
        return this.startUp;
    }

    public final String component9() {
        return this.localtime;
    }

    public final PcdnDebugInfoResult copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, Integer num, Long l10, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str20) {
        return new PcdnDebugInfoResult(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, num, l10, num2, num3, num4, num5, num6, num7, num8, str20);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcdnDebugInfoResult)) {
            return false;
        }
        PcdnDebugInfoResult pcdnDebugInfoResult = (PcdnDebugInfoResult) obj;
        return AbstractC5868k.m23669a(this.deviceType, pcdnDebugInfoResult.deviceType) && AbstractC5868k.m23669a(this.sysVersion, pcdnDebugInfoResult.sysVersion) && AbstractC5868k.m23669a(this.appName, pcdnDebugInfoResult.appName) && AbstractC5868k.m23669a(this.appVerion, pcdnDebugInfoResult.appVerion) && AbstractC5868k.m23669a(this.buildTime, pcdnDebugInfoResult.buildTime) && AbstractC5868k.m23669a(this.mode, pcdnDebugInfoResult.mode) && AbstractC5868k.m23669a(this.f12712sn, pcdnDebugInfoResult.f12712sn) && AbstractC5868k.m23669a(this.startUp, pcdnDebugInfoResult.startUp) && AbstractC5868k.m23669a(this.localtime, pcdnDebugInfoResult.localtime) && AbstractC5868k.m23669a(this.timeZone, pcdnDebugInfoResult.timeZone) && AbstractC5868k.m23669a(this.status, pcdnDebugInfoResult.status) && AbstractC5868k.m23669a(this.appData, pcdnDebugInfoResult.appData) && AbstractC5868k.m23669a(this.localIp, pcdnDebugInfoResult.localIp) && AbstractC5868k.m23669a(this.unixAddr, pcdnDebugInfoResult.unixAddr) && AbstractC5868k.m23669a(this.streamAddr, pcdnDebugInfoResult.streamAddr) && AbstractC5868k.m23669a(this.publicIp, pcdnDebugInfoResult.publicIp) && AbstractC5868k.m23669a(this.natType, pcdnDebugInfoResult.natType) && AbstractC5868k.m23669a(this.upnpAvail, pcdnDebugInfoResult.upnpAvail) && AbstractC5868k.m23669a(this.upnpAddr, pcdnDebugInfoResult.upnpAddr) && AbstractC5868k.m23669a(this.peers, pcdnDebugInfoResult.peers) && AbstractC5868k.m23669a(this.serverTraffic, pcdnDebugInfoResult.serverTraffic) && AbstractC5868k.m23669a(this.peerTraffic, pcdnDebugInfoResult.peerTraffic) && AbstractC5868k.m23669a(this.mtcpConns, pcdnDebugInfoResult.mtcpConns) && AbstractC5868k.m23669a(this.selfCpu, pcdnDebugInfoResult.selfCpu) && AbstractC5868k.m23669a(this.selfMem, pcdnDebugInfoResult.selfMem) && AbstractC5868k.m23669a(this.availMem, pcdnDebugInfoResult.availMem) && AbstractC5868k.m23669a(this.upBandwidth, pcdnDebugInfoResult.upBandwidth) && AbstractC5868k.m23669a(this.downBandwidth, pcdnDebugInfoResult.downBandwidth) && AbstractC5868k.m23669a(this.tlvStatus, pcdnDebugInfoResult.tlvStatus);
    }

    public final String getAppData() {
        return this.appData;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppVerion() {
        return this.appVerion;
    }

    public final Integer getAvailMem() {
        return this.availMem;
    }

    public final String getBuildTime() {
        return this.buildTime;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final Integer getDownBandwidth() {
        return this.downBandwidth;
    }

    public final String getLocalIp() {
        return this.localIp;
    }

    public final String getLocaltime() {
        return this.localtime;
    }

    public final String getMode() {
        return this.mode;
    }

    public final Integer getMtcpConns() {
        return this.mtcpConns;
    }

    public final String getNatType() {
        return this.natType;
    }

    public final Integer getPeerTraffic() {
        return this.peerTraffic;
    }

    public final Integer getPeers() {
        return this.peers;
    }

    public final String getPublicIp() {
        return this.publicIp;
    }

    public final Integer getSelfCpu() {
        return this.selfCpu;
    }

    public final Integer getSelfMem() {
        return this.selfMem;
    }

    public final Long getServerTraffic() {
        return this.serverTraffic;
    }

    public final String getSn() {
        return this.f12712sn;
    }

    public final String getStartUp() {
        return this.startUp;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStreamAddr() {
        return this.streamAddr;
    }

    public final String getSysVersion() {
        return this.sysVersion;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final String getTlvStatus() {
        return this.tlvStatus;
    }

    public final String getUnixAddr() {
        return this.unixAddr;
    }

    public final Integer getUpBandwidth() {
        return this.upBandwidth;
    }

    public final String getUpnpAddr() {
        return this.upnpAddr;
    }

    public final String getUpnpAvail() {
        return this.upnpAvail;
    }

    public int hashCode() {
        String str = this.deviceType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sysVersion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appVerion;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buildTime;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mode;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f12712sn;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.startUp;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.localtime;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.timeZone;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.status;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.appData;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.localIp;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.unixAddr;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.streamAddr;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.publicIp;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.natType;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.upnpAvail;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.upnpAddr;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Integer num = this.peers;
        int hashCode20 = (hashCode19 + (num == null ? 0 : num.hashCode())) * 31;
        Long l10 = this.serverTraffic;
        int hashCode21 = (hashCode20 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num2 = this.peerTraffic;
        int hashCode22 = (hashCode21 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.mtcpConns;
        int hashCode23 = (hashCode22 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.selfCpu;
        int hashCode24 = (hashCode23 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.selfMem;
        int hashCode25 = (hashCode24 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.availMem;
        int hashCode26 = (hashCode25 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.upBandwidth;
        int hashCode27 = (hashCode26 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.downBandwidth;
        int hashCode28 = (hashCode27 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str20 = this.tlvStatus;
        return hashCode28 + (str20 != null ? str20.hashCode() : 0);
    }

    public final void setAppData(String str) {
        this.appData = str;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setAppVerion(String str) {
        this.appVerion = str;
    }

    public final void setAvailMem(Integer num) {
        this.availMem = num;
    }

    public final void setBuildTime(String str) {
        this.buildTime = str;
    }

    public final void setDeviceType(String str) {
        this.deviceType = str;
    }

    public final void setDownBandwidth(Integer num) {
        this.downBandwidth = num;
    }

    public final void setLocalIp(String str) {
        this.localIp = str;
    }

    public final void setLocaltime(String str) {
        this.localtime = str;
    }

    public final void setMode(String str) {
        this.mode = str;
    }

    public final void setMtcpConns(Integer num) {
        this.mtcpConns = num;
    }

    public final void setNatType(String str) {
        this.natType = str;
    }

    public final void setPeerTraffic(Integer num) {
        this.peerTraffic = num;
    }

    public final void setPeers(Integer num) {
        this.peers = num;
    }

    public final void setPublicIp(String str) {
        this.publicIp = str;
    }

    public final void setSelfCpu(Integer num) {
        this.selfCpu = num;
    }

    public final void setSelfMem(Integer num) {
        this.selfMem = num;
    }

    public final void setServerTraffic(Long l10) {
        this.serverTraffic = l10;
    }

    public final void setSn(String str) {
        this.f12712sn = str;
    }

    public final void setStartUp(String str) {
        this.startUp = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setStreamAddr(String str) {
        this.streamAddr = str;
    }

    public final void setSysVersion(String str) {
        this.sysVersion = str;
    }

    public final void setTimeZone(String str) {
        this.timeZone = str;
    }

    public final void setTlvStatus(String str) {
        this.tlvStatus = str;
    }

    public final void setUnixAddr(String str) {
        this.unixAddr = str;
    }

    public final void setUpBandwidth(Integer num) {
        this.upBandwidth = num;
    }

    public final void setUpnpAddr(String str) {
        this.upnpAddr = str;
    }

    public final void setUpnpAvail(String str) {
        this.upnpAvail = str;
    }

    public String toString() {
        return "PcdnDebugInfoResult(deviceType=" + this.deviceType + ", sysVersion=" + this.sysVersion + ", appName=" + this.appName + ", appVerion=" + this.appVerion + ", buildTime=" + this.buildTime + ", mode=" + this.mode + ", sn=" + this.f12712sn + ", startUp=" + this.startUp + ", localtime=" + this.localtime + ", timeZone=" + this.timeZone + ", status=" + this.status + ", appData=" + this.appData + ", localIp=" + this.localIp + ", unixAddr=" + this.unixAddr + ", streamAddr=" + this.streamAddr + ", publicIp=" + this.publicIp + ", natType=" + this.natType + ", upnpAvail=" + this.upnpAvail + ", upnpAddr=" + this.upnpAddr + ", peers=" + this.peers + ", serverTraffic=" + this.serverTraffic + ", peerTraffic=" + this.peerTraffic + ", mtcpConns=" + this.mtcpConns + ", selfCpu=" + this.selfCpu + ", selfMem=" + this.selfMem + ", availMem=" + this.availMem + ", upBandwidth=" + this.upBandwidth + ", downBandwidth=" + this.downBandwidth + ", tlvStatus=" + this.tlvStatus + ')';
    }
}
