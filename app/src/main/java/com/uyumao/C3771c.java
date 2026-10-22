package com.uyumao;

import android.content.Context;
import android.util.Log;
import com.umeng.analytics.pro.C3309bd;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.uyumao.c */
/* loaded from: classes3.dex */
public class C3771c {

    /* renamed from: a */
    public static boolean f16931a;

    /* renamed from: b */
    public static C3776h f16932b;

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject m15996a(android.content.Context r9, com.uyumao.C3777i r10, org.json.JSONArray r11) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uyumao.C3771c.m15996a(android.content.Context, com.uyumao.i, org.json.JSONArray):org.json.JSONObject");
    }

    /* renamed from: a */
    public static void m15997a(Context context, JSONObject jSONObject, boolean z10) {
        if (jSONObject == null) {
            Log.e("UYMInnerManager", "JSONObject in sendInitData() is null.");
            return;
        }
        String m16027a = C3779k.m16027a(context, "https://yumao.puata.info/anti_logs", jSONObject.toString());
        Log.d("UYMInnerManager", "msg: " + m16027a + "; json: " + jSONObject);
        if (m16027a == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(m16027a);
            if (jSONObject2.has(C3309bd.f14096c)) {
                context.getSharedPreferences("uyumao_info", 0).edit().putString(C3309bd.f14096c, jSONObject2.optString(C3309bd.f14096c)).apply();
            }
            if (z10) {
                if (jSONObject2.has("resp_code") && jSONObject2.optInt("resp_code") == 0) {
                    context.getSharedPreferences("uyumao_info", 0).edit().putBoolean(new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date()), true).apply();
                }
                C3773e.m16009a(new File(context.getCacheDir() + File.separator + "net_change"));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
