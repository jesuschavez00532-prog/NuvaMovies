package com.bigbee.bean.request;

import java.io.Serializable;
import java.util.ArrayList;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class BBEventRequestBean implements Serializable {
    private String appId;
    private ArrayList<CustomizeEventBean> event;
    private String mac;
    private String model;
    private String routMac;

    /* renamed from: sn */
    private String f6200sn;

    public BBEventRequestBean(String str, String str2, String str3, String str4, String str5, ArrayList<CustomizeEventBean> arrayList) {
        AbstractC5868k.m23674f(str2, "appId");
        this.f6200sn = str;
        this.appId = str2;
        this.model = str3;
        this.mac = str4;
        this.routMac = str5;
        this.event = arrayList;
    }

    public static /* synthetic */ BBEventRequestBean copy$default(BBEventRequestBean bBEventRequestBean, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bBEventRequestBean.f6200sn;
        }
        if ((i10 & 2) != 0) {
            str2 = bBEventRequestBean.appId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = bBEventRequestBean.model;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = bBEventRequestBean.mac;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = bBEventRequestBean.routMac;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            arrayList = bBEventRequestBean.event;
        }
        return bBEventRequestBean.copy(str, str6, str7, str8, str9, arrayList);
    }

    public final String component1() {
        return this.f6200sn;
    }

    public final String component2() {
        return this.appId;
    }

    public final String component3() {
        return this.model;
    }

    public final String component4() {
        return this.mac;
    }

    public final String component5() {
        return this.routMac;
    }

    public final ArrayList<CustomizeEventBean> component6() {
        return this.event;
    }

    public final BBEventRequestBean copy(String str, String str2, String str3, String str4, String str5, ArrayList<CustomizeEventBean> arrayList) {
        AbstractC5868k.m23674f(str2, "appId");
        return new BBEventRequestBean(str, str2, str3, str4, str5, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BBEventRequestBean)) {
            return false;
        }
        BBEventRequestBean bBEventRequestBean = (BBEventRequestBean) obj;
        return AbstractC5868k.m23669a(this.f6200sn, bBEventRequestBean.f6200sn) && AbstractC5868k.m23669a(this.appId, bBEventRequestBean.appId) && AbstractC5868k.m23669a(this.model, bBEventRequestBean.model) && AbstractC5868k.m23669a(this.mac, bBEventRequestBean.mac) && AbstractC5868k.m23669a(this.routMac, bBEventRequestBean.routMac) && AbstractC5868k.m23669a(this.event, bBEventRequestBean.event);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final ArrayList<CustomizeEventBean> getEvent() {
        return this.event;
    }

    public final String getMac() {
        return this.mac;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getRoutMac() {
        return this.routMac;
    }

    public final String getSn() {
        return this.f6200sn;
    }

    public int hashCode() {
        String str = this.f6200sn;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.appId.hashCode()) * 31;
        String str2 = this.model;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mac;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.routMac;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ArrayList<CustomizeEventBean> arrayList = this.event;
        return hashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final void setAppId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.appId = str;
    }

    public final void setEvent(ArrayList<CustomizeEventBean> arrayList) {
        this.event = arrayList;
    }

    public final void setMac(String str) {
        this.mac = str;
    }

    public final void setModel(String str) {
        this.model = str;
    }

    public final void setRoutMac(String str) {
        this.routMac = str;
    }

    public final void setSn(String str) {
        this.f6200sn = str;
    }

    public String toString() {
        return "BBEventRequestBean(sn=" + this.f6200sn + ", appId=" + this.appId + ", model=" + this.model + ", mac=" + this.mac + ", routMac=" + this.routMac + ", event=" + this.event + ')';
    }
}
