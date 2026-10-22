package com.alibaba.sdk.android.utils;

import java.util.Map;

/* loaded from: classes.dex */
public class SdkInfo {

    /* renamed from: a */
    String f6054a;

    /* renamed from: b */
    String f6055b;

    /* renamed from: c */
    String f6056c;

    /* renamed from: c */
    Map<String, String> f6057c;

    public SdkInfo setAppKey(String str) {
        this.f6056c = str;
        return this;
    }

    public SdkInfo setExt(Map<String, String> map) {
        this.f6057c = map;
        return this;
    }

    public SdkInfo setSdkId(String str) {
        this.f6054a = str;
        return this;
    }

    public SdkInfo setSdkVersion(String str) {
        this.f6055b = str;
        return this;
    }
}
