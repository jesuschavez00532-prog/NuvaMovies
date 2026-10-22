package com.module.bean;

/* loaded from: classes2.dex */
public final class QualityBeanKt {
    public static final int QUALITY_INT_FHD = 3;
    public static final int QUALITY_INT_HD = 2;
    public static final int QUALITY_INT_SD = 1;
    private static final QualityBean QUALITY_SD = new QualityBean("480P", "480p", false);
    private static final QualityBean QUALITY_HD = new QualityBean("720P", "720p", true);
    private static final QualityBean QUALITY_FHD = new QualityBean("1080P", "1080p", true);

    public static final QualityBean getQUALITY_FHD() {
        return QUALITY_FHD;
    }

    public static final QualityBean getQUALITY_HD() {
        return QUALITY_HD;
    }

    public static final QualityBean getQUALITY_SD() {
        return QUALITY_SD;
    }
}
