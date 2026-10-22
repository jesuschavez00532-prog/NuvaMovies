package com.request.result;

import java.io.Serializable;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PersonDetailInfo implements Serializable {
    private String awards;
    private String birthPlace;
    private String birthTime;
    private String icon;
    private String introduction;
    private String name;
    private int personType;
    private String puId;

    public PersonDetailInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10) {
        this.puId = str;
        this.name = str2;
        this.birthPlace = str3;
        this.birthTime = str4;
        this.awards = str5;
        this.introduction = str6;
        this.icon = str7;
        this.personType = i10;
    }

    public final String component1() {
        return this.puId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.birthPlace;
    }

    public final String component4() {
        return this.birthTime;
    }

    public final String component5() {
        return this.awards;
    }

    public final String component6() {
        return this.introduction;
    }

    public final String component7() {
        return this.icon;
    }

    public final int component8() {
        return this.personType;
    }

    public final PersonDetailInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10) {
        return new PersonDetailInfo(str, str2, str3, str4, str5, str6, str7, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonDetailInfo)) {
            return false;
        }
        PersonDetailInfo personDetailInfo = (PersonDetailInfo) obj;
        return AbstractC5868k.m23669a(this.puId, personDetailInfo.puId) && AbstractC5868k.m23669a(this.name, personDetailInfo.name) && AbstractC5868k.m23669a(this.birthPlace, personDetailInfo.birthPlace) && AbstractC5868k.m23669a(this.birthTime, personDetailInfo.birthTime) && AbstractC5868k.m23669a(this.awards, personDetailInfo.awards) && AbstractC5868k.m23669a(this.introduction, personDetailInfo.introduction) && AbstractC5868k.m23669a(this.icon, personDetailInfo.icon) && this.personType == personDetailInfo.personType;
    }

    public final String getAwards() {
        return this.awards;
    }

    public final String getBirthPlace() {
        return this.birthPlace;
    }

    public final String getBirthTime() {
        return this.birthTime;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPersonType() {
        return this.personType;
    }

    public final String getPuId() {
        return this.puId;
    }

    public int hashCode() {
        String str = this.puId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birthPlace;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.birthTime;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.awards;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.introduction;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.icon;
        return ((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.personType;
    }

    public final void setAwards(String str) {
        this.awards = str;
    }

    public final void setBirthPlace(String str) {
        this.birthPlace = str;
    }

    public final void setBirthTime(String str) {
        this.birthTime = str;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setIntroduction(String str) {
        this.introduction = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPersonType(int i10) {
        this.personType = i10;
    }

    public final void setPuId(String str) {
        this.puId = str;
    }

    public String toString() {
        return "PersonDetailInfo(puId=" + this.puId + ", name=" + this.name + ", birthPlace=" + this.birthPlace + ", birthTime=" + this.birthTime + ", awards=" + this.awards + ", introduction=" + this.introduction + ", icon=" + this.icon + ", personType=" + this.personType + ')';
    }

    public /* synthetic */ PersonDetailInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(str, str2, str3, str4, str5, str6, str7, (i11 & 128) != 0 ? 0 : i10);
    }
}
