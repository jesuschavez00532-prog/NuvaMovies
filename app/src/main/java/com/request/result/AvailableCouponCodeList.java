package com.request.result;

import com.taobao.accs.common.Constants;
import java.util.Map;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AvailableCouponCodeList {
    private Map<String, Float> couponAmount;
    private String couponCode;
    private String couponCurrency;
    private String couponEffectType;
    private String couponTitle;
    private String invalidTime;
    private String packageCode;
    private String packageLabel;
    private String packageName;

    public AvailableCouponCodeList(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, Float> map, String str8) {
        AbstractC5868k.m23674f(str, "couponEffectType");
        AbstractC5868k.m23674f(str2, "couponCode");
        AbstractC5868k.m23674f(str3, "packageCode");
        AbstractC5868k.m23674f(str4, "couponTitle");
        AbstractC5868k.m23674f(str5, Constants.KEY_PACKAGE_NAME);
        AbstractC5868k.m23674f(str6, "packageLabel");
        AbstractC5868k.m23674f(str7, "invalidTime");
        AbstractC5868k.m23674f(map, "couponAmount");
        AbstractC5868k.m23674f(str8, "couponCurrency");
        this.couponEffectType = str;
        this.couponCode = str2;
        this.packageCode = str3;
        this.couponTitle = str4;
        this.packageName = str5;
        this.packageLabel = str6;
        this.invalidTime = str7;
        this.couponAmount = map;
        this.couponCurrency = str8;
    }

    public final String component1() {
        return this.couponEffectType;
    }

    public final String component2() {
        return this.couponCode;
    }

    public final String component3() {
        return this.packageCode;
    }

    public final String component4() {
        return this.couponTitle;
    }

    public final String component5() {
        return this.packageName;
    }

    public final String component6() {
        return this.packageLabel;
    }

    public final String component7() {
        return this.invalidTime;
    }

    public final Map<String, Float> component8() {
        return this.couponAmount;
    }

    public final String component9() {
        return this.couponCurrency;
    }

    public final AvailableCouponCodeList copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, Float> map, String str8) {
        AbstractC5868k.m23674f(str, "couponEffectType");
        AbstractC5868k.m23674f(str2, "couponCode");
        AbstractC5868k.m23674f(str3, "packageCode");
        AbstractC5868k.m23674f(str4, "couponTitle");
        AbstractC5868k.m23674f(str5, Constants.KEY_PACKAGE_NAME);
        AbstractC5868k.m23674f(str6, "packageLabel");
        AbstractC5868k.m23674f(str7, "invalidTime");
        AbstractC5868k.m23674f(map, "couponAmount");
        AbstractC5868k.m23674f(str8, "couponCurrency");
        return new AvailableCouponCodeList(str, str2, str3, str4, str5, str6, str7, map, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvailableCouponCodeList)) {
            return false;
        }
        AvailableCouponCodeList availableCouponCodeList = (AvailableCouponCodeList) obj;
        return AbstractC5868k.m23669a(this.couponEffectType, availableCouponCodeList.couponEffectType) && AbstractC5868k.m23669a(this.couponCode, availableCouponCodeList.couponCode) && AbstractC5868k.m23669a(this.packageCode, availableCouponCodeList.packageCode) && AbstractC5868k.m23669a(this.couponTitle, availableCouponCodeList.couponTitle) && AbstractC5868k.m23669a(this.packageName, availableCouponCodeList.packageName) && AbstractC5868k.m23669a(this.packageLabel, availableCouponCodeList.packageLabel) && AbstractC5868k.m23669a(this.invalidTime, availableCouponCodeList.invalidTime) && AbstractC5868k.m23669a(this.couponAmount, availableCouponCodeList.couponAmount) && AbstractC5868k.m23669a(this.couponCurrency, availableCouponCodeList.couponCurrency);
    }

    public final Map<String, Float> getCouponAmount() {
        return this.couponAmount;
    }

    public final String getCouponCode() {
        return this.couponCode;
    }

    public final String getCouponCurrency() {
        return this.couponCurrency;
    }

    public final String getCouponEffectType() {
        return this.couponEffectType;
    }

    public final String getCouponTitle() {
        return this.couponTitle;
    }

    public final String getInvalidTime() {
        return this.invalidTime;
    }

    public final String getPackageCode() {
        return this.packageCode;
    }

    public final String getPackageLabel() {
        return this.packageLabel;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return (((((((((((((((this.couponEffectType.hashCode() * 31) + this.couponCode.hashCode()) * 31) + this.packageCode.hashCode()) * 31) + this.couponTitle.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.packageLabel.hashCode()) * 31) + this.invalidTime.hashCode()) * 31) + this.couponAmount.hashCode()) * 31) + this.couponCurrency.hashCode();
    }

    public final void setCouponAmount(Map<String, Float> map) {
        AbstractC5868k.m23674f(map, "<set-?>");
        this.couponAmount = map;
    }

    public final void setCouponCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.couponCode = str;
    }

    public final void setCouponCurrency(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.couponCurrency = str;
    }

    public final void setCouponEffectType(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.couponEffectType = str;
    }

    public final void setCouponTitle(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.couponTitle = str;
    }

    public final void setInvalidTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.invalidTime = str;
    }

    public final void setPackageCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.packageCode = str;
    }

    public final void setPackageLabel(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.packageLabel = str;
    }

    public final void setPackageName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.packageName = str;
    }

    public String toString() {
        return "AvailableCouponCodeList(couponEffectType=" + this.couponEffectType + ", couponCode=" + this.couponCode + ", packageCode=" + this.packageCode + ", couponTitle=" + this.couponTitle + ", packageName=" + this.packageName + ", packageLabel=" + this.packageLabel + ", invalidTime=" + this.invalidTime + ", couponAmount=" + this.couponAmount + ", couponCurrency=" + this.couponCurrency + ')';
    }
}
