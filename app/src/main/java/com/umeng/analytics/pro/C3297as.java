package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.internal.C3452a;
import com.umeng.commonsdk.utils.UMUtils;
import com.uyumao.sdk.UYMManager;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.as */
/* loaded from: classes3.dex */
public class C3297as {
    /* renamed from: a */
    public static void m13798a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static String m13794a(Context context, String str, String str2) {
        return context == null ? str2 : UMEnvelopeBuild.imprintProperty(context, str, str2);
    }

    /* renamed from: a */
    public static void m13797a(Context context, String str) {
        try {
            Method declaredMethod = UYMManager.class.getDeclaredMethod("processEvent", Context.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.invoke(UYMManager.class, context, str);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static Map<String, String> m13795a() {
        HashMap hashMap = new HashMap();
        hashMap.put(C3325bt.f14244bi, C3452a.f15265e);
        if (!TextUtils.isEmpty(UMUtils.VALUE_ANALYTICS_VERSION)) {
            hashMap.put(C3325bt.f14245bj, UMUtils.VALUE_ANALYTICS_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_GAME_VERSION)) {
            hashMap.put(C3325bt.f14246bk, UMUtils.VALUE_GAME_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_PUSH_VERSION)) {
            hashMap.put(C3325bt.f14247bl, UMUtils.VALUE_PUSH_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_SHARE_VERSION)) {
            hashMap.put(C3325bt.f14248bm, UMUtils.VALUE_SHARE_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_APM_VERSION)) {
            hashMap.put(C3325bt.f14249bn, UMUtils.VALUE_APM_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_VERIFY_VERSION)) {
            hashMap.put(C3325bt.f14250bo, UMUtils.VALUE_VERIFY_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_SMS_VERSION)) {
            hashMap.put(C3325bt.f14251bp, UMUtils.VALUE_SMS_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
            hashMap.put(C3325bt.f14252bq, UMUtils.VALUE_REC_VERSION_NAME);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_VISUAL_VERSION)) {
            hashMap.put(C3325bt.f14253br, UMUtils.VALUE_VISUAL_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
            hashMap.put(C3325bt.f14254bs, UMUtils.VALUE_ASMS_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_LINK_VERSION)) {
            hashMap.put(C3325bt.f14255bt, UMUtils.VALUE_LINK_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_ABTEST_VERSION)) {
            hashMap.put(C3325bt.f14256bu, UMUtils.VALUE_ABTEST_VERSION);
        }
        if (!TextUtils.isEmpty(UMUtils.VALUE_ANTI_VERSION)) {
            hashMap.put(C3325bt.f14257bv, UMUtils.VALUE_ANTI_VERSION);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m13796a(JSONObject jSONObject) {
        String str;
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String valueOf = String.valueOf(keys.next());
                if (!TextUtils.isEmpty(valueOf) && (str = (String) jSONObject.get(valueOf)) != null) {
                    hashMap.put(valueOf, str);
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }
}
