package com.request.result;

import java.util.ArrayList;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class SubscribeData {
    private String alias;
    private String contentId;
    private String contentType;
    private String duration;
    private int moreAudio;
    private int moreSubtitle;
    private String name;
    private ArrayList<PosterList> posterList;
    private float score;
    private String shelve_time;
    private int subscribeId;
    private String type;
    private int updateCount;
    private String updateTime;
    private String viewpoint;
    private int volumnCount;

    public SubscribeData(int i10, String str, String str2, String str3, String str4, int i11, int i12, String str5, float f10, String str6, String str7, String str8, int i13, int i14, String str9, ArrayList<PosterList> arrayList) {
        this.subscribeId = i10;
        this.contentId = str;
        this.name = str2;
        this.type = str3;
        this.duration = str4;
        this.volumnCount = i11;
        this.updateCount = i12;
        this.alias = str5;
        this.score = f10;
        this.viewpoint = str6;
        this.updateTime = str7;
        this.shelve_time = str8;
        this.moreAudio = i13;
        this.moreSubtitle = i14;
        this.contentType = str9;
        this.posterList = arrayList;
    }

    public final int component1() {
        return this.subscribeId;
    }

    public final String component10() {
        return this.viewpoint;
    }

    public final String component11() {
        return this.updateTime;
    }

    public final String component12() {
        return this.shelve_time;
    }

    public final int component13() {
        return this.moreAudio;
    }

    public final int component14() {
        return this.moreSubtitle;
    }

    public final String component15() {
        return this.contentType;
    }

    public final ArrayList<PosterList> component16() {
        return this.posterList;
    }

    public final String component2() {
        return this.contentId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.duration;
    }

    public final int component6() {
        return this.volumnCount;
    }

    public final int component7() {
        return this.updateCount;
    }

    public final String component8() {
        return this.alias;
    }

    public final float component9() {
        return this.score;
    }

    public final SubscribeData copy(int i10, String str, String str2, String str3, String str4, int i11, int i12, String str5, float f10, String str6, String str7, String str8, int i13, int i14, String str9, ArrayList<PosterList> arrayList) {
        return new SubscribeData(i10, str, str2, str3, str4, i11, i12, str5, f10, str6, str7, str8, i13, i14, str9, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeData)) {
            return false;
        }
        SubscribeData subscribeData = (SubscribeData) obj;
        return this.subscribeId == subscribeData.subscribeId && AbstractC5868k.m23669a(this.contentId, subscribeData.contentId) && AbstractC5868k.m23669a(this.name, subscribeData.name) && AbstractC5868k.m23669a(this.type, subscribeData.type) && AbstractC5868k.m23669a(this.duration, subscribeData.duration) && this.volumnCount == subscribeData.volumnCount && this.updateCount == subscribeData.updateCount && AbstractC5868k.m23669a(this.alias, subscribeData.alias) && Float.compare(this.score, subscribeData.score) == 0 && AbstractC5868k.m23669a(this.viewpoint, subscribeData.viewpoint) && AbstractC5868k.m23669a(this.updateTime, subscribeData.updateTime) && AbstractC5868k.m23669a(this.shelve_time, subscribeData.shelve_time) && this.moreAudio == subscribeData.moreAudio && this.moreSubtitle == subscribeData.moreSubtitle && AbstractC5868k.m23669a(this.contentType, subscribeData.contentType) && AbstractC5868k.m23669a(this.posterList, subscribeData.posterList);
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final int getMoreAudio() {
        return this.moreAudio;
    }

    public final int getMoreSubtitle() {
        return this.moreSubtitle;
    }

    public final String getName() {
        return this.name;
    }

    public final ArrayList<PosterList> getPosterList() {
        return this.posterList;
    }

    public final float getScore() {
        return this.score;
    }

    public final String getShelve_time() {
        return this.shelve_time;
    }

    public final int getSubscribeId() {
        return this.subscribeId;
    }

    public final String getType() {
        return this.type;
    }

    public final int getUpdateCount() {
        return this.updateCount;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final String getViewpoint() {
        return this.viewpoint;
    }

    public final int getVolumnCount() {
        return this.volumnCount;
    }

    public int hashCode() {
        int i10 = this.subscribeId * 31;
        String str = this.contentId;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.duration;
        int hashCode4 = (((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.volumnCount) * 31) + this.updateCount) * 31;
        String str5 = this.alias;
        int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Float.floatToIntBits(this.score)) * 31;
        String str6 = this.viewpoint;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.updateTime;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.shelve_time;
        int hashCode8 = (((((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.moreAudio) * 31) + this.moreSubtitle) * 31;
        String str9 = this.contentType;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        ArrayList<PosterList> arrayList = this.posterList;
        return hashCode9 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setAlias(String str) {
        this.alias = str;
    }

    public final void setContentId(String str) {
        this.contentId = str;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setDuration(String str) {
        this.duration = str;
    }

    public final void setMoreAudio(int i10) {
        this.moreAudio = i10;
    }

    public final void setMoreSubtitle(int i10) {
        this.moreSubtitle = i10;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPosterList(ArrayList<PosterList> arrayList) {
        this.posterList = arrayList;
    }

    public final void setScore(float f10) {
        this.score = f10;
    }

    public final void setShelve_time(String str) {
        this.shelve_time = str;
    }

    public final void setSubscribeId(int i10) {
        this.subscribeId = i10;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setUpdateCount(int i10) {
        this.updateCount = i10;
    }

    public final void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public final void setViewpoint(String str) {
        this.viewpoint = str;
    }

    public final void setVolumnCount(int i10) {
        this.volumnCount = i10;
    }

    public String toString() {
        return "SubscribeData(subscribeId=" + this.subscribeId + ", contentId=" + this.contentId + ", name=" + this.name + ", type=" + this.type + ", duration=" + this.duration + ", volumnCount=" + this.volumnCount + ", updateCount=" + this.updateCount + ", alias=" + this.alias + ", score=" + this.score + ", viewpoint=" + this.viewpoint + ", updateTime=" + this.updateTime + ", shelve_time=" + this.shelve_time + ", moreAudio=" + this.moreAudio + ", moreSubtitle=" + this.moreSubtitle + ", contentType=" + this.contentType + ", posterList=" + this.posterList + ')';
    }
}
