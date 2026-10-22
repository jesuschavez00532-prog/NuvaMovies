package com.module.bean;

import cc.C1456h0;
import com.request.result.Channel;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class PipVideoInfo implements Serializable {
    String addressLicense;
    String channelCode;
    String from;
    Boolean isMultiQuality;
    boolean isUrlExpired;
    Channel mPipChannel;
    String pipProgramInfoJson;
    String pipQuality;
    C1456h0.a playType;
    String playUrl;
    int programIndex;
    String programInfoJson;
    String programName;
    String programNo;
    String quality;

    public PipVideoInfo(String str, String str2, C1456h0.a aVar, String str3, String str4, String str5, String str6, String str7, Boolean bool, String str8, String str9, Channel channel, Boolean bool2, int i10) {
        this.channelCode = str2;
        this.playType = aVar;
        this.programInfoJson = str3;
        this.pipProgramInfoJson = str8;
        this.addressLicense = str4;
        this.from = str5;
        this.quality = str6;
        this.pipQuality = str9;
        this.programName = str7;
        this.isMultiQuality = bool;
        this.programNo = str;
        this.mPipChannel = channel;
        this.isUrlExpired = bool2.booleanValue();
        this.programIndex = i10;
    }

    public String getAddressLicense() {
        return this.addressLicense;
    }

    public String getChannelCode() {
        return this.channelCode;
    }

    public String getFrom() {
        return this.from;
    }

    public Boolean getMultiQuality() {
        return this.isMultiQuality;
    }

    public String getPipProgramInfoJson() {
        return this.pipProgramInfoJson;
    }

    public String getPipQuality() {
        return this.pipQuality;
    }

    public C1456h0.a getPlayType() {
        return this.playType;
    }

    public String getPlayUrl() {
        return this.playUrl;
    }

    public int getProgramIndex() {
        return this.programIndex;
    }

    public String getProgramInfoJson() {
        return this.programInfoJson;
    }

    public String getProgramName() {
        return this.programName;
    }

    public String getProgramNo() {
        return this.programNo;
    }

    public String getQuality() {
        return this.quality;
    }

    public Channel getmPipChannel() {
        return this.mPipChannel;
    }

    public boolean isUrlExpired() {
        return this.isUrlExpired;
    }

    public void setAddressLicense(String str) {
        this.addressLicense = str;
    }

    public void setChannelCode(String str) {
        this.channelCode = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setMultiQuality(Boolean bool) {
        this.isMultiQuality = bool;
    }

    public void setPipProgramInfoJson(String str) {
        this.pipProgramInfoJson = str;
    }

    public void setPipQuality(String str) {
        this.pipQuality = str;
    }

    public void setPlayType(C1456h0.a aVar) {
        this.playType = aVar;
    }

    public void setPlayUrl(String str) {
        this.playUrl = str;
    }

    public void setProgramIndex(int i10) {
        this.programIndex = i10;
    }

    public void setProgramInfoJson(String str) {
        this.programInfoJson = str;
    }

    public void setProgramName(String str) {
        this.programName = str;
    }

    public void setProgramNo(String str) {
        this.programNo = str;
    }

    public void setQuality(String str) {
        this.quality = str;
    }

    public void setUrlExpired(boolean z10) {
        this.isUrlExpired = z10;
    }

    public void setmPipChannel(Channel channel) {
        this.mPipChannel = channel;
    }

    public String toString() {
        return "PipVideoInfo{programNo='" + this.programNo + "'channelCode='" + this.channelCode + "', playType=" + this.playType + ", programInfoJson='" + this.programInfoJson + "', addressLicense='" + this.addressLicense + "', from='" + this.from + "', quality='" + this.quality + "', programeName='" + this.programName + "', playUrl='" + this.playUrl + "', isMultiQuality=" + this.isMultiQuality + ", isUrlExpired=" + this.isUrlExpired + '}';
    }

    public PipVideoInfo() {
    }
}
