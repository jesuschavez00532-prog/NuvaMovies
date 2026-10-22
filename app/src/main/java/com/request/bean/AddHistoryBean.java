package com.request.bean;

import anet.channel.strategy.dispatch.DispatchConstants;
import com.lzy.okgo.cookie.SerializableCookie;
import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class AddHistoryBean implements Serializable {
    private int columnId;
    private String contentId;
    private String name;
    private String platform;
    private String portalCode;
    private String programContentId;
    private String type;
    private String userId;
    private String userToken;

    public AddHistoryBean(String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, String str8) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, DispatchConstants.PLATFORM);
        AbstractC5868k.m23674f(str5, "type");
        AbstractC5868k.m23674f(str6, "contentId");
        AbstractC5868k.m23674f(str8, SerializableCookie.NAME);
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.platform = str4;
        this.columnId = i10;
        this.type = str5;
        this.contentId = str6;
        this.programContentId = str7;
        this.name = str8;
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
        return this.platform;
    }

    public final int component5() {
        return this.columnId;
    }

    public final String component6() {
        return this.type;
    }

    public final String component7() {
        return this.contentId;
    }

    public final String component8() {
        return this.programContentId;
    }

    public final String component9() {
        return this.name;
    }

    public final AddHistoryBean copy(String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, String str8) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, DispatchConstants.PLATFORM);
        AbstractC5868k.m23674f(str5, "type");
        AbstractC5868k.m23674f(str6, "contentId");
        AbstractC5868k.m23674f(str8, SerializableCookie.NAME);
        return new AddHistoryBean(str, str2, str3, str4, i10, str5, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddHistoryBean)) {
            return false;
        }
        AddHistoryBean addHistoryBean = (AddHistoryBean) obj;
        return AbstractC5868k.m23669a(this.userToken, addHistoryBean.userToken) && AbstractC5868k.m23669a(this.userId, addHistoryBean.userId) && AbstractC5868k.m23669a(this.portalCode, addHistoryBean.portalCode) && AbstractC5868k.m23669a(this.platform, addHistoryBean.platform) && this.columnId == addHistoryBean.columnId && AbstractC5868k.m23669a(this.type, addHistoryBean.type) && AbstractC5868k.m23669a(this.contentId, addHistoryBean.contentId) && AbstractC5868k.m23669a(this.programContentId, addHistoryBean.programContentId) && AbstractC5868k.m23669a(this.name, addHistoryBean.name);
    }

    public final int getColumnId() {
        return this.columnId;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String getProgramContentId() {
        return this.programContentId;
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
        int hashCode = ((((((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.columnId) * 31) + this.type.hashCode()) * 31) + this.contentId.hashCode()) * 31;
        String str = this.programContentId;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode();
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
    }

    public final void setName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.name = str;
    }

    public final void setPlatform(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.platform = str;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setProgramContentId(String str) {
        this.programContentId = str;
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
        return "AddHistoryBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", platform=" + this.platform + ", columnId=" + this.columnId + ", type=" + this.type + ", contentId=" + this.contentId + ", programContentId=" + this.programContentId + ", name=" + this.name + ')';
    }
}
