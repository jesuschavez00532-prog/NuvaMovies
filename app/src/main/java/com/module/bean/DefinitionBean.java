package com.module.bean;

import java.util.List;
import ne.AbstractC5864g;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class DefinitionBean {
    private final String quality;
    private int selectSourceIndex;
    private final List<SourceBean> sourceList;

    public DefinitionBean(String str, List<SourceBean> list, int i10) {
        AbstractC5868k.m23674f(str, "quality");
        AbstractC5868k.m23674f(list, "sourceList");
        this.quality = str;
        this.sourceList = list;
        this.selectSourceIndex = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefinitionBean copy$default(DefinitionBean definitionBean, String str, List list, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = definitionBean.quality;
        }
        if ((i11 & 2) != 0) {
            list = definitionBean.sourceList;
        }
        if ((i11 & 4) != 0) {
            i10 = definitionBean.selectSourceIndex;
        }
        return definitionBean.copy(str, list, i10);
    }

    public final String component1() {
        return this.quality;
    }

    public final List<SourceBean> component2() {
        return this.sourceList;
    }

    public final int component3() {
        return this.selectSourceIndex;
    }

    public final DefinitionBean copy(String str, List<SourceBean> list, int i10) {
        AbstractC5868k.m23674f(str, "quality");
        AbstractC5868k.m23674f(list, "sourceList");
        return new DefinitionBean(str, list, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefinitionBean)) {
            return false;
        }
        DefinitionBean definitionBean = (DefinitionBean) obj;
        return AbstractC5868k.m23669a(this.quality, definitionBean.quality) && AbstractC5868k.m23669a(this.sourceList, definitionBean.sourceList) && this.selectSourceIndex == definitionBean.selectSourceIndex;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final SourceBean getSelectSource() {
        return this.sourceList.get(this.selectSourceIndex);
    }

    public final int getSelectSourceIndex() {
        return this.selectSourceIndex;
    }

    public final List<SourceBean> getSourceList() {
        return this.sourceList;
    }

    public int hashCode() {
        return (((this.quality.hashCode() * 31) + this.sourceList.hashCode()) * 31) + this.selectSourceIndex;
    }

    public final void setSelectSourceIndex(int i10) {
        this.selectSourceIndex = i10;
    }

    public String toString() {
        return "DefinitionBean(quality=" + this.quality + ", sourceList=" + this.sourceList + ", selectSourceIndex=" + this.selectSourceIndex + ')';
    }

    public /* synthetic */ DefinitionBean(String str, List list, int i10, int i11, AbstractC5864g abstractC5864g) {
        this(str, list, (i11 & 4) != 0 ? 0 : i10);
    }
}
