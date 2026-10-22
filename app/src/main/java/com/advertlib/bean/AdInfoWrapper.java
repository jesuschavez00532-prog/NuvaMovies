package com.advertlib.bean;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class AdInfoWrapper {
    private AdInfo adInfo;
    private String cachePath;

    public AdInfoWrapper(AdInfo adInfo, String str) {
        AbstractC5868k.m23674f(str, "cachePath");
        this.adInfo = adInfo;
        this.cachePath = str;
    }

    public static /* synthetic */ AdInfoWrapper copy$default(AdInfoWrapper adInfoWrapper, AdInfo adInfo, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            adInfo = adInfoWrapper.adInfo;
        }
        if ((i10 & 2) != 0) {
            str = adInfoWrapper.cachePath;
        }
        return adInfoWrapper.copy(adInfo, str);
    }

    public final AdInfo component1() {
        return this.adInfo;
    }

    public final String component2() {
        return this.cachePath;
    }

    public final AdInfoWrapper copy(AdInfo adInfo, String str) {
        AbstractC5868k.m23674f(str, "cachePath");
        return new AdInfoWrapper(adInfo, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdInfoWrapper)) {
            return false;
        }
        AdInfoWrapper adInfoWrapper = (AdInfoWrapper) obj;
        return AbstractC5868k.m23669a(this.adInfo, adInfoWrapper.adInfo) && AbstractC5868k.m23669a(this.cachePath, adInfoWrapper.cachePath);
    }

    public final AdInfo getAdInfo() {
        return this.adInfo;
    }

    public final String getCachePath() {
        return this.cachePath;
    }

    public int hashCode() {
        AdInfo adInfo = this.adInfo;
        return ((adInfo == null ? 0 : adInfo.hashCode()) * 31) + this.cachePath.hashCode();
    }

    public final void setAdInfo(AdInfo adInfo) {
        this.adInfo = adInfo;
    }

    public final void setCachePath(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.cachePath = str;
    }

    public String toString() {
        return "AdInfoWrapper(adInfo=" + this.adInfo + ", cachePath=" + this.cachePath + ')';
    }
}
