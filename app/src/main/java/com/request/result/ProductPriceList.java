package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class ProductPriceList implements Serializable {
    private String chargeType;
    private Float price;
    private String productCode;
    private String productName;

    public ProductPriceList(String str, String str2, String str3, Float f10) {
        this.productCode = str;
        this.productName = str2;
        this.chargeType = str3;
        this.price = f10;
    }

    public static /* synthetic */ ProductPriceList copy$default(ProductPriceList productPriceList, String str, String str2, String str3, Float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = productPriceList.productCode;
        }
        if ((i10 & 2) != 0) {
            str2 = productPriceList.productName;
        }
        if ((i10 & 4) != 0) {
            str3 = productPriceList.chargeType;
        }
        if ((i10 & 8) != 0) {
            f10 = productPriceList.price;
        }
        return productPriceList.copy(str, str2, str3, f10);
    }

    public final String component1() {
        return this.productCode;
    }

    public final String component2() {
        return this.productName;
    }

    public final String component3() {
        return this.chargeType;
    }

    public final Float component4() {
        return this.price;
    }

    public final ProductPriceList copy(String str, String str2, String str3, Float f10) {
        return new ProductPriceList(str, str2, str3, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPriceList)) {
            return false;
        }
        ProductPriceList productPriceList = (ProductPriceList) obj;
        return AbstractC5868k.m23669a(this.productCode, productPriceList.productCode) && AbstractC5868k.m23669a(this.productName, productPriceList.productName) && AbstractC5868k.m23669a(this.chargeType, productPriceList.chargeType) && AbstractC5868k.m23669a(this.price, productPriceList.price);
    }

    public final String getChargeType() {
        return this.chargeType;
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

    public int hashCode() {
        String str = this.productCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chargeType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f10 = this.price;
        return hashCode3 + (f10 != null ? f10.hashCode() : 0);
    }

    public final void setChargeType(String str) {
        this.chargeType = str;
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

    public String toString() {
        return "ProductPriceList(productCode=" + this.productCode + ", productName=" + this.productName + ", chargeType=" + this.chargeType + ", price=" + this.price + ')';
    }
}
