package com.live.bean;

import com.request.bean.EpgProgram;
import java.util.ArrayList;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class InfoBarBean {
    private String channelCode;
    private ArrayList<String> definitions;
    private boolean faved;
    private String index;
    private ArrayList<EpgProgram> infoBarEpgs;
    private boolean locked;
    private String name;
    private String postUrl;
    private int process;
    private String supportVideoType;
    private String videoQuality;

    public InfoBarBean(String str, String str2, String str3, String str4, boolean z10, boolean z11, int i10, ArrayList<EpgProgram> arrayList, ArrayList<String> arrayList2, String str5, String str6) {
        AbstractC5868k.m23674f(str, "index");
        AbstractC5868k.m23674f(arrayList, "infoBarEpgs");
        AbstractC5868k.m23674f(arrayList2, "definitions");
        AbstractC5868k.m23674f(str5, "videoQuality");
        this.index = str;
        this.name = str2;
        this.channelCode = str3;
        this.postUrl = str4;
        this.faved = z10;
        this.locked = z11;
        this.process = i10;
        this.infoBarEpgs = arrayList;
        this.definitions = arrayList2;
        this.videoQuality = str5;
        this.supportVideoType = str6;
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final ArrayList<String> getDefinitions() {
        return this.definitions;
    }

    public final boolean getFaved() {
        return this.faved;
    }

    public final String getIndex() {
        return this.index;
    }

    public final ArrayList<EpgProgram> getInfoBarEpgs() {
        return this.infoBarEpgs;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPostUrl() {
        return this.postUrl;
    }

    public final int getProcess() {
        return this.process;
    }

    public final String getSupportVideoType() {
        return this.supportVideoType;
    }

    public final String getVideoQuality() {
        return this.videoQuality;
    }

    public final void setChannelCode(String str) {
        this.channelCode = str;
    }

    public final void setDefinitions(ArrayList<String> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.definitions = arrayList;
    }

    public final void setFaved(boolean z10) {
        this.faved = z10;
    }

    public final void setIndex(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.index = str;
    }

    public final void setInfoBarEpgs(ArrayList<EpgProgram> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.infoBarEpgs = arrayList;
    }

    public final void setLocked(boolean z10) {
        this.locked = z10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPostUrl(String str) {
        this.postUrl = str;
    }

    public final void setProcess(int i10) {
        this.process = i10;
    }

    public final void setSupportVideoType(String str) {
        this.supportVideoType = str;
    }

    public final void setVideoQuality(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.videoQuality = str;
    }

    public /* synthetic */ InfoBarBean(String str, String str2, String str3, String str4, boolean z10, boolean z11, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6, int i11, AbstractC5864g abstractC5864g) {
        this(str, str2, str3, str4, z10, z11, (i11 & 64) != 0 ? 0 : i10, (i11 & 128) != 0 ? new ArrayList() : arrayList, (i11 & 256) != 0 ? new ArrayList() : arrayList2, (i11 & 512) != 0 ? "HD" : str5, str6);
    }
}
