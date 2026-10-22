package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AssetData implements Serializable {
    private String actorDisplay;
    private String alias;
    private String awardsUrl;
    private String contentId;
    private String contentTag;
    private String contentTagUrl;
    private String contentType;
    private String description;
    private String descriptionCompt;
    private String director;
    private String duration;
    private int favoriteId;
    private String hasFavorite;
    private String hasPositive;
    private String hasSubscribe;
    private String hasTidbits;
    private String hasTrailer;
    private String keyWords;
    private String language;
    private String loveCount;
    private int moreAudio;
    private int moreSubtitle;
    private String name;
    private String originalCountry;
    private int playBlues;
    private List<PosterList> posterList;
    private String programType;
    private String releaseTime;
    private String restricted;
    private List<SameSeasonSeriesBean> sameSeasonSeriesList;
    private float score;
    private List<SimpleProgramList> simpleProgramList;
    private int subscribeId;
    private Integer subscribeNum;
    private String tags;
    private int updateCount;
    private String viewPoint;
    private int volumnCount;

    public AssetData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, int i11, String str10, String str11, String str12, String str13, String str14, float f10, String str15, String str16, String str17, String str18, String str19, int i12, int i13, int i14, int i15, String str20, String str21, String str22, Integer num, String str23, String str24, String str25, List<SimpleProgramList> list, List<PosterList> list2, List<SameSeasonSeriesBean> list3, int i16) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str20, "hasSubscribe");
        AbstractC5868k.m23674f(str21, "hasFavorite");
        this.contentId = str;
        this.name = str2;
        this.duration = str3;
        this.hasPositive = str4;
        this.hasTidbits = str5;
        this.hasTrailer = str6;
        this.loveCount = str7;
        this.restricted = str8;
        this.programType = str9;
        this.volumnCount = i10;
        this.updateCount = i11;
        this.alias = str10;
        this.director = str11;
        this.actorDisplay = str12;
        this.language = str13;
        this.originalCountry = str14;
        this.score = f10;
        this.releaseTime = str15;
        this.viewPoint = str16;
        this.keyWords = str17;
        this.tags = str18;
        this.description = str19;
        this.moreAudio = i12;
        this.moreSubtitle = i13;
        this.subscribeId = i14;
        this.favoriteId = i15;
        this.hasSubscribe = str20;
        this.hasFavorite = str21;
        this.contentType = str22;
        this.subscribeNum = num;
        this.contentTag = str23;
        this.contentTagUrl = str24;
        this.awardsUrl = str25;
        this.simpleProgramList = list;
        this.posterList = list2;
        this.sameSeasonSeriesList = list3;
        this.playBlues = i16;
    }

    public final String component1() {
        return this.contentId;
    }

    public final int component10() {
        return this.volumnCount;
    }

    public final int component11() {
        return this.updateCount;
    }

    public final String component12() {
        return this.alias;
    }

    public final String component13() {
        return this.director;
    }

    public final String component14() {
        return this.actorDisplay;
    }

    public final String component15() {
        return this.language;
    }

    public final String component16() {
        return this.originalCountry;
    }

    public final float component17() {
        return this.score;
    }

    public final String component18() {
        return this.releaseTime;
    }

    public final String component19() {
        return this.viewPoint;
    }

    public final String component2() {
        return this.name;
    }

    public final String component20() {
        return this.keyWords;
    }

    public final String component21() {
        return this.tags;
    }

    public final String component22() {
        return this.description;
    }

    public final int component23() {
        return this.moreAudio;
    }

    public final int component24() {
        return this.moreSubtitle;
    }

    public final int component25() {
        return this.subscribeId;
    }

    public final int component26() {
        return this.favoriteId;
    }

    public final String component27() {
        return this.hasSubscribe;
    }

    public final String component28() {
        return this.hasFavorite;
    }

    public final String component29() {
        return this.contentType;
    }

    public final String component3() {
        return this.duration;
    }

    public final Integer component30() {
        return this.subscribeNum;
    }

    public final String component31() {
        return this.contentTag;
    }

    public final String component32() {
        return this.contentTagUrl;
    }

    public final String component33() {
        return this.awardsUrl;
    }

    public final List<SimpleProgramList> component34() {
        return this.simpleProgramList;
    }

    public final List<PosterList> component35() {
        return this.posterList;
    }

    public final List<SameSeasonSeriesBean> component36() {
        return this.sameSeasonSeriesList;
    }

    public final int component37() {
        return this.playBlues;
    }

    public final String component4() {
        return this.hasPositive;
    }

    public final String component5() {
        return this.hasTidbits;
    }

    public final String component6() {
        return this.hasTrailer;
    }

    public final String component7() {
        return this.loveCount;
    }

    public final String component8() {
        return this.restricted;
    }

    public final String component9() {
        return this.programType;
    }

    public final AssetData copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i10, int i11, String str10, String str11, String str12, String str13, String str14, float f10, String str15, String str16, String str17, String str18, String str19, int i12, int i13, int i14, int i15, String str20, String str21, String str22, Integer num, String str23, String str24, String str25, List<SimpleProgramList> list, List<PosterList> list2, List<SameSeasonSeriesBean> list3, int i16) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str20, "hasSubscribe");
        AbstractC5868k.m23674f(str21, "hasFavorite");
        return new AssetData(str, str2, str3, str4, str5, str6, str7, str8, str9, i10, i11, str10, str11, str12, str13, str14, f10, str15, str16, str17, str18, str19, i12, i13, i14, i15, str20, str21, str22, num, str23, str24, str25, list, list2, list3, i16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetData)) {
            return false;
        }
        AssetData assetData = (AssetData) obj;
        return AbstractC5868k.m23669a(this.contentId, assetData.contentId) && AbstractC5868k.m23669a(this.name, assetData.name) && AbstractC5868k.m23669a(this.duration, assetData.duration) && AbstractC5868k.m23669a(this.hasPositive, assetData.hasPositive) && AbstractC5868k.m23669a(this.hasTidbits, assetData.hasTidbits) && AbstractC5868k.m23669a(this.hasTrailer, assetData.hasTrailer) && AbstractC5868k.m23669a(this.loveCount, assetData.loveCount) && AbstractC5868k.m23669a(this.restricted, assetData.restricted) && AbstractC5868k.m23669a(this.programType, assetData.programType) && this.volumnCount == assetData.volumnCount && this.updateCount == assetData.updateCount && AbstractC5868k.m23669a(this.alias, assetData.alias) && AbstractC5868k.m23669a(this.director, assetData.director) && AbstractC5868k.m23669a(this.actorDisplay, assetData.actorDisplay) && AbstractC5868k.m23669a(this.language, assetData.language) && AbstractC5868k.m23669a(this.originalCountry, assetData.originalCountry) && Float.compare(this.score, assetData.score) == 0 && AbstractC5868k.m23669a(this.releaseTime, assetData.releaseTime) && AbstractC5868k.m23669a(this.viewPoint, assetData.viewPoint) && AbstractC5868k.m23669a(this.keyWords, assetData.keyWords) && AbstractC5868k.m23669a(this.tags, assetData.tags) && AbstractC5868k.m23669a(this.description, assetData.description) && this.moreAudio == assetData.moreAudio && this.moreSubtitle == assetData.moreSubtitle && this.subscribeId == assetData.subscribeId && this.favoriteId == assetData.favoriteId && AbstractC5868k.m23669a(this.hasSubscribe, assetData.hasSubscribe) && AbstractC5868k.m23669a(this.hasFavorite, assetData.hasFavorite) && AbstractC5868k.m23669a(this.contentType, assetData.contentType) && AbstractC5868k.m23669a(this.subscribeNum, assetData.subscribeNum) && AbstractC5868k.m23669a(this.contentTag, assetData.contentTag) && AbstractC5868k.m23669a(this.contentTagUrl, assetData.contentTagUrl) && AbstractC5868k.m23669a(this.awardsUrl, assetData.awardsUrl) && AbstractC5868k.m23669a(this.simpleProgramList, assetData.simpleProgramList) && AbstractC5868k.m23669a(this.posterList, assetData.posterList) && AbstractC5868k.m23669a(this.sameSeasonSeriesList, assetData.sameSeasonSeriesList) && this.playBlues == assetData.playBlues;
    }

    public final String getActorDisplay() {
        return this.actorDisplay;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getAwardsUrl() {
        return this.awardsUrl;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContentTag() {
        return this.contentTag;
    }

    public final String getContentTagUrl() {
        return this.contentTagUrl;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDescriptionCompt() {
        return this.descriptionCompt;
    }

    public final String getDirector() {
        return this.director;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final int getFavoriteId() {
        return this.favoriteId;
    }

    public final String getHasFavorite() {
        return this.hasFavorite;
    }

    public final String getHasPositive() {
        return this.hasPositive;
    }

    public final String getHasSubscribe() {
        return this.hasSubscribe;
    }

    public final String getHasTidbits() {
        return this.hasTidbits;
    }

    public final String getHasTrailer() {
        return this.hasTrailer;
    }

    public final String getKeyWords() {
        return this.keyWords;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLoveCount() {
        return this.loveCount;
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

    public final String getOriginalCountry() {
        return this.originalCountry;
    }

    public final int getPlayBlues() {
        return this.playBlues;
    }

    public final List<PosterList> getPosterList() {
        return this.posterList;
    }

    public final String getProgramType() {
        return this.programType;
    }

    public final String getReleaseTime() {
        return this.releaseTime;
    }

    public final String getRestricted() {
        return this.restricted;
    }

    public final List<SameSeasonSeriesBean> getSameSeasonSeriesList() {
        return this.sameSeasonSeriesList;
    }

    public final float getScore() {
        return this.score;
    }

    public final List<SimpleProgramList> getSimpleProgramList() {
        return this.simpleProgramList;
    }

    public final int getSubscribeId() {
        return this.subscribeId;
    }

    public final Integer getSubscribeNum() {
        return this.subscribeNum;
    }

    public final String getTags() {
        return this.tags;
    }

    public final int getUpdateCount() {
        return this.updateCount;
    }

    public final String getViewPoint() {
        return this.viewPoint;
    }

    public final int getVolumnCount() {
        return this.volumnCount;
    }

    public int hashCode() {
        int hashCode = this.contentId.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.duration;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hasPositive;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hasTidbits;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.hasTrailer;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.loveCount;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.restricted;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.programType;
        int hashCode9 = (((((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.volumnCount) * 31) + this.updateCount) * 31;
        String str9 = this.alias;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.director;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.actorDisplay;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.language;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.originalCountry;
        int hashCode14 = (((hashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31) + Float.floatToIntBits(this.score)) * 31;
        String str14 = this.releaseTime;
        int hashCode15 = (hashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.viewPoint;
        int hashCode16 = (hashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.keyWords;
        int hashCode17 = (hashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.tags;
        int hashCode18 = (hashCode17 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.description;
        int hashCode19 = (((((((((((((hashCode18 + (str18 == null ? 0 : str18.hashCode())) * 31) + this.moreAudio) * 31) + this.moreSubtitle) * 31) + this.subscribeId) * 31) + this.favoriteId) * 31) + this.hasSubscribe.hashCode()) * 31) + this.hasFavorite.hashCode()) * 31;
        String str19 = this.contentType;
        int hashCode20 = (hashCode19 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Integer num = this.subscribeNum;
        int hashCode21 = (hashCode20 + (num == null ? 0 : num.hashCode())) * 31;
        String str20 = this.contentTag;
        int hashCode22 = (hashCode21 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.contentTagUrl;
        int hashCode23 = (hashCode22 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.awardsUrl;
        int hashCode24 = (hashCode23 + (str22 == null ? 0 : str22.hashCode())) * 31;
        List<SimpleProgramList> list = this.simpleProgramList;
        int hashCode25 = (hashCode24 + (list == null ? 0 : list.hashCode())) * 31;
        List<PosterList> list2 = this.posterList;
        int hashCode26 = (hashCode25 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<SameSeasonSeriesBean> list3 = this.sameSeasonSeriesList;
        return ((hashCode26 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.playBlues;
    }

    public final void setActorDisplay(String str) {
        this.actorDisplay = str;
    }

    public final void setAlias(String str) {
        this.alias = str;
    }

    public final void setAwardsUrl(String str) {
        this.awardsUrl = str;
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
    }

    public final void setContentTag(String str) {
        this.contentTag = str;
    }

    public final void setContentTagUrl(String str) {
        this.contentTagUrl = str;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setDescriptionCompt(String str) {
        this.descriptionCompt = str;
    }

    public final void setDirector(String str) {
        this.director = str;
    }

    public final void setDuration(String str) {
        this.duration = str;
    }

    public final void setFavoriteId(int i10) {
        this.favoriteId = i10;
    }

    public final void setHasFavorite(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.hasFavorite = str;
    }

    public final void setHasPositive(String str) {
        this.hasPositive = str;
    }

    public final void setHasSubscribe(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.hasSubscribe = str;
    }

    public final void setHasTidbits(String str) {
        this.hasTidbits = str;
    }

    public final void setHasTrailer(String str) {
        this.hasTrailer = str;
    }

    public final void setKeyWords(String str) {
        this.keyWords = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setLoveCount(String str) {
        this.loveCount = str;
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

    public final void setOriginalCountry(String str) {
        this.originalCountry = str;
    }

    public final void setPlayBlues(int i10) {
        this.playBlues = i10;
    }

    public final void setPosterList(List<PosterList> list) {
        this.posterList = list;
    }

    public final void setProgramType(String str) {
        this.programType = str;
    }

    public final void setReleaseTime(String str) {
        this.releaseTime = str;
    }

    public final void setRestricted(String str) {
        this.restricted = str;
    }

    public final void setSameSeasonSeriesList(List<SameSeasonSeriesBean> list) {
        this.sameSeasonSeriesList = list;
    }

    public final void setScore(float f10) {
        this.score = f10;
    }

    public final void setSimpleProgramList(List<SimpleProgramList> list) {
        this.simpleProgramList = list;
    }

    public final void setSubscribeId(int i10) {
        this.subscribeId = i10;
    }

    public final void setSubscribeNum(Integer num) {
        this.subscribeNum = num;
    }

    public final void setTags(String str) {
        this.tags = str;
    }

    public final void setUpdateCount(int i10) {
        this.updateCount = i10;
    }

    public final void setViewPoint(String str) {
        this.viewPoint = str;
    }

    public final void setVolumnCount(int i10) {
        this.volumnCount = i10;
    }

    public String toString() {
        return "AssetData(contentId=" + this.contentId + ", name=" + this.name + ", duration=" + this.duration + ", hasPositive=" + this.hasPositive + ", hasTidbits=" + this.hasTidbits + ", hasTrailer=" + this.hasTrailer + ", loveCount=" + this.loveCount + ", restricted=" + this.restricted + ", programType=" + this.programType + ", volumnCount=" + this.volumnCount + ", updateCount=" + this.updateCount + ", alias=" + this.alias + ", director=" + this.director + ", actorDisplay=" + this.actorDisplay + ", language=" + this.language + ", originalCountry=" + this.originalCountry + ", score=" + this.score + ", releaseTime=" + this.releaseTime + ", viewPoint=" + this.viewPoint + ", keyWords=" + this.keyWords + ", tags=" + this.tags + ", description=" + this.description + ", moreAudio=" + this.moreAudio + ", moreSubtitle=" + this.moreSubtitle + ", subscribeId=" + this.subscribeId + ", favoriteId=" + this.favoriteId + ", hasSubscribe=" + this.hasSubscribe + ", hasFavorite=" + this.hasFavorite + ", contentType=" + this.contentType + ", subscribeNum=" + this.subscribeNum + ", contentTag=" + this.contentTag + ", contentTagUrl=" + this.contentTagUrl + ", awardsUrl=" + this.awardsUrl + ", simpleProgramList=" + this.simpleProgramList + ", posterList=" + this.posterList + ", sameSeasonSeriesList=" + this.sameSeasonSeriesList + ", playBlues=" + this.playBlues + ')';
    }
}
