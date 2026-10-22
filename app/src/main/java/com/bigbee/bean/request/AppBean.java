package com.bigbee.bean.request;

import com.lzy.okgo.model.Progress;
import java.io.Serializable;
import ne.AbstractC5868k;
import p291q0.AbstractC6322a;

/* loaded from: classes.dex */
public final class AppBean implements Serializable {
    private String appVer;

    /* renamed from: et */
    private long f6196et;

    /* renamed from: st */
    private long f6197st;
    private String sysVer;
    private String tag;
    private String uid;
    private String uname;

    public AppBean(String str, String str2, String str3, String str4, long j10, long j11, String str5) {
        AbstractC5868k.m23674f(str, "appVer");
        AbstractC5868k.m23674f(str5, Progress.TAG);
        this.appVer = str;
        this.sysVer = str2;
        this.uid = str3;
        this.uname = str4;
        this.f6197st = j10;
        this.f6196et = j11;
        this.tag = str5;
    }

    public final String component1() {
        return this.appVer;
    }

    public final String component2() {
        return this.sysVer;
    }

    public final String component3() {
        return this.uid;
    }

    public final String component4() {
        return this.uname;
    }

    public final long component5() {
        return this.f6197st;
    }

    public final long component6() {
        return this.f6196et;
    }

    public final String component7() {
        return this.tag;
    }

    public final AppBean copy(String str, String str2, String str3, String str4, long j10, long j11, String str5) {
        AbstractC5868k.m23674f(str, "appVer");
        AbstractC5868k.m23674f(str5, Progress.TAG);
        return new AppBean(str, str2, str3, str4, j10, j11, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppBean)) {
            return false;
        }
        AppBean appBean = (AppBean) obj;
        return AbstractC5868k.m23669a(this.appVer, appBean.appVer) && AbstractC5868k.m23669a(this.sysVer, appBean.sysVer) && AbstractC5868k.m23669a(this.uid, appBean.uid) && AbstractC5868k.m23669a(this.uname, appBean.uname) && this.f6197st == appBean.f6197st && this.f6196et == appBean.f6196et && AbstractC5868k.m23669a(this.tag, appBean.tag);
    }

    public final String getAppVer() {
        return this.appVer;
    }

    public final long getEt() {
        return this.f6196et;
    }

    public final long getSt() {
        return this.f6197st;
    }

    public final String getSysVer() {
        return this.sysVer;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUname() {
        return this.uname;
    }

    public int hashCode() {
        int hashCode = this.appVer.hashCode() * 31;
        String str = this.sysVer;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uid;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uname;
        return ((((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + AbstractC6322a.m25086a(this.f6197st)) * 31) + AbstractC6322a.m25086a(this.f6196et)) * 31) + this.tag.hashCode();
    }

    public final void setAppVer(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appVer = str;
    }

    public final void setEt(long j10) {
        this.f6196et = j10;
    }

    public final void setSt(long j10) {
        this.f6197st = j10;
    }

    public final void setSysVer(String str) {
        this.sysVer = str;
    }

    public final void setTag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.tag = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setUname(String str) {
        this.uname = str;
    }

    public String toString() {
        return "AppBean(appVer=" + this.appVer + ", sysVer=" + this.sysVer + ", uid=" + this.uid + ", uname=" + this.uname + ", st=" + this.f6197st + ", et=" + this.f6196et + ", tag=" + this.tag + ')';
    }
}
