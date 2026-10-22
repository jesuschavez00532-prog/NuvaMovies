package com.request.result;

import java.util.ArrayList;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class GiftDaysData {
    private ArrayList<FreeProduct> freeProductList;
    private String productCode;

    public GiftDaysData(String str, ArrayList<FreeProduct> arrayList) {
        AbstractC5868k.m23674f(str, "productCode");
        AbstractC5868k.m23674f(arrayList, "freeProductList");
        this.productCode = str;
        this.freeProductList = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftDaysData copy$default(GiftDaysData giftDaysData, String str, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = giftDaysData.productCode;
        }
        if ((i10 & 2) != 0) {
            arrayList = giftDaysData.freeProductList;
        }
        return giftDaysData.copy(str, arrayList);
    }

    public final String component1() {
        return this.productCode;
    }

    public final ArrayList<FreeProduct> component2() {
        return this.freeProductList;
    }

    public final GiftDaysData copy(String str, ArrayList<FreeProduct> arrayList) {
        AbstractC5868k.m23674f(str, "productCode");
        AbstractC5868k.m23674f(arrayList, "freeProductList");
        return new GiftDaysData(str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftDaysData)) {
            return false;
        }
        GiftDaysData giftDaysData = (GiftDaysData) obj;
        return AbstractC5868k.m23669a(this.productCode, giftDaysData.productCode) && AbstractC5868k.m23669a(this.freeProductList, giftDaysData.freeProductList);
    }

    public final ArrayList<FreeProduct> getFreeProductList() {
        return this.freeProductList;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public int hashCode() {
        return (this.productCode.hashCode() * 31) + this.freeProductList.hashCode();
    }

    public final void setFreeProductList(ArrayList<FreeProduct> arrayList) {
        AbstractC5868k.m23674f(arrayList, "<set-?>");
        this.freeProductList = arrayList;
    }

    public final void setProductCode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.productCode = str;
    }

    public String toString() {
        return "GiftDaysData(productCode=" + this.productCode + ", freeProductList=" + this.freeProductList + ')';
    }
}
