package com.alibaba.sdk.android.utils;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class AMSDevReporter {

    /* renamed from: a */
    private static ConcurrentHashMap<AMSSdkTypeEnum, AMSReportStatusEnum> f6045a = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public enum AMSReportStatusEnum {
        UNREPORTED,
        REPORTED
    }

    /* loaded from: classes.dex */
    public enum AMSSdkExtInfoKeyEnum {
        AMS_EXTINFO_KEY_VERSION("SdkVersion"),
        AMS_EXTINFO_KEY_PACKAGE("PackageName");

        private String description;

        AMSSdkExtInfoKeyEnum(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    /* loaded from: classes.dex */
    public enum AMSSdkTypeEnum {
        AMS_MAN("MAN"),
        AMS_HTTPDNS("HTTPDNS"),
        AMS_MPUSH("MPUSH"),
        AMS_MAC("MAC"),
        AMS_API("API"),
        AMS_HOTFIX("HOTFIX"),
        AMS_FEEDBACK("FEEDBACK"),
        AMS_IM("IM");

        private String description;

        AMSSdkTypeEnum(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.description;
        }
    }

    static {
        for (AMSSdkTypeEnum aMSSdkTypeEnum : AMSSdkTypeEnum.values()) {
            f6045a.put(aMSSdkTypeEnum, AMSReportStatusEnum.REPORTED);
        }
    }

    public static void asyncReport(Context context, AMSSdkTypeEnum aMSSdkTypeEnum) {
        C1568b.m7241a("Utils:DataTracker", "no man, do nothing");
    }

    public static AMSReportStatusEnum getReportStatus(AMSSdkTypeEnum aMSSdkTypeEnum) {
        return f6045a.get(aMSSdkTypeEnum);
    }

    public static void setLogEnabled(boolean z10) {
        C1568b.setLogEnabled(z10);
    }

    public static void asyncReport(Context context, AMSSdkTypeEnum aMSSdkTypeEnum, Map<String, Object> map) {
        C1568b.m7241a("Utils:DataTracker", "no man, do nothing");
    }
}
