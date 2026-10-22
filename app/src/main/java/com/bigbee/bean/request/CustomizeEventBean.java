package com.bigbee.bean.request;

import java.io.Serializable;
import java.util.ArrayList;
import ne.AbstractC5868k;
import p291q0.AbstractC6322a;

/* loaded from: classes.dex */
public final class CustomizeEventBean implements Serializable {
    private String appVer;
    private String eid;

    /* renamed from: et */
    private long f6201et;
    private ArrayList<EventNameValueBean> parameter;

    /* renamed from: st */
    private long f6202st;
    private String sysVer;

    public CustomizeEventBean(String str, String str2, String str3, long j10, long j11, ArrayList<EventNameValueBean> arrayList) {
        AbstractC5868k.m23674f(str, "eid");
        AbstractC5868k.m23674f(str2, "appVer");
        this.eid = str;
        this.appVer = str2;
        this.sysVer = str3;
        this.f6202st = j10;
        this.f6201et = j11;
        this.parameter = arrayList;
    }

    public final String component1() {
        return this.eid;
    }

    public final String component2() {
        return this.appVer;
    }

    public final String component3() {
        return this.sysVer;
    }

    public final long component4() {
        return this.f6202st;
    }

    public final long component5() {
        return this.f6201et;
    }

    public final ArrayList<EventNameValueBean> component6() {
        return this.parameter;
    }

    public final CustomizeEventBean copy(String str, String str2, String str3, long j10, long j11, ArrayList<EventNameValueBean> arrayList) {
        AbstractC5868k.m23674f(str, "eid");
        AbstractC5868k.m23674f(str2, "appVer");
        return new CustomizeEventBean(str, str2, str3, j10, j11, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomizeEventBean)) {
            return false;
        }
        CustomizeEventBean customizeEventBean = (CustomizeEventBean) obj;
        return AbstractC5868k.m23669a(this.eid, customizeEventBean.eid) && AbstractC5868k.m23669a(this.appVer, customizeEventBean.appVer) && AbstractC5868k.m23669a(this.sysVer, customizeEventBean.sysVer) && this.f6202st == customizeEventBean.f6202st && this.f6201et == customizeEventBean.f6201et && AbstractC5868k.m23669a(this.parameter, customizeEventBean.parameter);
    }

    public final String getAppVer() {
        return this.appVer;
    }

    public final String getEid() {
        return this.eid;
    }

    public final long getEt() {
        return this.f6201et;
    }

    public final ArrayList<EventNameValueBean> getParameter() {
        return this.parameter;
    }

    public final long getSt() {
        return this.f6202st;
    }

    public final String getSysVer() {
        return this.sysVer;
    }

    public int hashCode() {
        int hashCode = ((this.eid.hashCode() * 31) + this.appVer.hashCode()) * 31;
        String str = this.sysVer;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + AbstractC6322a.m25086a(this.f6202st)) * 31) + AbstractC6322a.m25086a(this.f6201et)) * 31;
        ArrayList<EventNameValueBean> arrayList = this.parameter;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setAppVer(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appVer = str;
    }

    public final void setEid(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.eid = str;
    }

    public final void setEt(long j10) {
        this.f6201et = j10;
    }

    public final void setParameter(ArrayList<EventNameValueBean> arrayList) {
        this.parameter = arrayList;
    }

    public final void setSt(long j10) {
        this.f6202st = j10;
    }

    public final void setSysVer(String str) {
        this.sysVer = str;
    }

    public String toString() {
        return "CustomizeEventBean(eid=" + this.eid + ", appVer=" + this.appVer + ", sysVer=" + this.sysVer + ", st=" + this.f6202st + ", et=" + this.f6201et + ", parameter=" + this.parameter + ')';
    }
}
