package com.request.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class CustomerServiceBean {
    private final String appId;

    public CustomerServiceBean(String str) {
        AbstractC5868k.m23674f(str, "appId");
        this.appId = str;
    }

    public static /* synthetic */ CustomerServiceBean copy$default(CustomerServiceBean customerServiceBean, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = customerServiceBean.appId;
        }
        return customerServiceBean.copy(str);
    }

    public final String component1() {
        return this.appId;
    }

    public final CustomerServiceBean copy(String str) {
        AbstractC5868k.m23674f(str, "appId");
        return new CustomerServiceBean(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomerServiceBean) && AbstractC5868k.m23669a(this.appId, ((CustomerServiceBean) obj).appId);
    }

    public final String getAppId() {
        return this.appId;
    }

    public int hashCode() {
        return this.appId.hashCode();
    }

    public String toString() {
        return "CustomerServiceBean(appId=" + this.appId + ')';
    }
}
