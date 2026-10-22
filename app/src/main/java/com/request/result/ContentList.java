package com.request.result;

import anet.channel.entity.EventType;
import java.io.Serializable;
import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ContentList implements Serializable {
    private String columnAlias;
    private List<PosterList> columnPosterList;
    private String contentId;
    private String description;
    private String name;
    private List<PosterList> posterList;
    private String programType;
    private String remark;
    private String restricted;
    private String specialFlag;
    private String type;
    private String updateCount;
    private String url;
    private String viewPoint;

    public ContentList(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<PosterList> list, List<PosterList> list2, String str8, String str9, String str10, String str11, String str12) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str4, "type");
        this.contentId = str;
        this.name = str2;
        this.viewPoint = str3;
        this.type = str4;
        this.url = str5;
        this.description = str6;
        this.remark = str7;
        this.posterList = list;
        this.columnPosterList = list2;
        this.programType = str8;
        this.updateCount = str9;
        this.specialFlag = str10;
        this.restricted = str11;
        this.columnAlias = str12;
    }

    public final String component1() {
        return this.contentId;
    }

    public final String component10() {
        return this.programType;
    }

    public final String component11() {
        return this.updateCount;
    }

    public final String component12() {
        return this.specialFlag;
    }

    public final String component13() {
        return this.restricted;
    }

    public final String component14() {
        return this.columnAlias;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.viewPoint;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.url;
    }

    public final String component6() {
        return this.description;
    }

    public final String component7() {
        return this.remark;
    }

    public final List<PosterList> component8() {
        return this.posterList;
    }

    public final List<PosterList> component9() {
        return this.columnPosterList;
    }

    public final ContentList copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<PosterList> list, List<PosterList> list2, String str8, String str9, String str10, String str11, String str12) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str4, "type");
        return new ContentList(str, str2, str3, str4, str5, str6, str7, list, list2, str8, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentList)) {
            return false;
        }
        ContentList contentList = (ContentList) obj;
        return AbstractC5868k.m23669a(this.contentId, contentList.contentId) && AbstractC5868k.m23669a(this.name, contentList.name) && AbstractC5868k.m23669a(this.viewPoint, contentList.viewPoint) && AbstractC5868k.m23669a(this.type, contentList.type) && AbstractC5868k.m23669a(this.url, contentList.url) && AbstractC5868k.m23669a(this.description, contentList.description) && AbstractC5868k.m23669a(this.remark, contentList.remark) && AbstractC5868k.m23669a(this.posterList, contentList.posterList) && AbstractC5868k.m23669a(this.columnPosterList, contentList.columnPosterList) && AbstractC5868k.m23669a(this.programType, contentList.programType) && AbstractC5868k.m23669a(this.updateCount, contentList.updateCount) && AbstractC5868k.m23669a(this.specialFlag, contentList.specialFlag) && AbstractC5868k.m23669a(this.restricted, contentList.restricted) && AbstractC5868k.m23669a(this.columnAlias, contentList.columnAlias);
    }

    public final String getColumnAlias() {
        return this.columnAlias;
    }

    public final List<PosterList> getColumnPosterList() {
        return this.columnPosterList;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getDescription() {
        return this.description;
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

    public final String getRemark() {
        return this.remark;
    }

    public final String getRestricted() {
        return this.restricted;
    }

    public final String getSpecialFlag() {
        return this.specialFlag;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUpdateCount() {
        return this.updateCount;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getViewPoint() {
        return this.viewPoint;
    }

    public int hashCode() {
        int hashCode = this.contentId.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.viewPoint;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.type.hashCode()) * 31;
        String str3 = this.url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.remark;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<PosterList> list = this.posterList;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<PosterList> list2 = this.columnPosterList;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.programType;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.updateCount;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.specialFlag;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.restricted;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.columnAlias;
        return hashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setColumnAlias(String str) {
        this.columnAlias = str;
    }

    public final void setColumnPosterList(List<PosterList> list) {
        this.columnPosterList = list;
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
    }

    public final void setDescription(String str) {
        this.description = str;
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

    public final void setRemark(String str) {
        this.remark = str;
    }

    public final void setRestricted(String str) {
        this.restricted = str;
    }

    public final void setSpecialFlag(String str) {
        this.specialFlag = str;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
    }

    public final void setUpdateCount(String str) {
        this.updateCount = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setViewPoint(String str) {
        this.viewPoint = str;
    }

    public String toString() {
        return "ContentList(contentId=" + this.contentId + ", name=" + this.name + ", viewPoint=" + this.viewPoint + ", type=" + this.type + ", url=" + this.url + ", description=" + this.description + ", remark=" + this.remark + ", posterList=" + this.posterList + ", columnPosterList=" + this.columnPosterList + ", programType=" + this.programType + ", updateCount=" + this.updateCount + ", specialFlag=" + this.specialFlag + ", restricted=" + this.restricted + ", columnAlias=" + this.columnAlias + ')';
    }

    public /* synthetic */ ContentList(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, String str8, String str9, String str10, String str11, String str12, int i10, AbstractC5864g abstractC5864g) {
        this(str, str2, str3, str4, str5, str6, str7, list, (i10 & 256) != 0 ? null : list2, (i10 & 512) != 0 ? null : str8, (i10 & EventType.AUTH_FAIL) != 0 ? null : str9, (i10 & 2048) != 0 ? null : str10, (i10 & 4096) != 0 ? null : str11, (i10 & 8192) != 0 ? null : str12);
    }
}
