package com.module.bean;

import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class TabBean {
    private int defaultIconResId;
    private String titleStr;

    public TabBean(String str, int i10) {
        AbstractC5868k.m23674f(str, "titleStr");
        this.titleStr = str;
        this.defaultIconResId = i10;
    }

    public static /* synthetic */ TabBean copy$default(TabBean tabBean, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = tabBean.titleStr;
        }
        if ((i11 & 2) != 0) {
            i10 = tabBean.defaultIconResId;
        }
        return tabBean.copy(str, i10);
    }

    public final String component1() {
        return this.titleStr;
    }

    public final int component2() {
        return this.defaultIconResId;
    }

    public final TabBean copy(String str, int i10) {
        AbstractC5868k.m23674f(str, "titleStr");
        return new TabBean(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabBean)) {
            return false;
        }
        TabBean tabBean = (TabBean) obj;
        return AbstractC5868k.m23669a(this.titleStr, tabBean.titleStr) && this.defaultIconResId == tabBean.defaultIconResId;
    }

    public final int getDefaultIconResId() {
        return this.defaultIconResId;
    }

    public final String getTitleStr() {
        return this.titleStr;
    }

    public int hashCode() {
        return (this.titleStr.hashCode() * 31) + this.defaultIconResId;
    }

    public final void setDefaultIconResId(int i10) {
        this.defaultIconResId = i10;
    }

    public final void setTitleStr(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.titleStr = str;
    }

    public String toString() {
        return "TabBean(titleStr=" + this.titleStr + ", defaultIconResId=" + this.defaultIconResId + ')';
    }

    public /* synthetic */ TabBean(String str, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(str, (i11 & 2) != 0 ? -1 : i10);
    }
}
