package com.request.bean;

import java.io.Serializable;
import java.util.List;
import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public final class SubTitleItemData implements Serializable {
    private List<SubTitleFileList> file;
    private String language;
    private String transLanguage = "";

    public SubTitleItemData(String str, List<SubTitleFileList> list) {
        this.language = str;
        this.file = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SubTitleItemData copy$default(SubTitleItemData subTitleItemData, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subTitleItemData.language;
        }
        if ((i10 & 2) != 0) {
            list = subTitleItemData.file;
        }
        return subTitleItemData.copy(str, list);
    }

    public final String component1() {
        return this.language;
    }

    public final List<SubTitleFileList> component2() {
        return this.file;
    }

    public final SubTitleItemData copy(String str, List<SubTitleFileList> list) {
        return new SubTitleItemData(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubTitleItemData)) {
            return false;
        }
        SubTitleItemData subTitleItemData = (SubTitleItemData) obj;
        return AbstractC5868k.m23669a(this.language, subTitleItemData.language) && AbstractC5868k.m23669a(this.file, subTitleItemData.file);
    }

    public final List<SubTitleFileList> getFile() {
        return this.file;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getTransLanguage() {
        return this.transLanguage;
    }

    public int hashCode() {
        String str = this.language;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SubTitleFileList> list = this.file;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setFile(List<SubTitleFileList> list) {
        this.file = list;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setTransLanguage(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.transLanguage = str;
    }

    public String toString() {
        return "SubTitleItemData(language=" + this.language + ", file=" + this.file + ')';
    }
}
