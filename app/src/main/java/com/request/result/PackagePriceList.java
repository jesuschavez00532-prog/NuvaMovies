package com.request.result;

import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class PackagePriceList implements Serializable {
    private String packageCode;
    private String packageName;
    private Float price;

    public PackagePriceList(String str, String str2, Float f10) {
        this.packageCode = str;
        this.packageName = str2;
        this.price = f10;
    }

    public static /* synthetic */ PackagePriceList copy$default(PackagePriceList packagePriceList, String str, String str2, Float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = packagePriceList.packageCode;
        }
        if ((i10 & 2) != 0) {
            str2 = packagePriceList.packageName;
        }
        if ((i10 & 4) != 0) {
            f10 = packagePriceList.price;
        }
        return packagePriceList.copy(str, str2, f10);
    }

    public final String component1() {
        return this.packageCode;
    }

    public final String component2() {
        return this.packageName;
    }

    public final Float component3() {
        return this.price;
    }

    public final PackagePriceList copy(String str, String str2, Float f10) {
        return new PackagePriceList(str, str2, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackagePriceList)) {
            return false;
        }
        PackagePriceList packagePriceList = (PackagePriceList) obj;
        return AbstractC5868k.m23669a(this.packageCode, packagePriceList.packageCode) && AbstractC5868k.m23669a(this.packageName, packagePriceList.packageName) && AbstractC5868k.m23669a(this.price, packagePriceList.price);
    }

    public final String getPackageCode() {
        return this.packageCode;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final Float getPrice() {
        return this.price;
    }

    public int hashCode() {
        String str = this.packageCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.packageName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f10 = this.price;
        return hashCode2 + (f10 != null ? f10.hashCode() : 0);
    }

    public final void setPackageCode(String str) {
        this.packageCode = str;
    }

    public final void setPackageName(String str) {
        this.packageName = str;
    }

    public final void setPrice(Float f10) {
        this.price = f10;
    }

    public String toString() {
        return "PackagePriceList(packageCode=" + this.packageCode + ", packageName=" + this.packageName + ", price=" + this.price + ')';
    }
}
