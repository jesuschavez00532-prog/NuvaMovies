package com.request.bean;

import java.util.ArrayList;
import org.xutils.p274db.annotation.Column;
import org.xutils.p274db.annotation.Table;

@Table(name = "channel_epg")
/* loaded from: classes2.dex */
public final class ChannelEpg {

    @Column(name = "channel_code")
    private String channelCode;

    @Column(name = "epg_date")
    private String epgDate;

    @Column(name = "epg_json")
    private String epgJson;

    /* renamed from: id */
    @Column(autoGen = true, isId = true, name = "id")
    private int f12693id;
    private ArrayList<EpgProgram> programList;

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final String getEpgDate() {
        return this.epgDate;
    }

    public final String getEpgJson() {
        return this.epgJson;
    }

    public final int getId() {
        return this.f12693id;
    }

    public final ArrayList<EpgProgram> getProgramList() {
        return this.programList;
    }

    public final void setChannelCode(String str) {
        this.channelCode = str;
    }

    public final void setEpgDate(String str) {
        this.epgDate = str;
    }

    public final void setEpgJson(String str) {
        this.epgJson = str;
    }

    public final void setId(int i10) {
        this.f12693id = i10;
    }

    public final void setProgramList(ArrayList<EpgProgram> arrayList) {
        this.programList = arrayList;
    }

    public String toString() {
        return "ChannelEpg(id=" + this.f12693id + ", channelCode=" + this.channelCode + ", epgJson=" + this.epgJson + ", programList=" + this.programList + ')';
    }
}
