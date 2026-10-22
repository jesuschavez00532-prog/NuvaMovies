package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ExchangeOrderInfo {
    private String createTime;
    private String exchangeCode;

    /* renamed from: id */
    private int f12707id;
    private String productName;
    private String updateTime;
    private String userId;
    private String usingTime;

    public ExchangeOrderInfo(int i10, String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "exchangeCode");
        AbstractC5868k.m23674f(str2, "productName");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "usingTime");
        AbstractC5868k.m23674f(str5, "createTime");
        AbstractC5868k.m23674f(str6, "updateTime");
        this.f12707id = i10;
        this.exchangeCode = str;
        this.productName = str2;
        this.userId = str3;
        this.usingTime = str4;
        this.createTime = str5;
        this.updateTime = str6;
    }

    public static /* synthetic */ ExchangeOrderInfo copy$default(ExchangeOrderInfo exchangeOrderInfo, int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = exchangeOrderInfo.f12707id;
        }
        if ((i11 & 2) != 0) {
            str = exchangeOrderInfo.exchangeCode;
        }
        String str7 = str;
        if ((i11 & 4) != 0) {
            str2 = exchangeOrderInfo.productName;
        }
        String str8 = str2;
        if ((i11 & 8) != 0) {
            str3 = exchangeOrderInfo.userId;
        }
        String str9 = str3;
        if ((i11 & 16) != 0) {
            str4 = exchangeOrderInfo.usingTime;
        }
        String str10 = str4;
        if ((i11 & 32) != 0) {
            str5 = exchangeOrderInfo.createTime;
        }
        String str11 = str5;
        if ((i11 & 64) != 0) {
            str6 = exchangeOrderInfo.updateTime;
        }
        return exchangeOrderInfo.copy(i10, str7, str8, str9, str10, str11, str6);
    }

    public final int component1() {
        return this.f12707id;
    }

    public final String component2() {
        return this.exchangeCode;
    }

    public final String component3() {
        return this.productName;
    }

    public final String component4() {
        return this.userId;
    }

    public final String component5() {
        return this.usingTime;
    }

    public final String component6() {
        return this.createTime;
    }

    public final String component7() {
        return this.updateTime;
    }

    public final ExchangeOrderInfo copy(int i10, String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str, "exchangeCode");
        AbstractC5868k.m23674f(str2, "productName");
        AbstractC5868k.m23674f(str3, "userId");
        AbstractC5868k.m23674f(str4, "usingTime");
        AbstractC5868k.m23674f(str5, "createTime");
        AbstractC5868k.m23674f(str6, "updateTime");
        return new ExchangeOrderInfo(i10, str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeOrderInfo)) {
            return false;
        }
        ExchangeOrderInfo exchangeOrderInfo = (ExchangeOrderInfo) obj;
        return this.f12707id == exchangeOrderInfo.f12707id && AbstractC5868k.m23669a(this.exchangeCode, exchangeOrderInfo.exchangeCode) && AbstractC5868k.m23669a(this.productName, exchangeOrderInfo.productName) && AbstractC5868k.m23669a(this.userId, exchangeOrderInfo.userId) && AbstractC5868k.m23669a(this.usingTime, exchangeOrderInfo.usingTime) && AbstractC5868k.m23669a(this.createTime, exchangeOrderInfo.createTime) && AbstractC5868k.m23669a(this.updateTime, exchangeOrderInfo.updateTime);
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getExchangeCode() {
        return this.exchangeCode;
    }

    public final int getId() {
        return this.f12707id;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUsingTime() {
        return this.usingTime;
    }

    public int hashCode() {
        return (((((((((((this.f12707id * 31) + this.exchangeCode.hashCode()) * 31) + this.productName.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.usingTime.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.updateTime.hashCode();
    }

    public final void setCreateTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.createTime = str;
    }

    public final void setExchangeCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.exchangeCode = str;
    }

    public final void setId(int i10) {
        this.f12707id = i10;
    }

    public final void setProductName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.productName = str;
    }

    public final void setUpdateTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.updateTime = str;
    }

    public final void setUserId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.userId = str;
    }

    public final void setUsingTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.usingTime = str;
    }

    public String toString() {
        return "ExchangeOrderInfo(id=" + this.f12707id + ", exchangeCode=" + this.exchangeCode + ", productName=" + this.productName + ", userId=" + this.userId + ", usingTime=" + this.usingTime + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ')';
    }
}
