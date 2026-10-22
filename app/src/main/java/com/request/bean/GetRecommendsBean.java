package com.request.bean;

import java.io.Serializable;
import java.util.Arrays;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class GetRecommendsBean implements Serializable {
    private String portalCode;
    private String[] recommendCodeArr;
    private String userId;
    private String userToken;

    public GetRecommendsBean(String str, String str2, String str3, String[] strArr) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(strArr, "recommendCodeArr");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.recommendCodeArr = strArr;
    }

    public static /* synthetic */ GetRecommendsBean copy$default(GetRecommendsBean getRecommendsBean, String str, String str2, String str3, String[] strArr, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = getRecommendsBean.userToken;
        }
        if ((i10 & 2) != 0) {
            str2 = getRecommendsBean.userId;
        }
        if ((i10 & 4) != 0) {
            str3 = getRecommendsBean.portalCode;
        }
        if ((i10 & 8) != 0) {
            strArr = getRecommendsBean.recommendCodeArr;
        }
        return getRecommendsBean.copy(str, str2, str3, strArr);
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

    public final String[] component4() {
        return this.recommendCodeArr;
    }

    public final GetRecommendsBean copy(String str, String str2, String str3, String[] strArr) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(strArr, "recommendCodeArr");
        return new GetRecommendsBean(str, str2, str3, strArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRecommendsBean)) {
            return false;
        }
        GetRecommendsBean getRecommendsBean = (GetRecommendsBean) obj;
        return AbstractC5868k.m23669a(this.userToken, getRecommendsBean.userToken) && AbstractC5868k.m23669a(this.userId, getRecommendsBean.userId) && AbstractC5868k.m23669a(this.portalCode, getRecommendsBean.portalCode) && AbstractC5868k.m23669a(this.recommendCodeArr, getRecommendsBean.recommendCodeArr);
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String[] getRecommendCodeArr() {
        return this.recommendCodeArr;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserToken() {
        return this.userToken;
    }

    public int hashCode() {
        return (((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31) + Arrays.hashCode(this.recommendCodeArr);
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setRecommendCodeArr(String[] strArr) {
        AbstractC5868k.m23674f(strArr, "<set-?>");
        this.recommendCodeArr = strArr;
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
        return "GetRecommendsBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", recommendCodeArr=" + Arrays.toString(this.recommendCodeArr) + ')';
    }
}
