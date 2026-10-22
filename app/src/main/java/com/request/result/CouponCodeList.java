package com.request.result;

import com.lzy.okgo.model.Progress;
import com.taobao.accs.common.Constants;
import java.util.Map;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class CouponCodeList {
    private Map<String, Float> couponAmount;
    private String couponCode;
    private String couponCurrency;
    private String couponEffectType;
    private String couponTitle;
    private String effectTime;

    /* renamed from: id */
    private String f12705id;
    private String invalidTime;
    private String packageCode;
    private String packageLabel;
    private String packageName;
    private String status;

    public CouponCodeList(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, Float> map, String str10, String str11) {
        AbstractC5868k.m23674f(str, "couponEffectType");
        AbstractC5868k.m23674f(str2, "couponCode");
        AbstractC5868k.m23674f(str3, "packageCode");
        AbstractC5868k.m23674f(str4, Progress.STATUS);
        AbstractC5868k.m23674f(str5, "couponTitle");
        AbstractC5868k.m23674f(str7, "invalidTime");
        AbstractC5868k.m23674f(str8, "couponCurrency");
        AbstractC5868k.m23674f(str9, "id");
        AbstractC5868k.m23674f(map, "couponAmount");
        AbstractC5868k.m23674f(str10, Constants.KEY_PACKAGE_NAME);
        AbstractC5868k.m23674f(str11, "packageLabel");
        this.couponEffectType = str;
        this.couponCode = str2;
        this.packageCode = str3;
        this.status = str4;
        this.couponTitle = str5;
        this.effectTime = str6;
        this.invalidTime = str7;
        this.couponCurrency = str8;
        this.f12705id = str9;
        this.couponAmount = map;
        this.packageName = str10;
        this.packageLabel = str11;
    }

    public final String component1() {
        return this.couponEffectType;
    }

    public final Map<String, Float> component10() {
        return this.couponAmount;
    }

    public final String component11() {
        return this.packageName;
    }

    public final String component12() {
        return this.packageLabel;
    }

    public final String component2() {
        return this.couponCode;
    }

    public final String component3() {
        return this.packageCode;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.couponTitle;
    }

    public final String component6() {
        return this.effectTime;
    }

    public final String component7() {
        return this.invalidTime;
    }

    public final String component8() {
        return this.couponCurrency;
    }

    public final String component9() {
        return this.f12705id;
    }

    public final CouponCodeList copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Map<String, Float> map, String str10, String str11) {
        AbstractC5868k.m23674f(str, "couponEffectType");
        AbstractC5868k.m23674f(str2, "couponCode");
        AbstractC5868k.m23674f(str3, "packageCode");
        AbstractC5868k.m23674f(str4, Progress.STATUS);
        AbstractC5868k.m23674f(str5, "couponTitle");
        AbstractC5868k.m23674f(str7, "invalidTime");
        AbstractC5868k.m23674f(str8, "couponCurrency");
        AbstractC5868k.m23674f(str9, "id");
        AbstractC5868k.m23674f(map, "couponAmount");
        AbstractC5868k.m23674f(str10, Constants.KEY_PACKAGE_NAME);
        AbstractC5868k.m23674f(str11, "packageLabel");
        return new CouponCodeList(str, str2, str3, str4, str5, str6, str7, str8, str9, map, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponCodeList)) {
            return false;
        }
        CouponCodeList couponCodeList = (CouponCodeList) obj;
        return AbstractC5868k.m23669a(this.couponEffectType, couponCodeList.couponEffectType) && AbstractC5868k.m23669a(this.couponCode, couponCodeList.couponCode) && AbstractC5868k.m23669a(this.packageCode, couponCodeList.packageCode) && AbstractC5868k.m23669a(this.status, couponCodeList.status) && AbstractC5868k.m23669a(this.couponTitle, couponCodeList.couponTitle) && AbstractC5868k.m23669a(this.effectTime, couponCodeList.effectTime) && AbstractC5868k.m23669a(this.invalidTime, couponCodeList.invalidTime) && AbstractC5868k.m23669a(this.couponCurrency, couponCodeList.couponCurrency) && AbstractC5868k.m23669a(this.f12705id, couponCodeList.f12705id) && AbstractC5868k.m23669a(this.couponAmount, couponCodeList.couponAmount) && AbstractC5868k.m23669a(this.packageName, couponCodeList.packageName) && AbstractC5868k.m23669a(this.packageLabel, couponCodeList.packageLabel);
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

    public final String getEffectTime() {
        return this.effectTime;
    }

    public final String getId() {
        return this.f12705id;
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

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((((((((this.couponEffectType.hashCode() * 31) + this.couponCode.hashCode()) * 31) + this.packageCode.hashCode()) * 31) + this.status.hashCode()) * 31) + this.couponTitle.hashCode()) * 31;
        String str = this.effectTime;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.invalidTime.hashCode()) * 31) + this.couponCurrency.hashCode()) * 31) + this.f12705id.hashCode()) * 31) + this.couponAmount.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.packageLabel.hashCode();
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

    public final void setEffectTime(String str) {
        this.effectTime = str;
    }

    public final void setId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f12705id = str;
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

    public final void setStatus(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.status = str;
    }

    public String toString() {
        return "CouponCodeList(couponEffectType=" + this.couponEffectType + ", couponCode=" + this.couponCode + ", packageCode=" + this.packageCode + ", status=" + this.status + ", couponTitle=" + this.couponTitle + ", effectTime=" + this.effectTime + ", invalidTime=" + this.invalidTime + ", couponCurrency=" + this.couponCurrency + ", id=" + this.f12705id + ", couponAmount=" + this.couponAmount + ", packageName=" + this.packageName + ", packageLabel=" + this.packageLabel + ')';
    }
}
