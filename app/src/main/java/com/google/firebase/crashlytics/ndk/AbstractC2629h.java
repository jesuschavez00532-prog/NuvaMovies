package com.google.firebase.crashlytics.ndk;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.ndk.h */
/* loaded from: classes.dex */
abstract class AbstractC2629h {
    /* renamed from: a */
    private static String m10903a(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m10904b(String str, String str2, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("session_id", str);
        hashMap.put("generator", str2);
        hashMap.put("started_at_seconds", Long.valueOf(j10));
        return new JSONObject(hashMap).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m10905c(String str, String str2, String str3, String str4, int i10, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_identifier", str);
        hashMap.put("version_code", str2);
        hashMap.put("version_name", str3);
        hashMap.put("install_uuid", str4);
        hashMap.put("delivery_mechanism", Integer.valueOf(i10));
        hashMap.put("development_platform", m10903a(str5));
        hashMap.put("development_platform_version", m10903a(str6));
        return new JSONObject(hashMap).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static String m10906d(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("arch", Integer.valueOf(i10));
        hashMap.put("build_model", str);
        hashMap.put("available_processors", Integer.valueOf(i11));
        hashMap.put("total_ram", Long.valueOf(j10));
        hashMap.put("disk_space", Long.valueOf(j11));
        hashMap.put("is_emulator", Boolean.valueOf(z10));
        hashMap.put("state", Integer.valueOf(i12));
        hashMap.put("build_manufacturer", str2);
        hashMap.put("build_product", str3);
        return new JSONObject(hashMap).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m10907e(String str, String str2, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("version", str);
        hashMap.put("build_version", str2);
        hashMap.put("is_rooted", Boolean.valueOf(z10));
        return new JSONObject(hashMap).toString();
    }
}
