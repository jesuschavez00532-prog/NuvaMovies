package com.titans.entity;

import anet.channel.entity.EventType;
import com.lzy.okgo.model.Progress;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.BaseMonitor;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes3.dex */
public final class Sources {
    private String auth;
    private String format;

    /* renamed from: id */
    private String f13567id;
    private String id_code;
    private String lang;
    private String license;
    private String main_addr;
    private String main_addr_code;
    private String media_code;
    private int priority;
    private String quality;
    private String rule_id_code;
    private String spared_addr;
    private String spared_addr_code;
    private String tag;
    private int weight;

    public Sources(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i11, String str14) {
        AbstractC5868k.m23674f(str, "media_code");
        AbstractC5868k.m23674f(str2, "main_addr");
        AbstractC5868k.m23674f(str3, "spared_addr");
        AbstractC5868k.m23674f(str4, BaseMonitor.ALARM_POINT_AUTH);
        AbstractC5868k.m23674f(str5, "license");
        AbstractC5868k.m23674f(str6, Progress.TAG);
        AbstractC5868k.m23674f(str7, "quality");
        AbstractC5868k.m23674f(str8, "main_addr_code");
        AbstractC5868k.m23674f(str9, "spared_addr_code");
        AbstractC5868k.m23674f(str10, "lang");
        AbstractC5868k.m23674f(str11, "id");
        this.priority = i10;
        this.media_code = str;
        this.main_addr = str2;
        this.spared_addr = str3;
        this.auth = str4;
        this.license = str5;
        this.tag = str6;
        this.quality = str7;
        this.main_addr_code = str8;
        this.spared_addr_code = str9;
        this.lang = str10;
        this.f13567id = str11;
        this.id_code = str12;
        this.rule_id_code = str13;
        this.weight = i11;
        this.format = str14;
    }

    public final int component1() {
        return this.priority;
    }

    public final String component10() {
        return this.spared_addr_code;
    }

    public final String component11() {
        return this.lang;
    }

    public final String component12() {
        return this.f13567id;
    }

    public final String component13() {
        return this.id_code;
    }

    public final String component14() {
        return this.rule_id_code;
    }

    public final int component15() {
        return this.weight;
    }

    public final String component16() {
        return this.format;
    }

    public final String component2() {
        return this.media_code;
    }

    public final String component3() {
        return this.main_addr;
    }

    public final String component4() {
        return this.spared_addr;
    }

    public final String component5() {
        return this.auth;
    }

    public final String component6() {
        return this.license;
    }

    public final String component7() {
        return this.tag;
    }

    public final String component8() {
        return this.quality;
    }

    public final String component9() {
        return this.main_addr_code;
    }

    public final Sources copy(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i11, String str14) {
        AbstractC5868k.m23674f(str, "media_code");
        AbstractC5868k.m23674f(str2, "main_addr");
        AbstractC5868k.m23674f(str3, "spared_addr");
        AbstractC5868k.m23674f(str4, BaseMonitor.ALARM_POINT_AUTH);
        AbstractC5868k.m23674f(str5, "license");
        AbstractC5868k.m23674f(str6, Progress.TAG);
        AbstractC5868k.m23674f(str7, "quality");
        AbstractC5868k.m23674f(str8, "main_addr_code");
        AbstractC5868k.m23674f(str9, "spared_addr_code");
        AbstractC5868k.m23674f(str10, "lang");
        AbstractC5868k.m23674f(str11, "id");
        return new Sources(i10, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, i11, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sources)) {
            return false;
        }
        Sources sources = (Sources) obj;
        return this.priority == sources.priority && AbstractC5868k.m23669a(this.media_code, sources.media_code) && AbstractC5868k.m23669a(this.main_addr, sources.main_addr) && AbstractC5868k.m23669a(this.spared_addr, sources.spared_addr) && AbstractC5868k.m23669a(this.auth, sources.auth) && AbstractC5868k.m23669a(this.license, sources.license) && AbstractC5868k.m23669a(this.tag, sources.tag) && AbstractC5868k.m23669a(this.quality, sources.quality) && AbstractC5868k.m23669a(this.main_addr_code, sources.main_addr_code) && AbstractC5868k.m23669a(this.spared_addr_code, sources.spared_addr_code) && AbstractC5868k.m23669a(this.lang, sources.lang) && AbstractC5868k.m23669a(this.f13567id, sources.f13567id) && AbstractC5868k.m23669a(this.id_code, sources.id_code) && AbstractC5868k.m23669a(this.rule_id_code, sources.rule_id_code) && this.weight == sources.weight && AbstractC5868k.m23669a(this.format, sources.format);
    }

    public final String getAuth() {
        return this.auth;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getId() {
        return this.f13567id;
    }

    public final String getId_code() {
        return this.id_code;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getLicense() {
        return this.license;
    }

    public final String getMain_addr() {
        return this.main_addr;
    }

    public final String getMain_addr_code() {
        return this.main_addr_code;
    }

    public final String getMedia_code() {
        return this.media_code;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getRule_id_code() {
        return this.rule_id_code;
    }

    public final String getSpared_addr() {
        return this.spared_addr;
    }

    public final String getSpared_addr_code() {
        return this.spared_addr_code;
    }

    public final String getTag() {
        return this.tag;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this.priority * 31) + this.media_code.hashCode()) * 31) + this.main_addr.hashCode()) * 31) + this.spared_addr.hashCode()) * 31) + this.auth.hashCode()) * 31) + this.license.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.quality.hashCode()) * 31) + this.main_addr_code.hashCode()) * 31) + this.spared_addr_code.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.f13567id.hashCode()) * 31;
        String str = this.id_code;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rule_id_code;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.weight) * 31;
        String str3 = this.format;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAuth(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.auth = str;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final void setId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f13567id = str;
    }

    public final void setId_code(String str) {
        this.id_code = str;
    }

    public final void setLang(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.lang = str;
    }

    public final void setLicense(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.license = str;
    }

    public final void setMain_addr(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.main_addr = str;
    }

    public final void setMain_addr_code(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.main_addr_code = str;
    }

    public final void setMedia_code(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.media_code = str;
    }

    public final void setPriority(int i10) {
        this.priority = i10;
    }

    public final void setQuality(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.quality = str;
    }

    public final void setRule_id_code(String str) {
        this.rule_id_code = str;
    }

    public final void setSpared_addr(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.spared_addr = str;
    }

    public final void setSpared_addr_code(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.spared_addr_code = str;
    }

    public final void setTag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.tag = str;
    }

    public final void setWeight(int i10) {
        this.weight = i10;
    }

    public String toString() {
        return "Sources(priority=" + this.priority + ", media_code=" + this.media_code + ", main_addr=" + this.main_addr + ", spared_addr=" + this.spared_addr + ", auth=" + this.auth + ", license=" + this.license + ", tag=" + this.tag + ", quality=" + this.quality + ", main_addr_code=" + this.main_addr_code + ", spared_addr_code=" + this.spared_addr_code + ", lang=" + this.lang + ", id=" + this.f13567id + ", id_code=" + this.id_code + ", rule_id_code=" + this.rule_id_code + ", weight=" + this.weight + ", format=" + this.format + ')';
    }

    public /* synthetic */ Sources(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i11, String str14, int i12, AbstractC5864g abstractC5864g) {
        this(i10, str, str2, str3, str4, str5, str6, str7, str8, str9, (i12 & EventType.AUTH_FAIL) != 0 ? "" : str10, (i12 & 2048) != 0 ? "" : str11, str12, str13, i11, (i12 & Message.FLAG_DATA_TYPE) != 0 ? "" : str14);
    }
}
