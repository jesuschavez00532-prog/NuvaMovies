package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class BlSearchByContentBean {
    private String contentId;
    private String portalCode;
    private String rows;
    private String userId;
    private String userToken;

    public BlSearchByContentBean(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "contentId");
        AbstractC5868k.m23674f(str5, "rows");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.contentId = str4;
        this.rows = str5;
    }

    public static /* synthetic */ BlSearchByContentBean copy$default(BlSearchByContentBean blSearchByContentBean, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = blSearchByContentBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = blSearchByContentBean.userId;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = blSearchByContentBean.portalCode;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = blSearchByContentBean.contentId;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = blSearchByContentBean.rows;
        }
        return blSearchByContentBean.copy(str, str6, str7, str8, str5);
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
        return this.contentId;
    }

    public final String component5() {
        return this.rows;
    }

    public final BlSearchByContentBean copy(String str, String str2, String str3, String str4, String str5) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "contentId");
        AbstractC5868k.m23674f(str5, "rows");
        return new BlSearchByContentBean(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlSearchByContentBean)) {
            return false;
        }
        BlSearchByContentBean blSearchByContentBean = (BlSearchByContentBean) obj;
        return AbstractC5868k.m23669a(this.userToken, blSearchByContentBean.userToken) && AbstractC5868k.m23669a(this.userId, blSearchByContentBean.userId) && AbstractC5868k.m23669a(this.portalCode, blSearchByContentBean.portalCode) && AbstractC5868k.m23669a(this.contentId, blSearchByContentBean.contentId) && AbstractC5868k.m23669a(this.rows, blSearchByContentBean.rows);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String getRows() {
        return this.rows;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.contentId.hashCode()) * 31) + this.rows.hashCode();
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setRows(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.rows = str;
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
        return "BlSearchByContentBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", contentId=" + this.contentId + ", rows=" + this.rows + ')';
    }
}
