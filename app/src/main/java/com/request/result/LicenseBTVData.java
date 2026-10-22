package com.request.result;

import com.lzy.okgo.model.Progress;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class LicenseBTVData {
    private String license;
    private String tag;

    public LicenseBTVData(String str, String str2) {
        AbstractC5868k.m23674f(str, Progress.TAG);
        AbstractC5868k.m23674f(str2, "license");
        this.tag = str;
        this.license = str2;
    }

    public static /* synthetic */ LicenseBTVData copy$default(LicenseBTVData licenseBTVData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = licenseBTVData.tag;
        }
        if ((i10 & 2) != 0) {
            str2 = licenseBTVData.license;
        }
        return licenseBTVData.copy(str, str2);
    }

    public final String component1() {
        return this.tag;
    }

    public final String component2() {
        return this.license;
    }

    public final LicenseBTVData copy(String str, String str2) {
        AbstractC5868k.m23674f(str, Progress.TAG);
        AbstractC5868k.m23674f(str2, "license");
        return new LicenseBTVData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LicenseBTVData)) {
            return false;
        }
        LicenseBTVData licenseBTVData = (LicenseBTVData) obj;
        return AbstractC5868k.m23669a(this.tag, licenseBTVData.tag) && AbstractC5868k.m23669a(this.license, licenseBTVData.license);
    }

    public final String getLicense() {
        return this.license;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.license.hashCode();
    }

    public final void setLicense(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.license = str;
    }

    public final void setTag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.tag = str;
    }

    public String toString() {
        return "LicenseBTVData(tag=" + this.tag + ", license=" + this.license + ')';
    }
}
