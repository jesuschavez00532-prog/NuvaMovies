package com.request.bean;

import java.io.Serializable;
import java.util.Arrays;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class StartPlayVODBean implements Serializable {
    private String authType;
    private Integer columnId;
    private String contentId;
    private int[] episodeNumberList;
    private String portalCode;
    private String seriesContentId;
    private int startTime;
    private String type;
    private String userId;
    private String userToken;

    public StartPlayVODBean(String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i10, String str7, int[] iArr) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "contentId");
        AbstractC5868k.m23674f(str6, "type");
        this.userToken = str;
        this.userId = str2;
        this.portalCode = str3;
        this.columnId = num;
        this.contentId = str4;
        this.seriesContentId = str5;
        this.type = str6;
        this.startTime = i10;
        this.authType = str7;
        this.episodeNumberList = iArr;
    }

    public final String component1() {
        return this.userToken;
    }

    public final int[] component10() {
        return this.episodeNumberList;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.portalCode;
    }

    public final Integer component4() {
        return this.columnId;
    }

    public final String component5() {
        return this.contentId;
    }

    public final String component6() {
        return this.seriesContentId;
    }

    public final String component7() {
        return this.type;
    }

    public final int component8() {
        return this.startTime;
    }

    public final String component9() {
        return this.authType;
    }

    public final StartPlayVODBean copy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, int i10, String str7, int[] iArr) {
        AbstractC5868k.m23674f(str, "userToken");
        AbstractC5868k.m23674f(str2, "userId");
        AbstractC5868k.m23674f(str3, "portalCode");
        AbstractC5868k.m23674f(str4, "contentId");
        AbstractC5868k.m23674f(str6, "type");
        return new StartPlayVODBean(str, str2, str3, num, str4, str5, str6, i10, str7, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPlayVODBean)) {
            return false;
        }
        StartPlayVODBean startPlayVODBean = (StartPlayVODBean) obj;
        return AbstractC5868k.m23669a(this.userToken, startPlayVODBean.userToken) && AbstractC5868k.m23669a(this.userId, startPlayVODBean.userId) && AbstractC5868k.m23669a(this.portalCode, startPlayVODBean.portalCode) && AbstractC5868k.m23669a(this.columnId, startPlayVODBean.columnId) && AbstractC5868k.m23669a(this.contentId, startPlayVODBean.contentId) && AbstractC5868k.m23669a(this.seriesContentId, startPlayVODBean.seriesContentId) && AbstractC5868k.m23669a(this.type, startPlayVODBean.type) && this.startTime == startPlayVODBean.startTime && AbstractC5868k.m23669a(this.authType, startPlayVODBean.authType) && AbstractC5868k.m23669a(this.episodeNumberList, startPlayVODBean.episodeNumberList);
    }

    public final String getAuthType() {
        return this.authType;
    }

    public final Integer getColumnId() {
        return this.columnId;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final int[] getEpisodeNumberList() {
        return this.episodeNumberList;
    }

    public final String getPortalCode() {
        return this.portalCode;
    }

    public final String getSeriesContentId() {
        return this.seriesContentId;
    }

    public final int getStartTime() {
        return this.startTime;
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
        int hashCode = ((((this.userToken.hashCode() * 31) + this.userId.hashCode()) * 31) + this.portalCode.hashCode()) * 31;
        Integer num = this.columnId;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.contentId.hashCode()) * 31;
        String str = this.seriesContentId;
        int hashCode3 = (((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + this.startTime) * 31;
        String str2 = this.authType;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        int[] iArr = this.episodeNumberList;
        return hashCode4 + (iArr != null ? Arrays.hashCode(iArr) : 0);
    }

    public final void setAuthType(String str) {
        this.authType = str;
    }

    public final void setColumnId(Integer num) {
        this.columnId = num;
    }

    public final void setContentId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.contentId = str;
    }

    public final void setEpisodeNumberList(int[] iArr) {
        this.episodeNumberList = iArr;
    }

    public final void setPortalCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.portalCode = str;
    }

    public final void setSeriesContentId(String str) {
        this.seriesContentId = str;
    }

    public final void setStartTime(int i10) {
        this.startTime = i10;
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
        return "StartPlayVODBean(userToken=" + this.userToken + ", userId=" + this.userId + ", portalCode=" + this.portalCode + ", columnId=" + this.columnId + ", contentId=" + this.contentId + ", seriesContentId=" + this.seriesContentId + ", type=" + this.type + ", startTime=" + this.startTime + ", authType=" + this.authType + ", episodeNumberList=" + Arrays.toString(this.episodeNumberList) + ')';
    }
}
