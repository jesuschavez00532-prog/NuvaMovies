package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class StartPlayLiveBean implements Serializable {
    private String channelCode;
    private Integer columnId;
    private String portalCode;
    private String type;
    private String userId;
    private String userToken;

    public StartPlayLiveBean(String str, String str2, String str3, String str4, Integer num, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "type");
        AbstractC5868k.m23674f(str5, "channelCode");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.type = str4;
        this.columnId = num;
        this.channelCode = str5;
    }

    public static /* synthetic */ StartPlayLiveBean copy$default(StartPlayLiveBean startPlayLiveBean, String str, String str2, String str3, String str4, Integer num, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = startPlayLiveBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = startPlayLiveBean.userId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = startPlayLiveBean.portalCode;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = startPlayLiveBean.type;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            num = startPlayLiveBean.columnId;
        }
        Integer num2 = num;
        if ((i10 & 32) != 0) {
            str5 = startPlayLiveBean.channelCode;
        }
        return startPlayLiveBean.copy(str, str6, str7, str8, num2, str5);
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

    public final Integer component5() {
        return this.columnId;
    }

    public final String component6() {
        return this.channelCode;
    }

    public final StartPlayLiveBean copy(String str, String str2, String str3, String str4, Integer num, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "type");
        AbstractC5868k.m23674f(str5, "channelCode");
        return new StartPlayLiveBean(str, str2, str3, str4, num, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayLiveBean)) {
            return false;
        }
        StartPlayLiveBean startPlayLiveBean = (StartPlayLiveBean) obj;
        return AbstractC5868k.m23669a(this.userToken, startPlayLiveBean.userToken) && AbstractC5868k.m23669a(this.userId, startPlayLiveBean.userId) && AbstractC5868k.m23669a(this.portalCode, startPlayLiveBean.portalCode) && AbstractC5868k.m23669a(this.type, startPlayLiveBean.type) && AbstractC5868k.m23669a(this.columnId, startPlayLiveBean.columnId) && AbstractC5868k.m23669a(this.channelCode, startPlayLiveBean.channelCode);
    }

    public final String getChannelCode() {
        return this.channelCode;
    }

    public final Integer getColumnId() {
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
        int hashCode = ((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.type.hashCode()) * 31;
        Integer num = this.columnId;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.channelCode.hashCode();
    }

    public final void setChannelCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.channelCode = str;
    }

    public final void setColumnId(Integer num) {
        this.columnId = num;
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
        return "StartPlayLiveBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", type=" + this.type + ", columnId=" + this.columnId + ", channelCode=" + this.channelCode + ')';
    }
}
