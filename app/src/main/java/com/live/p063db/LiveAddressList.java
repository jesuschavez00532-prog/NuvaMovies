package com.live.p063db;

import java.io.Serializable;
import java.util.List;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "LiveAddressList")
/* loaded from: classes2.dex */
public final class LiveAddressList implements Serializable {

    @Column(name = "audioType")
    private String audioType;

    @Column(name = "bitRateType")
    private String bitRateType;

    @Column(name = "cdnType")
    private String cdnType;

    @Column(isId = true, name = "channelCode")
    private String channelCode;

    @Column(name = "encodeFormat")
    private String encodeFormat;

    @Column(name = "playCode")
    private String playCode;

    @Column(name = "playUrl")
    private String playUrl;
    private List<String> playUrlList;

    @Column(name = "quality")
    private String quality;

    @Column(name = "urlInvalidTime")
    private String urlInvalidTime;

    public final String getAudioType() {
        return this.audioType;
    }

    public final String getBitRateType() {
        return this.bitRateType;
    }

    public final String getCdnType() {
        return this.cdnType;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getEncodeFormat() {
        return this.encodeFormat;
    }

    public final String getPlayCode() {
        return this.playCode;
    }

    public final String getPlayUrl() {
        return this.playUrl;
    }

    public final List<String> getPlayUrlList() {
        return this.playUrlList;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getUrlInvalidTime() {
        return this.urlInvalidTime;
    }

    public final void setAudioType(String str) {
        this.audioType = str;
    }

    public final void setBitRateType(String str) {
        this.bitRateType = str;
    }

    public final void setCdnType(String str) {
        this.cdnType = str;
    }

    public final void setChannelCode(String str) {
        this.channelCode = str;
    }

    public final void setEncodeFormat(String str) {
        this.encodeFormat = str;
    }

    public final void setPlayCode(String str) {
        this.playCode = str;
    }

    public final void setPlayUrl(String str) {
        this.playUrl = str;
    }

    public final void setPlayUrlList(List<String> list) {
        this.playUrlList = list;
    }

    public final void setQuality(String str) {
        this.quality = str;
    }

    public final void setUrlInvalidTime(String str) {
        this.urlInvalidTime = str;
    }
}
