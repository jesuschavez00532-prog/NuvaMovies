package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class Item implements Serializable {
    private String actorDisplay;
    private String contentId;
    private String director;
    private String name;
    private String originalCountry;
    private List<PosterList> posterList;
    private String programType;
    private String releaseTime;
    private String tags;
    private String type;

    public Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<PosterList> list) {
        this.type = str;
        this.contentId = str2;
        this.name = str3;
        this.director = str4;
        this.actorDisplay = str5;
        this.originalCountry = str6;
        this.releaseTime = str7;
        this.tags = str8;
        this.programType = str9;
        this.posterList = list;
    }

    public final String component1() {
        return this.type;
    }

    public final List<PosterList> component10() {
        return this.posterList;
    }

    public final String component2() {
        return this.contentId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.director;
    }

    public final String component5() {
        return this.actorDisplay;
    }

    public final String component6() {
        return this.originalCountry;
    }

    public final String component7() {
        return this.releaseTime;
    }

    public final String component8() {
        return this.tags;
    }

    public final String component9() {
        return this.programType;
    }

    public final Item copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<PosterList> list) {
        return new Item(str, str2, str3, str4, str5, str6, str7, str8, str9, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return AbstractC5868k.m23669a(this.type, item.type) && AbstractC5868k.m23669a(this.contentId, item.contentId) && AbstractC5868k.m23669a(this.name, item.name) && AbstractC5868k.m23669a(this.director, item.director) && AbstractC5868k.m23669a(this.actorDisplay, item.actorDisplay) && AbstractC5868k.m23669a(this.originalCountry, item.originalCountry) && AbstractC5868k.m23669a(this.releaseTime, item.releaseTime) && AbstractC5868k.m23669a(this.tags, item.tags) && AbstractC5868k.m23669a(this.programType, item.programType) && AbstractC5868k.m23669a(this.posterList, item.posterList);
    }

    public final String getActorDisplay() {
        return this.actorDisplay;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getDirector() {
        return this.director;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOriginalCountry() {
        return this.originalCountry;
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

    public final String getTags() {
        return this.tags;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contentId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.director;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.actorDisplay;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.originalCountry;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.releaseTime;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tags;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.programType;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<PosterList> list = this.posterList;
        return hashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final void setActorDisplay(String str) {
        this.actorDisplay = str;
    }

    public final void setContentId(String str) {
        this.contentId = str;
    }

    public final void setDirector(String str) {
        this.director = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOriginalCountry(String str) {
        this.originalCountry = str;
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

    public final void setTags(String str) {
        this.tags = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "Item(type=" + this.type + ", contentId=" + this.contentId + ", name=" + this.name + ", director=" + this.director + ", actorDisplay=" + this.actorDisplay + ", originalCountry=" + this.originalCountry + ", releaseTime=" + this.releaseTime + ", tags=" + this.tags + ", programType=" + this.programType + ", posterList=" + this.posterList + ')';
    }
}
