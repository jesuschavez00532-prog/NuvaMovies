package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.AbstractC0547a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p214l.C5303a;

/* renamed from: com.google.firebase.iid.u */
/* loaded from: classes.dex */
class C2651u {

    /* renamed from: a */
    final SharedPreferences f10129a;

    /* renamed from: b */
    final Context f10130b;

    /* renamed from: c */
    private final Map f10131c = new C5303a();

    /* renamed from: com.google.firebase.iid.u$a */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: d */
        private static final long f10132d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f10133a;

        /* renamed from: b */
        final String f10134b;

        /* renamed from: c */
        final long f10135c;

        private a(String str, String str2, long j10) {
            this.f10133a = str;
            this.f10134b = str2;
            this.f10135c = j10;
        }

        /* renamed from: a */
        static String m10984a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                String valueOf = String.valueOf(e10);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 24);
                sb2.append("Failed to encode token: ");
                sb2.append(valueOf);
                Log.w("FirebaseInstanceId", sb2.toString());
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public static String m10985b(a aVar) {
            if (aVar == null) {
                return null;
            }
            return aVar.f10133a;
        }

        /* renamed from: d */
        static a m10986d(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e10) {
                    String valueOf = String.valueOf(e10);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                    sb2.append("Failed to parse token: ");
                    sb2.append(valueOf);
                    Log.w("FirebaseInstanceId", sb2.toString());
                    return null;
                }
            }
            return new a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m10987c(String str) {
            if (System.currentTimeMillis() <= this.f10135c + f10132d && str.equals(this.f10134b)) {
                return false;
            }
            return true;
        }
    }

    public C2651u(Context context) {
        this.f10130b = context;
        this.f10129a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m10974a("com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m10974a(String str) {
        String str2;
        File file = new File(AbstractC0547a.m2327i(this.f10130b), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !m10981g()) {
                Log.i("FirebaseInstanceId", "App restored, clearing state");
                m10979d();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e10.getMessage());
                if (valueOf.length() != 0) {
                    str2 = "Error creating file in no backup dir: ".concat(valueOf);
                } else {
                    str2 = new String("Error creating file in no backup dir: ");
                }
                Log.d("FirebaseInstanceId", str2);
            }
        }
    }

    /* renamed from: b */
    static String m10975b(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6);
        sb2.append(str);
        sb2.append("|S|cre");
        return sb2.toString();
    }

    /* renamed from: c */
    private String m10976c(String str, String str2, String str3) {
        int length = String.valueOf(str).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append("|T|");
        sb2.append(str2);
        sb2.append("|");
        sb2.append(str3);
        return sb2.toString();
    }

    /* renamed from: e */
    private long m10977e(String str) {
        String string = this.f10129a.getString(m10975b(str, "cre"), null);
        if (string != null) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                return 0L;
            }
        }
        return 0L;
    }

    /* renamed from: j */
    private long m10978j(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f10129a.contains(m10975b(str, "cre"))) {
            SharedPreferences.Editor edit = this.f10129a.edit();
            edit.putString(m10975b(str, "cre"), String.valueOf(currentTimeMillis));
            edit.commit();
            return currentTimeMillis;
        }
        return m10977e(str);
    }

    /* renamed from: d */
    public synchronized void m10979d() {
        this.f10131c.clear();
        this.f10129a.edit().clear().commit();
    }

    /* renamed from: f */
    public synchronized a m10980f(String str, String str2, String str3) {
        return a.m10986d(this.f10129a.getString(m10976c(str, str2, str3), null));
    }

    /* renamed from: g */
    public synchronized boolean m10981g() {
        return this.f10129a.getAll().isEmpty();
    }

    /* renamed from: h */
    public synchronized void m10982h(String str, String str2, String str3, String str4, String str5) {
        String m10984a = a.m10984a(str4, str5, System.currentTimeMillis());
        if (m10984a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f10129a.edit();
        edit.putString(m10976c(str, str2, str3), m10984a);
        edit.commit();
    }

    /* renamed from: i */
    public synchronized long m10983i(String str) {
        long m10978j;
        m10978j = m10978j(str);
        this.f10131c.put(str, Long.valueOf(m10978j));
        return m10978j;
    }
}
