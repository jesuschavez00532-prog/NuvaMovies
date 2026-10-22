package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class EpgBean {
    private String channelCode;
    private int columnId;
    private String portalCode;
    private String type;
    private String userId;
    private String userToken;

    public EpgBean(String str, String str2, int i10, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "portalCode");
        AbstractC5868k.m23674f(str2, "channelCode");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        this.portalCode = str;
        this.channelCode = str2;
        this.columnId = i10;
        this.type = str3;
        this.userToken = str4;
        this.userId = str5;
    }

    public static /* synthetic */ EpgBean copy$default(EpgBean epgBean, String str, String str2, int i10, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = epgBean.portalCode;
        }
        if ((i11 & 2) != 0) {
            str2 = epgBean.channelCode;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            i10 = epgBean.columnId;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str3 = epgBean.type;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = epgBean.userToken;
        }
        String str8 = str4;
        if ((i11 & 32) != 0) {
            str5 = epgBean.userId;
        }
        return epgBean.copy(str, str6, i12, str7, str8, str5);
    }

    public final String component1() {
        return this.portalCode;
    }

    public final String component2() {
        return this.channelCode;
    }

    public final int component3() {
        return this.columnId;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.userToken;
    }

    public final String component6() {
        return this.userId;
    }

    public final EpgBean copy(String str, String str2, int i10, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "portalCode");
        AbstractC5868k.m23674f(str2, "channelCode");
        AbstractC5868k.m23674f(str3, "type");
        AbstractC5868k.m23674f(str4, "userToken");
        AbstractC5868k.m23674f(str5, "userId");
        return new EpgBean(str, str2, i10, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EpgBean)) {
            return false;
        }
        EpgBean epgBean = (EpgBean) obj;
        return AbstractC5868k.m23669a(this.portalCode, epgBean.portalCode) && AbstractC5868k.m23669a(this.channelCode, epgBean.channelCode) && this.columnId == epgBean.columnId && AbstractC5868k.m23669a(this.type, epgBean.type) && AbstractC5868k.m23669a(this.userToken, epgBean.userToken) && AbstractC5868k.m23669a(this.userId, epgBean.userId);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final int getColumnId() {
        return this.columnId;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((((((((this.portalCode.hashCode() * 31) + this.channelCode.hashCode()) * 31) + this.columnId) * 31) + this.type.hashCode()) * 31) + this.userToken.hashCode()) * 31) + this.userId.hashCode();
    }

    public final void setChannelCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.channelCode = str;
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.type = str;
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUserToken(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userToken = str;
    }

    public String toString() {
        return "EpgBean(portalCode=" + this.portalCode + ", channelCode=" + this.channelCode + ", columnId=" + this.columnId + ", type=" + this.type + ", userToken=" + this.userToken + ", userId=" + this.userId + ')';
    }
}
