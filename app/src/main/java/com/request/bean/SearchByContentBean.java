package com.request.bean;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SearchByContentBean implements Serializable {
    private String contentId;
    private int end;
    private String portalCode;
    private int rows;
    private int start;
    private String type;
    private String userId;
    private String userToken;

    public SearchByContentBean(String str, String str2, String str3, String str4, String str5, int i10, int i11, int i12) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "type");
        AbstractC5868k.m23674f(str5, "contentId");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.type = str4;
        this.contentId = str5;
        this.start = i10;
        this.end = i11;
        this.rows = i12;
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

    public final String component5() {
        return this.contentId;
    }

    public final int component6() {
        return this.start;
    }

    public final int component7() {
        return this.end;
    }

    public final int component8() {
        return this.rows;
    }

    public final SearchByContentBean copy(String str, String str2, String str3, String str4, String str5, int i10, int i11, int i12) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "type");
        AbstractC5868k.m23674f(str5, "contentId");
        return new SearchByContentBean(str, str2, str3, str4, str5, i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchByContentBean)) {
            return false;
        }
        SearchByContentBean searchByContentBean = (SearchByContentBean) obj;
        return AbstractC5868k.m23669a(this.userToken, searchByContentBean.userToken) && AbstractC5868k.m23669a(this.userId, searchByContentBean.userId) && AbstractC5868k.m23669a(this.portalCode, searchByContentBean.portalCode) && AbstractC5868k.m23669a(this.type, searchByContentBean.type) && AbstractC5868k.m23669a(this.contentId, searchByContentBean.contentId) && this.start == searchByContentBean.start && this.end == searchByContentBean.end && this.rows == searchByContentBean.rows;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final int getEnd() {
        return this.end;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final int getRows() {
        return this.rows;
    }

    public final int getStart() {
        return this.start;
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
        return (((((((((((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + this.type.hashCode()) * 31) + this.contentId.hashCode()) * 31) + this.start) * 31) + this.end) * 31) + this.rows;
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
    }

    public final void setEnd(int i10) {
        this.end = i10;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setRows(int i10) {
        this.rows = i10;
    }

    public final void setStart(int i10) {
        this.start = i10;
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
        return "SearchByContentBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", type=" + this.type + ", contentId=" + this.contentId + ", start=" + this.start + ", end=" + this.end + ", rows=" + this.rows + ')';
    }
}
