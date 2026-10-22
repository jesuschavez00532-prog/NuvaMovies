package com.request.result;

import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PersonWorksInfo {
    private String alias;
    private String contentId;
    private String contentType;
    private String description;
    private String director;
    private String duration;
    private String keyWords;
    private int moreAudio;
    private int moreSubtitle;
    private String name;
    private List<PosterList> posterList;
    private String programType;
    private float score;
    private String tags;
    private String type;
    private int updateCount;
    private String updateTime;
    private String viewpoint;
    private int volumnCount;

    public PersonWorksInfo(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, String str8, float f10, String str9, String str10, String str11, String str12, int i12, int i13, String str13, List<PosterList> list) {
        this.contentId = str;
        this.name = str2;
        this.type = str3;
        this.duration = str4;
        this.programType = str5;
        this.volumnCount = i10;
        this.updateCount = i11;
        this.alias = str6;
        this.director = str7;
        this.keyWords = str8;
        this.score = f10;
        this.viewpoint = str9;
        this.updateTime = str10;
        this.tags = str11;
        this.description = str12;
        this.moreAudio = i12;
        this.moreSubtitle = i13;
        this.contentType = str13;
        this.posterList = list;
    }

    public final String component1() {
        return this.contentId;
    }

    public final String component10() {
        return this.keyWords;
    }

    public final float component11() {
        return this.score;
    }

    public final String component12() {
        return this.viewpoint;
    }

    public final String component13() {
        return this.updateTime;
    }

    public final String component14() {
        return this.tags;
    }

    public final String component15() {
        return this.description;
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

    public final List<PosterList> component19() {
        return this.posterList;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.type;
    }

    public final String component4() {
        return this.duration;
    }

    public final String component5() {
        return this.programType;
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

    public final String component9() {
        return this.director;
    }

    public final PersonWorksInfo copy(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, String str8, float f10, String str9, String str10, String str11, String str12, int i12, int i13, String str13, List<PosterList> list) {
        return new PersonWorksInfo(str, str2, str3, str4, str5, i10, i11, str6, str7, str8, f10, str9, str10, str11, str12, i12, i13, str13, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonWorksInfo)) {
            return false;
        }
        PersonWorksInfo personWorksInfo = (PersonWorksInfo) obj;
        return AbstractC5868k.m23669a(this.contentId, personWorksInfo.contentId) && AbstractC5868k.m23669a(this.name, personWorksInfo.name) && AbstractC5868k.m23669a(this.type, personWorksInfo.type) && AbstractC5868k.m23669a(this.duration, personWorksInfo.duration) && AbstractC5868k.m23669a(this.programType, personWorksInfo.programType) && this.volumnCount == personWorksInfo.volumnCount && this.updateCount == personWorksInfo.updateCount && AbstractC5868k.m23669a(this.alias, personWorksInfo.alias) && AbstractC5868k.m23669a(this.director, personWorksInfo.director) && AbstractC5868k.m23669a(this.keyWords, personWorksInfo.keyWords) && Float.compare(this.score, personWorksInfo.score) == 0 && AbstractC5868k.m23669a(this.viewpoint, personWorksInfo.viewpoint) && AbstractC5868k.m23669a(this.updateTime, personWorksInfo.updateTime) && AbstractC5868k.m23669a(this.tags, personWorksInfo.tags) && AbstractC5868k.m23669a(this.description, personWorksInfo.description) && this.moreAudio == personWorksInfo.moreAudio && this.moreSubtitle == personWorksInfo.moreSubtitle && AbstractC5868k.m23669a(this.contentType, personWorksInfo.contentType) && AbstractC5868k.m23669a(this.posterList, personWorksInfo.posterList);
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

    public final String getKeyWords() {
        return this.keyWords;
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
        String str = this.contentId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.duration;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.programType;
        int hashCode5 = (((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.volumnCount) * 31) + this.updateCount) * 31;
        String str6 = this.alias;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.director;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.keyWords;
        int hashCode8 = (((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Float.floatToIntBits(this.score)) * 31;
        String str9 = this.viewpoint;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.updateTime;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tags;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.description;
        int hashCode12 = (((((hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.moreAudio) * 31) + this.moreSubtitle) * 31;
        String str13 = this.contentType;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        List<PosterList> list = this.posterList;
        return hashCode13 + (list != null ? list.hashCode() : 0);
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

    public final void setKeyWords(String str) {
        this.keyWords = str;
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

    public final void setPosterList(List<PosterList> list) {
        this.posterList = list;
    }

    public final void setProgramType(String str) {
        this.programType = str;
    }

    public final void setScore(float f10) {
        this.score = f10;
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
        return "PersonWorksInfo(contentId=" + this.contentId + ", name=" + this.name + ", type=" + this.type + ", duration=" + this.duration + ", programType=" + this.programType + ", volumnCount=" + this.volumnCount + ", updateCount=" + this.updateCount + ", alias=" + this.alias + ", director=" + this.director + ", keyWords=" + this.keyWords + ", score=" + this.score + ", viewpoint=" + this.viewpoint + ", updateTime=" + this.updateTime + ", tags=" + this.tags + ", description=" + this.description + ", moreAudio=" + this.moreAudio + ", moreSubtitle=" + this.moreSubtitle + ", contentType=" + this.contentType + ", posterList=" + this.posterList + ')';
    }
}
