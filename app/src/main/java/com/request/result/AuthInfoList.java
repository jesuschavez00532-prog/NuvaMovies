package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AuthInfoList implements Serializable {
    private String contentId;
    private String effectTime;
    private String expInvalidTime;
    private String invalidTime;
    private String name;
    private Float price;
    private String productCode;
    private String productName;
    private String serviceType;
    private String status;
    private String subTime;
    private String userName;

    public AuthInfoList(String str, String str2, String str3, Float f10, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.userName = str;
        this.productCode = str2;
        this.productName = str3;
        this.price = f10;
        this.contentId = str4;
        this.name = str5;
        this.status = str6;
        this.effectTime = str7;
        this.subTime = str8;
        this.serviceType = str9;
    }

    public final String component1() {
        return this.userName;
    }

    public final String component10() {
        return this.serviceType;
    }

    public final String component2() {
        return this.productCode;
    }

    public final String component3() {
        return this.productName;
    }

    public final Float component4() {
        return this.price;
    }

    public final String component5() {
        return this.contentId;
    }

    public final String component6() {
        return this.name;
    }

    public final String component7() {
        return this.status;
    }

    public final String component8() {
        return this.effectTime;
    }

    public final String component9() {
        return this.subTime;
    }

    public final AuthInfoList copy(String str, String str2, String str3, Float f10, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new AuthInfoList(str, str2, str3, f10, str4, str5, str6, str7, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthInfoList)) {
            return false;
        }
        AuthInfoList authInfoList = (AuthInfoList) obj;
        return AbstractC5868k.m23669a(this.userName, authInfoList.userName) && AbstractC5868k.m23669a(this.productCode, authInfoList.productCode) && AbstractC5868k.m23669a(this.productName, authInfoList.productName) && AbstractC5868k.m23669a(this.price, authInfoList.price) && AbstractC5868k.m23669a(this.contentId, authInfoList.contentId) && AbstractC5868k.m23669a(this.name, authInfoList.name) && AbstractC5868k.m23669a(this.status, authInfoList.status) && AbstractC5868k.m23669a(this.effectTime, authInfoList.effectTime) && AbstractC5868k.m23669a(this.subTime, authInfoList.subTime) && AbstractC5868k.m23669a(this.serviceType, authInfoList.serviceType);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getEffectTime() {
        return this.effectTime;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r0 = p359ue.AbstractC7167u.m27748R(r8, new java.lang.String[]{" "}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        r1 = p359ue.AbstractC7167u.m27748R(r1, new java.lang.String[]{" "}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getExpInvalidTime() {
        /*
            r14 = this;
            java.lang.String r0 = r14.expInvalidTime
            boolean r0 = p317rb.AbstractC6567a.m25637g(r0)
            if (r0 == 0) goto L42
            java.lang.String r1 = r14.expInvalidTime
            java.lang.String r0 = " "
            r7 = 0
            if (r1 == 0) goto L24
            java.lang.String[] r2 = new java.lang.String[]{r0}
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.util.List r1 = p359ue.AbstractC7157k.m27692R(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L42
            java.lang.String r8 = r14.expInvalidTime
            if (r8 == 0) goto L40
            java.lang.String[] r9 = new java.lang.String[]{r0}
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r0 = p359ue.AbstractC7157k.m27692R(r8, r9, r10, r11, r12, r13)
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            goto L41
        L40:
            r0 = 0
        L41:
            return r0
        L42:
            java.lang.String r0 = r14.expInvalidTime
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.request.result.AuthInfoList.getExpInvalidTime():java.lang.String");
    }

    public final String getInvalidTime() {
        return this.invalidTime;
    }

    public final String getName() {
        return this.name;
    }

    public final Float getPrice() {
        return this.price;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getServiceType() {
        return this.serviceType;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubTime() {
        return this.subTime;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        String str = this.userName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.price;
        int hashCode4 = (hashCode3 + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str4 = this.contentId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.effectTime;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subTime;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.serviceType;
        return hashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setContentId(String str) {
        this.contentId = str;
    }

    public final void setEffectTime(String str) {
        this.effectTime = str;
    }

    public final void setExpInvalidTime(String str) {
        this.expInvalidTime = str;
    }

    public final void setInvalidTime(String str) {
        this.invalidTime = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPrice(Float f10) {
        this.price = f10;
    }

    public final void setProductCode(String str) {
        this.productCode = str;
    }

    public final void setProductName(String str) {
        this.productName = str;
    }

    public final void setServiceType(String str) {
        this.serviceType = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setSubTime(String str) {
        this.subTime = str;
    }

    public final void setUserName(String str) {
        this.userName = str;
    }

    public String toString() {
        return "AuthInfoList(userName=" + this.userName + ", productCode=" + this.productCode + ", productName=" + this.productName + ", price=" + this.price + ", contentId=" + this.contentId + ", name=" + this.name + ", status=" + this.status + ", effectTime=" + this.effectTime + ", subTime=" + this.subTime + ", serviceType=" + this.serviceType + ')';
    }
}
