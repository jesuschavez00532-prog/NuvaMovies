package com.request.result;

import com.lzy.okgo.cookie.SerializableCookie;
import com.taobao.accs.common.Constants;
import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ChildColumn implements Serializable {
    private Integer Sequence;
    private String alias;
    private String brief;
    private String code;
    private String free;

    /* renamed from: id */
    private int f12703id;
    private String isAv1;
    private String name;
    private String orderFlag;
    private Integer parentId;
    private List<PosterList> posterList;
    private String recmdTitle;
    private int recommendNum;
    private String remark;
    private String restricted;
    private String style;
    private String timeNotice;
    private String trySee;
    private String type;

    public ChildColumn(int i10, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, String str9, String str10, String str11, List<PosterList> list, String str12, String str13, String str14, int i11) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str8, Constants.KEY_HTTP_CODE);
        this.f12703id = i10;
        this.parentId = num;
        this.name = str;
        this.brief = str2;
        this.timeNotice = str3;
        this.recmdTitle = str4;
        this.trySee = str5;
        this.type = str6;
        this.orderFlag = str7;
        this.Sequence = num2;
        this.code = str8;
        this.remark = str9;
        this.alias = str10;
        this.restricted = str11;
        this.posterList = list;
        this.free = str12;
        this.isAv1 = str13;
        this.style = str14;
        this.recommendNum = i11;
    }

    public final int component1() {
        return this.f12703id;
    }

    public final Integer component10() {
        return this.Sequence;
    }

    public final String component11() {
        return this.code;
    }

    public final String component12() {
        return this.remark;
    }

    public final String component13() {
        return this.alias;
    }

    public final String component14() {
        return this.restricted;
    }

    public final List<PosterList> component15() {
        return this.posterList;
    }

    public final String component16() {
        return this.free;
    }

    public final String component17() {
        return this.isAv1;
    }

    public final String component18() {
        return this.style;
    }

    public final int component19() {
        return this.recommendNum;
    }

    public final Integer component2() {
        return this.parentId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.brief;
    }

    public final String component5() {
        return this.timeNotice;
    }

    public final String component6() {
        return this.recmdTitle;
    }

    public final String component7() {
        return this.trySee;
    }

    public final String component8() {
        return this.type;
    }

    public final String component9() {
        return this.orderFlag;
    }

    public final ChildColumn copy(int i10, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, String str9, String str10, String str11, List<PosterList> list, String str12, String str13, String str14, int i11) {
        AbstractC5868k.m23674f(str, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str8, Constants.KEY_HTTP_CODE);
        return new ChildColumn(i10, num, str, str2, str3, str4, str5, str6, str7, num2, str8, str9, str10, str11, list, str12, str13, str14, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildColumn)) {
            return false;
        }
        ChildColumn childColumn = (ChildColumn) obj;
        return this.f12703id == childColumn.f12703id && AbstractC5868k.m23669a(this.parentId, childColumn.parentId) && AbstractC5868k.m23669a(this.name, childColumn.name) && AbstractC5868k.m23669a(this.brief, childColumn.brief) && AbstractC5868k.m23669a(this.timeNotice, childColumn.timeNotice) && AbstractC5868k.m23669a(this.recmdTitle, childColumn.recmdTitle) && AbstractC5868k.m23669a(this.trySee, childColumn.trySee) && AbstractC5868k.m23669a(this.type, childColumn.type) && AbstractC5868k.m23669a(this.orderFlag, childColumn.orderFlag) && AbstractC5868k.m23669a(this.Sequence, childColumn.Sequence) && AbstractC5868k.m23669a(this.code, childColumn.code) && AbstractC5868k.m23669a(this.remark, childColumn.remark) && AbstractC5868k.m23669a(this.alias, childColumn.alias) && AbstractC5868k.m23669a(this.restricted, childColumn.restricted) && AbstractC5868k.m23669a(this.posterList, childColumn.posterList) && AbstractC5868k.m23669a(this.free, childColumn.free) && AbstractC5868k.m23669a(this.isAv1, childColumn.isAv1) && AbstractC5868k.m23669a(this.style, childColumn.style) && this.recommendNum == childColumn.recommendNum;
    }

    public final String getAlias() {
        return this.alias;
    }

    public final String getBrief() {
        return this.brief;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getFree() {
        return this.free;
    }

    public final int getId() {
        return this.f12703id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOrderFlag() {
        return this.orderFlag;
    }

    public final Integer getParentId() {
        return this.parentId;
    }

    public final List<PosterList> getPosterList() {
        return this.posterList;
    }

    public final String getRecmdTitle() {
        return this.recmdTitle;
    }

    public final int getRecommendNum() {
        return this.recommendNum;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final String getRestricted() {
        return this.restricted;
    }

    public final Integer getSequence() {
        return this.Sequence;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTimeNotice() {
        return this.timeNotice;
    }

    public final String getTrySee() {
        return this.trySee;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = this.f12703id * 31;
        Integer num = this.parentId;
        int hashCode = (((i10 + (num == null ? 0 : num.hashCode())) * 31) + this.name.hashCode()) * 31;
        String str = this.brief;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.timeNotice;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recmdTitle;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trySee;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.orderFlag;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.Sequence;
        int hashCode8 = (((hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.code.hashCode()) * 31;
        String str7 = this.remark;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.alias;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.restricted;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<PosterList> list = this.posterList;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.free;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.isAv1;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.style;
        return ((hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 31) + this.recommendNum;
    }

    public final String isAv1() {
        return this.isAv1;
    }

    public final void setAlias(String str) {
        this.alias = str;
    }

    public final void setAv1(String str) {
        this.isAv1 = str;
    }

    public final void setBrief(String str) {
        this.brief = str;
    }

    public final void setCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.code = str;
    }

    public final void setFree(String str) {
        this.free = str;
    }

    public final void setId(int i10) {
        this.f12703id = i10;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setOrderFlag(String str) {
        this.orderFlag = str;
    }

    public final void setParentId(Integer num) {
        this.parentId = num;
    }

    public final void setPosterList(List<PosterList> list) {
        this.posterList = list;
    }

    public final void setRecmdTitle(String str) {
        this.recmdTitle = str;
    }

    public final void setRecommendNum(int i10) {
        this.recommendNum = i10;
    }

    public final void setRemark(String str) {
        this.remark = str;
    }

    public final void setRestricted(String str) {
        this.restricted = str;
    }

    public final void setSequence(Integer num) {
        this.Sequence = num;
    }

    public final void setStyle(String str) {
        this.style = str;
    }

    public final void setTimeNotice(String str) {
        this.timeNotice = str;
    }

    public final void setTrySee(String str) {
        this.trySee = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "ChildColumn(id=" + this.f12703id + ", parentId=" + this.parentId + ", name=" + this.name + ", brief=" + this.brief + ", timeNotice=" + this.timeNotice + ", recmdTitle=" + this.recmdTitle + ", trySee=" + this.trySee + ", type=" + this.type + ", orderFlag=" + this.orderFlag + ", Sequence=" + this.Sequence + ", code=" + this.code + ", remark=" + this.remark + ", alias=" + this.alias + ", restricted=" + this.restricted + ", posterList=" + this.posterList + ", free=" + this.free + ", isAv1=" + this.isAv1 + ", style=" + this.style + ", recommendNum=" + this.recommendNum + ')';
    }

    public ChildColumn() {
        this(0, 0, "", "", "", "", "", "", "", 0, "", "", "", "", null, null, null, null, 0);
    }
}
