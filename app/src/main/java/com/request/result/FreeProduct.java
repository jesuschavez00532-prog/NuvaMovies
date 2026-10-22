package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class FreeProduct {
    private int preAuthDays;
    private String productCode;
    private String productName;

    public FreeProduct(String str, int i10, String str2) {
        AbstractC5868k.m23674f(str, "productCode");
        AbstractC5868k.m23674f(str2, "productName");
        this.productCode = str;
        this.preAuthDays = i10;
        this.productName = str2;
    }

    public static /* synthetic */ FreeProduct copy$default(FreeProduct freeProduct, String str, int i10, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = freeProduct.productCode;
        }
        if ((i11 & 2) != 0) {
            i10 = freeProduct.preAuthDays;
        }
        if ((i11 & 4) != 0) {
            str2 = freeProduct.productName;
        }
        return freeProduct.copy(str, i10, str2);
    }

    public final String component1() {
        return this.productCode;
    }

    public final int component2() {
        return this.preAuthDays;
    }

    public final String component3() {
        return this.productName;
    }

    public final FreeProduct copy(String str, int i10, String str2) {
        AbstractC5868k.m23674f(str, "productCode");
        AbstractC5868k.m23674f(str2, "productName");
        return new FreeProduct(str, i10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeProduct)) {
            return false;
        }
        FreeProduct freeProduct = (FreeProduct) obj;
        return AbstractC5868k.m23669a(this.productCode, freeProduct.productCode) && this.preAuthDays == freeProduct.preAuthDays && AbstractC5868k.m23669a(this.productName, freeProduct.productName);
    }

    public final int getPreAuthDays() {
        return this.preAuthDays;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getProductName() {
        return this.productName;
    }

    public int hashCode() {
        return (((this.productCode.hashCode() * 31) + this.preAuthDays) * 31) + this.productName.hashCode();
    }

    public final void setPreAuthDays(int i10) {
        this.preAuthDays = i10;
    }

    public final void setProductCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.productCode = str;
    }

    public final void setProductName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.productName = str;
    }

    public String toString() {
        return "FreeProduct(productCode=" + this.productCode + ", preAuthDays=" + this.preAuthDays + ", productName=" + this.productName + ')';
    }
}
