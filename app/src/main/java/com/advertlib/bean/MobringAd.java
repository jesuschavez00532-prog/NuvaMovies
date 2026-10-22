package com.advertlib.bean;

import com.lzy.okgo.cookie.SerializableCookie;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class MobringAd {
    private int adid;
    private int bid_type;
    private String click_url;

    /* renamed from: cn */
    private String f5860cn;
    private List<CreativeData> creative;
    private int daily_cap;
    private String description;
    private String icon;
    private String kpi;
    private String name;
    private float payout;
    private String pkg;
    private int platform;
    private String preview_url;
    private int status;
    private String title;

    public MobringAd(float f10, int i10, String str, int i11, String str2, int i12, String str3, String str4, int i13, String str5, String str6, String str7, int i14, String str8, String str9, List<CreativeData> list) {
        AbstractC5868k.m23674f(str, "click_url");
        AbstractC5868k.m23674f(str2, "icon");
        AbstractC5868k.m23674f(str3, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str4, "pkg");
        AbstractC5868k.m23674f(str5, "cn");
        AbstractC5868k.m23674f(str6, "kpi");
        AbstractC5868k.m23674f(str7, "preview_url");
        AbstractC5868k.m23674f(str8, "title");
        AbstractC5868k.m23674f(str9, "description");
        this.payout = f10;
        this.bid_type = i10;
        this.click_url = str;
        this.daily_cap = i11;
        this.icon = str2;
        this.adid = i12;
        this.name = str3;
        this.pkg = str4;
        this.platform = i13;
        this.f5860cn = str5;
        this.kpi = str6;
        this.preview_url = str7;
        this.status = i14;
        this.title = str8;
        this.description = str9;
        this.creative = list;
    }

    public final float component1() {
        return this.payout;
    }

    public final String component10() {
        return this.f5860cn;
    }

    public final String component11() {
        return this.kpi;
    }

    public final String component12() {
        return this.preview_url;
    }

    public final int component13() {
        return this.status;
    }

    public final String component14() {
        return this.title;
    }

    public final String component15() {
        return this.description;
    }

    public final List<CreativeData> component16() {
        return this.creative;
    }

    public final int component2() {
        return this.bid_type;
    }

    public final String component3() {
        return this.click_url;
    }

    public final int component4() {
        return this.daily_cap;
    }

    public final String component5() {
        return this.icon;
    }

    public final int component6() {
        return this.adid;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.pkg;
    }

    public final int component9() {
        return this.platform;
    }

    public final MobringAd copy(float f10, int i10, String str, int i11, String str2, int i12, String str3, String str4, int i13, String str5, String str6, String str7, int i14, String str8, String str9, List<CreativeData> list) {
        AbstractC5868k.m23674f(str, "click_url");
        AbstractC5868k.m23674f(str2, "icon");
        AbstractC5868k.m23674f(str3, SerializableCookie.NAME);
        AbstractC5868k.m23674f(str4, "pkg");
        AbstractC5868k.m23674f(str5, "cn");
        AbstractC5868k.m23674f(str6, "kpi");
        AbstractC5868k.m23674f(str7, "preview_url");
        AbstractC5868k.m23674f(str8, "title");
        AbstractC5868k.m23674f(str9, "description");
        return new MobringAd(f10, i10, str, i11, str2, i12, str3, str4, i13, str5, str6, str7, i14, str8, str9, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobringAd)) {
            return false;
        }
        MobringAd mobringAd = (MobringAd) obj;
        return Float.compare(this.payout, mobringAd.payout) == 0 && this.bid_type == mobringAd.bid_type && AbstractC5868k.m23669a(this.click_url, mobringAd.click_url) && this.daily_cap == mobringAd.daily_cap && AbstractC5868k.m23669a(this.icon, mobringAd.icon) && this.adid == mobringAd.adid && AbstractC5868k.m23669a(this.name, mobringAd.name) && AbstractC5868k.m23669a(this.pkg, mobringAd.pkg) && this.platform == mobringAd.platform && AbstractC5868k.m23669a(this.f5860cn, mobringAd.f5860cn) && AbstractC5868k.m23669a(this.kpi, mobringAd.kpi) && AbstractC5868k.m23669a(this.preview_url, mobringAd.preview_url) && this.status == mobringAd.status && AbstractC5868k.m23669a(this.title, mobringAd.title) && AbstractC5868k.m23669a(this.description, mobringAd.description) && AbstractC5868k.m23669a(this.creative, mobringAd.creative);
    }

    public final int getAdid() {
        return this.adid;
    }

    public final int getBid_type() {
        return this.bid_type;
    }

    public final String getClick_url() {
        return this.click_url;
    }

    public final String getCn() {
        return this.f5860cn;
    }

    public final List<CreativeData> getCreative() {
        return this.creative;
    }

    public final int getDaily_cap() {
        return this.daily_cap;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getKpi() {
        return this.kpi;
    }

    public final String getName() {
        return this.name;
    }

    public final float getPayout() {
        return this.payout;
    }

    public final String getPkg() {
        return this.pkg;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public final String getPreview_url() {
        return this.preview_url;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int floatToIntBits = ((((((((((((((((((((((((((((Float.floatToIntBits(this.payout) * 31) + this.bid_type) * 31) + this.click_url.hashCode()) * 31) + this.daily_cap) * 31) + this.icon.hashCode()) * 31) + this.adid) * 31) + this.name.hashCode()) * 31) + this.pkg.hashCode()) * 31) + this.platform) * 31) + this.f5860cn.hashCode()) * 31) + this.kpi.hashCode()) * 31) + this.preview_url.hashCode()) * 31) + this.status) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        List<CreativeData> list = this.creative;
        return floatToIntBits + (list == null ? 0 : list.hashCode());
    }

    public final void setAdid(int i10) {
        this.adid = i10;
    }

    public final void setBid_type(int i10) {
        this.bid_type = i10;
    }

    public final void setClick_url(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.click_url = str;
    }

    public final void setCn(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f5860cn = str;
    }

    public final void setCreative(List<CreativeData> list) {
        this.creative = list;
    }

    public final void setDaily_cap(int i10) {
        this.daily_cap = i10;
    }

    public final void setDescription(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.description = str;
    }

    public final void setIcon(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.icon = str;
    }

    public final void setKpi(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.kpi = str;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setPayout(float f10) {
        this.payout = f10;
    }

    public final void setPkg(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.pkg = str;
    }

    public final void setPlatform(int i10) {
        this.platform = i10;
    }

    public final void setPreview_url(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.preview_url = str;
    }

    public final void setStatus(int i10) {
        this.status = i10;
    }

    public final void setTitle(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        return "MobringAd(payout=" + this.payout + ", bid_type=" + this.bid_type + ", click_url=" + this.click_url + ", daily_cap=" + this.daily_cap + ", icon=" + this.icon + ", adid=" + this.adid + ", name=" + this.name + ", pkg=" + this.pkg + ", platform=" + this.platform + ", cn=" + this.f5860cn + ", kpi=" + this.kpi + ", preview_url=" + this.preview_url + ", status=" + this.status + ", title=" + this.title + ", description=" + this.description + ", creative=" + this.creative + ')';
    }
}
