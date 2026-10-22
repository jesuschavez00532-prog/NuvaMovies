package com.request.result;

import com.request.bean.EpgProgram;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class EpgData {
    private String alias;
    private String channelCode;
    private String channelNumber;
    private String keyWords;
    private String name;
    private List<EpgProgram> programList;
    private String restricted;
    private String supportBusiness;
    private String tags;

    public EpgData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<EpgProgram> list) {
        this.channelCode = str;
        this.name = str2;
        this.supportBusiness = str3;
        this.alias = str4;
        this.channelNumber = str5;
        this.tags = str6;
        this.keyWords = str7;
        this.restricted = str8;
        this.programList = list;
    }

    public final String component1() {
        return this.channelCode;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.supportBusiness;
    }

    public final String component4() {
        return this.alias;
    }

    public final String component5() {
        return this.channelNumber;
    }

    public final String component6() {
        return this.tags;
    }

    public final String component7() {
        return this.keyWords;
    }

    public final String component8() {
        return this.restricted;
    }

    public final List<EpgProgram> component9() {
        return this.programList;
    }

    public final EpgData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<EpgProgram> list) {
        return new EpgData(str, str2, str3, str4, str5, str6, str7, str8, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpgData)) {
            return false;
        }
        EpgData epgData = (EpgData) obj;
        return AbstractC5868k.m23669a(this.channelCode, epgData.channelCode) && AbstractC5868k.m23669a(this.name, epgData.name) && AbstractC5868k.m23669a(this.supportBusiness, epgData.supportBusiness) && AbstractC5868k.m23669a(this.alias, epgData.alias) && AbstractC5868k.m23669a(this.channelNumber, epgData.channelNumber) && AbstractC5868k.m23669a(this.tags, epgData.tags) && AbstractC5868k.m23669a(this.keyWords, epgData.keyWords) && AbstractC5868k.m23669a(this.restricted, epgData.restricted) && AbstractC5868k.m23669a(this.programList, epgData.programList);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getChannelNumber() {
        return this.channelNumber;
    }

    public final String getKeyWords() {
        return this.keyWords;
    }

    public final String getName() {
        return this.name;
    }

    public final List<EpgProgram> getProgramList() {
        return this.programList;
    }

    public final String getRestricted() {
        return this.restricted;
    }

    public final String getSupportBusiness() {
        return this.supportBusiness;
    }

    public final String getTags() {
        return this.tags;
    }

    public int hashCode() {
        String str = this.channelCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.supportBusiness;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.alias;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.channelNumber;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.tags;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.keyWords;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.restricted;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<EpgProgram> list = this.programList;
        return hashCode8 + (list != null ? list.hashCode() : 0);
    }

    public final void setAlias(String str) {
        this.alias = str;
    }

    public final void setChannelCode(String str) {
        this.channelCode = str;
    }

    public final void setChannelNumber(String str) {
        this.channelNumber = str;
    }

    public final void setKeyWords(String str) {
        this.keyWords = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setProgramList(List<EpgProgram> list) {
        this.programList = list;
    }

    public final void setRestricted(String str) {
        this.restricted = str;
    }

    public final void setSupportBusiness(String str) {
        this.supportBusiness = str;
    }

    public final void setTags(String str) {
        this.tags = str;
    }

    public String toString() {
        return "EpgData(channelCode=" + this.channelCode + ", name=" + this.name + ", supportBusiness=" + this.supportBusiness + ", alias=" + this.alias + ", channelNumber=" + this.channelNumber + ", tags=" + this.tags + ", keyWords=" + this.keyWords + ", restricted=" + this.restricted + ", programList=" + this.programList + ')';
    }
}
