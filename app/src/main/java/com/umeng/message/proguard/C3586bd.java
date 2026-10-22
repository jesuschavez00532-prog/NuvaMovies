package com.umeng.message.proguard;

import android.app.Application;
import android.content.ContentValues;
import android.text.TextUtils;
import com.umeng.message.common.UPLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.umeng.message.proguard.bd */
/* loaded from: classes3.dex */
public final class C3586bd {

    /* renamed from: a */
    private final String f16056a;

    public C3586bd(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str + "_";
        }
        this.f16056a = str;
    }

    /* renamed from: b */
    private String m15389b(String str) {
        return this.f16056a + str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (0 == 0) goto L24;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m15390c(java.lang.String r7, java.lang.String r8) {
        /*
            r0 = 0
            android.app.Application r1 = com.umeng.message.proguard.C3706y.m15840a()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            boolean r2 = com.umeng.message.proguard.C3678f.m15753b(r1)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            if (r2 == 0) goto L16
            com.umeng.message.proguard.bc r1 = com.umeng.message.proguard.C3585bc.m15386a()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            android.content.SharedPreferences r1 = r1.f16055a     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r7 = r1.getString(r7, r8)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            return r7
        L16:
            java.lang.String[] r5 = new java.lang.String[]{r7}     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            android.content.ContentResolver r7 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            android.net.Uri r2 = com.umeng.message.proguard.C3682h.m15769c(r1)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            r3 = 0
            r4 = 0
            r6 = 0
            r1 = r7
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            if (r0 != 0) goto L32
            if (r0 == 0) goto L31
            r0.close()     // Catch: java.lang.Throwable -> L31
        L31:
            return r8
        L32:
            boolean r7 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            if (r7 == 0) goto L43
            java.lang.String r7 = "v"
            int r7 = r0.getColumnIndex(r7)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r7 = r0.getString(r7)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            r8 = r7
        L43:
            r0.close()     // Catch: java.lang.Throwable -> L52
            goto L52
        L47:
            r7 = move-exception
            goto L53
        L49:
            r7 = move-exception
            java.lang.String r1 = "KV"
            com.umeng.message.common.UPLog.m15196e(r1, r7)     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L52
            goto L43
        L52:
            return r8
        L53:
            if (r0 == 0) goto L58
            r0.close()     // Catch: java.lang.Throwable -> L58
        L58:
            goto L5a
        L59:
            throw r7
        L5a:
            goto L59
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3586bd.m15390c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    private static void m15392d(String str, String str2) {
        try {
            Application m15840a = C3706y.m15840a();
            if (C3678f.m15753b(m15840a)) {
                C3585bc.m15386a().m15388a(str, str2);
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("k", str);
            contentValues.put("v", str2);
            m15840a.getContentResolver().insert(C3682h.m15769c(m15840a), contentValues);
        } catch (Exception e10) {
            UPLog.m15196e("KV", e10);
        }
    }

    /* renamed from: a */
    public final void m15394a(String str, int i10) {
        m15392d(m15389b(str), String.valueOf(i10));
    }

    /* renamed from: a */
    public final void m15395a(String str, long j10) {
        m15392d(m15389b(str), String.valueOf(j10));
    }

    /* renamed from: b */
    public final Set<String> m15402b(String str, Set<String> set) {
        try {
            String m15390c = m15390c(m15389b(str), "");
            if (!TextUtils.isEmpty(m15390c)) {
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = new JSONArray(m15390c);
                int length = jSONArray.length();
                if (length > 0) {
                    for (int i10 = 0; i10 < length; i10++) {
                        hashSet.add(jSONArray.optString(i10));
                    }
                }
                return hashSet;
            }
        } catch (Throwable th) {
            UPLog.m15196e("KV", th);
        }
        return set;
    }

    /* renamed from: a */
    public final void m15396a(String str, String str2) {
        m15392d(m15389b(str), String.valueOf(str2));
    }

    /* renamed from: a */
    public final void m15398a(String str, boolean z10) {
        m15392d(m15389b(str), String.valueOf(z10));
    }

    /* renamed from: a */
    public final void m15397a(String str, Set<String> set) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (set != null) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            m15392d(m15389b(str), jSONArray.toString());
        } catch (Throwable th) {
            UPLog.m15196e("KV", th);
        }
    }

    /* renamed from: b */
    public final int m15399b(String str, int i10) {
        String m15390c = m15390c(m15389b(str), String.valueOf(i10));
        if (!TextUtils.isEmpty(m15390c)) {
            try {
                return Integer.parseInt(m15390c);
            } catch (Exception e10) {
                UPLog.m15196e("KV", e10);
            }
        }
        return i10;
    }

    /* renamed from: a */
    public final void m15393a(String str) {
        m15391c(m15389b(str));
    }

    /* renamed from: b */
    public final long m15400b(String str, long j10) {
        String m15390c = m15390c(m15389b(str), String.valueOf(j10));
        if (!TextUtils.isEmpty(m15390c)) {
            try {
                return Long.parseLong(m15390c);
            } catch (Exception e10) {
                UPLog.m15196e("KV", e10);
            }
        }
        return j10;
    }

    /* renamed from: c */
    private static void m15391c(String str) {
        try {
            Application m15840a = C3706y.m15840a();
            if (C3678f.m15753b(m15840a)) {
                C3585bc.m15386a().m15387a(str);
                return;
            }
            m15840a.getContentResolver().delete(C3682h.m15769c(m15840a), null, new String[]{str});
        } catch (Throwable th) {
            UPLog.m15196e("KV", th);
        }
    }

    /* renamed from: b */
    public final boolean m15403b(String str, boolean z10) {
        String m15390c = m15390c(m15389b(str), String.valueOf(z10));
        if (!TextUtils.isEmpty(m15390c)) {
            try {
                return Boolean.parseBoolean(m15390c);
            } catch (Exception e10) {
                UPLog.m15196e("KV", e10);
            }
        }
        return z10;
    }

    /* renamed from: b */
    public final String m15401b(String str, String str2) {
        return m15390c(m15389b(str), str2);
    }
}
