package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PropertiesInfoBean {
    private String customerEmail;
    private String downloadNumber;
    private String downloadSpeed;
    private String shareLinkUrl;

    public PropertiesInfoBean(String str, String str2, String str3, String str4) {
        this.customerEmail = str;
        this.shareLinkUrl = str2;
        this.downloadNumber = str3;
        this.downloadSpeed = str4;
    }

    public static /* synthetic */ PropertiesInfoBean copy$default(PropertiesInfoBean propertiesInfoBean, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = propertiesInfoBean.customerEmail;
        }
        if ((i10 & 2) != 0) {
            str2 = propertiesInfoBean.shareLinkUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = propertiesInfoBean.downloadNumber;
        }
        if ((i10 & 8) != 0) {
            str4 = propertiesInfoBean.downloadSpeed;
        }
        return propertiesInfoBean.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.customerEmail;
    }

    public final String component2() {
        return this.shareLinkUrl;
    }

    public final String component3() {
        return this.downloadNumber;
    }

    public final String component4() {
        return this.downloadSpeed;
    }

    public final PropertiesInfoBean copy(String str, String str2, String str3, String str4) {
        return new PropertiesInfoBean(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertiesInfoBean)) {
            return false;
        }
        PropertiesInfoBean propertiesInfoBean = (PropertiesInfoBean) obj;
        return AbstractC5868k.m23669a(this.customerEmail, propertiesInfoBean.customerEmail) && AbstractC5868k.m23669a(this.shareLinkUrl, propertiesInfoBean.shareLinkUrl) && AbstractC5868k.m23669a(this.downloadNumber, propertiesInfoBean.downloadNumber) && AbstractC5868k.m23669a(this.downloadSpeed, propertiesInfoBean.downloadSpeed);
    }

    public final String getCustomerEmail() {
        return this.customerEmail;
    }

    public final String getDownloadNumber() {
        return this.downloadNumber;
    }

    public final String getDownloadSpeed() {
        return this.downloadSpeed;
    }

    public final String getShareLinkUrl() {
        return this.shareLinkUrl;
    }

    public int hashCode() {
        String str = this.customerEmail;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shareLinkUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.downloadNumber;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.downloadSpeed;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCustomerEmail(String str) {
        this.customerEmail = str;
    }

    public final void setDownloadNumber(String str) {
        this.downloadNumber = str;
    }

    public final void setDownloadSpeed(String str) {
        this.downloadSpeed = str;
    }

    public final void setShareLinkUrl(String str) {
        this.shareLinkUrl = str;
    }

    public String toString() {
        return "PropertiesInfoBean(customerEmail=" + this.customerEmail + ", shareLinkUrl=" + this.shareLinkUrl + ", downloadNumber=" + this.downloadNumber + ", downloadSpeed=" + this.downloadSpeed + ')';
    }
}
