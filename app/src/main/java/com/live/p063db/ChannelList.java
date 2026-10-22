package com.live.p063db;

import com.lzy.okgo.cookie.SerializableCookie;
import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "ChannelList")
/* loaded from: classes2.dex */
public final class ChannelList implements Serializable {

    @Column(name = "alias")
    private String alias;

    @Column(isId = true, name = "channelCode")
    private String channelCode;

    @Column(name = "channelNumber")
    private int channelNumber;

    @Column(name = "collectionTime")
    private long collectionTime;

    @Column(name = "eventKey")
    private String eventKey;

    @Column(name = "index")
    private int index;

    @Column(name = "keyWords")
    private String keyWords;
    private List<LiveAddressList> liveAddressList;

    @Column(name = SerializableCookie.NAME)
    private String name;

    @Column(name = "page")
    private int page;

    @Column(name = "posterUrl")
    private String posterUrl;

    @Column(name = "program_state")
    private int program_state;

    @Column(name = "quality")
    private String quality;

    @Column(name = "restricted")
    private String restricted;

    @Column(name = "supportBusiness")
    private String supportBusiness;
    private String supportVideoType;
    private final String TAG = "ChannelList";

    @Column(name = "locked_end_time")
    private String locked_end_time = "";

    @Column(name = "locked_time_zone")
    private String locked_time_zone = "";

    @Column(name = "locked_start_time")
    private String locked_start_time = "";

    public final String getAlias() {
        return this.alias;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final int getChannelNumber() {
        return this.channelNumber;
    }

    public final long getCollectionTime() {
        return this.collectionTime;
    }

    public final String getEventKey() {
        return this.eventKey;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getKeyWords() {
        return this.keyWords;
    }

    public final List<LiveAddressList> getLiveAddressList() {
        return this.liveAddressList;
    }

    public final String getLocked_end_time() {
        return this.locked_end_time;
    }

    public final String getLocked_start_time() {
        return this.locked_start_time;
    }

    public final String getLocked_time_zone() {
        return this.locked_time_zone;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPage() {
        return this.page;
    }

    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final int getProgram_state() {
        return this.program_state;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getRestricted() {
        return this.restricted;
    }

    public final String getSupportBusiness() {
        return this.supportBusiness;
    }

    public final String getSupportVideoType() {
        return this.supportVideoType;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final void setAlias(String str) {
        this.alias = str;
    }

    public final void setChannelCode(String str) {
        this.channelCode = str;
    }

    public final void setChannelNumber(int i10) {
        this.channelNumber = i10;
    }

    public final void setCollectionTime(long j10) {
        this.collectionTime = j10;
    }

    public final void setEventKey(String str) {
        this.eventKey = str;
    }

    public final void setIndex(int i10) {
        this.index = i10;
    }

    public final void setKeyWords(String str) {
        this.keyWords = str;
    }

    public final void setLiveAddressList(List<LiveAddressList> list) {
        this.liveAddressList = list;
    }

    public final void setLocked_end_time(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.locked_end_time = str;
    }

    public final void setLocked_start_time(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.locked_start_time = str;
    }

    public final void setLocked_time_zone(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.locked_time_zone = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPage(int i10) {
        this.page = i10;
    }

    public final void setPosterUrl(String str) {
        this.posterUrl = str;
    }

    public final void setProgram_state(int i10) {
        this.program_state = i10;
    }

    public final void setQuality(String str) {
        this.quality = str;
    }

    public final void setRestricted(String str) {
        this.restricted = str;
    }

    public final void setSupportBusiness(String str) {
        this.supportBusiness = str;
    }

    public final void setSupportVideoType(String str) {
        this.supportVideoType = str;
    }
}
