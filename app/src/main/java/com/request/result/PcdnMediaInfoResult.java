package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PcdnMediaInfoResult {
    private String bufferData;
    private Long bufferTime;
    private String headMoment;
    private String mediaCode;
    private String name;
    private String playUrl;
    private String protocol;
    private Long recvBytes;
    private String recvMoment;
    private Long sendBytes;
    private String sendMoment;
    private String sourceUrl;
    private Integer status;
    private String tailMoment;
    private String type;

    public PcdnMediaInfoResult(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Long l10, String str7, Long l11, Long l12, String str8, String str9, String str10, String str11) {
        this.name = str;
        this.mediaCode = str2;
        this.type = str3;
        this.protocol = str4;
        this.sourceUrl = str5;
        this.playUrl = str6;
        this.status = num;
        this.bufferTime = l10;
        this.bufferData = str7;
        this.recvBytes = l11;
        this.sendBytes = l12;
        this.headMoment = str8;
        this.recvMoment = str9;
        this.sendMoment = str10;
        this.tailMoment = str11;
    }

    public final String component1() {
        return this.name;
    }

    public final Long component10() {
        return this.recvBytes;
    }

    public final Long component11() {
        return this.sendBytes;
    }

    public final String component12() {
        return this.headMoment;
    }

    public final String component13() {
        return this.recvMoment;
    }

    public final String component14() {
        return this.sendMoment;
    }

    public final String component15() {
        return this.tailMoment;
    }

    public final String component2() {
        return this.mediaCode;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.protocol;
    }

    public final String component5() {
        return this.sourceUrl;
    }

    public final String component6() {
        return this.playUrl;
    }

    public final Integer component7() {
        return this.status;
    }

    public final Long component8() {
        return this.bufferTime;
    }

    public final String component9() {
        return this.bufferData;
    }

    public final PcdnMediaInfoResult copy(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Long l10, String str7, Long l11, Long l12, String str8, String str9, String str10, String str11) {
        return new PcdnMediaInfoResult(str, str2, str3, str4, str5, str6, num, l10, str7, l11, l12, str8, str9, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PcdnMediaInfoResult)) {
            return false;
        }
        PcdnMediaInfoResult pcdnMediaInfoResult = (PcdnMediaInfoResult) obj;
        return AbstractC5868k.m23669a(this.name, pcdnMediaInfoResult.name) && AbstractC5868k.m23669a(this.mediaCode, pcdnMediaInfoResult.mediaCode) && AbstractC5868k.m23669a(this.type, pcdnMediaInfoResult.type) && AbstractC5868k.m23669a(this.protocol, pcdnMediaInfoResult.protocol) && AbstractC5868k.m23669a(this.sourceUrl, pcdnMediaInfoResult.sourceUrl) && AbstractC5868k.m23669a(this.playUrl, pcdnMediaInfoResult.playUrl) && AbstractC5868k.m23669a(this.status, pcdnMediaInfoResult.status) && AbstractC5868k.m23669a(this.bufferTime, pcdnMediaInfoResult.bufferTime) && AbstractC5868k.m23669a(this.bufferData, pcdnMediaInfoResult.bufferData) && AbstractC5868k.m23669a(this.recvBytes, pcdnMediaInfoResult.recvBytes) && AbstractC5868k.m23669a(this.sendBytes, pcdnMediaInfoResult.sendBytes) && AbstractC5868k.m23669a(this.headMoment, pcdnMediaInfoResult.headMoment) && AbstractC5868k.m23669a(this.recvMoment, pcdnMediaInfoResult.recvMoment) && AbstractC5868k.m23669a(this.sendMoment, pcdnMediaInfoResult.sendMoment) && AbstractC5868k.m23669a(this.tailMoment, pcdnMediaInfoResult.tailMoment);
    }

    public final String getBufferData() {
        return this.bufferData;
    }

    public final Long getBufferTime() {
        return this.bufferTime;
    }

    public final String getHeadMoment() {
        return this.headMoment;
    }

    public final String getMediaCode() {
        return this.mediaCode;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlayUrl() {
        return this.playUrl;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final Long getRecvBytes() {
        return this.recvBytes;
    }

    public final String getRecvMoment() {
        return this.recvMoment;
    }

    public final Long getSendBytes() {
        return this.sendBytes;
    }

    public final String getSendMoment() {
        return this.sendMoment;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String getTailMoment() {
        return this.tailMoment;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mediaCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.protocol;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sourceUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.playUrl;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.status;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Long l10 = this.bufferTime;
        int hashCode8 = (hashCode7 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str7 = this.bufferData;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l11 = this.recvBytes;
        int hashCode10 = (hashCode9 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.sendBytes;
        int hashCode11 = (hashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str8 = this.headMoment;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.recvMoment;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sendMoment;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tailMoment;
        return hashCode14 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void setBufferData(String str) {
        this.bufferData = str;
    }

    public final void setBufferTime(Long l10) {
        this.bufferTime = l10;
    }

    public final void setHeadMoment(String str) {
        this.headMoment = str;
    }

    public final void setMediaCode(String str) {
        this.mediaCode = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPlayUrl(String str) {
        this.playUrl = str;
    }

    public final void setProtocol(String str) {
        this.protocol = str;
    }

    public final void setRecvBytes(Long l10) {
        this.recvBytes = l10;
    }

    public final void setRecvMoment(String str) {
        this.recvMoment = str;
    }

    public final void setSendBytes(Long l10) {
        this.sendBytes = l10;
    }

    public final void setSendMoment(String str) {
        this.sendMoment = str;
    }

    public final void setSourceUrl(String str) {
        this.sourceUrl = str;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final void setTailMoment(String str) {
        this.tailMoment = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "PcdnMediaInfoResult(name=" + this.name + ", mediaCode=" + this.mediaCode + ", type=" + this.type + ", protocol=" + this.protocol + ", sourceUrl=" + this.sourceUrl + ", playUrl=" + this.playUrl + ", status=" + this.status + ", bufferTime=" + this.bufferTime + ", bufferData=" + this.bufferData + ", recvBytes=" + this.recvBytes + ", sendBytes=" + this.sendBytes + ", headMoment=" + this.headMoment + ", recvMoment=" + this.recvMoment + ", sendMoment=" + this.sendMoment + ", tailMoment=" + this.tailMoment + ')';
    }
}
