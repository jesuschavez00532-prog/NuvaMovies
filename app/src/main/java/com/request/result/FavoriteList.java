package com.request.result;

import anet.channel.entity.EventType;
import java.util.ArrayList;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class FavoriteList {
    private String actorDisplay;
    private String alias;
    private String contentId;
    private String contentType;
    private String description;
    private String director;
    private String duration;

    /* renamed from: id */
    private int f12709id;
    private int moreAudio;
    private int moreSubtitle;
    private String name;
    private ArrayList<PosterList> posterList;
    private String programType;
    private float score;
    private String shelve_time;
    private String supportVideoType;
    private String tags;
    private String type;
    private int updateCount;
    private String updateTime;
    private String viewpoint;
    private int volumnCount;

    public FavoriteList(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, int i12, String str7, String str8, float f10, String str9, String str10, String str11, int i13, int i14, String str12, String str13, String str14, ArrayList<PosterList> arrayList, String str15) {
        this.f12709id = i10;
        this.contentId = str;
        this.name = str2;
        this.actorDisplay = str3;
        this.type = str4;
        this.duration = str5;
        this.programType = str6;
        this.volumnCount = i11;
        this.updateCount = i12;
        this.alias = str7;
        this.director = str8;
        this.score = f10;
        this.viewpoint = str9;
        this.updateTime = str10;
        this.shelve_time = str11;
        this.moreAudio = i13;
        this.moreSubtitle = i14;
        this.contentType = str12;
        this.tags = str13;
        this.description = str14;
        this.posterList = arrayList;
        this.supportVideoType = str15;
    }

    public final int component1() {
        return this.f12709id;
    }

    public final String component10() {
        return this.alias;
    }

    public final String component11() {
        return this.director;
    }

    public final float component12() {
        return this.score;
    }

    public final String component13() {
        return this.viewpoint;
    }

    public final String component14() {
        return this.updateTime;
    }

    public final String component15() {
        return this.shelve_time;
    }

    public final int component16() {
        return this.moreAudio;
    }

    public final int component17() {
        return this.moreSubtitle;
    }

    public final String component18() {
        return this.contentType;
    }

    public final String component19() {
        return this.tags;
    }

    public final String component2() {
        return this.contentId;
    }

    public final String component20() {
        return this.description;
    }

    public final ArrayList<PosterList> component21() {
        return this.posterList;
    }

    public final String component22() {
        return this.supportVideoType;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.actorDisplay;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.duration;
    }

    public final String component7() {
        return this.programType;
    }

    public final int component8() {
        return this.volumnCount;
    }

    public final int component9() {
        return this.updateCount;
    }

    public final FavoriteList copy(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, int i12, String str7, String str8, float f10, String str9, String str10, String str11, int i13, int i14, String str12, String str13, String str14, ArrayList<PosterList> arrayList, String str15) {
        return new FavoriteList(i10, str, str2, str3, str4, str5, str6, i11, i12, str7, str8, f10, str9, str10, str11, i13, i14, str12, str13, str14, arrayList, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteList)) {
            return false;
        }
        FavoriteList favoriteList = (FavoriteList) obj;
        return this.f12709id == favoriteList.f12709id && AbstractC5868k.m23669a(this.contentId, favoriteList.contentId) && AbstractC5868k.m23669a(this.name, favoriteList.name) && AbstractC5868k.m23669a(this.actorDisplay, favoriteList.actorDisplay) && AbstractC5868k.m23669a(this.type, favoriteList.type) && AbstractC5868k.m23669a(this.duration, favoriteList.duration) && AbstractC5868k.m23669a(this.programType, favoriteList.programType) && this.volumnCount == favoriteList.volumnCount && this.updateCount == favoriteList.updateCount && AbstractC5868k.m23669a(this.alias, favoriteList.alias) && AbstractC5868k.m23669a(this.director, favoriteList.director) && Float.compare(this.score, favoriteList.score) == 0 && AbstractC5868k.m23669a(this.viewpoint, favoriteList.viewpoint) && AbstractC5868k.m23669a(this.updateTime, favoriteList.updateTime) && AbstractC5868k.m23669a(this.shelve_time, favoriteList.shelve_time) && this.moreAudio == favoriteList.moreAudio && this.moreSubtitle == favoriteList.moreSubtitle && AbstractC5868k.m23669a(this.contentType, favoriteList.contentType) && AbstractC5868k.m23669a(this.tags, favoriteList.tags) && AbstractC5868k.m23669a(this.description, favoriteList.description) && AbstractC5868k.m23669a(this.posterList, favoriteList.posterList) && AbstractC5868k.m23669a(this.supportVideoType, favoriteList.supportVideoType);
    }

    public final String getActorDisplay() {
        return this.actorDisplay;
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

    public final String getDescription() {
        return this.description;
    }

    public final String getDirector() {
        return this.director;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final int getId() {
        return this.f12709id;
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

    public final String getProgramType() {
        return this.programType;
    }

    public final float getScore() {
        return this.score;
    }

    public final String getShelve_time() {
        return this.shelve_time;
    }

    public final String getSupportVideoType() {
        return this.supportVideoType;
    }

    public final String getTags() {
        return this.tags;
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
        int i10 = this.f12709id * 31;
        String str = this.contentId;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actorDisplay;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.duration;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.programType;
        int hashCode6 = (((((hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.volumnCount) * 31) + this.updateCount) * 31;
        String str7 = this.alias;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.director;
        int hashCode8 = (((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Float.floatToIntBits(this.score)) * 31;
        String str9 = this.viewpoint;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.updateTime;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.shelve_time;
        int hashCode11 = (((((hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31) + this.moreAudio) * 31) + this.moreSubtitle) * 31;
        String str12 = this.contentType;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.tags;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.description;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        ArrayList<PosterList> arrayList = this.posterList;
        int hashCode15 = (hashCode14 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str15 = this.supportVideoType;
        return hashCode15 + (str15 != null ? str15.hashCode() : 0);
    }

    public final void setActorDisplay(String str) {
        this.actorDisplay = str;
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

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDirector(String str) {
        this.director = str;
    }

    public final void setDuration(String str) {
        this.duration = str;
    }

    public final void setId(int i10) {
        this.f12709id = i10;
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

    public final void setProgramType(String str) {
        this.programType = str;
    }

    public final void setScore(float f10) {
        this.score = f10;
    }

    public final void setShelve_time(String str) {
        this.shelve_time = str;
    }

    public final void setSupportVideoType(String str) {
        this.supportVideoType = str;
    }

    public final void setTags(String str) {
        this.tags = str;
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
        return "FavoriteList(id=" + this.f12709id + ", contentId=" + this.contentId + ", name=" + this.name + ", actorDisplay=" + this.actorDisplay + ", type=" + this.type + ", duration=" + this.duration + ", programType=" + this.programType + ", volumnCount=" + this.volumnCount + ", updateCount=" + this.updateCount + ", alias=" + this.alias + ", director=" + this.director + ", score=" + this.score + ", viewpoint=" + this.viewpoint + ", updateTime=" + this.updateTime + ", shelve_time=" + this.shelve_time + ", moreAudio=" + this.moreAudio + ", moreSubtitle=" + this.moreSubtitle + ", contentType=" + this.contentType + ", tags=" + this.tags + ", description=" + this.description + ", posterList=" + this.posterList + ", supportVideoType=" + this.supportVideoType + ')';
    }

    public /* synthetic */ FavoriteList(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, int i12, String str7, String str8, float f10, String str9, String str10, String str11, int i13, int i14, String str12, String str13, String str14, ArrayList arrayList, String str15, int i15, AbstractC5864g abstractC5864g) {
        this(i10, str, str2, (i15 & 8) != 0 ? null : str3, (i15 & 16) != 0 ? null : str4, (i15 & 32) != 0 ? null : str5, (i15 & 64) != 0 ? null : str6, (i15 & 128) != 0 ? 0 : i11, (i15 & 256) != 0 ? 0 : i12, (i15 & 512) != 0 ? null : str7, (i15 & EventType.AUTH_FAIL) != 0 ? null : str8, (i15 & 2048) != 0 ? 0.0f : f10, (i15 & 4096) != 0 ? null : str9, (i15 & 8192) != 0 ? null : str10, (i15 & 16384) != 0 ? null : str11, (32768 & i15) != 0 ? 0 : i13, (65536 & i15) != 0 ? 0 : i14, (131072 & i15) != 0 ? null : str12, (262144 & i15) != 0 ? null : str13, (524288 & i15) != 0 ? null : str14, (1048576 & i15) != 0 ? null : arrayList, (i15 & 2097152) != 0 ? null : str15);
    }
}
