package com.advertlib.bean;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AdReportBeanWrapper {
    private final AdReportBean bean;

    /* renamed from: id */
    private final int f5858id;

    public AdReportBeanWrapper(int i10, AdReportBean adReportBean) {
        AbstractC5868k.m23674f(adReportBean, "bean");
        this.f5858id = i10;
        this.bean = adReportBean;
    }

    public static /* synthetic */ AdReportBeanWrapper copy$default(AdReportBeanWrapper adReportBeanWrapper, int i10, AdReportBean adReportBean, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = adReportBeanWrapper.f5858id;
        }
        if ((i11 & 2) != 0) {
            adReportBean = adReportBeanWrapper.bean;
        }
        return adReportBeanWrapper.copy(i10, adReportBean);
    }

    public final int component1() {
        return this.f5858id;
    }

    public final AdReportBean component2() {
        return this.bean;
    }

    public final AdReportBeanWrapper copy(int i10, AdReportBean adReportBean) {
        AbstractC5868k.m23674f(adReportBean, "bean");
        return new AdReportBeanWrapper(i10, adReportBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdReportBeanWrapper)) {
            return false;
        }
        AdReportBeanWrapper adReportBeanWrapper = (AdReportBeanWrapper) obj;
        return this.f5858id == adReportBeanWrapper.f5858id && AbstractC5868k.m23669a(this.bean, adReportBeanWrapper.bean);
    }

    public final AdReportBean getBean() {
        return this.bean;
    }

    public final int getId() {
        return this.f5858id;
    }

    public int hashCode() {
        return (this.f5858id * 31) + this.bean.hashCode();
    }

    public String toString() {
        return "AdReportBeanWrapper(id=" + this.f5858id + ", bean=" + this.bean + ')';
    }
}
