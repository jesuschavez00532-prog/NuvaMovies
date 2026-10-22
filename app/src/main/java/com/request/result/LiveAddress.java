package com.request.result;

import com.lzy.okgo.model.Progress;
import java.io.Serializable;
import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class LiveAddress implements Serializable {
    private String AVFormat;
    private String cdnType;
    private String license;
    private String playCode;
    private String quality;
    private String tag;

    public LiveAddress(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str4, "license");
        AbstractC5868k.m23674f(str6, Progress.TAG);
        this.playCode = str;
        this.cdnType = str2;
        this.quality = str3;
        this.license = str4;
        this.AVFormat = str5;
        this.tag = str6;
    }

    public static /* synthetic */ LiveAddress copy$default(LiveAddress liveAddress, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = liveAddress.playCode;
        }
        if ((i10 & 2) != 0) {
            str2 = liveAddress.cdnType;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = liveAddress.quality;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = liveAddress.license;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = liveAddress.AVFormat;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = liveAddress.tag;
        }
        return liveAddress.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.playCode;
    }

    public final String component2() {
        return this.cdnType;
    }

    public final String component3() {
        return this.quality;
    }

    public final String component4() {
        return this.license;
    }

    public final String component5() {
        return this.AVFormat;
    }

    public final String component6() {
        return this.tag;
    }

    public final LiveAddress copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AbstractC5868k.m23674f(str4, "license");
        AbstractC5868k.m23674f(str6, Progress.TAG);
        return new LiveAddress(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveAddress)) {
            return false;
        }
        LiveAddress liveAddress = (LiveAddress) obj;
        return AbstractC5868k.m23669a(this.playCode, liveAddress.playCode) && AbstractC5868k.m23669a(this.cdnType, liveAddress.cdnType) && AbstractC5868k.m23669a(this.quality, liveAddress.quality) && AbstractC5868k.m23669a(this.license, liveAddress.license) && AbstractC5868k.m23669a(this.AVFormat, liveAddress.AVFormat) && AbstractC5868k.m23669a(this.tag, liveAddress.tag);
    }

    public final String getAVFormat() {
        return this.AVFormat;
    }

    public final String getCdnType() {
        return this.cdnType;
    }

    public final String getLicense() {
        return this.license;
    }

    public final String getPlayCode() {
        return this.playCode;
    }

    public final String getQuality() {
        return this.quality;
    }

    public final String getTag() {
        return this.tag;
    }

    public int hashCode() {
        String str = this.playCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cdnType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.quality;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.license.hashCode()) * 31;
        String str4 = this.AVFormat;
        return ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.tag.hashCode();
    }

    public final void setAVFormat(String str) {
        this.AVFormat = str;
    }

    public final void setCdnType(String str) {
        this.cdnType = str;
    }

    public final void setLicense(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.license = str;
    }

    public final void setPlayCode(String str) {
        this.playCode = str;
    }

    public final void setQuality(String str) {
        this.quality = str;
    }

    public final void setTag(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.tag = str;
    }

    public String toString() {
        return "LiveAddress(playCode=" + this.playCode + ", cdnType=" + this.cdnType + ", quality=" + this.quality + ", license=" + this.license + ", AVFormat=" + this.AVFormat + ", tag=" + this.tag + ')';
    }
}
