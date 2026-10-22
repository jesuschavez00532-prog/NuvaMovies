package com.module.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class ColumnPosterBean {
    private int columnId;
    private String iconUrl;
    private String logoUrl;
    private String stageUrl;

    public ColumnPosterBean(int i10, String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "logoUrl");
        AbstractC5868k.m23674f(str2, "stageUrl");
        AbstractC5868k.m23674f(str3, "iconUrl");
        this.columnId = i10;
        this.logoUrl = str;
        this.stageUrl = str2;
        this.iconUrl = str3;
    }

    public static /* synthetic */ ColumnPosterBean copy$default(ColumnPosterBean columnPosterBean, int i10, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = columnPosterBean.columnId;
        }
        if ((i11 & 2) != 0) {
            str = columnPosterBean.logoUrl;
        }
        if ((i11 & 4) != 0) {
            str2 = columnPosterBean.stageUrl;
        }
        if ((i11 & 8) != 0) {
            str3 = columnPosterBean.iconUrl;
        }
        return columnPosterBean.copy(i10, str, str2, str3);
    }

    public final int component1() {
        return this.columnId;
    }

    public final String component2() {
        return this.logoUrl;
    }

    public final String component3() {
        return this.stageUrl;
    }

    public final String component4() {
        return this.iconUrl;
    }

    public final ColumnPosterBean copy(int i10, String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "logoUrl");
        AbstractC5868k.m23674f(str2, "stageUrl");
        AbstractC5868k.m23674f(str3, "iconUrl");
        return new ColumnPosterBean(i10, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColumnPosterBean)) {
            return false;
        }
        ColumnPosterBean columnPosterBean = (ColumnPosterBean) obj;
        return this.columnId == columnPosterBean.columnId && AbstractC5868k.m23669a(this.logoUrl, columnPosterBean.logoUrl) && AbstractC5868k.m23669a(this.stageUrl, columnPosterBean.stageUrl) && AbstractC5868k.m23669a(this.iconUrl, columnPosterBean.iconUrl);
    }

    public final int getColumnId() {
        return this.columnId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getStageUrl() {
        return this.stageUrl;
    }

    public int hashCode() {
        return (((((this.columnId * 31) + this.logoUrl.hashCode()) * 31) + this.stageUrl.hashCode()) * 31) + this.iconUrl.hashCode();
    }

    public final void setColumnId(int i10) {
        this.columnId = i10;
    }

    public final void setIconUrl(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.iconUrl = str;
    }

    public final void setLogoUrl(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.logoUrl = str;
    }

    public final void setStageUrl(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.stageUrl = str;
    }

    public String toString() {
        return "ColumnPosterBean(columnId=" + this.columnId + ", logoUrl=" + this.logoUrl + ", stageUrl=" + this.stageUrl + ", iconUrl=" + this.iconUrl + ')';
    }
}
