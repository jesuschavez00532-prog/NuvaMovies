package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.AbstractC0547a;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.v0 */
/* loaded from: classes.dex */
class C2715v0 {

    /* renamed from: a */
    final SharedPreferences f10387a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.v0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d */
        private static final long f10388d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f10389a;

        /* renamed from: b */
        final String f10390b;

        /* renamed from: c */
        final long f10391c;

        private a(String str, String str2, long j10) {
            this.f10389a = str;
            this.f10390b = str2;
            this.f10391c = j10;
        }

        /* renamed from: a */
        static String m11332a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        /* renamed from: c */
        static a m11333c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e10) {
                    Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m11334b(String str) {
            if (System.currentTimeMillis() <= this.f10391c + f10388d && str.equals(this.f10390b)) {
                return false;
            }
            return true;
        }
    }

    public C2715v0(Context context) {
        this.f10387a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m11326a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m11326a(Context context, String str) {
        File file = new File(AbstractC0547a.m2327i(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !m11330e()) {
                Log.i("FirebaseMessaging", "App restored, clearing state");
                m11328c();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e10.getMessage());
            }
        }
    }

    /* renamed from: b */
    private String m11327b(String str, String str2) {
        return str + "|T|" + str2 + "|" + Operator.Operation.MULTIPLY;
    }

    /* renamed from: c */
    public synchronized void m11328c() {
        this.f10387a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized a m11329d(String str, String str2) {
        return a.m11333c(this.f10387a.getString(m11327b(str, str2), null));
    }

    /* renamed from: e */
    public synchronized boolean m11330e() {
        return this.f10387a.getAll().isEmpty();
    }

    /* renamed from: f */
    public synchronized void m11331f(String str, String str2, String str3, String str4) {
        String m11332a = a.m11332a(str3, str4, System.currentTimeMillis());
        if (m11332a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f10387a.edit();
        edit.putString(m11327b(str, str2), m11332a);
        edit.commit();
    }
}
