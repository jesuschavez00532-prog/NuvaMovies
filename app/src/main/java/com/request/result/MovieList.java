package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class MovieList implements Serializable {
    private String audioInfo;
    private String audioType;
    private String bitRateType;
    private String contentId;
    private String encodeFormat;
    private List<LicenseData> licenseList;
    private String quality;
    private String screenFormat;
    private String terminalType;
    private String type;
    private String videoFormat;
    private String videoType;

    public MovieList(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<LicenseData> list) {
        this.contentId = str;
        this.terminalType = str2;
        this.type = str3;
        this.audioType = str4;
        this.videoType = str5;
        this.screenFormat = str6;
        this.encodeFormat = str7;
        this.videoFormat = str8;
        this.bitRateType = str9;
        this.quality = str10;
        this.audioInfo = str11;
        this.licenseList = list;
    }

    public final String component1() {
        return this.contentId;
    }

    public final String component10() {
        return this.quality;
    }

    public final String component11() {
        return this.audioInfo;
    }

    public final List<LicenseData> component12() {
        return this.licenseList;
    }

    public final String component2() {
        return this.terminalType;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.audioType;
    }

    public final String component5() {
        return this.videoType;
    }

    public final String component6() {
        return this.screenFormat;
    }

    public final String component7() {
        return this.encodeFormat;
    }

    public final String component8() {
        return this.videoFormat;
    }

    public final String component9() {
        return this.bitRateType;
    }

    public final MovieList copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<LicenseData> list) {
        return new MovieList(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieList)) {
            return false;
        }
        MovieList movieList = (MovieList) obj;
        return AbstractC5868k.m23669a(this.contentId, movieList.contentId) && AbstractC5868k.m23669a(this.terminalType, movieList.terminalType) && AbstractC5868k.m23669a(this.type, movieList.type) && AbstractC5868k.m23669a(this.audioType, movieList.audioType) && AbstractC5868k.m23669a(this.videoType, movieList.videoType) && AbstractC5868k.m23669a(this.screenFormat, movieList.screenFormat) && AbstractC5868k.m23669a(this.encodeFormat, movieList.encodeFormat) && AbstractC5868k.m23669a(this.videoFormat, movieList.videoFormat) && AbstractC5868k.m23669a(this.bitRateType, movieList.bitRateType) && AbstractC5868k.m23669a(this.quality, movieList.quality) && AbstractC5868k.m23669a(this.audioInfo, movieList.audioInfo) && AbstractC5868k.m23669a(this.licenseList, movieList.licenseList);
    }

    public final String getAudioInfo() {
        return this.audioInfo;
    }

    public final String getAudioType() {
        return this.audioType;
    }

    public final String getBitRateType() {
        return this.bitRateType;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getEncodeFormat() {
        return this.encodeFormat;
    }

    public final List<LicenseData> getLicenseList() {
        return this.licenseList;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getScreenFormat() {
        return this.screenFormat;
    }

    public final String getTerminalType() {
        return this.terminalType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getVideoFormat() {
        return this.videoFormat;
    }

    public final String getVideoType() {
        return this.videoType;
    }

    public int hashCode() {
        String str = this.contentId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.terminalType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.audioType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.videoType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.screenFormat;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.encodeFormat;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.videoFormat;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bitRateType;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.quality;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.audioInfo;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<LicenseData> list = this.licenseList;
        return hashCode11 + (list != null ? list.hashCode() : 0);
    }

    public final void setAudioInfo(String str) {
        this.audioInfo = str;
    }

    public final void setAudioType(String str) {
        this.audioType = str;
    }

    public final void setBitRateType(String str) {
        this.bitRateType = str;
    }

    public final void setContentId(String str) {
        this.contentId = str;
    }

    public final void setEncodeFormat(String str) {
        this.encodeFormat = str;
    }

    public final void setLicenseList(List<LicenseData> list) {
        this.licenseList = list;
    }

    public final void setQuality(String str) {
        this.quality = str;
    }

    public final void setScreenFormat(String str) {
        this.screenFormat = str;
    }

    public final void setTerminalType(String str) {
        this.terminalType = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVideoFormat(String str) {
        this.videoFormat = str;
    }

    public final void setVideoType(String str) {
        this.videoType = str;
    }

    public String toString() {
        return "MovieList(contentId=" + this.contentId + ", terminalType=" + this.terminalType + ", type=" + this.type + ", audioType=" + this.audioType + ", videoType=" + this.videoType + ", screenFormat=" + this.screenFormat + ", encodeFormat=" + this.encodeFormat + ", videoFormat=" + this.videoFormat + ", bitRateType=" + this.bitRateType + ", quality=" + this.quality + ", audioInfo=" + this.audioInfo + ", licenseList=" + this.licenseList + ')';
    }
}
