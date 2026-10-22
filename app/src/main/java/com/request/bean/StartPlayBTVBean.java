package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class StartPlayBTVBean implements Serializable {
    private String channelCode;
    private int columnId;
    private String contentId;
    private String portalCode;
    private String type;
    private String userId;
    private String userToken;

    public StartPlayBTVBean(String str, String str2, String str3, String str4, int i10, String str5, String str6) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "type");
        AbstractC5868k.m23674f(str5, "channelCode");
        AbstractC5868k.m23674f(str6, "contentId");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.type = str4;
        this.columnId = i10;
        this.channelCode = str5;
        this.contentId = str6;
    }

    public static /* synthetic */ StartPlayBTVBean copy$default(StartPlayBTVBean startPlayBTVBean, String str, String str2, String str3, String str4, int i10, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = startPlayBTVBean.userToken;
        }
        if ((i11 & 2) != 0) {
            str2 = startPlayBTVBean.userId;
        }
        String str7 = str2;
        if ((i11 & 4) != 0) {
            str3 = startPlayBTVBean.portalCode;
        }
        String str8 = str3;
        if ((i11 & 8) != 0) {
            str4 = startPlayBTVBean.type;
        }
        String str9 = str4;
        if ((i11 & 16) != 0) {
            i10 = startPlayBTVBean.columnId;
        }
        int i12 = i10;
        if ((i11 & 32) != 0) {
            str5 = startPlayBTVBean.channelCode;
        }
        String str10 = str5;
        if ((i11 & 64) != 0) {
            str6 = startPlayBTVBean.contentId;
        }
        return startPlayBTVBean.copy(str, str7, str8, str9, i12, str10, str6);
    }

    public final String component1() {
        return this.userToken;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.portalCode;
    }

    public final String component4() {
        return this.type;
    }

    public final int component5() {
        return this.columnId;
    }

    public final String component6() {
        return this.channelCode;
    }

    public final String component7() {
        return this.contentId;
    }

    public final StartPlayBTVBean copy(String str, String str2, String str3, String str4, int i10, String str5, String str6) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "type");
        AbstractC5868k.m23674f(str5, "channelCode");
        AbstractC5868k.m23674f(str6, "contentId");
        return new StartPlayBTVBean(str, str2, str3, str4, i10, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayBTVBean)) {
            return false;
        }
        StartPlayBTVBean startPlayBTVBean = (StartPlayBTVBean) obj;
        return AbstractC5868k.m23669a(this.userToken, startPlayBTVBean.userToken) && AbstractC5868k.m23669a(this.userId, startPlayBTVBean.userId) && AbstractC5868k.m23669a(this.portalCode, startPlayBTVBean.portalCode) && AbstractC5868k.m23669a(this.type, startPlayBTVBean.type) && this.columnId == startPlayBTVBean.columnId && AbstractC5868k.m23669a(this.channelCode, startPlayBTVBean.channelCode) && AbstractC5868k.m23669a(this.contentId, startPlayBTVBean.contentId);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final int getColumnId() {
        return this.columnId;
    }

    public final String getContentId() {
        return this.contentId;
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
        return (((((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.type.hashCode()) * 31) + this.columnId) * 31) + this.channelCode.hashCode()) * 31) + this.contentId.hashCode();
    }

    public final void setChannelCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.channelCode = str;
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
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
        return "StartPlayBTVBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", type=" + this.type + ", columnId=" + this.columnId + ", channelCode=" + this.channelCode + ", contentId=" + this.contentId + ')';
    }
}
