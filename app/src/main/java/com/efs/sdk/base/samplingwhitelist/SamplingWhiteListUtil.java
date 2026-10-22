package com.efs.sdk.base.samplingwhitelist;

/* loaded from: classes.dex */
public class SamplingWhiteListUtil {
    private static boolean sHitWL;

    public static boolean isHitWL() {
        return sHitWL;
    }

    public static void setHitWL(boolean z10) {
        sHitWL = z10;
    }
}
