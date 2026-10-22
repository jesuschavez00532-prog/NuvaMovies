package com.request.result;

import android.text.Spanned;
import anet.channel.bytes.C0905a;
import anet.channel.entity.EventType;
import com.lzy.okgo.cookie.SerializableCookie;
import java.io.Serializable;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AssetList implements Serializable {
    private String actorDisplay;
    private String alias;
    private String contentId;
    private String contentType;
    private String description;
    private String director;
    private String duration;
    private transient String mIconPosterUrl;
    private transient Spanned mScoreStr;
    private transient String mShowName;
    private transient Spanned mUpdateCountStr;
    private int moreAudio;
    private int moreSubtitle;
    private String name;
    private List<PosterList> posterList;
    private String programType;
    private float score;
    private String shelveTime;
    private String tags;
    private String type;
    private int updateCount;
    private String updateTime;
    private String viewpoint;
    private int volumnCount;

    public AssetList(String str, String str2, int i10, int i11, float f10, int i12, int i13, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<PosterList> list, String str12, String str13, String str14) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        this.contentId = str;
        this.name = str2;
        this.moreAudio = i10;
        this.moreSubtitle = i11;
        this.score = f10;
        this.volumnCount = i12;
        this.updateCount = i13;
        this.actorDisplay = str3;
        this.type = str4;
        this.duration = str5;
        this.programType = str6;
        this.alias = str7;
        this.director = str8;
        this.viewpoint = str9;
        this.updateTime = str10;
        this.shelveTime = str11;
        this.posterList = list;
        this.tags = str12;
        this.description = str13;
        this.contentType = str14;
    }

    public final String component1() {
        return this.contentId;
    }

    public final String component10() {
        return this.duration;
    }

    public final String component11() {
        return this.programType;
    }

    public final String component12() {
        return this.alias;
    }

    public final String component13() {
        return this.director;
    }

    public final String component14() {
        return this.viewpoint;
    }

    public final String component15() {
        return this.updateTime;
    }

    public final String component16() {
        return this.shelveTime;
    }

    public final List<PosterList> component17() {
        return this.posterList;
    }

    public final String component18() {
        return this.tags;
    }

    public final String component19() {
        return this.description;
    }

    public final String component2() {
        return this.name;
    }

    public final String component20() {
        return this.contentType;
    }

    public final int component3() {
        return this.moreAudio;
    }

    public final int component4() {
        return this.moreSubtitle;
    }

    public final float component5() {
        return this.score;
    }

    public final int component6() {
        return this.volumnCount;
    }

    public final int component7() {
        return this.updateCount;
    }

    public final String component8() {
        return this.actorDisplay;
    }

    public final String component9() {
        return this.type;
    }

    public final AssetList copy(String str, String str2, int i10, int i11, float f10, int i12, int i13, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List<PosterList> list, String str12, String str13, String str14) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, SerializableCookie.NAME);
        return new AssetList(str, str2, i10, i11, f10, i12, i13, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetList)) {
            return false;
        }
        AssetList assetList = (AssetList) obj;
        return AbstractC5868k.m23669a(this.contentId, assetList.contentId) && AbstractC5868k.m23669a(this.name, assetList.name) && this.moreAudio == assetList.moreAudio && this.moreSubtitle == assetList.moreSubtitle && Float.compare(this.score, assetList.score) == 0 && this.volumnCount == assetList.volumnCount && this.updateCount == assetList.updateCount && AbstractC5868k.m23669a(this.actorDisplay, assetList.actorDisplay) && AbstractC5868k.m23669a(this.type, assetList.type) && AbstractC5868k.m23669a(this.duration, assetList.duration) && AbstractC5868k.m23669a(this.programType, assetList.programType) && AbstractC5868k.m23669a(this.alias, assetList.alias) && AbstractC5868k.m23669a(this.director, assetList.director) && AbstractC5868k.m23669a(this.viewpoint, assetList.viewpoint) && AbstractC5868k.m23669a(this.updateTime, assetList.updateTime) && AbstractC5868k.m23669a(this.shelveTime, assetList.shelveTime) && AbstractC5868k.m23669a(this.posterList, assetList.posterList) && AbstractC5868k.m23669a(this.tags, assetList.tags) && AbstractC5868k.m23669a(this.description, assetList.description) && AbstractC5868k.m23669a(this.contentType, assetList.contentType);
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

    public final String getMIconPosterUrl() {
        return this.mIconPosterUrl;
    }

    public final Spanned getMScoreStr() {
        return this.mScoreStr;
    }

    public final String getMShowName() {
        return this.mShowName;
    }

    public final Spanned getMUpdateCountStr() {
        return this.mUpdateCountStr;
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

    public final List<PosterList> getPosterList() {
        return this.posterList;
    }

    public final String getProgramType() {
        return this.programType;
    }

    public final float getScore() {
        return this.score;
    }

    public final String getShelveTime() {
        return this.shelveTime;
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
        int hashCode = ((((((((((((this.contentId.hashCode() * 31) + this.name.hashCode()) * 31) + this.moreAudio) * 31) + this.moreSubtitle) * 31) + Float.floatToIntBits(this.score)) * 31) + this.volumnCount) * 31) + this.updateCount) * 31;
        String str = this.actorDisplay;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.duration;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.programType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.alias;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.director;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.viewpoint;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.updateTime;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.shelveTime;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<PosterList> list = this.posterList;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.tags;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.description;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.contentType;
        return hashCode13 + (str12 != null ? str12.hashCode() : 0);
    }

    public final void setActorDisplay(String str) {
        this.actorDisplay = str;
    }

    public final void setAlias(String str) {
        this.alias = str;
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
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

    public final void setMIconPosterUrl(String str) {
        this.mIconPosterUrl = str;
    }

    public final void setMScoreStr(Spanned spanned) {
        this.mScoreStr = spanned;
    }

    public final void setMShowName(String str) {
        this.mShowName = str;
    }

    public final void setMUpdateCountStr(Spanned spanned) {
        this.mUpdateCountStr = spanned;
    }

    public final void setMoreAudio(int i10) {
        this.moreAudio = i10;
    }

    public final void setMoreSubtitle(int i10) {
        this.moreSubtitle = i10;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setPosterList(List<PosterList> list) {
        this.posterList = list;
    }

    public final void setProgramType(String str) {
        this.programType = str;
    }

    public final void setScore(float f10) {
        this.score = f10;
    }

    public final void setShelveTime(String str) {
        this.shelveTime = str;
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
        return "AssetList(contentId=" + this.contentId + ", name=" + this.name + ", moreAudio=" + this.moreAudio + ", moreSubtitle=" + this.moreSubtitle + ", score=" + this.score + ", volumnCount=" + this.volumnCount + ", updateCount=" + this.updateCount + ", actorDisplay=" + this.actorDisplay + ", type=" + this.type + ", duration=" + this.duration + ", programType=" + this.programType + ", alias=" + this.alias + ", director=" + this.director + ", viewpoint=" + this.viewpoint + ", updateTime=" + this.updateTime + ", shelveTime=" + this.shelveTime + ", posterList=" + this.posterList + ", tags=" + this.tags + ", description=" + this.description + ", contentType=" + this.contentType + ')';
    }

    public /* synthetic */ AssetList(String str, String str2, int i10, int i11, float f10, int i12, int i13, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, String str12, String str13, String str14, int i14, AbstractC5864g abstractC5864g) {
        this(str, str2, i10, i11, f10, i12, i13, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : str5, (i14 & EventType.AUTH_FAIL) != 0 ? null : str6, (i14 & 2048) != 0 ? null : str7, (i14 & 4096) != 0 ? null : str8, (i14 & 8192) != 0 ? null : str9, (i14 & 16384) != 0 ? null : str10, (32768 & i14) != 0 ? null : str11, (65536 & i14) != 0 ? null : list, (131072 & i14) != 0 ? null : str12, (262144 & i14) != 0 ? null : str13, (i14 & C0905a.MAX_POOL_SIZE) != 0 ? null : str14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssetList(String str) {
        this("", str, 0, 0, 0.0f, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048448, null);
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
    }
}
