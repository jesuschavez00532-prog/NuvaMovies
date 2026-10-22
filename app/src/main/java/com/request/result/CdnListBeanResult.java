package com.request.result;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class CdnListBeanResult implements Serializable {
    private String cdn_id;
    private String cdn_id_mark;
    private String cdn_type;
    private String group_id_mark;
    private String gslb_params;
    private String main_addr;
    private String main_addr_mark;
    private String rule_id_mark;
    private int serial_number;
    private String spared_addr;
    private String spared_addr_mark;
    private String tag;
    private String token;
    private List<UrlListBeanResult> url_list;
    private Integer weight;

    public CdnListBeanResult(String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, String str8, List<UrlListBeanResult> list, Integer num, String str9, String str10, String str11, String str12) {
        this.main_addr = str;
        this.spared_addr = str2;
        this.cdn_type = str3;
        this.tag = str4;
        this.serial_number = i10;
        this.token = str5;
        this.main_addr_mark = str6;
        this.spared_addr_mark = str7;
        this.cdn_id = str8;
        this.url_list = list;
        this.weight = num;
        this.cdn_id_mark = str9;
        this.rule_id_mark = str10;
        this.group_id_mark = str11;
        this.gslb_params = str12;
    }

    public final String component1() {
        return this.main_addr;
    }

    public final List<UrlListBeanResult> component10() {
        return this.url_list;
    }

    public final Integer component11() {
        return this.weight;
    }

    public final String component12() {
        return this.cdn_id_mark;
    }

    public final String component13() {
        return this.rule_id_mark;
    }

    public final String component14() {
        return this.group_id_mark;
    }

    public final String component15() {
        return this.gslb_params;
    }

    public final String component2() {
        return this.spared_addr;
    }

    public final String component3() {
        return this.cdn_type;
    }

    public final String component4() {
        return this.tag;
    }

    public final int component5() {
        return this.serial_number;
    }

    public final String component6() {
        return this.token;
    }

    public final String component7() {
        return this.main_addr_mark;
    }

    public final String component8() {
        return this.spared_addr_mark;
    }

    public final String component9() {
        return this.cdn_id;
    }

    public final CdnListBeanResult copy(String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, String str8, List<UrlListBeanResult> list, Integer num, String str9, String str10, String str11, String str12) {
        return new CdnListBeanResult(str, str2, str3, str4, i10, str5, str6, str7, str8, list, num, str9, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CdnListBeanResult)) {
            return false;
        }
        CdnListBeanResult cdnListBeanResult = (CdnListBeanResult) obj;
        return AbstractC5868k.m23669a(this.main_addr, cdnListBeanResult.main_addr) && AbstractC5868k.m23669a(this.spared_addr, cdnListBeanResult.spared_addr) && AbstractC5868k.m23669a(this.cdn_type, cdnListBeanResult.cdn_type) && AbstractC5868k.m23669a(this.tag, cdnListBeanResult.tag) && this.serial_number == cdnListBeanResult.serial_number && AbstractC5868k.m23669a(this.token, cdnListBeanResult.token) && AbstractC5868k.m23669a(this.main_addr_mark, cdnListBeanResult.main_addr_mark) && AbstractC5868k.m23669a(this.spared_addr_mark, cdnListBeanResult.spared_addr_mark) && AbstractC5868k.m23669a(this.cdn_id, cdnListBeanResult.cdn_id) && AbstractC5868k.m23669a(this.url_list, cdnListBeanResult.url_list) && AbstractC5868k.m23669a(this.weight, cdnListBeanResult.weight) && AbstractC5868k.m23669a(this.cdn_id_mark, cdnListBeanResult.cdn_id_mark) && AbstractC5868k.m23669a(this.rule_id_mark, cdnListBeanResult.rule_id_mark) && AbstractC5868k.m23669a(this.group_id_mark, cdnListBeanResult.group_id_mark) && AbstractC5868k.m23669a(this.gslb_params, cdnListBeanResult.gslb_params);
    }

    public final String getCdn_id() {
        return this.cdn_id;
    }

    public final String getCdn_id_mark() {
        return this.cdn_id_mark;
    }

    public final String getCdn_type() {
        return this.cdn_type;
    }

    public final String getGroup_id_mark() {
        return this.group_id_mark;
    }

    public final String getGslb_params() {
        return this.gslb_params;
    }

    public final String getMain_addr() {
        return this.main_addr;
    }

    public final String getMain_addr_mark() {
        return this.main_addr_mark;
    }

    public final String getRule_id_mark() {
        return this.rule_id_mark;
    }

    public final int getSerial_number() {
        return this.serial_number;
    }

    public final String getSpared_addr() {
        return this.spared_addr;
    }

    public final String getSpared_addr_mark() {
        return this.spared_addr_mark;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getToken() {
        return this.token;
    }

    public final List<UrlListBeanResult> getUrl_list() {
        return this.url_list;
    }

    public final Integer getWeight() {
        return this.weight;
    }

    public int hashCode() {
        String str = this.main_addr;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.spared_addr;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cdn_type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tag;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.serial_number) * 31;
        String str5 = this.token;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.main_addr_mark;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.spared_addr_mark;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cdn_id;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<UrlListBeanResult> list = this.url_list;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.weight;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str9 = this.cdn_id_mark;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.rule_id_mark;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.group_id_mark;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.gslb_params;
        return hashCode13 + (str12 != null ? str12.hashCode() : 0);
    }

    public final void setCdn_id(String str) {
        this.cdn_id = str;
    }

    public final void setCdn_id_mark(String str) {
        this.cdn_id_mark = str;
    }

    public final void setCdn_type(String str) {
        this.cdn_type = str;
    }

    public final void setGroup_id_mark(String str) {
        this.group_id_mark = str;
    }

    public final void setGslb_params(String str) {
        this.gslb_params = str;
    }

    public final void setMain_addr(String str) {
        this.main_addr = str;
    }

    public final void setMain_addr_mark(String str) {
        this.main_addr_mark = str;
    }

    public final void setRule_id_mark(String str) {
        this.rule_id_mark = str;
    }

    public final void setSerial_number(int i10) {
        this.serial_number = i10;
    }

    public final void setSpared_addr(String str) {
        this.spared_addr = str;
    }

    public final void setSpared_addr_mark(String str) {
        this.spared_addr_mark = str;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setToken(String str) {
        this.token = str;
    }

    public final void setUrl_list(List<UrlListBeanResult> list) {
        this.url_list = list;
    }

    public final void setWeight(Integer num) {
        this.weight = num;
    }

    public String toString() {
        return "CdnListBeanResult(main_addr=" + this.main_addr + ", spared_addr=" + this.spared_addr + ", cdn_type=" + this.cdn_type + ", tag=" + this.tag + ", serial_number=" + this.serial_number + ", token=" + this.token + ", main_addr_mark=" + this.main_addr_mark + ", spared_addr_mark=" + this.spared_addr_mark + ", cdn_id=" + this.cdn_id + ", url_list=" + this.url_list + ", weight=" + this.weight + ", cdn_id_mark=" + this.cdn_id_mark + ", rule_id_mark=" + this.rule_id_mark + ", group_id_mark=" + this.group_id_mark + ", gslb_params=" + this.gslb_params + ')';
    }
}
