package com.module.bean;

import ne.AbstractC5868k;

/* loaded from: classes2.dex */
public class QualityBean {
    private final String displayQuality;
    private final boolean isShowHdAndCastTag;
    private final String qualityValue;

    public QualityBean(String str, String str2, boolean z10) {
        AbstractC5868k.m23674f(str, "displayQuality");
        AbstractC5868k.m23674f(str2, "qualityValue");
        this.displayQuality = str;
        this.qualityValue = str2;
        this.isShowHdAndCastTag = z10;
    }

    public final String getDisplayQuality() {
        return this.displayQuality;
    }

    public final int getQualityInt() {
        String str = this.displayQuality;
        int hashCode = str.hashCode();
        if (hashCode != 1604516) {
            if (hashCode != 1688123) {
                if (hashCode != 46737881 || !str.equals("1080P")) {
                    return 1;
                }
                return 3;
            }
            if (!str.equals("720P")) {
                return 1;
            }
            return 2;
        }
        str.equals("480P");
        return 1;
    }

    public final String getQualityValue() {
        return this.qualityValue;
    }

    public final boolean isShowHdAndCastTag() {
        return this.isShowHdAndCastTag;
    }
}
