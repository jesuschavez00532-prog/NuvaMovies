package com.request.result;

import com.taobao.accs.common.Constants;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class OrderInfo {
    private String amountLocal;
    private int authorizedDays;
    private String createTime;
    private String currencyLocal;

    /* renamed from: id */
    private int f12710id;
    private String mode;
    private String orderId;
    private String packagePlanName;
    private int packageType;
    private String payStatus;
    private int payType;
    private String paymentAmount;
    private String paymentCurrency;
    private String paymentTime;
    private String state;
    private String transactionId;

    public OrderInfo(int i10, String str, String str2, int i11, String str3, int i12, String str4, String str5, String str6, String str7, String str8, String str9, int i13, String str10, String str11, String str12) {
        AbstractC5868k.m23674f(str, "orderId");
        AbstractC5868k.m23674f(str2, "transactionId");
        AbstractC5868k.m23674f(str3, "packagePlanName");
        AbstractC5868k.m23674f(str4, "paymentAmount");
        AbstractC5868k.m23674f(str5, "paymentCurrency");
        AbstractC5868k.m23674f(str8, "paymentTime");
        AbstractC5868k.m23674f(str9, "createTime");
        AbstractC5868k.m23674f(str10, "state");
        AbstractC5868k.m23674f(str11, "payStatus");
        AbstractC5868k.m23674f(str12, Constants.KEY_MODE);
        this.f12710id = i10;
        this.orderId = str;
        this.transactionId = str2;
        this.packageType = i11;
        this.packagePlanName = str3;
        this.authorizedDays = i12;
        this.paymentAmount = str4;
        this.paymentCurrency = str5;
        this.amountLocal = str6;
        this.currencyLocal = str7;
        this.paymentTime = str8;
        this.createTime = str9;
        this.payType = i13;
        this.state = str10;
        this.payStatus = str11;
        this.mode = str12;
    }

    public final int component1() {
        return this.f12710id;
    }

    public final String component10() {
        return this.currencyLocal;
    }

    public final String component11() {
        return this.paymentTime;
    }

    public final String component12() {
        return this.createTime;
    }

    public final int component13() {
        return this.payType;
    }

    public final String component14() {
        return this.state;
    }

    public final String component15() {
        return this.payStatus;
    }

    public final String component16() {
        return this.mode;
    }

    public final String component2() {
        return this.orderId;
    }

    public final String component3() {
        return this.transactionId;
    }

    public final int component4() {
        return this.packageType;
    }

    public final String component5() {
        return this.packagePlanName;
    }

    public final int component6() {
        return this.authorizedDays;
    }

    public final String component7() {
        return this.paymentAmount;
    }

    public final String component8() {
        return this.paymentCurrency;
    }

    public final String component9() {
        return this.amountLocal;
    }

    public final OrderInfo copy(int i10, String str, String str2, int i11, String str3, int i12, String str4, String str5, String str6, String str7, String str8, String str9, int i13, String str10, String str11, String str12) {
        AbstractC5868k.m23674f(str, "orderId");
        AbstractC5868k.m23674f(str2, "transactionId");
        AbstractC5868k.m23674f(str3, "packagePlanName");
        AbstractC5868k.m23674f(str4, "paymentAmount");
        AbstractC5868k.m23674f(str5, "paymentCurrency");
        AbstractC5868k.m23674f(str8, "paymentTime");
        AbstractC5868k.m23674f(str9, "createTime");
        AbstractC5868k.m23674f(str10, "state");
        AbstractC5868k.m23674f(str11, "payStatus");
        AbstractC5868k.m23674f(str12, Constants.KEY_MODE);
        return new OrderInfo(i10, str, str2, i11, str3, i12, str4, str5, str6, str7, str8, str9, i13, str10, str11, str12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderInfo)) {
            return false;
        }
        OrderInfo orderInfo = (OrderInfo) obj;
        return this.f12710id == orderInfo.f12710id && AbstractC5868k.m23669a(this.orderId, orderInfo.orderId) && AbstractC5868k.m23669a(this.transactionId, orderInfo.transactionId) && this.packageType == orderInfo.packageType && AbstractC5868k.m23669a(this.packagePlanName, orderInfo.packagePlanName) && this.authorizedDays == orderInfo.authorizedDays && AbstractC5868k.m23669a(this.paymentAmount, orderInfo.paymentAmount) && AbstractC5868k.m23669a(this.paymentCurrency, orderInfo.paymentCurrency) && AbstractC5868k.m23669a(this.amountLocal, orderInfo.amountLocal) && AbstractC5868k.m23669a(this.currencyLocal, orderInfo.currencyLocal) && AbstractC5868k.m23669a(this.paymentTime, orderInfo.paymentTime) && AbstractC5868k.m23669a(this.createTime, orderInfo.createTime) && this.payType == orderInfo.payType && AbstractC5868k.m23669a(this.state, orderInfo.state) && AbstractC5868k.m23669a(this.payStatus, orderInfo.payStatus) && AbstractC5868k.m23669a(this.mode, orderInfo.mode);
    }

    public final String getAmountLocal() {
        return this.amountLocal;
    }

    public final int getAuthorizedDays() {
        return this.authorizedDays;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getCurrencyLocal() {
        return this.currencyLocal;
    }

    public final int getId() {
        return this.f12710id;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPackagePlanName() {
        return this.packagePlanName;
    }

    public final int getPackageType() {
        return this.packageType;
    }

    public final String getPayStatus() {
        return this.payStatus;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final String getPaymentAmount() {
        return this.paymentAmount;
    }

    public final String getPaymentCurrency() {
        return this.paymentCurrency;
    }

    public final String getPaymentTime() {
        return this.paymentTime;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.f12710id * 31) + this.orderId.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.packageType) * 31) + this.packagePlanName.hashCode()) * 31) + this.authorizedDays) * 31) + this.paymentAmount.hashCode()) * 31) + this.paymentCurrency.hashCode()) * 31;
        String str = this.amountLocal;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencyLocal;
        return ((((((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.paymentTime.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.payType) * 31) + this.state.hashCode()) * 31) + this.payStatus.hashCode()) * 31) + this.mode.hashCode();
    }

    public final void setAmountLocal(String str) {
        this.amountLocal = str;
    }

    public final void setAuthorizedDays(int i10) {
        this.authorizedDays = i10;
    }

    public final void setCreateTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.createTime = str;
    }

    public final void setCurrencyLocal(String str) {
        this.currencyLocal = str;
    }

    public final void setId(int i10) {
        this.f12710id = i10;
    }

    public final void setMode(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.mode = str;
    }

    public final void setOrderId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.orderId = str;
    }

    public final void setPackagePlanName(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.packagePlanName = str;
    }

    public final void setPackageType(int i10) {
        this.packageType = i10;
    }

    public final void setPayStatus(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.payStatus = str;
    }

    public final void setPayType(int i10) {
        this.payType = i10;
    }

    public final void setPaymentAmount(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.paymentAmount = str;
    }

    public final void setPaymentCurrency(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.paymentCurrency = str;
    }

    public final void setPaymentTime(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.paymentTime = str;
    }

    public final void setState(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.state = str;
    }

    public final void setTransactionId(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.transactionId = str;
    }

    public String toString() {
        return "OrderInfo(id=" + this.f12710id + ", orderId=" + this.orderId + ", transactionId=" + this.transactionId + ", packageType=" + this.packageType + ", packagePlanName=" + this.packagePlanName + ", authorizedDays=" + this.authorizedDays + ", paymentAmount=" + this.paymentAmount + ", paymentCurrency=" + this.paymentCurrency + ", amountLocal=" + this.amountLocal + ", currencyLocal=" + this.currencyLocal + ", paymentTime=" + this.paymentTime + ", createTime=" + this.createTime + ", payType=" + this.payType + ", state=" + this.state + ", payStatus=" + this.payStatus + ", mode=" + this.mode + ')';
    }
}
